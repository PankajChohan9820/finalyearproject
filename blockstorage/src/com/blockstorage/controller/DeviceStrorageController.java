package com.blockstorage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.blockstorage.dto.StorageDto;
import com.blockstorage.service.DeviceStorageService;

@Controller
public class DeviceStrorageController {
	
	@Autowired
	private DeviceStorageService deviceStorageService;

	@RequestMapping(value="processblocktransaction.html",method=RequestMethod.POST)
	public @ResponseBody String  getUserList(@RequestBody StorageDto storagedto)
	{
		System.out.println("name of Device Id"+ storagedto.getDeviceId());
		String status = deviceStorageService.processRecord(storagedto);
		return status;
	}
}
