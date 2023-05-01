import java.util.Scanner;

public class Main {
    public static final String VERSION = "2023-05-01";
    public static ResolutionParser resolutionParser = new ResolutionParser();
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Hello, welcome to Bulk Image Resizer version " + VERSION + "!");
        System.out.println("Please place the images that you would like to resize in the \"input\" folder if you haven't already! Subfolders will also be read.\n");

        obtainAndParseResolution();

        System.out.println("Which resampling algorithm would you prefer to use?");
        String algorithm = input.nextLine();
    }

    public static int[] obtainAndParseResolution() {
        System.out.println("What resolution would you like to resize the images to? (e.g. \"256x256\")");
        String stringResolution = input.nextLine();
        int[] resolutionArray = resolutionParser.parse(stringResolution);

        return resolutionArray;
    }
}
