'use strict';
 
App.controller('UserController', [	'$scope', 'UserService', function($scope, UserService) {
          var self = this;
          self.user={id:null,username:'',address:'',email:''};
          self.users=[];
               
          self.fetchAllUsers = function(){
              UserService.fetchAllUsers()
                  .then(
                               function(d) {
                                    self.users = d;
                               },
                                function(errResponse){
                                    console.error('Error while fetching Currencies');
                                }
                       );
          };
            
          self.createUser = function(user){
              UserService.createUser(user)
                      .then(
                      self.fetchAllUsers, 
                              function(errResponse){
                                   console.error('Error while creating User.');
                              } 
                  );
          };
 
         self.updateUser = function(user, id){
              UserService.updateUser(user, id)
                      .then(
                              self.fetchAllUsers, 
                              function(errResponse){
                                   console.error('Error while updating User.');
                              } 
                  );
          };
 
         self.deleteUser = function(id){
              UserService.deleteUser(id)
                      .then(
                              self.fetchAllUsers, 
                              function(errResponse){
                                   console.error('Error while deleting User.');
                              } 
                  );
          };
 
          self.fetchAllUsers();
 
          self.submit = function() {
              if(self.user.id==null){
                  console.log('Saving New User', self.user);    
                  self.createUser(self.user);
              }else{
                  self.updateUser(self.user, self.user.id);
                  console.log('User updated with id ', self.user.id);
              }
              self.reset();
          };
               
          self.edit = function(id){
              console.log('id to be edited', id);
              for(var i = 0; i < self.users.length; i++){
                  if(self.users[i].id == id) {
                     self.user = angular.copy(self.users[i]);
                     break;
                  }
              }
          };
               
          self.remove = function(id){
              console.log('id to be deleted', id);
              for(var i = 0; i < self.users.length; i++){//clean form if the user to be deleted is shown there.
                  if(self.users[i].id == id) {
                     self.reset();
                     break;
                  }
              }
              self.deleteUser(id);
          };
 
           
          self.reset = function(){
              self.user={id:null,username:'',address:'',email:''};
              $scope.myForm.$setPristine(); //reset Form
          };
 
      }]);

App.controller('UserList',['$scope','UserService',function($scope, UserService){
	
	 var self = this;
	 console.log("1");
     self.user={id:null,username:'',address:'',email:''};
     $scope.users1=[];
     console.log("2");
     UserService.fetchAllUsers().then(
             function(d) {
                 console.log("4");
                 console.log(d);
                 $scope.users1 = d;
           	  console.log($scope.users1);
             },
              function(errResponse){
                  console.error('Error while fetching Currencies');
              }
     );
     /*self.fetchAllUsers = function(){
    	 console.log("3");
         UserService.fetchAllUsers()
             .then(
                          function(d) {
                              console.log("4");
                        	  self.users1 = d;
                          },
                           function(errResponse){
                               console.error('Error while fetching Currencies');
                           }
                  );
     };*/
	
}]);

/*App.controller('UserManagement',['$scope','UserService',function($scope,UserService){
	console.log("Inside usermanagement controller");
}]);*/