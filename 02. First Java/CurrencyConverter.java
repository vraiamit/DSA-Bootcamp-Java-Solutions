// Input currency in rupees and output in USD.
import java.util.*;
class CurrencyConverter{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input currency in inr  :");
        double inr = sc.nextDouble();
        double usd = inr * 0.0105 ;
		System.out.println("Currency after conversion in USD is :" + (usd) +"$.");
	}
}
