package calculator;

import camp.nextstep.edu.missionutils.Console;

public class Application {
    public static void main(String[] args) {
        System.out.println("덧셈할 숫자를 입력하세요.");
        String userInput = Console.readLine();

        String[] userInputArr = userInput.split(",|:");
        int sum = 0;
        for (String numberString : userInputArr) {
            int number = Integer.parseInt(numberString);
            sum += number;
        }
        System.out.println(sum);
    }
}