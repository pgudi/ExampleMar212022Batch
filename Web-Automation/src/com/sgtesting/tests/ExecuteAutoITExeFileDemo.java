package com.sgtesting.tests;

public class ExecuteAutoITExeFileDemo {
	public static void main(String[] args) {
		executeFile();

	}
	
	private static void executeFile()
	{
		try
		{
		//	Runtime.getRuntime().exec("F:\\SeleniumAutomation\\AutoIT\\FirstTestScript.exe");
			Runtime obj=Runtime.getRuntime();
			obj.exec("F:\\SeleniumAutomation\\AutoIT\\ThirdTestScriptSaveFile.exe");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
