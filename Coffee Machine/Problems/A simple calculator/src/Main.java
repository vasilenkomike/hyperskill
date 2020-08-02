import  java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstString,secondString;
        String operation;
        long first,second;
        firstString = scanner.next();
        operation = scanner.next();
        secondString  = scanner.next();
        first=Long.parseLong(firstString);
        second=Long.parseLong(secondString);
        switch (operation){
            case "+": System.out.println((first+second)); break;
            case "-": System.out.println((first-second)); break;
            case "/":
                if (second==0){System.out.println("Division by 0!"); break;}
                else { System.out.println((first/second)); break;}
            case  "*": System.out.println(first*second);break;
            default:System.out.println("Unknown operator");
        }

    }
}