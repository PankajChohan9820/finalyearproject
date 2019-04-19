package com.blockstorage.service;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blockstorage.dao.RefMasterMaintainDAOImpl;
import com.blockstorage.dto.MinerDto;
import com.blockstorage.dto.StorageDto;
import com.blockstorage.model.HashStorage;
import com.blockstorage.model.RecordStorage;
import com.blockstorage.utils.ApplicationConstantsUtil;
import com.blockstorage.utils.Helper;
import com.blockstorage.utils.SearchParameter;

@Service
public class DeviceStorageService {

	@Autowired
	private RefMasterMaintainDAOImpl refMasterMaintainDAOImpl;
	
	public String processRecord(StorageDto storagedto)
	{
		String status = "unsuccessfull";
		if(null!=storagedto && null!=storagedto.getDeviceId() && !storagedto.getDeviceId().isEmpty()
				&& null!=storagedto.getHumidity() && !storagedto.getHumidity().isEmpty()
				&& null!=storagedto.getTemperature() && !storagedto.getTemperature().isEmpty()
				&& null!=storagedto.getToken() && !storagedto.getToken().isEmpty())
		{
			String token = storagedto.getToken();
			Integer tokenvalue = Integer.parseInt(token);
			String deviceId =storagedto.getDeviceId();
			double deviceIntId = Double.parseDouble(deviceId);
			double devicenumber =  Math.sqrt((tokenvalue-7));
			if(devicenumber==deviceIntId)
			{
				HashStorage hashstorage = this.getHashstStorage(deviceId);
				if(null!=hashstorage)
				{
					RecordStorage r = new RecordStorage();
					r.setHashKey(hashstorage.getHashKey());
					r.setHumidity(storagedto.getHumidity());
					r.setRecordDate(new Date());
					r.setTemperature(storagedto.getTemperature());
					try {
						Integer id = refMasterMaintainDAOImpl.create(r);
						status ="success";
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}

		}
			
		return status;
	}
	
	public HashStorage getHashstStorage(String deviceid)
	{
		List<SearchParameter> sp = new ArrayList<SearchParameter>();
		sp.add(new SearchParameter(ApplicationConstantsUtil.MC_EQUAL, "deviceId", deviceid));
		List<HashStorage> hsList = refMasterMaintainDAOImpl.findEntityList(HashStorage.class, sp, null);
		if(null!=hsList && !hsList.isEmpty() && hsList.size()==1)
		{
			return hsList.get(0);
	
		}
		else
			return null;
	}
	
	public HashStorage getHashstStorage()
	{
		List<SearchParameter> sp = new ArrayList<SearchParameter>();
		String username = Helper.getUsername();
		sp.add(new SearchParameter(ApplicationConstantsUtil.MC_EQUAL, "username", username));
		List<HashStorage> hsList = refMasterMaintainDAOImpl.findEntityList(HashStorage.class, sp, null);
		if(null!=hsList && !hsList.isEmpty() && hsList.size()==1)
		{
			return hsList.get(0);
	
		}
		else
			return null;
	}
	
	
	@SuppressWarnings("unchecked")
	public List<RecordStorage> getRecordList()
	{
		List<RecordStorage> recordList = new ArrayList<RecordStorage>();
		HashStorage hs = getHashstStorage();
		if(null!=hs)
		{
			List<SearchParameter> sp = new ArrayList<SearchParameter>();
			sp.add(new SearchParameter(ApplicationConstantsUtil.MC_EQUAL, "hashKey", hs.getHashKey()));
			recordList = refMasterMaintainDAOImpl.findEntityList(RecordStorage.class, sp, null);
		}
		
		
		return recordList;
	}
	
	public String getHashValue(String message)
	{
		MessageDigest md = null;
		try {
			md = MessageDigest.getInstance("MD5");
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        byte[] hashInBytes = md.digest(message.getBytes(StandardCharsets.UTF_8));

        StringBuilder sb = new StringBuilder();
        for (byte b : hashInBytes) {
            sb.append(String.format("%02x", b));
        }
        System.out.println(sb.toString());
        String hashValue = sb.toString();
        return hashValue;
	}
	
	public List<MinerDto> getMinerDto(List<RecordStorage> storageDtoList)
	{
		List<MinerDto> minerList = new ArrayList<MinerDto>();
		int count =1;
		for(RecordStorage s : storageDtoList)
		{
			MinerDto m = new MinerDto();
			if(count%2==0)
			{
				m.setAgentName("Agent 1");
			}
			else
			{
				m.setAgentName("Agent 2");
			}
			m.setCreaor("root service");
			String message=s.getHumidity()+"#"+s.getTemperature();
			String hasmessage = this.getHashValue(message);
			Long timestamp = s.getRecordDate().getTime();
			String blockchain = "timestamp ="+timestamp+" "+"hash = "+hasmessage;
			m.setBlockchain(blockchain);
			m.setPort("8080");
			minerList.add(m);
			count++;
		}
		return minerList;
	}
	
	
}
