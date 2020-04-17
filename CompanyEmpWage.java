public class CompanyEmpWage {
	private final String companyName;
   private final int empWagePerHr;
   private final int workingDaysInMonth;
   private final int totalHrsInMonth;

   public CompanyEmpWage(String companyName, int empWagePerHr, int workingDaysInMonth, int totalHrsInMonth) {
      this.companyName=companyName;
      this.empWagePerHr=empWagePerHr;
      this.workingDaysInMonth=workingDaysInMonth;
      this.totalHrsInMonth=totalHrsInMonth;
   }

	public String getCompanyName() {
		return companyName;
	}

	public int getEmpWagePerHr() {
		return empWagePerHr;
	}

	public int getWorkingDaysInMonth() {
		return workingDaysInMonth;
	}

	public int getTotalHrsInMonth() {
		return totalHrsInMonth;
	}

}

