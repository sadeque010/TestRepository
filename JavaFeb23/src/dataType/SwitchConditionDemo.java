package dataType;

public class SwitchConditionDemo {

	public static void main(String[] args) {
 
		
		
		/*
		 * Switch Statement Syntax;
		 * 
		 * Switch (expression){
		 * 
		 * case value1:
		 * //code to be executed
		 * break;
		 * case value2:
		 * //code to be executed
		 * break;
		 * case value3:
		 * //code to be executed
		 * break;
		 * case value4:
		 * //code to be executed
		 * break;
		 * 
		 * default:
		 * //code to be executed
		 * }
		 * 
		 * 
		 */
		
		int dayNumber = 8;
		
		switch (dayNumber) {
		
		case 1:
		System.out.println("Today is monday");		
		break;				
		case 2:
		System.out.println("Today is Tuesday");
		
		break;
		case 3:
		System.out.println("Today is Wednesday");
		
		break;
		case 4:
		System.out.println("Today is Thursday");
		
		break;
		case 5:
		System.out.println("Today is Friday");
		
		break;
		case 6:
		System.out.println("Today is Saturday");
		
		break;
		case 7:
		System.out.println("Today is Sunday");
		break;
		
		default:
		System.out.println("Sorry it is not a day");
		
       }
			
	}

}
