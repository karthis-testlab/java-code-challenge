package com.java.file.handlers;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class PrintHostname {

	public static void main(String[] args) throws UnknownHostException {
		
		String hostName = InetAddress.getLocalHost().getHostName();		
		System.out.println(hostName);

	}

}