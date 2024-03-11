package com.java.file.handlers;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.concurrent.TimeUnit;

public class ExecuteCommandLineScrpt {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		//String[] run = {"./client-side-performance-script.js"};
		//executeCommands(run);
		
		ProcessBuilder builder = new ProcessBuilder();
		builder.directory(new File("/Users/karthistestlab/Documents/code-labs/my-project-labs/df24/client-side-performance/lighthouse/"));
		builder.command("sh", "-c", "ls -al");
		Process process = builder.start();
		
		OutputStream outputStream = process.getOutputStream();
        InputStream inputStream = process.getInputStream();
        InputStream errorStream = process.getErrorStream();

        printStream(inputStream);
        printStream(errorStream);

        boolean isFinished = process.waitFor(30, TimeUnit.SECONDS);
        outputStream.flush();
        outputStream.close();

        if(!isFinished) {
            process.destroyForcibly();
        }
		
	}
	
	private static void printStream(InputStream inputStream) throws IOException {
        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream))) {
            String line;
            while((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

        }
    }
	

}