import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {

        Scanner in = new Scanner(System.in);
        String partyAfil = "";

        System.out.println("Enter your party affiliation [R, D or I]: ");
        partyAfil = in.nextLine();

        // create a scanner and read in the partyAfil

        if(partyAfil.equalsIgnoreCase("R"))
        {
            System.out.println("You get a Republican Elephant");
        }
       else if(partyAfil.equalsIgnoreCase("D"))
        {
            System.out.println("You get a Democratic Donkey");
        }
        else if(partyAfil.equalsIgnoreCase("I"))
        {
            System.out.println("You get a Independent Man");
        }
        else
            System.out.println("I dont know what party you belong to!");
    }
}