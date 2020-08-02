import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String str;
        int r1,r2;
        str = scanner.nextLine();
        r1 = scanner.nextInt();
        r2 = scanner.nextInt();
        System.out.print(str.substring(r1,r2+1));
    }
}