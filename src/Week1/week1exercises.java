package Week1;

import java.math.BigDecimal;
import java.math.RoundingMode;

import helpers.InputReader;

public class week1exercises {
    public static final String CONSOLE_CLEAR = "\033[H\033[2J";
    public static void main(String[] args)
    {
        int number1 = InputReader.getInt("Enter your first number > ");
        int number2 = InputReader.getInt("Enter your second number > ");
        double averagecal = (number1 + number2)/2;
        System.out.println("This is the average of those two numbers > " + averagecal);
    }
}
