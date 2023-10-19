package com.tester;

import com.code.Date;

public class TestDate {

	public static void main(String[] args) {
		Date d=new Date();
		d.display();
		System.out.println("DAY= "+d.getDd());
		System.out.println("MONTH= "+d.getMm());
		System.out.println("YEAR= "+d.getYy());
		d.setDd(20);
		d.setMm(10);
		d.setYy(2023);
		d.display();
		
		Date d1=new Date(21,10,2023);
		d1.display();
		System.out.println("DAY="+d1.getDd());
		System.out.println("MONTH="+d1.getMm());
		System.out.println("YEAR="+d1.getYy());
		d.setDd(30);
		d.setMm(10);
		d.setYy(2023);
		d.display();
		
		System.out.println("----------------------------------------");
		
	}

}
