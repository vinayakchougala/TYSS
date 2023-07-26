package TYSSAssignment;

public class Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("FM");
		senorita(3);
	}
	public static void senorita(int n) {
		System.out.println("hello");
		n--;
		if(n==0) {
			return;
		}
		senorita(n);
		System.out.println("Bye..!");
	}
}
