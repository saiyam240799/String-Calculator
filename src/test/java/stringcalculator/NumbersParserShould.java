package stringcalculator;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.List;
import static java.util.List.*;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class NumbersParserShould {
    private NumberParser numberParser;
    private String input;
    private List<Integer> expected;

    @Before
    public void before() {
        numberParser = new NumberParser();
    }

    public NumbersParserShould(String input, List<Integer> expected) {
        this.input = input;
        this.expected = expected;
    }

    @Test
    public void parseNumber() {
        assertEquals(expected, numberParser.fromStringToNumber(input));
    }

    @Parameterized.Parameters
    public static Iterable<Object[]>  testIterable() {
        return Arrays.asList(new Object[][] {
                { "1,2,3", of(1, 2, 3) },
                { "1\n2\n3", of(1, 2, 3) },
                { "//;\n1;2", of(1, 2) },
                { "//[***]\n1***2***3", of(1, 2, 3) },
        });
    }
}

