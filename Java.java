import java.util.*;

public class Main {
    public static void main(String[] args) {
/*/Задача №1
Напечатать ряд чисел 20 в виде:
20 20 20 20 20 20 20 20 20 20/*/      
      for (int i = 0; i <= 10; i++) {
        System.out.println("20 ");
      }
/*/Задача №2
Напечатать числа следующим образом:
10 10.4
11 11.4
...
25 25.4/*/      
      for (int a = 10; a <= 25; a++) {
        System.out.printf("%d %d.4\n", a, a);
      }
/*/Задача №3
Напечатать таблицу умножения на 7/*/
      for (int a = 1; a <= 10; a++) {
        System.out.printf("%d x 7 = %d\n", a, a * 7);
      }
/*/Задача №4
Найти: 1.сумму всех целых чиселот 100 до 500; /*/
      int sum = 0;
      for (int a = 100; a <= 500; a++) {
        sum = sum + a;
        System.out.println(sum);
      }
    }
  }