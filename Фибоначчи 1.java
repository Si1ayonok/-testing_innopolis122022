import java.util.*;

public class Main {
    public static void main(String[] args) {
/*/Задача №6
Последовательность Фибоначчи образуется так: первый и второй члены 
последовательности равны 1, каждый следующий равен сумме двух предыдущих 
(1, 1, 2, 3, 5, 8, 13, ...). Дано натуральноечисло n. 
1.Найти k-й член последовательности Фибоначчи. 
2.Получить первые n членов последовательности Фибоначчи. 
3.Верно ли, что сумма первых n членов последовательности Фибоначчи есть четное число?
/*/
      int n = 11;
    //вариант 1 
      System.out.printf("Первые %d членов последовательности:", n);
      int sum2 = 0;
      for (int i = 1; i <= n; i = sum2 - i) {
        sum2 = sum2 + i;
        System.out.printf(sum2 + " ");
      }
      System.out.print("\n");
    //вариант 2
      int num0 = 0;
      int num1 = 1;
      int num2;
      System.out.printf("Первые %d членов последовательности: %d %d ", n, num0, num1);
      for (int i = 3; i <= n; i ++) {
        num2 = num0 + num1;
        num0 = num1;
        num1 = num2;
        System.out.printf(num2 + " ");
      }
    }
  }
