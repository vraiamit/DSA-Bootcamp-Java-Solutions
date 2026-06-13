// Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
import java.util.*;
class Calculator{
	public static void main(String[] args){
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the value of a : ");
		double a = sc.nextDouble();
		System.out.println("Enter the value of b : ");
		double b = sc.nextDouble();
		System.out.println("Choose an operator (+, -, *, /) : ");
		char c = sc.next().charAt(0);
		if (c=='+'){
			System.out.println("sum of a and b is "+ (a+b));
			}
		else if (c=='-'){
			System.out.println("Div of a and b is "+ (a-b));
			}
		else if (c=='*'){
			System.out.println("Mul of a and b is "+ (a*b));
			}
		else if (c=='/'){
			System.out.println("Division of a and b is "+ (a /b));
			}
		else{
			System.out.println("Please fill correct input");

			}
		}
	}
