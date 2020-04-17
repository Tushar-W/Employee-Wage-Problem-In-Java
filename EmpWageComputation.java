import java.util.ArrayList;

public class EmpWageComputation {
   // CONSTANTS
   public static final int IS_PART_TIME = 1;
   public static final int IS_FULL_TIME = 2;

   private int noOfCompanies=0;
   private ArrayList<CompanyEmpWage> companyWageDataList;

   public EmpWageComputation() {
      companyWageDataList = new ArrayList<CompanyEmpWage>();
   }

   private void addCompanyData(String companyName, int empWagePerHr, int workingDays, int totalWorkHr) {
      CompanyEmpWage companyWageData = new CompanyEmpWage(companyName,empWagePerHr,workingDays,totalWorkHr);
      companyWageDataList.add(companyWageData);
   }

   public void getEmpWage() {
      for(int i=0; i<companyWageDataList.size(); i++) {
			CompanyEmpWage companyWageData = companyWageDataList.get(i);
         int totalEmpWage = this.computeEmpWage(companyWageData);
         System.out.println("Total Emp Wage for Company "+companyWageData.getCompanyName()+" is"+totalEmpWage);
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
      EmpWageComputation empWageBuilder=new EmpWageComputation();
      empWageBuilder.addCompanyData("Dmart",20,20,100);
      empWageBuilder.addCompanyData("Big-Bazar",20,10,50);
      empWageBuilder.getEmpWage();
   }
}
