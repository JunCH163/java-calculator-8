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
        String[] numbers;

        if (m.find()) {
            String customDelimiter = m.group(1);
            numbers = m.group(2).split(Pattern.quote(customDelimiter));
        } else {
            numbers = userInput.split(",|:");
        }

        int sum = 0;
            for (String numberString : numbers) {
                try{
                    int number = Integer.parseInt(numberString);
                    if (number < 0) {
                        throw new IllegalArgumentException();
                    }
                    sum += number;
                } catch (NumberFormatException e) {
                    throw new IllegalArgumentException();
                }

            }
            System.out.println("결과: " + sum);
    }
}