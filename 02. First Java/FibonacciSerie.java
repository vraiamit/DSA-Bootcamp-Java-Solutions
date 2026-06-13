import java.util.*;

class FibonacciSerie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers to print: ");
        int n = sc.nextInt();
        
        int a = 0;
        int b = 1;
        int next;
        
        System.out.println("Fibonacci Series is : ");
        
        for (int x = 1; x <= n; x++) {
            System.out.print(a + " "); // a ko print kiya aur space add kiya
            
            // Yahan se int hata diya gaya hai kyunki variables upar ban chuke hain
            next = a + b; 
            a = b;        
            b = next;     
        }
        
        sc.close(); // Scanner ko close karna ek good practice hai
    }
}