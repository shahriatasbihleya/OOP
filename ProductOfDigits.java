import java.util.Scanner; 
public class ProductOfDigits  
{ 
    public static void main(String[] args)  
    { 
        Scanner input = new Scanner(System.in); 
        System.out.print("Enter a number: "); 
        int num = input.nextInt(); 
        if (num < 0)  
        { 
            num = -num; 
        } 
        if (num == 0) 
        { 
            System.out.println("Product of digits is: 0"); 
        }  
        else  
        { 
            int product = 1; 
            while (num > 0)  
            { 
                product = product * (num % 10); 
                num = num / 10;                 
            } 
            System.out.println("Product of digits is: " + product); 
        } 
    }     
}
