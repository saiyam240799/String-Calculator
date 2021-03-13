package stringcalculator;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberParser {

    private String delimiter;

    public NumberParser() {
        delimiter = "[,\n]";
    }

    

    List<Integer> fromStringToNumber(String numbers) {
        return Arrays
                .stream(splitOnDelimiter(numbers))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }


}
