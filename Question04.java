package Day_14_Lab_1;

public class Question04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	deerPlay(70, false);
	deerPlay(95, false);
	deerPlay(95, true);
	
	}
		
	public static void deerPlay (int temp, boolean isSummer) {
		
		if (isSummer && (temp>=60 && temp<=100)) {
			System.out.println("true");
		}else if (!isSummer && (temp>=60 && temp<=90)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
	}

}
