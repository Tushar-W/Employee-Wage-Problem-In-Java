public class EmpWageComputation {
	// CONSTANTS
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;

	private final String company;
	private final int empWagePerHr;
	private final int workingDaysInMonth;
	private final int totalHrsInMonth;

	public EmpWageComputation(String company, int empWagePerHr, int workingDaysInMonth, int totalHrsInMonth) {
		this.company=company;
		this.empWagePerHr=empWagePerHr;
		this.workingDaysInMonth=workingDaysInMonth;
		this.totalHrsInMonth=totalHrsInMonth;
	}

	public int computeEmpWage() {
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
		System.out.println("Total Work Hour:" +totalWorkHr);
		return totalWorkHr * empWagePerHr;
	}

	public static void main(String[] args) {
		EmpWageComputation dmart=new EmpWageComputation("D-mart",20,20,100);
		EmpWageComputation reliance=new EmpWageComputation("Reliance",10,10,50);
		System.out.println("Total Emp Wage For Company "+dmart.company+" Is: "+dmart.computeEmpWage());
		System.out.println("Total Emp Wage For Company "+reliance.company+" Is: "+reliance.computeEmpWage());
	}
}
