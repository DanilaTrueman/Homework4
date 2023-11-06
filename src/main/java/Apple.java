import java.util.Scanner;

public class Apple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите имя: ");
        String name = scanner.nextLine();

        System.out.print("Введите количество яблок: ");
        int appleCount = scanner.nextInt();

        printAppleInfo(name, appleCount);
    }

    public static void printAppleInfo(String name, int appleCount) {
        String text = name + " хранит у себя ";
        String apples;

        if (appleCount % 10 == 1 && appleCount % 100 != 11) {
            apples = "яблоко";
        } else if (appleCount % 10 >= 2 && appleCount % 10 <= 4 && (appleCount % 100 < 10 || appleCount % 100 >= 20)) {
            apples = "яблока";
        } else {
            apples = "яблок";
        }

        text += appleCount + " " + apples;
        System.out.println(text);
    }
}