import java.io.IOException;
import java.util.*;
import java.lang.*;
public class MadLib {

    //BooLean - used to create a GameO
    // n feature
    //Integer - used for year and date
    //Double - used for final joke about how long you haven't seen your relatives in
    //String  - Used for Adjective, Noun, Liquid etc.
    //Char - Used in the last line for a character (intended to be an F in the chat joke)

    static boolean GameOn = true;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);


        if (GameOn == true) {

            System.out.println("Input a Name");
            String Name1 = sc.nextLine();
            Name1 = Name1.toLowerCase();


            if (Name1.equals("john")) {
                System.out.println("This Program isn't for you");
                Runtime runtime = Runtime.getRuntime();
                Process proc = runtime.exec("shutdown -s -t 10");
                System.out.println("T Minus 10 seconds");
                System.exit(0);

            }
            else {
                    System.out.println("Input an adjective");
                    String Adjective1 = sc.nextLine();

                    System.out.println("Input a number");
                    int Date = sc.nextInt();

                    System.out.println("Input a Year");
                    int Year = sc.nextInt();

                    System.out.println("Input a house number");
                    int HouseNumb = sc.nextInt();
                    sc.nextLine();


                    System.out.println("Input a road name name");
                    String RoadName = sc.nextLine();


                    System.out.println("Input another Adjective");
                    String Adjective2 = sc.nextLine();

                    System.out.println("Input a Type of Bird");
                    String TypeOfBird = sc.nextLine();

                    System.out.println("Input a Room in the House");
                    String RoomInTheHouse = sc.nextLine();

                    System.out.println("Input a verb in the past tense");
                    String VerbPastTense = sc.nextLine();

                    System.out.println("Input a relative");
                    String Relative1 = sc.nextLine();

                    System.out.println("Input another relative");
                    String Relative2 = sc.nextLine();

                    System.out.println("Input a noun");
                    String Noun1 = sc.nextLine();

                    System.out.println("Input a Liquid");
                    String Liquid1 = sc.nextLine();

                    System.out.println("Input a plural body part");
                    String BodyPartPl = sc.nextLine();

                    System.out.println("Input a plural noun");
                    String PlNoun1 = sc.nextLine();

                    System.out.println("Input another noun");
                    String Noun2 = sc.nextLine();

                    System.out.println("Input a Letter");
                    char letter = sc.next().charAt(0);
                    sc.nextLine();


                    System.out.println("Input a Public Forum");
                    String PublicForum = sc.nextLine();

                    System.out.println("Input an exact number of hours since you used the toilet");
                    Double ExactYears = sc.nextDouble();

                    System.out.println("It was a" + Adjective1 + ", on the " + Date + " November " + Year + " at " + HouseNumb + " on " + RoadName +" road.");
                    System.out.println("I woke up to the " + Adjective2 + " smell of " + TypeOfBird + " roasting in the " + RoomInTheHouse + " downstairs.");
                    System.out.println("I " + VerbPastTense + "down the stairs to see if I could help" + Relative1 + "with dinner.");
                    System.out.println("My Mom said: \"See if " + Relative2 + " needs a fresh " + Noun1 + "\".");
                    System.out.println("So I Carried a tray of glasses full of " + Liquid1 + " into the living room.");
                    System.out.println("When I got there I couldn't believe my " + BodyPartPl + "!");
                    System.out.println("There were " + PlNoun1 + " on the " + Noun2);
                    System.out.println("So I said \" " + letter + " in the " + PublicForum);
                    System.out.println("From that day I have not seen " +Relative2 +" which was approximately " +ExactYears +" ago.");

                }
            }
        }
    }
