package calculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {

        public int add(String inputText) {
            if (inputText == null || inputText.isEmpty()) {
                return 0;
            }

            inputText = inputText.replace("\\n", "\n");

            String[] numbers;
            Matcher m = Pattern.compile("//(.)\n(.*)").matcher(inputText);

            if (m.find()) {
                String customDelimiter = m.group(1);
                numbers = m.group(2).split(Pattern.quote(customDelimiter));
            } else {
                numbers = inputText.split(",|:");
            }

            return sum(numbers);
        }

        private int sum(String[] numbers) {
            int sum = 0;
            for (String numberString : numbers) {
                try {
                    int number = Integer.parseInt(numberString);
                    if (number < 0) {
                        throw new IllegalArgumentException();
                    }
                    sum += number;
                } catch (NumberFormatException e) {
                    throw new IllegalArgumentException();
                }
            }
            return sum;
        }
    }

