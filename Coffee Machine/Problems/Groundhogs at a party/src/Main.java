import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cups;
        boolean weekend;
        cups = scanner.nextInt();
        weekend = scanner.nextBoolean();
        if (weekend){
            if ((cups >=15) &&(cups <=25)){
                System.out.println(true);
            }
            else
            {
                System.out.println(false);
            }
        }
        else {
            if ((cups >=10) &&(cups <=20)){
                System.out.println(true);
            }
            else {
                System.out.println(false);
            }
        }
    }
}