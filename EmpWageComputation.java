public class EmpWageComputation {
   // CONSTANTS
   public static final int IS_PART_TIME = 1;
   public static final int IS_FULL_TIME = 2;

   private int noOfCompanies=0;
   private CompanyEmpWage[] companyWageData;

   public EmpWageComputation() {
      companyWageData = new CompanyEmpWage[2];
   }

   private void addCompanyData(String companyName, int empWagePerHr, int workingDays, int totalWorkHr) {
      companyWageData[noOfCompanies] = new CompanyEmpWage(companyName,empWagePerHr,workingDays,totalWorkHr);
      noOfCompanies++;
   }

   public void getEmpWage() {
      for(int i=0; i<noOfCompanies; i++) {
         int totalEmpWage=this.computeEmpWage(companyWageData[i]);
         System.out.println("Total Emp Wage for Company "+companyWageData[i].getCompanyName()+" is"+totalEmpWage);
      }
   }

   public int computeEmpWage(CompanyEmpWage companyWageData) {
      // VARIABLES
      int empHrs=0;
      int monthlyWage=0;
      int totalWorkHr=0;
      int workingDays=0;
      // COMPUTATION
      while(totalWorkHr <= companyWageData.getTotalHrsInMonth() && workingDays < companyWageData.getWorkingDaysInMonth()) {
         int empCheck = (int)Math.floor(Math.random() * 10) % 3;
         switch (empCheck) {
            case  IS_PART_TIME:
               empHrs=4;
               break;
            case  IS_FULL_TIME:
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
      return totalWorkHr * companyWageData.getEmpWagePerHr();
   }

   public static void main(String[] args) {
      EmpWageComputation e1=new EmpWageComputation();
      e1.addCompanyData("Dmart",20,2,10);
      e1.addCompanyData("Big-Bazar",20,2,20);
      e1.getEmpWage();
   }
}
