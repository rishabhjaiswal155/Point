package com.code;

public class Date {
private int dd,mm,yy;

public Date() {
	System.out.println("-------Default constructor--------");
	dd=19;
	mm=10;
	yy=2023;
}

public Date(int dd, int mm, int yy) {
	System.out.println("-------Paremeterize Constructor invoked-------");
	this.dd = dd;
	this.mm = mm;
	this.yy = yy;
}

public int getDd() {
	return dd;
}

public void setDd(int dd) {
	this.dd = dd;
}

public int getMm() {
	return mm;
}

public void setMm(int mm) {
	this.mm = mm;
}

public int getYy() {
	return yy;
}

public void setYy(int yy) {
	this.yy = yy;
}
public void display()
{
	System.out.println("Day= "+dd+"Month= "+mm+"Year= "+yy);
}



}
