package com.news18.hindirevampvalidation;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.testng.ITestResult;
import org.testng.annotations.Test;

import com.news18.init.GenericUtility;
import com.news18.init.WebDriverActions;

public class TestGetParent extends WebDriverActions {

	//InitializePages pages;
	ITestResult result;
	GenericUtility genericUtility = new GenericUtility();
	
	@Test()
	public void validateHindiRevampUrls() throws Throwable
	{
		String pUrl=null;
		try {
			dbConnect();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		List<String> list=new ArrayList<String>();

		Statement stat = con.createStatement();
		String query="select childurl from failiedchildurl  ; ";
		ResultSet result = stat.executeQuery(query);
		while(result.next())
		{
			list.add(result.getString("childurl"));
		}
		
		for (int i = 0; i < list.size(); i++) {
			
			pUrl=checkParent(list.get(i));
			insertParentChild(pUrl, list.get(i));
		}
		
		result.close();
		stat.close();
		dbConnectionClose();
	}
	
	public String checkParent(String url) throws SQLException
	{
		String pUrl = null;
		try {
			dbConnect();
		} catch (Throwable e) {
			e.printStackTrace();
		}

		Statement stat = con.createStatement();
		String query="select parenturl from hindi_migration_urls where childurl='"+url+"';";
		ResultSet result = stat.executeQuery(query);
		while(result.next())
		{
			pUrl=(result.getString("parenturl"));
		}
		System.out.println("Parent url :"+pUrl);
		result.close();
		stat.close();
		dbConnectionClose();
		return pUrl;
	}
	
	public void insertParentChild(String pUrl,String cUrl) throws SQLException
	{
		String query=null;
		try {
			dbConnect();
		} catch (Throwable e) {
			e.printStackTrace();
		}

		Statement stat = con.createStatement();
		 query="insert into hindi_parent_childurl(parenturl,childurl,status)values('"+pUrl+"','"+cUrl+"',000);";
		 stat.executeUpdate(query);
		 stat.close();
		dbConnectionClose();
		
		System.out.println("inserted parent child");
		
	}
}

