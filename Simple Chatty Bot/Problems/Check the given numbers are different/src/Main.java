import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int i1,i2,i3;
        i1 = scanner.nextInt();
        i2 = scanner.nextInt();
        i3 = scanner.nextInt();
        boolean res = (i1!=i2)&&(i2!=i3)&&(i1!=i3)&&(i2!=i1);
        System.out.print(res);
    }
}