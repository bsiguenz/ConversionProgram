import java.util.ArrayList;

class PrimeNumbers {

    int totalPrimeNumbers;
    ArrayList<Integer> primes;
    int primeIndex;

    public PrimeNumbers(){

        primes = new ArrayList<>();
        primeIndex = 0;
    }

    public void computePrimes(int totalNumber){
        totalPrimeNumbers = totalNumber;
        int primeCount = 0;
        for(int i=2; i<1000; i++){
            if(primeCount < this.totalPrimeNumbers){

               if(checkPrime(i)){

                   this.primes.add(i);
                   primeCount++;
               }
            }

        }
    }

    public boolean checkPrime(int numberToCheck) {
        int remainder;
        for (int i = 2; i <= numberToCheck / 2; i++) {
            remainder = numberToCheck % i;

            if (remainder == 0) {
                return false;
            }
        }
        return true;
    }

    public int getFirstPrime(){
        return primes.get(0);
    }

    public int getSecondPrime(){
        return primes.get(1);
    }

    public int getNext(){
        return primes.get(primeIndex++);
    }

    @Override
    public String toString() {
        String value = "";
        for (int i: primes) {
            value+=i+",";
        }
        return value;
    }
}

class Main{
    public static void main(String[] args){
        PrimeNumbers p = new PrimeNumbers();
        p.computePrimes(5);
        System.out.println("Primes: "+p.toString());
        System.out.println("First Prime: "+p.getFirstPrime());
        System.out.println("Second Prime: "+p.getSecondPrime());
        System.out.println("Next Prime: "+p.getNext());
    }
}
