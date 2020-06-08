public class FactorPrinter {
    public static void main(String[] args) {
            printFactors(4);
    }

    public static void printFactors (int number){
        String factors = "";
        if (number < 1){
            System.out.println("Invalid Value");
        } else {
            for(int i = 1; i <= number/2; i++){
                if(number % i == 0){
                   factors += i + " ";
                }

            }
            factors += Integer.toString(number);
            System.out.println(factors);

        }

    }

}

