public class Sum3and5Challenge {
    public static void main(String[] args) {

        int numbersDivided = 0;
        int sumNumbers = 0;

        for (int i = 0; i <= 1000; i++){
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println(i + " is divisible by 3 and 5.");
                sumNumbers = sumNumbers + i;
                numbersDivided++;
                if (numbersDivided == 5){
                    System.out.println("Total " + sumNumbers);
                    break;
                }
            }
        }
    }


}
