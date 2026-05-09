import java.util.Scanner;
public class assign2 {
    static int[] convertToBinary(int number) {
        int a = number;
        int[] temp = new int[32];
        int index = 0;

        if (a == 0) {
            int[] zero = {0};
            return zero;
        }

        while (a > 0) {
            temp[index] = a % 2;
            a = a / 2;
            index++;
        }

        int[] binaryarr = new int[index];
        for (int i = 0; i < index; i++) {
            binaryarr[i] = temp[index - 1 - i];
        }

        return binaryarr;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int number = input.nextInt();

        int[] result = convertToBinary(number);

        System.out.print("Binary of " + number + " is: ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
        }
        System.out.println();

        input.close();

    }
}
