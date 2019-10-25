package epam.com.lesson4;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {
    public static void main(String[] args)  throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please enter a number -> ");

        String sNumber = reader.readLine();
        int number = Integer.parseInt(sNumber);

        BufferedReader str = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please choose type of returned value. If you want in String format please enter - s, " +
                "if you want in Integer format please enter - i ");

        String option = str.readLine();

        if (option.equals("i")){
            System.out.println("Integer format -> " + converterInteger(number));
        }
        else if (option.equals("s")){
            System.out.println("String format -> " + converterString(number));
        }

    }
// number returned in Integer value
    public static int converterInteger(int number){
        int converted = 0;
        int temp = 0;
        StringBuilder buffer = new StringBuilder();
        while (number>0){

            temp = number%2;
            buffer.append(temp);

            number = number/2;
        }
        converted = Integer.parseInt(buffer.reverse().toString());
        return converted;
    }

    public static String converterString(int number){
        int temp = 0;

        StringBuilder buffer = new StringBuilder();
        String result = " ";

        while (number>0){
            temp = number%2;
            buffer.append(temp);
            number = number/2;
        }
        result = buffer.reverse().toString();
        return result;
    }

}
