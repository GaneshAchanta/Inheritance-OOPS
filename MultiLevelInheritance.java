package inheritance;
	class GrandFather{
		int grand_father_bal = 3000;
		public void grandFatherBalance() {
			System.out.println("Grand Father's Bank Balance ::" +grand_father_bal);
		}
	}
	class Father1 extends GrandFather{
		int father_bank_bal = 2000 + grand_father_bal;
		public void fatherBalance() {
			System.out.println("Father's Bank Balance ::" + father_bank_bal);
		}
	}
	class Son1 extends Father1{
		int son_bank_bal = 5000 + father_bank_bal;
		public void sonBalance() {
			System.out.println("Son's Bank Balance ::" +son_bank_bal);
		}
	}

public class MultiLevelInheritance {

	public static void main(String[] args) {
		Son1 s= new Son1();
		s.grandFatherBalance();
		System.out.println();
		s.fatherBalance();
		System.out.println();
		s.sonBalance();
		System.out.println();
	}

}
