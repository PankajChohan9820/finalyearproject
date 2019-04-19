package com.blockstorage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.blockstorage.dto.MinerDto;
import com.blockstorage.model.RecordStorage;
import com.blockstorage.service.DeviceStorageService;

@Controller
public class ViewController {

	@Autowired
	private DeviceStorageService deviceStorageService;
	
	@RequestMapping(value="viewrecords.html",method=RequestMethod.GET)
	public ModelAndView getPastRecords()
	{
		ModelAndView view = new ModelAndView("viewrecords");
		List<RecordStorage> recordStorage = deviceStorageService.getRecordList();
		List<MinerDto> minorList = deviceStorageService.getMinerDto(recordStorage);
		view.addObject("minorList", minorList);
		return view;
	}
	
	@RequestMapping(value="login.html",method=RequestMethod.GET)
	public String loginpage()
	{
		return "login";
	}
}
