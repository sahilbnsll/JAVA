import java.util.Random;
import java.util.Scanner;

class Game{
    private int number;
    public int inputNumber;
    public int noOfGuesses = 0;

    // Constructor to generate the random number
    Game(){
        Random rand = new Random();
        this.number = rand.nextInt(10);      // this will assign a random number in range of 0-10
    }

    // takeUserInput() -> to take a user input of number
    void takeUserInput(){
        System.out.println("Guess the number");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
    }

    // isCorrectNumber() -> to detect whether the number entered by the user is true or not
    boolean isCorrectNumber(){
        noOfGuesses++;
        if (inputNumber==number){
            System.out.format("Yes you guessed it right, it was %d\nYou guessed it in %d attempts \n", number, noOfGuesses);
            return true;
        }
        else if(inputNumber<number){
            System.out.println("Too low...");
        }
        else if(inputNumber>number){
            System.out.println("Too high...");
        }
        return false;
    }

}
public class guessTheNumber {
    public static void main(String[] args) {

        System.out.println("Number is in the range of 0-10");
        Game g = new Game();
        boolean b= false;
        while(!b){
            g.takeUserInput();
            b = g.isCorrectNumber();
        }
        System.out.println("Your Score: "+ 100/g.noOfGuesses + "%");
    }
}