package calculator;

import camp.nextstep.edu.missionutils.Console;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Application {

    private static final String INPUT_PROMPT_MESSAGE = "덧셈할 문자열을 입력해 주세요.";
    private static final String RESULT_PREFIX = "결과 : ";

    public static void main(String[] args) {
        StringCalculator calculator = new StringCalculator();
        System.out.println(INPUT_PROMPT_MESSAGE);
        String userInput = Console.readLine();

        int result = calculator.add(userInput);
        System.out.println(RESULT_PREFIX + result);
    }

}