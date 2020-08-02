import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input,count;
        input = -1;
        count =  0;
        while(true){
            input = scanner.nextInt();
            if (input!=0){count++;}
            else {break;}
        }
        System.out.println(count);
    }
}