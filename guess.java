import java.util.Random;
import java.util.Scanner;

public class guess {
    public static void main(String[] args) {
        Scanner numb = new Scanner(System.in);

        int count = 0;
        int randomN = new Random().nextInt(100);

        System.out.println("________Jogo da Adivinhacao_________");

      while(count < 5){

          System.out.println("escolha um numero entre 0 e 100: ");
          int chosen = numb.nextInt();

        if(chosen < randomN){
            System.out.println("the number is bigger !!");
            count++;
        }else if (chosen > randomN){
            System.out.println("the number is smaller !!");
            count++;
        }else if (chosen == randomN){
            System.out.println("!!!!!!!   Congratulations, you've chosen the correct number !!!!!!");
            count = 5;
        }

        if (chosen != randomN && count == 5){
            System.out.println(String.format("You've lost the game, the numb is %d :(" ,randomN));
        }

      }
    }
}
