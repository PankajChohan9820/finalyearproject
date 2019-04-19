'use strict';
 
var App = angular.module('myApp',['ngRoute']);

App.config(function($routeProvider) {
    $routeProvider
        .when('/viewStudents', {
            templateUrl: 'resources/pages/users.html',
            controller: 'UserList'
        }).when('/mangeusers', {
            templateUrl: 'resources/pages/usermangement.html'
           
        });
        
});