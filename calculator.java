import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number:");
        System.out.println("1= addition, 2= subtraction, 3= multiplication,4= division");
        int num= sc.nextInt();
        System.out.println("enter the first number");
        int a= sc.nextInt();
        System.out.println("enter the second number");
        int b= sc.nextInt();
        switch(num){
            case 1:
           System.out.println(a+b);
           break;
           case 2:
           System.out.println(a-b);
           break;
           case 3:
           System.out.println(a*b);
           break;
           case 4:
           System.out.println(a/b);
           break;
           



           

        }

    }
    
}
