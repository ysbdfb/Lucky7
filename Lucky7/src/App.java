import java.util.Random;
public class App {
    public static void main(String[] args) throws Exception {
        Random random = new Random();
        int RandomNumber1 = random.nextInt(10) + 1;
        int RandomNumber2 = random.nextInt(10) + 1;
        int RandomNumber3 = random.nextInt(10) + 1;
        System.out.println(RandomNumber1 + " " + RandomNumber2 + " " + RandomNumber3);
        if(RandomNumber1 == 7 || RandomNumber2 == 7 || RandomNumber3 == 7) {
            System.out.println("You won");
        }
        else {
            System.out.println("You lost");
        }
    }
}
