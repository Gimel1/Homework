package homeWOrkDocx;

public class Ex4 {

	
		String MyUserId = "nik";
		String MyPassword = "abc123";
		boolean i = Authorization(MyUserId , MyPassword);
		
		if(i==true) {
		System.out.println("Authentication Passed!");
		}else {
		System.out.println("Authentication Failed!");
		}
		
			
		}
		
		
			
		

		public static boolean Authorization(String userid  , String password) {
			String userid;
			String password;
			userid = "nik";
			password = "abc123";
			if((userid.equals(MyUserId) && password.equals(MyPassword))) return true; 
			else 
		{ return false;
			
				
		}
			
			
		}
		
}

	


