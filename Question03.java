package Day_14_Lab_1;

public class Question03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	specialEleven(22);
	specialEleven(11);
	specialEleven(24);
	specialEleven(3);
	specialEleven(1);
	}

	public static void specialEleven(int eleven) {
		
		if (eleven%11 == 0 || eleven%11==1) {
			if(eleven==1) {
				System.out.println(false);
			}else {
				System.out.println("true");	
			}
			
		}else {
			System.out.println("false");
		}
		
	}
	
	
}
