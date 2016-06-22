package com.walden.entity;

import java.io.Serializable;

public class TurfMail implements Serializable{
	
	public String getENCODEING() {
		return ENCODEING;
	}
	public  final String ENCODEING = "UTF-8";
    private String host;
	private String sender;
	//private String receiver;
	private String name;
	private String username;
	private String password;
//	private String subject;
//	private String message;
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public String getSender() {
		return sender;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	
	
}
