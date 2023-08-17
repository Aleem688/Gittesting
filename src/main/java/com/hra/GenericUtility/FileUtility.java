package com.hra.GenericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {
	public String getPropertyFileData(String key) throws IOException
	{
	FileInputStream fis=new FileInputStream(IPathConstants.filepath);
	Properties pobj=new Properties();
	pobj.load(fis);
	String value = pobj.getProperty(key);
	return value;
	

}}
