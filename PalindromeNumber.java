import java.util.Scanner; 
public class PalindromeNumber  
{ 
    public static void main(String[] args)  
    { 
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter a number: "); 
        int num = sc.nextInt(); 
        int reverse = 0, temp = num; 
 
        while (temp != 0)  
        { 
            reverse = reverse * 10 + temp % 10;  
            temp /= 10;                 
        } 
        if (num == reverse) 
        { 
            System.out.println(num + " is a palindrome."); 
        }  
        else  
        { 
            System.out.println(num + " is not a palindrome."); 
        } 
    }    
}
