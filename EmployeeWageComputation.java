public class EmployeeWageComputation {

   public static void main(String args[]){
      int IS_FULL_TIME = 1;
      int EMP_RATE_PER_HR = 20;
      int empHrs;
      int dailyWage;
      double empCheck=Math.floor(Math.random()*10)%2;
      if (IS_FULL_TIME == 1 )
          empHrs = 8;
      else
          empHrs = 0;
      dailyWage = empHrs * EMP_RATE_PER_HR;
      System.out.println("Daily Employee Wage : " + dailyWage);
   }
}
