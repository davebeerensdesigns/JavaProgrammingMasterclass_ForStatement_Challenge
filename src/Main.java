public class Main {
    public static void main(String[] args) {
        int primeCounter = 0;
        for(int i = 50; primeCounter < 3 && i <= 1000; i++){
            if(isPrime(i)){
                System.out.println("Number " + i + " is a prime number");
                primeCounter++;
            }
        }
    }

    public static boolean isPrime(int number){
        if(number <= 1){
            return false;
        }
        for (int i = 2; i <= number / 2; i++){
            if ((number % i) == 0) {
                return false;
            }
        }
        return true;
    }
}