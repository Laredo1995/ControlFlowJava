package controlFlowProject;

import java.util.Random;
import java.util.Scanner;

public class Project {

    public static void main(String[] args) {
        System.out.print("Hello World\n");
        AsciiChars.printNumbers();
        AsciiChars.printUpperCase();
        AsciiChars.printLowerCase();
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String name = scanner.next();
        System.out.printf("Hello %s!%n", name);

        System.out.print("Would you like to continue to the interactive portion? (yes, no): ");
        String answer = scanner.next();

        if (!answer.equals("yes") && !answer.equals("y")) {
            System.out.println("Please return later to complete the survey.");
            System.exit(0);
        }

        // prompt user for various pieces of information
        System.out.print("Do you have a red car? (yes, no): ");
        String redCarAnswer = scanner.next();

        System.out.print("What is the name of your favorite pet? ");
        String petName = scanner.next();

        System.out.print("What is the age of your favorite pet? ");
        int petAge = scanner.nextInt();

        System.out.print("What is your lucky number? ");
        int luckyNumber = scanner.nextInt();

        System.out.print("Do you have a favorite quarterback? (yes, no): ");
        String quarterbackAnswer = scanner.next();

        int jerseyNumber = 0;
        if (quarterbackAnswer.equals("yes") || quarterbackAnswer.equals("y")) {
            System.out.print("What is their jersey number? ");
            jerseyNumber = scanner.nextInt();
        }

        System.out.print("What is the two-digit model year of your car? ");
        int carYear = scanner.nextInt();

        System.out.print("What is the first name of your favorite actor or actress? ");
        String actorFirstName = scanner.next();

        System.out.print("Enter a random number between 1 and 50: ");
        int randomNum = scanner.nextInt();

        // generate lottery numbers
        int[] nums = new int[6];

        nums[0] = luckyNumber;

        if (redCarAnswer.equals("yes") || redCarAnswer.equals("y")) {
            nums[1] = 1;
        }

        nums[2] = getLuckyNumber(petName);

        nums[3] = getLuckyNumber(carYear);

        nums[4] = getActorNumber(actorFirstName);

        if (jerseyNumber != 0) {
            nums[5] = jerseyNumber;
        } else {
            nums[5] = getLuckyNumber(randomNum);
        }

        // generate lottery numbers and magic ball
        int[] lotteryNumbers = generateLotteryNumbers(nums);
        int magicBall = generateMagicBall(nums);

        // printing the results
        System.out.printf("Lottery numbers: %d %d %d %d %d Magic ball: %d%n", 
                          lotteryNumbers[0], lotteryNumbers[1], lotteryNumbers[2], 
                          lotteryNumbers[3], lotteryNumbers[4], magicBall);
    }


   private static int generateMagicBall(int[] nums) {
		// TODO Auto-generated method stub
		return 0;
	}


private static int getLuckyNumber(int carYear) {
		// TODO Auto-generated method stub
		return 0;
	}


private static int getActorNumber(String actorFirstName) {
		// TODO Auto-generated method stub
		return 0;
	}


private static int getLuckyNumber(String petName) {
		// TODO Auto-generated method stub
		return 0;
	}


private static int[] generateLotteryNumbers(int[] nums) {
        Random random = new Random();
        int[] lotteryNumbers = new int[5];
        for (int i = 0; i < 5; i++) {
            int randomNum = random.nextInt(75) + 1;
            while (contains(nums, randomNum)) {
                randomNum = random.nextInt(75) + 1;
            }
            lotteryNumbers[i] = randomNum;
            
            
        }
		return lotteryNumbers;
        
   }


private static boolean contains(int[] nums, int randomNum) {
	// TODO Auto-generated method stub
	return false;
}
}
