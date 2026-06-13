//Take 2 numbers as input and print the largest number.

import java.util.*;
class LargestNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number  :");
        int a = sc.nextInt();
        System.out.println("Enter second number  :");
        int b = sc.nextInt();
		int result = (a > b) ? a : b;
		System.out.println("Greatest number is :" + (result));
	}
        

}
