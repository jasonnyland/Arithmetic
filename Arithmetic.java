import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        while (true) {
            System.out.println("1 ) Add");
            System.out.println("2 ) Subtract");
            System.out.println("3 ) Multiply");
            System.out.println("4 ) Divide");
            System.out.println("5 ) Exit");
            System.out.println("Select an option:");
            Scanner scan = new Scanner(System.in);
            char select = scan.next().charAt(0);
            scan.close();
            float a,b;
            switch(select) {
                case '1' :
                    System.out.println("Enter two numbers:");
                    a = scan.nextFloat();
                    b = scan.nextFloat();
                    System.out.println(a + b);
                    break;
                case '2' :
                    System.out.println("Enter two numbers:");
                    a = scan.nextFloat();
                    b = scan.nextFloat();
                    System.out.println(a - b);
                    break;
                case '3' :
                    System.out.println("Enter two numbers:");
                    a = scan.nextFloat();
                    b = scan.nextFloat();
                    System.out.println(a * b);
                    break;
                case '4' :
                    System.out.println("Enter two numbers:");
                    a = scan.nextFloat();
                    b = scan.nextFloat();
                    System.out.println(a / b);
                    break;
                case '5' :
                    System.exit(0);
                    break;
                default :
                    System.out.println("Invalid Selection");
            }
        }
    } 
}