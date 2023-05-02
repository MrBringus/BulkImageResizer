import exceptions.ExcessiveArgumentException;
import exceptions.ZeroArgumentException;

public class ResolutionParser {
    public int[] parse(String stringResolution) {
        int[] resolutionArray = new int[2];
        String[] tempResolutionArray = stringResolution.split("(?i)x");

        if (tempResolutionArray.length > 2) {
            throw new ExcessiveArgumentException();
        }

        for (int i = 0; i < resolutionArray.length; i++) {
            resolutionArray[i] = Integer.parseInt(tempResolutionArray[i]);
            if (resolutionArray[i] < 1) {
                throw new ZeroArgumentException();
            }
        }

        return resolutionArray;
    }
}