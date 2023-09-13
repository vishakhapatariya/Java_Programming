import myPackage1.Demo1;
import myPackage1.Demo2;
import myPackage1.Demo3;
import myPackage2.Demo4;
import myPackage2.Demo5;

class Test{

	public static void main(String args[]){
		Demo1 x1 = new Demo1();
		System.out.println("Access within same class : ");
		x1.display();

		Demo2 x2 = new Demo2();
		System.out.println("Access within same package non sub class : ");
		x2.display2();

		Demo3 x3 = new Demo3();
		System.out.println("Access within same package sub class : ");
		x3.display3();

		Demo4 x4 = new Demo4();
		System.out.println("Access outside package non sub class  : ");
		x4.display4();

		Demo5 x5 = new Demo5();
		System.out.println("Access outside package sub class  : ");
		x5.display5();
	}
}
