package Day_14_Lab_1;

public class Question06 {

	public static void main(String[] args) {
		
		cigarParty(30, false);
		cigarParty(50, true);
		cigarParty(70, true);
	
	}
		
	public static void cigarParty(int cigars, boolean b) {
		
		if (b && cigars>=40) {
			System.out.println(true);
			
		}else if (!b && (cigars>=40 && cigars<=60)){
			System.out.println(true);
		
		}else {
			System.out.println(false);
		
		}
		
		
	}
	

}
