package calculator;

import camp.nextstep.edu.missionutils.Console;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Application {
    public static void main(String[] args) {
        System.out.println("덧셈할 문자열을 입력해 주세요.");
        String userInput = Console.readLine();
        if(userInput == null || userInput.isEmpty()) {
            System.out.println("결과 : 0");
            return;
        }
        userInput = userInput.replace("\\n", "\n");
        Matcher m = Pattern.compile("//(.)\n(.*)").matcher(userInput);
        int sum = 0;
        if (m.find()) {
            String customDelimiter = m.group(1);
            String[] customUserInputArr = m.group(2).split(Pattern.quote(customDelimiter));
            for (String numberString : customUserInputArr) {
                int number = Integer.parseInt(numberString);
                sum += number;
            }
            System.out.println("결과: " + sum);
        } else {
            String[] userInputArr = userInput.split(",|:");

            for (String numberString : userInputArr) {
                int number = Integer.parseInt(numberString);
                sum += number;
            }
            System.out.println("결과: " + sum);
        }
    }
}