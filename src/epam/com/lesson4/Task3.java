package epam.com.lesson4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
        System.out.print("Enter a number -> ");
        String str = reader.readLine();

        reverse(str);
    }

    public static String reverse(String number){

        char[] reversed = number.toCharArray();
        int i = number.length() - 1;
        while (i >= 0){

            if (number.length() - 2 <= i) {

                System.out.print(reversed[i]);
            }
        i--;

        }

        return " ";
    }
}
