import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        int r1,r2;
        Scanner scanner = new Scanner(System.in);
        r1 = scanner.nextInt();
        r2 = scanner.nextInt();
        for(int i = r1; i <= r2; i++){
            if (( i%3 == 0) && ( i%5 == 0)){
                System.out.println("FizzBuzz");
            }
            else if ( (i%3) == 0) {
                System.out.println("Fizz");
            }
            else if ( (i%5) == 0) {
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }
        }
    }
}