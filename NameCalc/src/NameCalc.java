import java.util.Scanner;

public class NameCalc {
    public static void main(String[] args) {
        char[] chars = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        int i = 0;
        int k = 0;
        int value = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Find out how many points your name is worth!");

        System.out.println("What is your name? (Lowercase)");

        String name = input.nextLine();

        char[] nameArray = name.toCharArray();
        int length = nameArray.length;

        while(k < length) {

            while (chars[i] != nameArray[k]) {
                i++;

                if (i > 25) {
                    i = 0;
                }
            }

            if (chars[i] == nameArray[k]) {
                i++;
                value = value + i;
            }
            k++;
            i++;
        }

        System.out.printf("Your name is worth %d points!", value);


    }
}

