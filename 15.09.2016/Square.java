public class Square {
	 
	 public static void main (String[] args){
            int n = Integer.parseInt (args [0]); 
			for (int k = 0; k != n; k++) {
				for (int i = 0; i != n; i++) {
					System.out.print ("*");
			} 
			System.out.println ();
	    }
	 }
	
}