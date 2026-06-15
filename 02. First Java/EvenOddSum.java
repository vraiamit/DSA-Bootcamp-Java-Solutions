import java.util.*;
public class EvenOddSum{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("How much number you want to put :");
        int n = sc.nextInt();
        int sum_odd =0 , sum_even = 0 ;  // java me jb bhi koi variable iniialise ktro hmesha value de do 
        while(n>0){
            System.out.println("Enter number :");
            int i = sc.nextInt();
            if (i%2==0){
                sum_even= sum_even+i;
            }
            else{
                sum_odd=sum_odd+i;

            }
            n--;

        }
        System.out.println("Sum of even number  :" + (sum_even));
        System.out.println("Sum of odd number :" +(sum_odd));


        
    }
    
}
