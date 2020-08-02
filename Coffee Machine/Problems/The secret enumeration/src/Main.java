public class Main {

    public static void main(String[] args) {
        int count = 0;
    Secret[] stars = Secret.values();
    for(Secret secret: stars){
        if ((secret.name().length() >=4)&&(secret.name().substring(0, 4).equals("STAR"))) {
           count++;
        }
            }
    System.out.println(count);
    }
}

/* At least two constants start with STAR
enum Secret {
    STAR, CRASH, START, // ...
}
*/