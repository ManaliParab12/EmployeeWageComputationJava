public class EmployeeWageComputation {

   public static void main(String args[]){
      int IS_FULL_TIME = 1;
      int IS_PART_TIME = 2;
      int EMP_RATE_PER_HR = 20;
      int empHrs;
      int dailyWage;
      double empCheck=Math.floor(Math.random()*10)%3;
      if ( empCheck == IS_PART_TIME )
          empHrs = 4;
      else if ( empCheck == IS_FULL_TIME )
          empHrs = 8;
      else
          empHrs = 0;
      dailyWage = empHrs * EMP_RATE_PER_HR;
      System.out.println("Daily Employee Wage : " + dailyWage);
   }
}
