package calculator;

import camp.nextstep.edu.missionutils.Console;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Application {

    private static final String INPUT_PROMPT_MESSAGE = "덧셈할 문자열을 입력해 주세요.";
    private static final String RESULT_PREFIX = "결과 : ";
    private static final int EMPTY_RESULT = 0;

    public static void main(String[] args) {
        System.out.println(INPUT_PROMPT_MESSAGE);
        String userInput = Console.readLine();
        if(userInput == null || userInput.isEmpty()) {
            System.out.println(RESULT_PREFIX + EMPTY_RESULT);
            return;
        }
        userInput = userInput.replace("\\n", "\n");
        Matcher m = Pattern.compile("//(.)\n(.*)").matcher(userInput);
        String[] numbers;

        if (m.find()) {
            String customDelimiter = m.group(1);
            numbers = m.group(2).split(Pattern.quote(customDelimiter));
        } else {
            numbers = userInput.split(",|:");
        }

        int totalSum = sum(numbers);
            System.out.println(RESULT_PREFIX + totalSum);
    }

    private static int sum(String[] numbers) {
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