package slot7.packages;

class PrimeFact
{
 public static int[] calculatePrimeFactors(int number) {
        int[] factors = new int[number];
        int index = 0;
        int i = 2;
        while (i <= number) {
            if (number % i == 0) {
                factors[index++] = i;
                number /= i;
            } else {
                i++;
            }
        }
        return factors;
    }
}