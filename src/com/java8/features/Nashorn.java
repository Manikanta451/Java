package com.java8.features;

import java.io.FileNotFoundException;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Nashorn {

	public static void main(String[] args) throws FileNotFoundException, ScriptException {
		ScriptEngine se=new ScriptEngineManager().getEngineByName("Narshon");
		se.eval("print('Hello Nashorn');");
	}

}
