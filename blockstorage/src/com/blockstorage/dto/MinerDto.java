package com.blockstorage.dto;

public class MinerDto {

	private long timeStamp;
	private String agentName;
	private String port;
	private String creaor;
	private String blockchain;
	public long getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(long timeStamp) {
		this.timeStamp = timeStamp;
	}
	public String getAgentName() {
		return agentName;
	}
	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}
	public String getPort() {
		return port;
	}
	public void setPort(String port) {
		this.port = port;
	}
	public String getCreaor() {
		return creaor;
	}
	public void setCreaor(String creaor) {
		this.creaor = creaor;
	}
	public String getBlockchain() {
		return blockchain;
	}
	public void setBlockchain(String blockchain) {
		this.blockchain = blockchain;
	}
	
	
	
}
