import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Club club = new Bouncer();
        String name = new String();

        while(name != null){
            System.out.println("");
            name = scan.next();
            if(name.equals("No")){
                String redColorCode = "\u001B[31m";
                String resetColorCode = "\u001B[0m";

                System.out.println(redColorCode + "Please leave" + resetColorCode);
                break;
            }
            club.enter(name);
        }
    }
}