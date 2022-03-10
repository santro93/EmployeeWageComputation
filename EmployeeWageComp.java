package employeeWageComp;

public class EmployeeWageComp {
	// Declared global variables
		public static double RANDOM 			= Math.floor(Math.random()*3);
		public static final int ABSENT			= 0; 
		public static final int IS_PRESENT 		= 1;
		public static final int IS_HALF_PRESENT = 2;
		public static final int WAGE_PER_HR		= 20;
		public static final int FULL_DAY_HR		= 8;
		public static final int HALF_DAY_HR 	= 4;
		
		
	public static void main(String[] args) {
	    // Print Program Name
		           System.out.println("\nWelcome to Employee Wage Computation Program");
		          
		//Check Employee is Present , Absent Or Half Time  By using Random 
		           //Employee is Present
				if (IS_PRESENT == RANDOM ) {
					System.out.println("Employee is Present");
					// Calculate Daily Employee Wage
					int dailyWage = WAGE_PER_HR * FULL_DAY_HR;
					System.out.println(dailyWage);
				}
				 //Employee is Absent
				else if (ABSENT== RANDOM ){
					System.out.println("Employee is Absent");
					// Calculate Daily Employee Wage
					int dailyWage = 0;
					System.out.println(dailyWage);
				}
				 //Employee is Half Time
				else if (IS_HALF_PRESENT == RANDOM ) {
					System.out.println("Employee is Half Time");
					// Calculate Daily Employee Wage
					int halfdailyWage = WAGE_PER_HR * HALF_DAY_HR;
					System.out.println(halfdailyWage);
		
				}
	
				
				
				
	}

}
