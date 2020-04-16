public class EmpWageComputation {
	// CONSTANTS
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;

	public static int calcEmpWageForCompany(String company, int empWagePerHr, int workingDaysInMonth, int totalHrsInMonth) {
		// VARIABLES
		int empHrs=0;
		int monthlyWage=0;
		int totalWorkHr=0;
		int workingDays=0;
		// COMPUTATION
		while(totalWorkHr <= totalHrsInMonth && workingDays < workingDaysInMonth) {
			int empCheck = (int)Math.floor(Math.random() * 10) % 3;
			switch (empCheck) {
				case	IS_PART_TIME:
					empHrs=4;
					break;
				case	IS_FULL_TIME:
					empHrs=8;
					break;
				default:
					empHrs=0;
					break;
			}
			totalWorkHr +=empHrs;
			workingDays++;
		}
		int totalEmpWage=totalWorkHr * empWagePerHr;
		System.out.println("Total Emp Wage For Company "+company+" Is: "+totalEmpWage);
		return totalEmpWage;
	}

	public static void main(String[] args) {
		calcEmpWageForCompany("D-mart",20,20,100);
		calcEmpWageForCompany("Reliance",10,20,100);
	}
}
