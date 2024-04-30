package com.runtime.challenges;

public class ShutdownPC {

	public static void main(String[] args) {
		String[] shutdownCommand;
		String operatingSystem = System.getProperty("os.name");
		try {
			// Shutdown the PC based on system operating system
			if("Linux".equals(operatingSystem) || "Mac OS X".equals(operatingSystem)) {
				shutdownCommand = new String[] {"shutdown -h now"};
			} else if (operatingSystem.contains("Windows")) {
				// This will work on any version of windows including version 11 
				shutdownCommand = new String[] {"shutdown.exe -s -t 0"};
			} else {
		        throw new RuntimeException("Unsupported operating system.");
		    }
			Runtime.getRuntime().exec(shutdownCommand);
		    System.exit(0);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}