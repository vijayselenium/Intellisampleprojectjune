package javabasics;

public class BankExample {
    public static void main(String[] args) {


        // role - Manager - 500, Staff - 300, Clerk - 200
        // inputs - role , no of working days

        String role = "vijay";
        int noOfworkingDays = 10;
        int salary = 0;

        if(role.equalsIgnoreCase("Manager")){

           salary = 500 * noOfworkingDays;
        }
        else if (role.equalsIgnoreCase("Staff")){
           salary =300 * noOfworkingDays;
        }
        else if(role.equalsIgnoreCase("Clerk")){
            salary = 200 * noOfworkingDays;
        }
        else{
            System.out.println("enter the valid role");
        }
        System.out.println(salary);
    }
}
