import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input,first;
        input = scanner.nextLine();

        if (("J".equals((input.substring(0,1)))) || ("j".equals(input.substring(0,1)))) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}