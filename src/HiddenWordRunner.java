import java.util.Scanner;

public class HiddenWordRunner
{
    public static void main(String[] args)
    {
        System.out.println("Please guess the secret 5 letter word in all caps.");
        HiddenWord trial1 = new HiddenWord("APPLE");
        String hint = "";
        Scanner in = new Scanner(System.in);
        String guess = in.nextLine();
        hint = trial1.getHint(guess);
        while(!hint.equals("APPLE"))
        {
            System.out.println("Your hint: " + hint);
            System.out.println("What's your next guess?");
            guess = in.nextLine();
            hint = trial1.getHint(guess);
        }
        System.out.println("Congrats you got the secret word!");
    }
}
