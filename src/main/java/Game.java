import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> sequence = new ArrayList<>();

        System.out.print("Введите последовательность чисел через пробел: ");
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");

        for (String number : numbers) {
            sequence.add(Integer.parseInt(number));
        }

        playGame(sequence);
    }

    public static void playGame(List<Integer> sequence) {
        List<Integer> toRemove = new ArrayList<>();
        int score = 0;
        boolean combinationFound = true;

        while (combinationFound) {
            combinationFound = false;

            System.out.print("Какие числа хотите вычеркнуть?(вводить через пробел) ");
            printSequence(sequence);

            String input = new Scanner(System.in).nextLine();
            String[] numbers = input.split(" ");

            toRemove.clear();
            for (String number : numbers) {
                toRemove.add(Integer.parseInt(number));
            }

            boolean validCombination = false;

            for (int i = 0; i < sequence.size() - 1; i++) {
                if ((toRemove.contains(sequence.get(i)) && toRemove.contains(sequence.get(i + 1))) &&
                        (sequence.get(i).equals(sequence.get(i + 1)) || sequence.get(i) + sequence.get(i + 1) == 9)) {
                    sequence.remove(i);
                    sequence.remove(i);
                    score++;
                    validCombination = true;
                    combinationFound = true;
                    break;
                }
            }

            if (!validCombination) {
                System.out.println("Неверная комбинация чисел. Попробуйте еще раз.");
            }

            System.out.println("Результирующий счет: " + score);
        }
    }

    public static void printSequence(List<Integer> sequence) {
        for (int i = 0; i < sequence.size(); i++) {
            System.out.print(sequence.get(i) + " ");
        }
        System.out.println();
    }
}