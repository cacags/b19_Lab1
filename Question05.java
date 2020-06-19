package Day_14_Lab_1;

public class Question05 {

	public static void main(String[] args) {
			
		caughtSpeeding(60, true);
		caughtSpeeding(65, false);
		caughtSpeeding(65, true);
		
	}
	
	public static void caughtSpeeding(int speed, boolean birthday) {
		int temp=0;
		if(birthday) {
			temp=temp+5;			
		}
		if(speed<=60+temp) {
			System.out.println("0");
		}else if (speed>=61+temp && speed<=80+temp) {
			System.out.println("1");
		}else if (speed>=81+temp) {
			System.out.println("3");
		}
			
	}
	

}
