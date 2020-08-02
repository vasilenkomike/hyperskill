import java.util.Scanner;
class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] arr;
    int n;
    String[] input = scanner.nextLine().split(" ");
    arr = new int[input.length];
    n = scanner.nextInt();
    while (n>arr.length){
       n = n - arr.length;
    }
    int k = n;
    for(int i = 0; i < input.length; ++i){
        if ((n+i) > (arr.length-1)){
            k = (i+n) - arr.length;
            arr[k] = Integer.valueOf(input[i]);
        }
        else {
        k = n+i;
        arr[k] = Integer.valueOf(input[i]);
        }
    }
    for (int j :arr){
        System.out.print(j+" ");
    }

        }
    }
