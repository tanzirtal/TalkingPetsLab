package lab;
import java.util.Scanner; //imports Scanner which allows input from user

public class HowManyPets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //creates scanner object

        //asks user question for input
        System.out.println("How many pets do you have?");
        int numberOfPets = scanner.nextInt(); //statement to take in user input
        scanner.nextLine(); //question for Mikaila, explain difference between nextLine(); and nextInt(); or next();  use in this case

        Pets pets[] = new Pets[numberOfPets]; //create array to store pet info

        //get details for each pet, have to iterate through a loop to get multiple inputs
        for (int i = 0; i < numberOfPets; i++){ //this statement uses the numberOfPets input above in line 10
            System.out.println("What kind of pet is pet number " + (i+1) + "? (cat/dog/lizard are the only acceptable inputs)"); // asks for pet type (cat, dog, etc.
            String type = scanner.next(); //assigns value to petTypes array index, increasing by i+1 as dictated by input

            System.out.println("What is the name of this " + type + "?"); // how can I insert switch to go before getting name of pets?
            String name = scanner.next(); //assigns value to petNames array index, increasing by i+1 as dictated by input

            //we will utilize switch statements here instead of if/else statements for readability and ease of use

            switch (type.toLowerCase()){ //.typeToLowerCase() method is used here because we want to ensure that whatever is input will match our stated case
                case "dog":             // what the heck is and enhanced switch?
                    pets[i] = new Dogs(name);
                    break;
                case "cat":
                    pets[i] = new Cats(name);
                    break;
                case "lizard":
                    pets[i] = new Lizards(name);
                    break;
                default:
                    System.out.println("Sike! I dont care - this ain't a zoo homie... Try again, this time with the correct input!");
                    i--; //allows another attempt if user tries some funny stuff
                    break; //ends the switch
            }

        }

        //prints list of pets
        System.out.println("Here is the list of your pets");
        for (int i = 0; i < pets.length; i++) { // if statement iterates through array to print, name, type (species), and what the pet says || what the heck is an enhanced for loop??
            Pets currentPet = pets[i]; //creates currentPet object that assigns pets[] array values
            if (currentPet != null){ //!= null added incase user messes up and the switch happens to return a null value, shouldn't happen but this is a safety measure
                System.out.println(currentPet.getName() + " is a "+ currentPet.species() + " and says: " + currentPet.speak());
            }
        }

        scanner.close(); //why close the scanner? close scanner prevents resource leaks, thanks Google
    }
}
