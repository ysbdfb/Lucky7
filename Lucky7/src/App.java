import java.util.Random;
public class App {
    public static void main(String[] args) throws Exception {
        Random random = new Random();
        int money = 5;
        while(money > 0) {
        int RandomNumber1 = random.nextInt(10) + 1;
        int RandomNumber2 = random.nextInt(10) + 1;
        int RandomNumber3 = random.nextInt(10) + 1;
        System.out.println(RandomNumber1 + " " + RandomNumber2 + " " + RandomNumber3);
        if(RandomNumber1 == 7 && RandomNumber2 == 7 && RandomNumber3 == 7) {
            money += 9;
            System.out.println(" You won 10€.\n Your balance is " + money + " €.\n");
        }
        else if(RandomNumber1 == 7 && RandomNumber2 == 7) {
            money += 4;
            System.out.println(" You won 5€.\n Your balance is " + money + " €.\n");
        }
        else if(RandomNumber1 == 7 && RandomNumber3 == 7) {
            money += 4;
            System.out.println(" You won 5€.\n Your balance is " + money + " €.\n");
        }
        else if(RandomNumber2 == 7 && RandomNumber3 == 7) {
            money += 4;
            System.out.println(" You won 5€.\n Your balance is " + money + " €.\n");
        }
        else if(RandomNumber1 == 7) {
            money += 2;
            System.out.println(" You won 3€.\n Your balance is " + money + " €.\n");
        }
        else if(RandomNumber2 == 7) {
            money += 2;
            System.out.println(" You won 3€.\n Your balance is " + money + " €.\n");
        }
        else if(RandomNumber3 == 7) {
            money += 2;
            System.out.println(" You won 3€.\n Your balance is " + money + " €.\n");
        }
        else {
            money--;
            System.out.println(" You lost this game.\n Dont't give up!\n Your balance is " + money + " €.\n");
        }
        if(money == 0) {
            System.out.println(" You lost everything.\n Game is over");
            break;
        }
        }
    }
}
