public class EmployeeWageComputation {
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    public static final int EMP_RATE_PER_HR = 20;
    public static final int NUM_OF_WORKING_DAYS =20;

    public static void main(String args[]){
        int empHrs;
        int dailyWage;
        int monthlyWage = 0;
        for (int day = 0; day < NUM_OF_WORKING_DAYS; day++) {
            int empCheck = (int) Math.floor(Math.random()*10)%3;
            switch (empCheck) {
                case IS_PART_TIME :
                     empHrs = 4;
                     break;
                case IS_FULL_TIME :
                     empHrs = 8;
                     break;
                default :
                     empHrs = 0;
            }
            dailyWage = empHrs * EMP_RATE_PER_HR;
            monthlyWage += dailyWage;
            System.out.println("Daily Employee Wage : " + dailyWage);
        }
        System.out.println("Monthly Employee Wage : " + monthlyWage);
    }

}
