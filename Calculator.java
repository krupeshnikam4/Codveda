
import java.util.Scanner;

class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         System.out.println();
        System.out.println("---Calculator---");System.out.println();
        System.out.print("Enter Operator: ");
        char operator = sc.next().charAt(0);
        System.out.println();

        System.out.print("Enter num1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter num2: ");
        int num2 = sc.nextInt();
         
        double result;
        switch(operator)
        {
            case '*':
            result = num1*num2;
            System.out.print(result);
            break;

            case '+':
            result = num1+num2;
            System.out.print(result);
            break;

            case '-':
            result= num1-num2;
            System.out.print(result);
            break;

            case '/':
            result = num1/num2;
            System.out.print(result);
            break;

            default : System.out.print("");

        }

    }
}
