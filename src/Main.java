import java.util.Scanner;

public class Main {
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str = scanner.nextLine();
        Reversed reversed= new Reversed();
        String reversedStr = reversed.reverse(str);
        System.out.println("Перевернутая строка: " + reversedStr);
    }
}
