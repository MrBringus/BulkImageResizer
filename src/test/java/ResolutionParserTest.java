import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ResolutionParserTest {
    public ResolutionParser resolutionParser;
    public String stringResolution;
    public int[] resolutionArray;
    public int[] testArray;

    @BeforeEach
    public void beforeEach() {
        resolutionParser = new ResolutionParser();
        stringResolution = "";
        resolutionArray = new int[2];
        testArray = new int[2];
    }

    @Test
    public void testValidInput() {
        stringResolution = "256x256";
        resolutionArray = resolutionParser.parse(stringResolution);
        testArray = new int[]{256, 256};
        assertArrayEquals(testArray, resolutionArray);
    }

    @Test
    public void testAlphabeticInput() {
        stringResolution = "ABCxDEF";
        assertThrows(NumberFormatException.class, () -> resolutionArray = resolutionParser.parse(stringResolution));
    }

    @Test
    public void testSingleValuedInput() {
        stringResolution = "256";
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> resolutionArray = resolutionParser.parse(stringResolution));
    }
}