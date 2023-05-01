import java.util.Arrays;

public class ResolutionParser {
    public int[] parse(String stringResolution) {
        int[] resolutionArray = new int[2];
        String[] tempResolutionArray = stringResolution.split("x");

        resolutionArray = Arrays.stream(tempResolutionArray).mapToInt(Integer::parseInt).toArray();

        return resolutionArray;
    }
}