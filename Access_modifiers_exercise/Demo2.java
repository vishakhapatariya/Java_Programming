package myPackage1;

public class Demo2{

	public void display2(){
		Demo1 d = new Demo1();
		// b is not accessible outside class
		// b is private
		System.out.println(d.a+" "+d.c+" "+d.d);
	}
}
