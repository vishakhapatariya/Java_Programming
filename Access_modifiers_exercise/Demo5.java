package myPackage2;

import myPackage1.Demo1;

public class Demo5 extends Demo1{
	public void display5(){
		// a and b can not accessible in another package
		// a is default and b is private
		System.out.println(c+" "+d);
	}
}
