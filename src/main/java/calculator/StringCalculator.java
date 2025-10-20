package calculator;

public class StringCalculator {

    private final Parser parser = new Parser();

    public int add(String inputText) {
        if (inputText == null || inputText.isEmpty()) {
            return 0;
        }
        inputText = inputText.replace("\\n", "\n");

        String[] numbers = parser.parse(inputText);

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