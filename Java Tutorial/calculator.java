import java.util.Scanner;

public class calculator {
    static int add(int a,int b){
        return a+b;
    }
    static int sub(int a,int b){
        return a-b;
    }
    static int mul(int a,int b){
        return a*b;
    }
    static int div(int a,int b){
        if(b==0){
            return 0;
        }
        else{
            return a/b;
        }
    }
    public static void main (String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a Number 1:");
        int a=sc.nextInt();
        System.out.print("Enter an operator(+|-|*|/):");
        char operator=sc.next().charAt(0);
        System.out.print("Enter a Number 2:");
        int b=sc.nextInt();
        switch (operator){
            case '+':
                System.out.print("the Addition of two numbers="+add(a,b));
                break;
            case '-':
                System.out.print("The Subraction of two numbers="+sub(a,b));
                break;
            case '*':
                System.out.print("The Multiplication of two numbers="+mul(a,b));
                break;
            case '/':
                if (b==0){
                System.out.print("Number cannot divide by zero");}
                else {
                    System.out.print("The Division of two numbers=" + div(a, b));
                }
                break;
            default:
                System.out.print("Invalid Operator.");
                break;
        }
    }
}
