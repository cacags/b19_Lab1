package Day_14_Lab_1;

public class Question01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		stringTimes("Hi",2);
		stringTimes("Hi",3);
		stringTimes("Hi",1);
			
	}
	
	public static void stringTimes(String hi, int times) {
				
		if(times>=0) {
			
			for (int i=1;i<=times;i++) {
			
				System.out.print(hi);
			
			}
				System.out.println();
				
		}else {
			System.out.println("Invalid Input");
			
		}
			
	}

}
