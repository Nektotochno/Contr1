import java.util.Scanner;

public class Kp {
    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Задание 3");
            int sum = 0;
            int num;
            System.out.println("Введите последовательность чисел (последнее число должно быть 0):");
            num = scanner.nextInt();

            while (num != 0) {
                sum += num;
                num = scanner.nextInt();
            }
            System.out.println("Сумма последовательности: " + sum);
        }
    }

}
