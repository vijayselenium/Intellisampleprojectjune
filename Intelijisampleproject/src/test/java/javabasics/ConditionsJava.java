package javabasics;

public class ConditionsJava {

    public static void main(String[] args) {

        int firstNumber = 100 ;
        int secondNumber =100 ;

        if(firstNumber == secondNumber) {
            System.out.println("Two no are equal");
        }
        else if(firstNumber > secondNumber){
            System.out.println("first no id greater");
        }
        else if(firstNumber < secondNumber){
            System.out.println("2nd no is greater");
        }
        else{
            System.out.println("not equal");
        }
    }
}
