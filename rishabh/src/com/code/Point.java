package com.code;
public class Point {
private int x,y;

public Point() {
  System.out.println("Default Constructor invoked");
  x=10;
  y=6;
}

public Point(int x, int y) {
	System.out.println("--------------paremetreize Constructor invoked-------");
	this.x = x;
	this.y = y;
}

public void display()
{
	System.out.println("Point X="+x+"point Y= "+y);
}

public int getX() {
	return x;
}

public void setX(int x) {
	this.x = x;
}

public int getY() {
	return y;
}

public void setY(int y) {
	this.y = y;
}

@Override
public String toString() {
	return "Point x=" + x + ", y=" + y ;
}

public boolean isEqual(Point pobj)
{
	if(this.x==pobj.x && this.y==pobj.y)
	{
		return true;
	}
	else
	{
		return false;
	}
}






}
