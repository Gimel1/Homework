package homeWOrkDocx;

public class Ex4 {

	
		String MyUserId = "nik";
		String MyPassword = "abc123";
		String userid = "nik";
		String password = "abc123";
		
		boolean i = Authorization(MyUserId , MyPassword , userid , password);
		
		if(i==true) {
		System.out.println("Authentication Passed!");
		}else {
		System.out.println("Authentication Failed!");
		}
		
			
		}
		
		
			
		

		public static boolean Authorization(String a  , String b , String c , String d) {
			if((a.equals(c) && b.equals(d))) return true; 
			else 
		{ return false;
			
				
		}
			
			
		}
		
}

	


