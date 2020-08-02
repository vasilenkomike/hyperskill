import  java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n,min;
        int[] arr;

        n = scanner.nextInt();
        arr = new int[n];
        for (int i =0; i<n; i++){
            int k = scanner.nextInt();
            arr[i] = k;
        }
        min = arr[0];
        for (int i =0; i<n; i++){
            if (arr[i] < min){
                min = arr[i];
            };
        }
        System.out.println(min);
    }
}