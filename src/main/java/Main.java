import java.util.Scanner;

public class Main {
    public static final String VERSION = "2023-05-01";
    public static ResolutionParser resolutionParser = new ResolutionParser();
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Hello, welcome to Bulk Image Resizer version " + VERSION + "!");
        System.out.println("Please place the images that you would like to resize in the \"input\" folder if you haven't already! Subfolders will also be read.\n");

        int[] parsedResolution = obtainAndParseResolution();

        System.out.println("Which resampling algorithm would you prefer to use?");
        String algorithm = input.nextLine();
    }

    public static int[] obtainAndParseResolution() {
        System.out.println("What resolution would you like to resize the images to? (e.g. \"256x256\")");
        while (true) {
            String stringResolution = input.nextLine();
            try {
                int[] resolutionArray = resolutionParser.parse(stringResolution);
                return resolutionArray;
            } catch (NumberFormatException invalidInputException) {
                System.out.println("The resolution values may only use numeric characters! (e.g. \"256x256\") Please try again.");
            } catch (ArrayIndexOutOfBoundsException singleInputException) {
                System.out.println("There must be two resolution values! (e.g. \"256x256\") Please try again.");
            } catch (IllegalArgumentException tooManyInputsException) {
                System.out.println("There must be at most two resolution values! (e.g. \"256x256\") Please try again.");
            }
        }
    }
}
