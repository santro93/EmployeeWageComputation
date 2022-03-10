package employeeWageComp;

public class EmployeeWageComp {
	// Declared global variables
		public static double RANDOM = Math.floor(Math.random()*2);
		public static final int IS_PRESENT = 1;
		public static final int WAGE_PER_HR = 20;
		public static final int FULL_DAY_HR = 8;

	public static void main(String[] args) {
	    // Print Program Name
		           System.out.println("\nWelcome to Employee Wage Computation Program");
	
		//Check Employee is Present or Absent By using Random 
		
				if (IS_PRESENT == RANDOM ) {
					System.out.println("Employee is Present");
					// Calculate Daily Employee Wage
					int dailyWage = WAGE_PER_HR * FULL_DAY_HR;
					System.out.println(dailyWage);
				}
				else{
					System.out.println("Employee is Absent");
					// Calculate Daily Employee Wage
					int dailyWage = 0;
					System.out.println(dailyWage);
				}
				
		
			
	
				
				
				
	}

}
