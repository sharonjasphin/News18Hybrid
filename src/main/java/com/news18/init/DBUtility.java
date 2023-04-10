package com.news18.init;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;

import com.mysql.cj.jdbc.Driver;

public class DBUtility extends GenericUtility implements IPath {

	public Connection con=null;
	public int id=0;
	/**
	 * Method to connect to DataBase creating Connection through DriverManager Class
	 * @throws Throwable
	 */
	public void  dbConnect() throws Throwable {
		Driver driverref=new Driver();
		DriverManager.registerDriver(driverref);
		con=DriverManager.getConnection(dbPath,userName,password);
	}

	public void insertIntoDB(String current_className, String platformName, String curClassMethodName,String status,String lang, String exceptionMsg) throws SQLException {
		try {
			dbConnect();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String query = null;
		Statement stat = con.createStatement();

		/* Getting last inserted record ID Number value from table psi_all_lang, and insert new values by 
		  incrementing ID variable. */	

		String getLastId="SELECT id from news18summaryreport order by id desc limit 1;";

		ResultSet result1 = stat.executeQuery(getLastId);
		while(result1.next())
		{
			id=result1.getInt(1);
		}
		id++;

		query="insert into news18summaryreport(Id,DateTime,ScenarioName,PlatformName,TestMethodName,Status,Language,FailureReason) values("+id+",now(),'"+current_className+"','"+platformName+"','"+curClassMethodName+"','"+status+"','"+lang+"','"+exceptionMsg+"')";

		double result = stat.executeUpdate(query);

		if(result==1)
		{
			System.out.println("1 row inserted");
		}
		else
		{
			System.out.println("Row failed to insert");
		}

		dbConnectionClose();
	}

	public void insertIntoGoogleTrendsDB(String KeyWord,String lang, String URL,int Count) throws SQLException {
		try {
			dbConnect();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String query = null;
		Statement stat = con.createStatement();

		/* Getting last inserted record ID Number value from table psi_all_lang, and insert new values by 
		  incrementing ID variable. */	

		String getLastId="SELECT id from sitemapgoogletrends order by id desc limit 1;";

		ResultSet result1 = stat.executeQuery(getLastId);
		while(result1.next())
		{
			id=result1.getInt(1);
		}
		id++;

		query="insert into sitemapgoogletrends(Id,DateTime,KeyWord,Count,URL,Language) values("+id+",now(),'"+KeyWord+"','"+Count+"','"+URL+"','"+lang+"')";		
		double result = stat.executeUpdate(query);

		if(result==1)
		{
			System.out.println("1 row inserted");
		}
		else
		{
			System.out.println("Row failed to insert");
		}

		dbConnectionClose();
	}

	/**
	 * @param lang
	 * @param tableName
	 * @return
	 * @throws Throwable
	 */
	public  List<String> dbGetUrls(String section) throws Throwable
	{

		try {
			dbConnect();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<String> list=new ArrayList<String>();

		Statement stat = con.createStatement();
		String query="select *from base_api_urls where section='"+section+"';";
		ResultSet result = stat.executeQuery(query);
		while(result.next())
		{
			list.add(result.getString("url"));
		}
		result.close();
		stat.close();
		return list;	
	}

	public void dbConnectionClose() throws SQLException {
		con.close();
	}

	/**
	 * @author DanishR
	 * This method inserts data into mentioned DB
	 * @param current_className
	 * @param platformName
	 * @param curClassMethodName
	 * @param status
	 * @param lang
	 * @param exceptionMsg
	 * @throws SQLException
	 */
	public void insertIntoDBRevamp(String current_className, String platformName, String curClassMethodName,String status,String lang, String exceptionMsg) throws SQLException {
		try {
			dbConnect();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String query = null;
		Statement stat = con.createStatement();

		/* Getting last inserted record ID Number value from table psi_all_lang, and insert new values by 
		  incrementing ID variable. */	

		String getLastId="SELECT id from hindirevampreport order by id desc limit 1;";

		ResultSet result1 = stat.executeQuery(getLastId);
		//		while(result1.next())
		//		{
		//			id=result1.getInt(1);
		//		}
		//		id++;
		//		
		query="insert into hindirevampreport(DateTime,ScenarioName,PlatformName,TestMethodName,Status,Language,FailureReason) values(now(),'"+current_className+"','"+platformName+"','"+curClassMethodName+"','"+status+"','"+lang+"','"+exceptionMsg+"')";

		double result = stat.executeUpdate(query);

		if(result==1)
		{
			System.out.println("1 row inserted");
		}
		else
		{
			System.out.println("Row failed to insert");
		}

		dbConnectionClose();
	}

	/**
	 * @author Viping
	 * @param limitFrom
	 * @param limitUpTo
	 * @return
	 * @throws Throwable
	 */
	public  List<String> dbGetHindiRevampUrls(int limitFrom , int limitUpTo) throws Throwable
	{
		try {
			dbConnect();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		List<String> list=new ArrayList<String>();

		Statement stat = con.createStatement();
//		String query="select Urls from hindi_revamp_urls Limit "+limitFrom + ","+limitUpTo+" ; ";
		String query="select Urls from english_urls Limit "+limitFrom + ","+limitUpTo+" ; ";
		ResultSet result = stat.executeQuery(query);
		while(result.next())
		{
			list.add(result.getString("Urls"));
		}
		result.close();
		stat.close();
		dbConnectionClose();
		return list;	
	}
	
	/**
	 * @author Viping
	 * @param limitFrom
	 * @param limitUpTo
	 * @return
	 * @throws Throwable
	 */
	public  List<String> dbGetEnglishUrls(int limitFrom , int limitUpTo) throws Throwable
	{
		try {
			dbConnect();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		List<String> list=new ArrayList<String>();

		Statement stat = con.createStatement();
		String query="select Urls from english_urls Limit "+limitFrom + ","+limitUpTo+" ; ";
		ResultSet result = stat.executeQuery(query);
		while(result.next())
		{
			list.add(result.getString("Urls"));
		}
		result.close();
		stat.close();
		dbConnectionClose();
		return list;	
	}

	/**
	 * @author DanishR
	 * This method is used insert data into DB table
	 * @param id
	 * @param parentUrl
	 * @param childUrl
	 * @throws Throwable
	 */
	public void dbInsertHindiRevampUrls(String parentUrl, String childUrl)  throws Throwable {

		try {
			dbConnect();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String query1 = null;
		Statement stat = con.createStatement();
		String getLastId="SELECT slno from hindi_migration_urls order by slno desc limit 1;";
		ResultSet result1 = stat.executeQuery(getLastId);
		//		int slno = 0;
		//		while(result1.next())
		//		{
		//			slno=result1.getInt(1);
		//		}
		//		slno++;

		query1 = "insert into hindi_migration_urls(DateTime,ParentUrl,ChildUrl) values(now(),'"+parentUrl+"','"+childUrl+"')";
		stat.executeUpdate(query1);
		result1.close();
		stat.close();
		dbConnectionClose();
	}

	/**
	 * @author DanishR
	 * This method is used insert Parent Urls data into DB table
	 * @param id
	 * @param parentUrl
	 * @param childUrl
	 * @throws Throwable
	 */
	public void dbInsertHindiSiteMapParentUrls(String urls)  throws Throwable {

		try {
			dbConnect();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String query1 = null;
		Statement stat = con.createStatement();
		String getLastId="SELECT slno from sitemap_hindi_parent_urls order by slno desc limit 1;";
		ResultSet result1 = stat.executeQuery(getLastId);

		query1 = "insert into sitemap_hindi_parent_urls(DateTime,Urls) values(now(),'"+urls+"')";
		stat.executeUpdate(query1);
		result1.close();
		stat.close();
		dbConnectionClose();

	}

	/**
	 * @author DanishR
	 * This method is used to get sitemap Urls from Parent Table
	 * @return
	 * @throws Throwable
	 */
	public  List<String> dbGetHindiSitemapUrls() throws Throwable
	{
		try {
			dbConnect();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		List<String> list=new ArrayList<String>();

		Statement stat = con.createStatement();
		String query="select Urls from sitemap_hindi_parent_urls; ";
		ResultSet result = stat.executeQuery(query);
		while(result.next())
		{
			list.add(result.getString("Urls"));
		}
		Assert.assertTrue(list.size()>0," No Data Found ");
		result.close();
		stat.close();
		return list;	
	}

	/**
	 * @author DanishR
	 * This method is used insert data into DB table
	 * @param id
	 * @param parentUrl
	 * @param childUrl
	 * @throws Throwable
	 */
	public void dbInsertHindiSiteMapChildUrls(String parentUrl, String childUrl,String lang)  throws Throwable {

		try {
			dbConnect();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String query1 = null;
		Statement stat = con.createStatement();
		String getLastId="SELECT sno from  english_urls order by sno desc limit 1;";
		ResultSet result1 = stat.executeQuery(getLastId);
		query1 = "insert into sitemap_hindi_child_urls(DateTime,Language,ParentUrl,ChildUrl) values(now(),'"+lang+"','"+parentUrl+"','"+childUrl+"')";
		stat.executeUpdate(query1);
		result1.close();
		stat.close();
		dbConnectionClose();

	}

	/**
	 * @author DanishR
	 * This method is used to Query for format Urls data from DB table
	 * @param quey
	 * @param from
	 * @param to
	 * @return 
	 * @throws Throwable
	 */
	public List<String> dbSelectHindiSiteMapChildUrls(String query,int from,int to)  throws Throwable {

		List<String> getChildForResult=new ArrayList<String>();
		try {
			dbConnect();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String queryTemp=query+" "+from+""+","+""+to+""+";";
		System.out.println("complete query:"+queryTemp);
		Statement stat = con.createStatement();
		ResultSet result1 = stat.executeQuery(queryTemp);
		int slno = 0;
		while(result1.next())
		{
			getChildForResult.add(result1.getString("childurl"));
		}

		result1.close();
		stat.close();
		dbConnectionClose();

		return getChildForResult;

	}

	/**
	 * @author DanishR
	 * This method is used Get Last Table Row ID
	 * @param query
	 * @return 
	 * @throws Throwable
	 */
	public int dbGetLastId(String query)  throws Throwable {
		try {
			dbConnect();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Statement stat = con.createStatement();
		ResultSet result1 = stat.executeQuery(query);

		int sno = 0;
		while(result1.next())
		{
			sno=result1.getInt(1);
		}

		result1.close();
		stat.close();
		dbConnectionClose();
		return sno;
	}

	/**
	 * @author DanishR
	 * This method is used select SiteMap Parent Url for corresponding Child Url from DB table
	 * @param quey
	 * @param from
	 * @param to
	 * @return 
	 * @throws Throwable
	 */
	public String dbSelectHindiSiteMapParentUrls(String query,String childUrl)  throws Throwable {

		String getParentForResult = null;
		try {
			dbConnect();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String queryTemp=query+" "+"= '"+childUrl+"';";
		System.out.println("complete query:"+queryTemp);
		Statement stat = con.createStatement();
		ResultSet result1 = stat.executeQuery(queryTemp);
		int slno = 0;
		while(result1.next())
		{
			getParentForResult =result1.getString("parenturl");
		}
		result1.close();
		stat.close();
		dbConnectionClose();
		return getParentForResult;
	}

	/**
	 * @author DanishR
	 * This Method truncates the SiteMap Parent Table
	 * @throws SQLException
	 */
	public void dbTruncateParentTable() throws Throwable {
		try {
			dbConnect();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Statement stat = con.createStatement();
		String trunctab = "Truncate table sitemap_hindi_parent_urls;";
		stat.executeUpdate(trunctab);
		stat.close();
		dbConnectionClose();
	}

	/**
	 * @author DanishR
	 * This method is used to Query get Parent Urls from DB table
	 * @param quey
	 * @param from
	 * @param to
	 * @return 
	 * @throws Throwable
	 */
	public List<String> dbSelectHindiSiteMapParentUrls(String query)  throws Throwable {

		List<String> getParentForResult=new ArrayList<String>();
		try {
			dbConnect();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("complete query:"+query);
		Statement stat = con.createStatement();
		ResultSet result1 = stat.executeQuery(query);
		int slno = 0;
		while(result1.next())
		{
			getParentForResult.add(result1.getString("urls"));
		}

		result1.close();
		stat.close();
		dbConnectionClose();

		return getParentForResult;

	}

	/**
	 * @param lang
	 * @param tableName
	 * @return
	 * @throws Throwable
	 */
	public  List<String> dbGetGoogleTrendsSynonyms() throws Throwable
	{	
		try {
			dbConnect();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<String> list=new ArrayList<String>();
		Statement stat = con.createStatement();
		String query="select KeyWord from googletrends_synonyms;";
		ResultSet result = stat.executeQuery(query);
		while(result.next())
		{
			list.add(result.getString("KeyWord"));
		}
		result.close();
		stat.close();
		return list;	
	}
}
