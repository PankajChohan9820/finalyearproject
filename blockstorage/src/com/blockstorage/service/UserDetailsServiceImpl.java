package com.blockstorage.service;




import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.GrantedAuthorityImpl;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.blockstorage.utils.ApplicationConstantsUtil;
import com.blockstorage.dao.RefMasterMaintainDAOImpl;
import com.blockstorage.utils.SearchParameter;
import com.blockstorage.model.User;


@Service("userDetailsService")
public class UserDetailsServiceImpl implements UserDetailsService {
	
	@SuppressWarnings("rawtypes")
	@Autowired
	private RefMasterMaintainDAOImpl refMasterMaintainDAOImpl;

	@SuppressWarnings("unchecked")
	@Override
	public UserDetails loadUserByUsername(String arg0)
			throws UsernameNotFoundException, DataAccessException {
		// TODO Auto-generated method stub
		UserDetails userDetails  = null;
		List<User> user = new ArrayList<User>();
		//Criterion crt = Restrictions.eq();
		List<SearchParameter> search=new ArrayList<SearchParameter>();
		SearchParameter searchParam=new SearchParameter(ApplicationConstantsUtil.MC_EQUAL, "userName", arg0);
		search.add(searchParam);
	
		try {
			user = refMasterMaintainDAOImpl.findEntityList(User.class,search ,null);
			if(user!=null && user.get(0).getUserName()!=null && user.get(0).getUserName().length()>0){
			System.out.println(user.get(0).getUserName()+" "+user.get(0).getPassword());
			}
			else
			{
					throw new UsernameNotFoundException("user not found");
							
			} 
		System.out.println("got user name");
		userDetails = this.buildUserFromUserEntity(user.get(0));
		System.out.println("executed builduserfromuserentity()");
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}
		return userDetails;
	}

	private UserDetails buildUserFromUserEntity(User userEntity) {
		// TODO Auto-generated method stub
		
		final String username = userEntity.getUserName();
		final String password = userEntity.getPassword();
		boolean enabledStr=userEntity.getIsEnabled();
		
		final boolean enabled; 
		if(enabledStr) {
			enabled=true;
		}
		else {
			enabled=false;
		}
		final Collection<GrantedAuthority> authority = new ArrayList<GrantedAuthority>();
		
		
		authority.add(new GrantedAuthorityImpl(userEntity.getRole().getRoleName()));
		
		
		
		org.springframework.security.core.userdetails.User user = new org.springframework.security.core.userdetails.User(username, password, enabled, true, true, true, authority);
		
		return user;
	}

}
 