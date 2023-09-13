package myPackage2;

import myPackage1.Demo1;

public class Demo4{
	public void display4(){
		// a and b can not accessible in another package
		// a is default and b is private
		// c is not accessible in non-sub class of another package
		// c is protected
		Demo1 d = new Demo1();
		System.out.println(d.d);
	}
}
