package calculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {

    public String[] parse(String text) {
        Matcher m = Pattern.compile("//(.)\n(.*)").matcher(text);
        if (m.find()) {
            String customDelimiter = m.group(1);
            return m.group(2).split(Pattern.quote(customDelimiter));
        }
        return text.split(",|:");
    }
}