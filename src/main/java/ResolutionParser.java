import java.util.Arrays;

public class ResolutionParser {
    public int[] parse(String stringResolution) {
        int[] resolutionArray = new int[2];
        String[] tempResolutionArray = stringResolution.split("x");

        try {
            resolutionArray = Arrays.stream(tempResolutionArray).mapToInt(Integer::parseInt).toArray();
        } catch (NumberFormatException invalidInputException){
            System.out.println("The resolution values may only use numeric characters! (e.g. \"256x256\")");
            throw invalidInputException;
        }

        return resolutionArray;
    }
}