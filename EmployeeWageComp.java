package employeeWageComp;

public class EmployeeWageComp {
	// Declared global variables
		public static double RANDOM = Math.floor(Math.random()*2);
		public static final int IS_PRESENT = 1;
			

	public static void main(String[] args) {
	   // Print Program Name
		System.out.println("\nWelcome to Employee Wage Computation Program");
	
		//Check Employee is Present or Absent By using Random 
		
				if (IS_PRESENT == RANDOM ) {
					System.out.println("Employee is Present");
				}
				else{
					System.out.println("Employee is Absent");
				}
	
	
	}

}
