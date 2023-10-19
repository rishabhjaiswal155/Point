package com.tester;
import com.code.Point;
public class TestPoint {
	public static void main(String[] args) {
	 Point p=new Point();
	 p.display();
	 System.out.println("X="+p.getX());
	 System.out.println("Y="+p.getY());
	 p.setX(6);
	 p.setY(10);
	 p.display();
	 ----------------------------------------------------------------------------
	 Point p1=new Point(11,5);
	 p1.display();
	 System.out.println("X="+p1.getX());
	 System.out.println("Y="+p1.getY());
	 p1.setX(5);
	 p1.setY(11);
	 p1.display();
	 
	 boolean result=p.isEqual(p1);
	 System.out.println(result);
	 if(result=true)
		 System.out.println("points p=p1");
	 else
		 System.out.println("points p!=p1");
	}
}
