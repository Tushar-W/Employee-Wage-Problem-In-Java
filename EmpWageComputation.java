public class EmpWageComputation {

	// CONSTANTS
	static final int IS_FULL_TIME = 1;
	static final int IS_PART_TIME=2;
	static final int EMP_WAGE_PER_HOUR = 20;

	public static void main(String[] args) {
		// VARIABLES
		int empHrs=0;
		int empWage=0;
		// COMPUTATION
		int empCheck = (int)Math.floor(Math.random() * 10) % 3;
		System.out.println(empCheck);
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
		System.out.println("Employee Wage: "+ empWage);
	}
}
