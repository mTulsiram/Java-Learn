import java.time.Instant;
import java.util.Scanner;

public class Hello{
    public static void main(String[] args){
        System.out.println("Hello World");

        System.out.println("2+3 = " + (2+3));

        String name  = "Tulsiram Methre";
        int age = 27;
        double height = 5.4;
        System.out.println("Name : "+ name);
        System.out.println("Height : "+ height);
        System.out.println("Age : "+ age);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        System.out.println("The number you  entered is "+ number);
            
        }
}