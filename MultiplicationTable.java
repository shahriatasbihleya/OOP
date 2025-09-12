
import java.util.Scanner; 
 
public class MultiplicationTable 
{ 
    public static void main(String[] args)  
    { 
        Scanner input = new Scanner(System.in); 
 
        System.out.print("Enter a number to print its table: "); 
        int num = input.nextInt(); 
 
        int i = 1;  
 
        System.out.println("Multiplication Table of " + num + ":"); 
 
        while (i <= 10) 
        { 
            System.out.println(num + " x " + i + " = " + (num * i)); 
            i++; 
        } 
    }   
}