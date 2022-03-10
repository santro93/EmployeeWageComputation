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
		int dailyWage = 0;
		public static void main(String[] args) {
								// Print Program Name
		           System.out.println("\nWelcome to Employee Wage Computation Program");
		          
		           				// Employee Wage Calculation as per Present, Absent Or Half Time  By using "Switch" 
		           switch((int)RANDOM){
		           						//Employee is Absent
		           		case 0:     	
		           							System.out.println("Employee is Absent");
	        	           		        // Calculate Daily Employee Wage
	        	           		   			int dailyWage  = WAGE_PER_HR * ABSENT;
	        	           		   		   System.out.println(dailyWage);     
	        	           		   				        break;
	        	           		   			//Employee is Present
		           		case 1:			   
		           							System.out.println("Employee is Present");
		           						// Calculate Daily Employee Wage
		           							dailyWage = WAGE_PER_HR * FULL_DAY_HR;
		           						   System.out.println(dailyWage);
					   									break;
						        	   	//Employee is Half Time
		           		case 2:
		           							System.out.println("Employee is Half Time");
									   // Calculate Daily Employee Wage
						        	       int halfdailyWage = WAGE_PER_HR * HALF_DAY_HR;
						        	   	   System.out.println(halfdailyWage);
						
				}
	
				
				
				
	}

}
