import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scan = new Scanner(System.in);
        int i= scan.nextInt();
        int r1,r2,r3,r4;
        r1=i/1000;
        i=i%1000;
        r2=i/100;
        i=i%100;
        r3=i/10;
        i=i%10;
        r4=i;
        if ((r1==r4)&&(r2==r3)){
            System.out.print(1);
        }
        else{
            System.out.print(2);
        }
    }
}