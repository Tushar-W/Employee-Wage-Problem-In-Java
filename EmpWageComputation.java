public class EmpWageComputation {
	// CONSTANTS
	static final int IS_FULL_TIME = 1;
	static final int IS_PART_TIME=2;
	static final int EMP_WAGE_PER_HOUR = 20;
	static final int WORKING_DAYS_IN_MONTH=20;
	static final int TOTAL_HRS_IN_MONTH=100;

	public static int getMonthlyWage() {
		// VARIABLES
		int empHrs=0;
		int empWage=0;
		int monthlyWage=0;
		int totalWorkHr=0;
		int workingDays=0;
		// COMPUTATION
		while(totalWorkHr < TOTAL_HRS_IN_MONTH && workingDays < WORKING_DAYS_IN_MONTH) {
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
			totalWorkHr=totalWorkHr + empHrs;
			workingDays++;
		}
		System.out.println("Total Work Hour In Month:"+totalWorkHr);
		monthlyWage=totalWorkHr * EMP_WAGE_PER_HOUR;
		return monthlyWage;
	}

	public static void main(String[] args) {
		System.out.println("Employee Monthly Wage: "+ getMonthlyWage());
	}
}
