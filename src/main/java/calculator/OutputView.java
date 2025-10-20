package calculator;

public class OutputView {

    private static final String RESULT_PREFIX = "결과 : ";

    public static void printResult(int result) {
        System.out.println(RESULT_PREFIX + result);
    }
}