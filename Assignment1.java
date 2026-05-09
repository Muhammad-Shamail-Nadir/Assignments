import java.util.Scanner;
public class assign1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int number = input.nextInt(); 
        int a = number;
        int[] bits = new int[32];
        int index = 0;
        if (a == 0) {
            System.out.println("Binary of " + number + " is: 0");
            return;
        }
        while (a > 0) {
            bits[index] = a % 2;
            a = a / 2;
            index++;
        }
        System.out.print("Binary of " + number + " is: ");
        for (int i = index - 1; i >= 0; i--) {
              System.out.print(bits[i]);
        }
        System.out.println();
        input.close();
    }
}
