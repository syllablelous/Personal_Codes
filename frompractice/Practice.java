// THIS CODE IS NOT YET FINISHED, WILL BE REVISED
import java.util.Scanner;

public class Practice {

    static Scanner scan = new Scanner(System.in);

    
    // Questions
    public static void main(String[] args) throws Exception {
        System.out.println("Exam 2 practice problems");

        // Part 1: Conversions
        // Print the converted values

        // 1. Create a method to convert celsius to fahrenheit.
        System.out.print("Enter temperature in celsius: ");
        double tempInCelsius = scan.nextDouble();
        System.out.println(toFahrenheit(tempInCelsius));

        // 2. Create a method to convert fahrenheit to celsius.
        System.out.print("Enter temperature in fahrenheit: ");
        double tempInFahrenheit = scan.nextDouble();
        System.out.println(toCelsius(tempInFahrenheit));

        // 3. Create a method to convert seconds to minutes.
        System.out.print("Enter time in seconds: ");
        double seconds = scan.nextDouble();
        System.out.println(secondsToMinutes(seconds));

        // 4. Create a method to convert hours to minutes.
        System.out.print("Enter time in hours: ");
        double hours = scan.nextDouble();
        System.out.println(hoursToMinutes(hours));

        // 5. Create a method to convert megabytes to gigabytes.
        System.out.print("Enter storage value in megabytes: ");
        double megabytes = scan.nextDouble();
        System.out.println(toGigabytes(megabytes));

        // Part 2: Conditions
        // Display "valid" if it is true.
        // Display "invalid" if it is false.

        // 6. Create a condition to check if the length given mobile number is valid

        System.out.print("Enter your 11 digit mobile number: ");
        String mobileNumber = scan.next();
        System.out.println(checkValidity(mobileNumber));

        // 7. Create a condition to check if your bestfriend's first name is in
        // UPPERCASE letters
        System.out.print("Enter name of your bestfriend in UPPERCASE: ");
        String bestfriend = scan.next();
        System.out.println(isUppercase(bestfriend));

        scan.nextLine();

        // 8. Create a condition to check if the answer is correct
        // answer should be manila or MANILA
        System.out.print("Enter the capital of the philippines: ");
        String capital = scan.next();
        if (capital.contains("manila")) {
            System.out.println("VALID");
        }
        else if (capital.contains("MANILA")) {
            System.out.println("VALID");
        }
        else {

        }
        

        // System.out.println(checkAnswer(capital));


        // 9. Create a condition to check if the answer belongs to one of the five human senses
        // sight
        // touch
        // hearing
        // smell
        // taste

        System.out.print("Enter one of the five human senses: ");
        String sense = scan.next();
        sensesAnswer(sense);
        
        // 10. Create a condition to detect if a word is present in the input.
        scan.nextLine();
        System.out.println("Use the word \"love\" in any sentence");
        String love = scan.nextLine();
        System.out.println(containsLove(love));

        
        // Close scanner
        scan.close();
    }
    
    static double toFahrenheit (double tempInCelsius) {
        double fahrenheit = (tempInCelsius * 9/5) + 32;

        return fahrenheit;
    }

    static double toCelsius (double tempInFahrenheit) {
        double celsius = (tempInFahrenheit - 32) * 5/9;

        return celsius;
    }

    static double secondsToMinutes (double seconds) {
        double secondsinMinutes = seconds/60;

        return secondsinMinutes;
    }

    static double hoursToMinutes (double hours) {
        double hoursinMinutes = hours * 60;

        return hoursinMinutes;
    }

    static double toGigabytes (double megabytes) {
        double inGigabytes = megabytes/1000;

        return inGigabytes;
    }

    static String checkValidity (String mobileNumber) {
        if (mobileNumber.length() == 11) {
            return "VALID";
        }
        else {
            return "INVALID";
        }
    }

    static String isUppercase (String bestfriend) {
        if (bestfriend == bestfriend.toUpperCase()) {
            return "VALID";
        }
        else {
            return "INVALID";
        }
    }

    static String checkAnswer (String capital) {
         
        if (capital == "manila") {
            return "VALID";
        }
        else if (capital == "MANILA") {
            return "VALID";
        }
        else {
            return "INVALID";
        }
    }

    // solution for 9 to 10
    static String sensesAnswer (String sense) {
        switch (sense) {
            case "sight":
                System.out.println("VALID");
                break;
            case "touch":
                System.out.println("VALID");
                break;
            case "hearing":
                System.out.println("VALID");
                break;
            case "smell":
                System.out.println("VALID");
                break;
            case "taste":
                System.out.println("VALID");
                break;
            default:
                System.out.println("INVALID");
                break;
        }
        return sense;
    }

    static String containsLove (String love) {
        if (love.contains("love")) {
            return "VALID";
        }
        else {
            return "INVALID";
        }
    }
}
