import packages.PrimeFact;
import java.util.*;

public class PrimeFactors {
    
    public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	
        int number = Integer.parseInt(sc.nextLine());
        int[] factors = PrimeFact.calculatePrimeFactors(number);
        System.out.print("Prime factors of " + number + ": ");
        for (int i = 0; i < factors.length; i++) {
            if (factors[i] != 0) {
                System.out.print(factors[i] + " ");
            }
        }
    }
}s