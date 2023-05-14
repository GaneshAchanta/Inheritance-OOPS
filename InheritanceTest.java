package inheritance;
class Parent{
	public void m1() {
		System.out.println("I am parent class method");
	}
}
class Child extends Parent{
	public void m2() {
		System.out.println("I am child class method");
	}
}

public class InheritanceTest {

	public static void main(String[] args) {
		Parent pobj = new Parent();//Parent class object
		pobj.m1();
		//pobj.m2();//C.E-parent property can't access child class object
		Child cobj = new Child();
		cobj.m1();//access the Parent property by using Child class object
		cobj.m2();//access the Child property by using Child class
	}

}
