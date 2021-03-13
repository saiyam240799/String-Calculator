package stringcalculator;
import org.junit.Test;
import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;
import static stringcalculator.ConcatNumbersByComma.*;

public class ConcatNumbersByCommaShould {
    @Test
    public void return_3() {
        assertThat(concatNumbers(asList(-1,-2)), equalTo("-1, -2"));
    }
}
