package inheritance;
class Super{
	public Super() {
		System.out.println("I am parent constructor");
	}
}
class Sub extends Super{
	public Sub() {
		System.out.println("I am child constructor");
	}
}
public class ConTest {

	public static void main(String[] args) {
		Sub obj = new Sub();//it calls first parent class then child class
		Super sobj = new Super();//it calls only itself
		
	}

}
