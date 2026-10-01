import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    // Объявляем объект класса Scanner для ввода данных
    public static Scanner sc = new Scanner(System.in);
    // Объявляем объект класса PrintStream для вывода данных
    public static PrintStream out = System.out;
    public static void main(String[] args) {
        // Считывание пяти целых неотрицательных чисел holeDiameterX, beadDiameterA, beadDiameterB, beadDiameterC, beadDiameterD из консоли
        long holeDiameterX = sc.nextLong();
        long beadDiameterA = sc.nextLong();
        long beadDiameterB = sc.nextLong();
        long beadDiameterC = sc.nextLong();
        long beadDiameterD = sc.nextLong();
        // Сравнение диаметра отверстия и бусины A
        if (holeDiameterX <= beadDiameterA) {
            // Бусина A не прошла, остальные не рассматриваем. Выводим 0
            out.print(0);
        } else {
            // Бусина А прошла, сравниваем диаметры отверстия и бусины B
            if (holeDiameterX <= beadDiameterB) {
                // Бусина B не прошла, но до неё прошла бусина A - выводим 1
                out.print(1);
            } else {
                // Бусины А и B прошли, сравниваем диаметры отверстия и бусины C. Далее аналогично
                if (holeDiameterX <= beadDiameterC) {
                    out.print(2);
                } else {
                    if (holeDiameterX <= beadDiameterD) {
                        out.print(3);
                        // Все бусины прошли (ни одна по диаметру не была равна или больше отверстия), выводим 4
                    } else {
                        out.print(4);
                    }
                }
            }
        }
    }
}
