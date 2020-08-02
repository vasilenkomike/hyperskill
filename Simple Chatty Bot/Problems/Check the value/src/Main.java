import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        boolean result;
        int i;
        i = scanner.nextInt();
        result = (i>0)&&(i<10);
        System.out.print(result);
    }
}