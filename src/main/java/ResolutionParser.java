public class ResolutionParser {
    public int[] parse(String stringResolution) {
        int[] resolutionArray = new int[2];
        String[] tempResolutionArray = stringResolution.split("x");

        if (tempResolutionArray.length > 2) {
            throw new IllegalArgumentException();
        }

        resolutionArray[0] = Integer.parseInt(tempResolutionArray[0]);
        resolutionArray[1] = Integer.parseInt(tempResolutionArray[1]);

        return resolutionArray;
    }
}