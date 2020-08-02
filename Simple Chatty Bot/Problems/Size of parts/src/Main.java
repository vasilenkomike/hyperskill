import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int num, c,l,s,p;
        c=l=s=p=0;
        num = scanner.nextInt();
        for (int i = 0; i < num; i++){
            c = scanner.nextInt();
            if (c == 0) {
                p++;
            }
            else if(c > 0){
                l++;
            }
            else if (c < 0){
                s++;
            }
        }
        System.out.print(p + " " + l + " " + s);
    }
}