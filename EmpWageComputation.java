public class EmpWageComputation {

	// CONSTANTS
	static final int IS_FULL_TIME = 1;
	static final int IS_PART_TIME=2;
	static final int EMP_WAGE_PER_HOUR = 20;
	static final int WORKING_DAYS_IN_MONTH=20;

	public static int getMonthlyWage() {
		// VARIABLES
		int empHrs=0;
		int empWage=0;
		int monthlyWage=0;
		// COMPUTATION
		for(int day=1; day<=WORKING_DAYS_IN_MONTH; day++){
			int empCheck = (int)Math.floor(Math.random() * 10) % 3;
			switch (empCheck) {
				case	IS_FULL_TIME:
					empHrs=8;
					break;
				case	IS_PART_TIME:
					empHrs=4;
					break;
				default:
					empHrs=0;
					break;
			}
			empWage = empHrs * EMP_WAGE_PER_HOUR;
			monthlyWage=monthlyWage + empWage;
		}
		return monthlyWage;
	}

	public static void main(String[] args) {
		System.out.println("Employee Monthly Wage: "+ getMonthlyWage());
	}
}
