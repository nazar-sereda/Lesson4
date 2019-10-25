package epam.com.lesson4;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.SortedMap;
import java.util.WeakHashMap;

public class Task1 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a word -> ");
        String str = reader.readLine();

        System.out.println(unic(str));

    }

    public static String unic (String str){

        String result = " ";
        int index = 0;

        while (index<str.length()){

            char ch = str.charAt(index);

            if (!result.contains(String.valueOf(ch))){
                result = result + ch;
            }

            index++;
        }

        return result;
    }

}
