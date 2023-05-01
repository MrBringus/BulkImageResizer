import java.util.Scanner;

public class Main {
    public final static String VERSION = "2023-04-30";

    public static void main(String[] args) {
        System.out.println("Hello, welcome to Bulk Image Resizer version " + VERSION + "!");
        System.out.println("Please place the images that you would like to resize in the \"input\" folder if you haven't already! Subfolders will also be read.\n");
        Scanner input = new Scanner(System.in);
        System.out.println("What resolution would you like to resize the images to? (e.g. \"256x256\")");
        String stringResolution = input.nextLine();
        System.out.println("Which resampling algorithm would you prefer to use?");
        String algorithm = input.nextLine();
    }
}
