package dataType;

public class ElseIfDemo {

	public static void main(String[] args) {
 
		
		/**
		 * Else if Syntax;
		 * 
		 * if (condition)
		 * {
		 * code to be executed
		 * } 
		 * else if (condition)
		 * {
		 * code to be executed
		 * }
		 * else
		 * {
		 * code to be executed
		 * }
		 */
		
		int age = 99;
		
		if (age >= 18 && age <= 80) {
		
					System.out.println("It is high to get married");
	    } 
		else if (age > 80 && age< 129) 
		{
					System.out.println("Pray to Allah that You are in good health");
		}
		else 
		{
					System.out.println(" You are too young !! wait for a while");
		}

}
}
