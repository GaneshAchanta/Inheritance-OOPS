package inheritance;
	class Father{
		int father_bank_bal = 2000;
		public void fatherBalance() {
			System.out.println("Father's Bank Balance::" +father_bank_bal);
		}
	}
	class Son extends Father{
		int son_bank_bal = 1000+father_bank_bal;
		public void sonsBalance() {
			System.out.println("Son's Bank Balance::"+son_bank_bal);
		}
	}
public class SingleInheritance {

	public static void main(String[] args) {
		Son s = new Son();
		s.fatherBalance();
		System.out.println();
		s.sonsBalance();

	}

}
