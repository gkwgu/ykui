package org.example;
import org.example.util.StringUtil;

public class Main {
    public static void main (String[] args)
    {
        String str = "J@va the be$t!123";
        StringUtil reversed= new StringUtil();
        String reversedStr = reversed.reverseLetters(str);
        System.out.println("Перевернутая строка: " + reversedStr);
    }
}
