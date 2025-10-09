import java.util.Random;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Random random = new Random();
        Scanner in = new Scanner(System.in);
        System.out.println("Ready to spin? Place your bet!");
        int money = Integer.parseInt(in.nextLine());
        System.out.println("Let's get started!");
        String answer;
        while(money > 0) {
        int randomNumber1 = random.nextInt(10) + 1;
        int randomNumber2 = random.nextInt(10) + 1;
        int randomNumber3 = random.nextInt(10) + 1;
        System.out.println(randomNumber1 + " " + randomNumber2 + " " + randomNumber3);
        int seven = 0;
        if(randomNumber1 == 7) seven++;
        if(randomNumber2 == 7) seven++;
        if(randomNumber3 == 7) seven++;
        if(seven == 1) {
            money += 2;
            System.out.println("You won 3$.\nYour balance is " + money + "$.\n");
        }
        else if(seven == 2) {
            money += 4;
            System.out.println("You won 5$.\nYour balance is " + money + "$.\n");
        }
        else if(seven == 3) {
            money += 9;
            System.out.println("You won 10$.\nYour balance is " + money + "$.\n");
        }
        else if(seven == 0) {
            money--;
            if(money > 0) {
            System.out.println("You lost this game.\nDont't give up!\nYour balance is " + money + "$.\n");
            }
        }
        if(money == 0) {
            System.out.println("You lost everything.\nGame is over.");
            break;
        }
        System.out.println("Would you like to play again?\nType: yes/no\n");
        answer = in.nextLine();
        if(answer.equalsIgnoreCase("yes")) {
            System.out.println("Again!");
        }
        else if(answer.equalsIgnoreCase("no")) {
            System.out.println("Thanks for playing!");
            break;
        }
        }
        in.close();
    }
}
