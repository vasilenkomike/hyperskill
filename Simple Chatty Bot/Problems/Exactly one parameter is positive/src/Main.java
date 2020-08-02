import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int i1,i2,i3;
        boolean b1,b2,b3,result;
        i1 = scanner.nextInt();
        i2 = scanner.nextInt();
        i3 = scanner.nextInt();
        b1=i1>0;
        b2=i2>0;
        b3=i3>0;
        result=   (((b1==true)&&((b2==false)&&(b3==false)))
                || ((b2==true)&&((b1==false)&&(b3==false)))
                || ((b3==true)&&((b1==false)&&(b2==false))) );
        System.out.print(result);
    }
}