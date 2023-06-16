import exceptions.ExcessiveArgumentException;
import exceptions.ZeroArgumentException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ResolutionParserTest {
    private ResolutionParser resolutionParser;
    private String stringResolution;

    @BeforeEach
    public void beforeEach() {
        resolutionParser = new ResolutionParser();
        stringResolution = "";
    }

    @Test
    public void testValidInput() {
        stringResolution = "256x256";
        int[] expectedArray = new int[]{256, 256};
        assertArrayEquals(expectedArray, resolutionParser.parse(stringResolution));
    }

    @Test
    public void testAlphabeticInput() {
        stringResolution = "ABCxDEF";
        assertThrows(NumberFormatException.class, () -> resolutionParser.parse(stringResolution));
    }

    @Test
    public void testNullInput() {
        stringResolution = "";
        assertThrows(NumberFormatException.class, () -> resolutionParser.parse(stringResolution));
    }

    @Test
    public void testSingleValuedInput() {
        stringResolution = "256";
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> resolutionParser.parse(stringResolution));
    }

    @Test
    public void testTripleValuedInput() {
        stringResolution = "256x256x256";
        assertThrows(ExcessiveArgumentException.class, () -> resolutionParser.parse(stringResolution));
    }

    @Test
    public void testZeroInput() {
        stringResolution = "0x256";
        assertThrows(ZeroArgumentException.class, () -> resolutionParser.parse(stringResolution));
    }
}