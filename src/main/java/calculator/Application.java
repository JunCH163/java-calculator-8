package calculator;

import camp.nextstep.edu.missionutils.Console;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Application {

    public static void main(String[] args) {
        StringCalculator calculator = new StringCalculator();
        String inputText = InputView.readInput();

        int result = calculator.add(inputText);
        OutputView.printResult(result);
    }

}