package com.java.file.handlers;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class ExecuteJavaScriptCode {

	public static void main(String[] args) throws ScriptException {
		
		ScriptEngine ee = new ScriptEngineManager().getEngineByName("Nashorn");  
		ee.eval("print('Hello Nashorn!');");

	}

}