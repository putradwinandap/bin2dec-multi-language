import java.util.Scanner;

public class Bin2Dec {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter binary number: ");

        String binary = input.next();

        int binaryLength = binary.length();

        if (binaryLength == 0 || binaryLength > 8) {
            System.out.println("Input must be 1-8 digits");
            input.close();
            return;
        }

        int decimal = 0;
        int exponent = binaryLength - 1;

        for (int i = 0; i < binaryLength; i++) {
            char charc = binary.charAt(i);

            if (charc != '0' && charc != '1') {
                System.out.println("Input can only be 0 and 1");
                input.close();
                return;
            }

            int digit = charc - '0';
            decimal += digit * (int) Math.pow(2, exponent);
            exponent--;
        }

        System.out.println("Decimal result: " + decimal);

        input.close();
    }
}