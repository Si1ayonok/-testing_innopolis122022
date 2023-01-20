import java.util.*;

public class Main {
    public static void main(String[] args) {
/*Задача №1
Напечатать ряд чисел 20 в виде:
20 20 20 20 20 20 20 20 20 20*/      
      for (int i = 0; i <= 10; i++) {
        System.out.println("20 ");
      }
/*Задача №2
Напечатать числа следующим образом:
10 10.4
11 11.4
...
25 25.4*/      
      for (int a = 10; a <= 25; a++) {
        System.out.printf("%d %d.4\n", a, a);
      }
/*Задача №3
Напечатать таблицу умножения на 7*/
      for (int a = 1; a <= 10; a++) {
        System.out.printf("%d x 7 = %d\n", a, a * 7);
      }
/*Задача №4
Найти: 1.сумму всех целых чиселот 100 до 500; */
      int sum = 0;
      for (int a = 100; a <= 500; a++) {
        sum = sum + a;
        System.out.println(sum);
      }
import java.util.*;
import java.util.Scanner;
/*Найти: 2.сумму всех целых чиселот a до b (значения a и b вводятся с клавиатуры; b>=a).*/
public class Main {
    public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      
      double sum = 0;
      double a = sc.nextDouble(); 
      double b = sc.nextDouble();
      for(double i = a; i <= b; i++) {
        System.out.println("sum before = " + sum);
        System.out.println("i = " + i);
        sum = sum + i;
        System.out.println("sum after = " + sum);
        System.out.println("= = = = = = = = = = = = = =");
      }
        System.out.println("sum = " + sum);
     
    }
  }
import java.util.*;

public class Main {
    public static void main(String[] args) {
/*Задача №6
Последовательность Фибоначчи образуется так: первый и второй члены 
последовательности равны 1, каждый следующий равен сумме двух предыдущих 
(1, 1, 2, 3, 5, 8, 13, ...). Дано натуральное число n. 
1.Найти k-й член последовательности Фибоначчи.*/ 
      int k = 23;
      long num0 = 1;
      long num1 = 1;
      int a = 1;
      long num2 = 2;
        while (a <= k - 2) {
        a++;
        num2 = num0 + num1;
        num0 = num1;
        num1 = num2;
        }
         System.out.printf("%d-й член последовательности: %d  \n", k, num2);
/*2.Получить первые n членов последовательности Фибоначчи.
3.Верно ли, что сумма первых n членов последовательности Фибоначчи есть четное число?*/
int n = 11;
      long num3 = 1;
      long num4 = 1;
      long num5;
      long sum = num3 + num4;
      System.out.printf("Первые %d членов последовательности: %d %d ", n, num3, num4);
      for (int i = 3; i <= n; i ++) {
        
        num5 = num3 + num4;
        num3 = num4;
        num4 = num5;
        sum = num5 + sum;
        System.out.printf(num5 + " ");
        
      }
       System.out.printf("\nCумма первых %d членов последовательности Фибоначчи - четное число? \n это:", n);
       System.out.println(sum % 2 == 0);
      

      
    }
  }



/*Задача №7
Дана непустая последовательность целых чисел, оканчивающаяся нулем. 
Найти: 1.сумму всех чисел последовательности; 
2.количество всех чисел последовательности*/
 public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);      
      int sum = 0;
      int counter = 0;
      
      int temp = sc.nextInt();
      
      while(temp != 0) {
        sum = sum + temp;
        counter++;
        temp = sc.nextInt();
      }
      System.out.println("sum = " + sum);
      System.out.println("count = " + counter);
/*Задача №8
Дано натуральное число. Определить: 
1.количество цифр 3 в нем; 
2.сколько раз внем встречается последняя цифра; 
3.количество четных цифр в нем;
4.сумму его цифр, больших пяти; 
5.произведение его цифр, больших семи; 
6.сколько раз в нем встречаются цифры 0 и 5 (всего)*/
      
      int number = sc.nextInt();
      System.out.println("Число " + number);
      int countOfThree = 0;
      int countOfEven = 0;
      int countOflast = 0;
      int lastNunber = number % 10;
      int sum = 0;
      int digit = 1;
      int digit1 = 0;
      
      while(number != 0) {
        int lastDigit = number % 10;
        
        if(lastDigit == 3) {
          countOfThree++;
        }
        
        if(lastDigit % 2 == 0) {
          countOfEven++;
        }
        
        if(lastDigit > 5 ) {
          sum = sum + lastDigit;
        }
        if(lastDigit == lastNunber ) {
          countOflast++;
        }
        
        if(lastDigit > 7 ) {
          digit = digit * lastDigit;
        }
        
        number = number / 10;
        
        if(lastDigit == 5 || lastDigit == 0 ) {
          digit1++;
        }
      }
      
      System.out.println("Количество цифр 3 в числе равно " + countOfThree);
      System.out.println("Количество четных цифр в числе равно " + countOfEven);
      System.out.println("Количество последних цифр в числе равно " + countOflast++);
      System.out.println("Сумма цифр больше 5ти " + sum);
      if(digit == 1){
        System.out.println("В числе отсутсвуют цифры больше 7");
        }
      else 
        System.out.println("Произведение цифр больше 7ти " + digit);
      System.out.println("В числе встречаются цифры 0 и 5 суммарно: " + digit1);
  }
}

  }
  }

/*Задача №9 
Имеется фрагмент программы в виде оператора цикла с параметром,
обеспечивающий вывод на кран "столбиком" всех целых чисел от 10 до 30. 
Оформить этот фрагмент ввиде: 
1.оператора цикла с предусловием; 
2.оператора цикла с постусловием.*/
    //Вариант 1
     int i = 10;
     while(i < 31) {
      System.out.println(i);
        i++;
      }
    //Вариант 2  
     do{
       System.out.println(i);
        i++;
     } 
     while(i < 31);
    }
  }
import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*Задача №10
Дано натуральное число. 
1.Определить его максимальную цифру
2.Определить его минимальную цифру*/  
      Scanner sc = new Scanner(System.in);
    
      int number = sc.nextInt();
      
      int max = 0;
      int min = 0;
      
      while(number != 0) {
        int lastDigit = number % 10;
        
        if(lastDigit > max) {
          max = lastDigit;
        }
        
        if(max == 9) {
          break;
        }
        
        if (lastDigit < max) {
          min = lastDigit;
        }
    
        number = number / 10;
      }
      
      System.out.printf("Максимальное число: %d\n", max);
      System.out.printf("Минимальное число: %d", min);
      
  }
}
/*Задача №11
Найти максимальное из натуральных чисел, не превышающих 5000, 
которое нацело делится на 39.*/

      for (int i = 5000; i > 0; i--) {
        if (i % 39 == 0) {
          System.out.println(i);
          break;
      }
    } 
  }
}
import java.util.*;

public class Main {
    public static void main(String[] args) {
/*Задача №12
Гражданин 1 марта открыл счет в банке, вложив  1000 руб. Через каждый месяц размер вклада
увеличивается на 2% от имеющейся суммы.Определить:
1.за какой месяц величина ежемесячного увеличения вклада превысит 30 руб.;
2.через сколько месяцев размер вклада превысит 1200 руб.*/
      double sum = 1000;
      double profit1 = 30;
      double sum2= 1200;
      double profit = 0;
      int i = 0;
      int a = 0;
      
      while (profit <= profit1 ) {
        profit = (sum * 0.02);
        sum = profit + sum;
        i ++;
      
      }
        System.out.printf("Величина ежемесячного увеличения вклада превысит " +  profit1 + " р. через: %d месяцев\n", i);
      
        sum = 1000;
        
        while (sum <= sum2) {
        profit = (sum * 0.02);
        sum = profit + sum;
        a ++;
        }
          System.out.printf("Сумма вклада превысит " +  sum2 + " р. через: %d месяцев\n", a);
          
         }
      }  
import java.util.*;

public class Main {
    public static void main(String[] args) {
      /*Задача №1
Составить программу вывода любого числа любое заданное число раз*/
    int digit = 22;
    int number = 3;
      for (int a = 0; a < number; a++) {
        System.out.println(digit);
      }
  }
}
import java.util.*;

public class Main {
    public static void main(String[] args) {
      /*Задача №2
Напечатать числа следующим образом:
25 25.5 24.8
26 26.5 25.8
...
35 35.5 34.8*/      
      for (int a = 25; a <= 35; a++) {
        System.out.printf("%d %d.5 %d.8\n", a, a, a - 1);
      }
  }
}
import java.util.*;

public class Main {
    public static void main(String[] args) {
      /*Задача №3
Напечатать таблицу соответствия между весом в фунтах и весом в килограммах для 
значений 1, 2, ..., 10 фунтов (1 фунт = 453 г)*/
    String pound = "фунт";
    String kilo = "кг";
          for (int a = 1; a <= 10; a++) {
            if (a <= 1) {
            }
            else if (a >= 2 && a <= 4) {
              pound = "фунта";
            }
            else if (a >= 5) {
             pound = "фунтов";
            }
            System.out.printf("%d %s = %.3f %s\n", a, pound, a * 0.453, kilo);
          }
        }
}
import java.util.*;

public class Main {
    public static void main(String[] args) {
      /*Задача №4
Вычислить сумму 1 + 1/2 + 1/3 +...+ 1/n.*/
    float sum = 1;
    float index1 = 5;
    float n = 1;
    float index = 1/n;
    
          while (n <= index1 ) {
        System.out.println("sum before = " + sum);
        System.out.printf("index = 1/%.0f = %.3f\n", n, index);
        sum = index + sum;
        System.out.println("sum after = " + sum);
        n ++;
        index = 1/ n;
        System.out.println("= = = = = = = = = = = = = =");
      }
        System.out.println("sum = " + sum);
    }
}