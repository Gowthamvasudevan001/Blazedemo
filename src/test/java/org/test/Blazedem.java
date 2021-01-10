package org.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Blazedem extends Base{


	@BeforeClass
	public static void la() {
		launchBrowser();
	}
	
	@AfterClass
	public static void clo() {
		close();
	}
	
	@BeforeMethod
	public void start() {
		startTime();
	}
	
	
	@AfterMethod
	public void end() {
		endTime();
	}
	@Test
	@Parameters({"dep","dest","name","address","city","state","zipcode","type","number","month","year","cardname"})
	public void testcase(String dep,String dest,String name,String address,String city,String state,String zipcode,String type,String number,String month,String year,String cardname) throws InterruptedException {
		
		BlazedemoPojo a = new BlazedemoPojo();
		
		launchurl("https://www.blazedemo.com/");
		
		sele(a.getDeparture(),dep);
		
		sele(a.getDestination(),dest);
		
		click(a.getFind());
		
		click(a.getSelflight());
		
		Thread.sleep(3000);
		
		fill(a.getName(),name);
		
		fill(a.getAddress(),address);
		
		fill(a.getCity(),city);
		
		fill(a.getState(),state);
		
		fill(a.getZipcode(),zipcode);
		
		sele(a.getCardtype(),type);
		
		fill(a.getCardnumber(),number);
		
		fill(a.getCardmonth(),month);
		
		fill(a.getCardyear(),year);
		
		fill(a.getCardName(),cardname);
		
		click(a.getPagesubmit());
		
		Thread.sleep(3000);
		
		printBooking(a.getPrintfinal());
	}

}
