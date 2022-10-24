import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

import static java.lang.Integer.parseInt;


public class Main {
    public static void main(String[] args) {

        AsciiChars.printNumbers();
        AsciiChars.printLowerCase();
        AsciiChars.printUpperCase();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String input = scanner.nextLine();
        System.out.println("Hello "+input);


        String favoritePet;
        int ageOfPet;
        int luckyNumber;
        String favoriteQuarterBack;
        int quarterBackJersey = 0;
        int yearOfCar;
        String favoriteActor;
        int randomNum = (int) (Math.random() * 50);
        int secondRandomNum = (int) (Math.random() * 10);
        boolean hasFavQuarterBack = false;
        int magicBallNum;

        System.out.println("Would you like to continue to the interactive portion?  (n or no) to quit hit any other key to continue");
        input = scanner.nextLine();
        if(input.equals("no")||input.equals("n")) {
            System.out.println("Come back if you would like to take my survey another time");
            return;
        }

        // Can't exit while loop with "quit" unsure as to why
        while (!scanner.next().equals("quit")) {
            System.out.println("Whats the name of your favorite pet?");
            while (scanner.hasNextInt()) {
                System.out.println("that pet name is not Valid, please try again");
                favoritePet = scanner.next();
            }
            favoritePet = scanner.next();

            System.out.println("Whats the age of your favorite pet?");
            while (!scanner.hasNextInt()) {

                System.out.println("That is not a valid input please try again");
                try {
                    ageOfPet = scanner.nextInt();
                } catch (InputMismatchException e) {
                    input = scanner.nextLine();


                }

            }
            ageOfPet = scanner.nextInt();
            System.out.println("What is you lucky number? ");
            while (!scanner.hasNextInt()) {

                System.out.println("That is not a valid input please try again");
                try {
                    luckyNumber = scanner.nextInt();
                } catch (InputMismatchException e) {
                    input = scanner.nextLine();


                }

            }

            luckyNumber = scanner.nextInt();


            System.out.println("Do you have a favorite quarterback?");
            favoriteQuarterBack = scanner.next();
            if (favoriteQuarterBack.equals("y")) {
                System.out.println("What is your favorites jersey number?");
                hasFavQuarterBack = true;

                while (!scanner.hasNextInt()) {

                    System.out.println("That is not a valid input please try again");
                    try {
                        quarterBackJersey = scanner.nextInt();
                    } catch (InputMismatchException e) {
                        input = scanner.next();


                    }

                }
                quarterBackJersey = scanner.nextInt();
            }

            System.out.println("What is the two-digit model year of your car?");
            while (!scanner.hasNextInt()) {

                System.out.println("That is not a valid input please try again");
                try {
                    yearOfCar = scanner.nextInt();
                } catch (InputMismatchException e) {
                    input = scanner.nextLine();


                }

            }

            yearOfCar = scanner.nextInt();


            System.out.println("What is the first name of your favorite actor? ");
            while (scanner.hasNextInt()) {
                System.out.println("That is not a valid input please try again");
                favoriteActor = scanner.next();
            }

            favoriteActor = scanner.next();


            System.out.println("Enter a random number between 1 and 50");

            //validation here won't work gets stuck in while loop
            while ((parseInt(scanner.next()) > 50 || parseInt(scanner.next()) < 1) ||!scanner.hasNextInt() ) {




                System.out.println("That is not a valid input please try again");
                try {
                    luckyNumber = scanner.nextInt();
                } catch (InputMismatchException e) {
                    input = scanner.nextLine();


                }

            }
          //  luckyNumber = scanner.nextInt();

            if (hasFavQuarterBack) {
                magicBallNum = (int) (Math.random() * 75) * quarterBackJersey;

                if (magicBallNum > 75) {
                    magicBallNum %= 75;
                }
            } else {
                magicBallNum = (int) (Math.random() * 75) * luckyNumber;

                if (magicBallNum > 75) {
                    magicBallNum %= 75;
                }

            }

            //putting LottoNums in if statement to check if they are higher than 65 causes code to hang. 
            int maxNum = 65;
            int firstLottoNum = favoritePet.charAt(2);
            int secondLottoNum = yearOfCar + luckyNumber;
            int thirdLottoNum = randomNum - secondRandomNum;
            int fourthLottoNum = favoriteActor.charAt(0);
            int fifthLottoNum = ageOfPet + yearOfCar;



            System.out.println("Lottery numbers: " + firstLottoNum + ", " + secondLottoNum + ", " + thirdLottoNum + ", " + fourthLottoNum + ", " + fifthLottoNum + " " + "Magic ball: " + magicBallNum);


        }

        System.out.println("Thank you for playing");

    }

}
