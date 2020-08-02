import  java.util.Scanner;
class Main {
    public static void main(String[] args) {
        int max,cur;
        Scanner scanner= new Scanner(System.in);
        cur = scanner.nextInt();
        max =cur;
        while ((cur)!=0){
            cur = scanner.nextInt();
            if (max < cur) {
                max = cur;
            }

        }
        System.out.println(max);
    }
}