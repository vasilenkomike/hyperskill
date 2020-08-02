import java.util.Scanner;
class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n,max,current;
    max = -1;
    n = scanner.nextInt();
    for(int i = 0 ; i<n;i++){
        current = scanner.nextInt();
        if ((current%4) == 0) {
            if (current > max) {
                max = current;
            }
        }
    }
    System.out.println(max);
    }
}