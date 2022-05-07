import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
          while (true) {
              String input = sc.nextLine();
              System.out.println(calc(input));
              if (input.equals("exit")) { break; }
          }
    }


    public static String calc(String input) throws ArithmeticException {
        String[] splitInput = input.split(" ");
        String arithmeticChar = splitInput[1];


        try {
            int firstNum = Integer.parseInt(splitInput[0]);
            int secNum = Integer.parseInt(splitInput[2]);

            if (firstNum > 0 && firstNum < 11 && secNum > 0 && secNum < 11){
                switch (arithmeticChar) {
                    case "+" -> { return String.valueOf(firstNum + secNum); }
                    case "-" -> { return String.valueOf(firstNum - secNum); }
                    case "*" -> { return String.valueOf(firstNum * secNum); }
                    default  -> { return String.valueOf(firstNum / secNum); }
                }
            }else { throw new ArithmeticException(); }

        }catch (NumberFormatException e) {
            int firstNum = RomanNumber.toInteger(splitInput[0]);
            int secNum = RomanNumber.toInteger(splitInput[2]);

            if (firstNum > 0 && firstNum < 11 && secNum > 0 && secNum < 11){
                switch (arithmeticChar) {
                    case "+" -> { return RomanNumber.toString(firstNum + secNum); }
                    case "-" -> { return RomanNumber.toString(firstNum - secNum); }
                    case "*" -> { return RomanNumber.toString(firstNum * secNum); }
                    default  -> { return RomanNumber.toString(firstNum / secNum); }
                }
            }else  { throw new ArithmeticException(); }
        }

    }

}
