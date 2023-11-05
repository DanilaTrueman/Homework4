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

        if (appleCount >= 5 && appleCount <= 10 || appleCount % 10 == 0) {
            text += appleCount + " яблок";
        } else if (appleCount % 10 == 1) {
            text += appleCount + " яблоко";
        } else if (appleCount % 10 >= 2 && appleCount % 10 <= 4) {
            text += appleCount + " яблока";
        } else {
            text += appleCount + " яблок";
        }
        System.out.println(text);
    }
}