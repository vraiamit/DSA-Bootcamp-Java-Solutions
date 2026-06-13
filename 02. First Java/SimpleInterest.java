
//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
import java.util.*;
class SimpleInterest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Principal :");
        double p = sc.nextDouble();
        System.out.println("time :");
        double t = sc.nextDouble();
        System.out.println("rate of intrest :");
        double r = sc.nextDouble();
        double si = (p*r*t)/100;
        System.out.println("Simple intrest :"+ si);
        
    }
}
