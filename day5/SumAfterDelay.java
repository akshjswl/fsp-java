// <!-- wap to accept two numbers from user and display their sum after 10 sec -->

import java.util.Scanner;

class SumAfterDelay {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.println("enter first number");
         double num1 = scanner.nextDouble();
         System.out.print("Enter second number: ");
         double num2 = scanner.nextDouble();
         try{
            System.out.println("Calculating sum... Please wait 10 seconds.");
            Thread.sleep(10000);
            double sum = num1 + num2;
            System.out.println("Sum: " + sum);
            scanner.close();
         }
         catch(InterruptedException e)
         {}
    }
}