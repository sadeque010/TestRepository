package array;

public class ArrayDemo {

	public static void main(String[] args) {
  
		
		// declaring array
		String [] myArray = new String [3];
		
		
		// assigning value of the array
		
		myArray [0] = "Selenium";
		myArray [1] = "Eclipse";
		myArray [2] = "Java";
		
		
//		
		System.out.println(myArray[0]);
		System.out.println(myArray[1]);
		System.out.println(myArray[2]);
		
		 
		
		for(int i=0;i<myArray.length;i++)
		{
			System.out.println(myArray[i]);
		}
		 
		
		// another way of declaring the array
		
		
		int [] number = {4, 2, 7};
		for (int i = 0; i<number.length; i++) {
			System.out.println(number[i]);
		}
		
		
		
		System.out.println("example of enhanced for loop");
		// example of enhanced for loop
		
		for (int variable: number) {
			System.out.println(variable);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
