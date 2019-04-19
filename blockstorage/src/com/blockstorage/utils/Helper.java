package com.blockstorage.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;


@Component
public class Helper {
	
	
	
	
	public static String getUsername()
	{
		final Authentication authentication = SecurityContextHolder
				.getContext().getAuthentication();
		if ((authentication == null)
				|| authentication.getPrincipal().equals("anonymousUser"))
		{
			return null;
		}
		else
		{
			return authentication.getName();
		}

	}
	
	
	
	
}
