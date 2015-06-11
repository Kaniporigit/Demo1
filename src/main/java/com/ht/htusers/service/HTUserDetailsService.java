package com.ht.htusers.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ht.htusers.entity.HTUser;
import com.ht.htusers.entity.PermissionGroup;
import com.ht.user.dao.UserDao;




@Service("userDetailsService")
public class HTUserDetailsService {
	@Autowired
	private UserDao userDao;
	
	@Transactional(readOnly=true)
	public UserDetails loadUserByUsername(final String userId) throws UsernameNotFoundException {
	
		
		 HTUser user = userDao.findByUserId(userId);
		 
		List<GrantedAuthority> authorities = buildUserAuthority(user.getPermissionGroups());

		return buildUserForAuthentication(user, authorities);
		
	}

	// Converts com.ht.htusers.entity.User user to
	// org.springframework.security.core.userdetails.User
	private User buildUserForAuthentication(HTUser user, List<GrantedAuthority> authorities) {
		return new User(user.getUserId().toString(), user.getPassword(), user.getUserStatus(), true, true, true, authorities);
	}

	
	
	private List<GrantedAuthority> buildUserAuthority(Set<PermissionGroup> permissionGroups) {

		Set<GrantedAuthority> setAuths = new HashSet<GrantedAuthority>();

		// Build user's authorities
		for (PermissionGroup permissionGroup:permissionGroups) {
			setAuths.add(new SimpleGrantedAuthority(permissionGroup.getPermissionGroupName()));
		}
		

		List<GrantedAuthority> Result = new ArrayList<GrantedAuthority>(setAuths);

		return Result;
	}
}
