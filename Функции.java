import java.util.*;

public class Main {
  /*Задача №1 
  Напечатать числа в виде следующей таблицы:
  5 5 5 5 5 5
  5 5 5 5 5 5
  5 5 5 5 5 5
  5 5 5 5 5 5*/
    public static void sequence(int number, int index1, int index2) {
      for (int i = 0; i < index1; i++) {
        for (int a = 0; a < index2; a++) {
        System.out.printf(number +" ");
        }
      System.out.println("");
      }
    }
    public static void main(String[] args) {
    sequence(5, 4, 6);
    }
  }
import java.util.*;

public class Main {
  /*Задача №2 
  Напечатать числа в виде следующей таблицы:
  5 
  5 5 
  5 5 5 
  5 5 5 5 
  5 5 5 5 5 
  5 5 5 5 5 5*/
    public static void tree(int number, int index) {
       for (int i = 1; i <= index; i++) {
            for (int j = 0; j < i; j++) {
              System.out.print(number + " ");
              }
        System.out.println("");
        }
    }
    public static void main(String[] args) {
    tree(5, 6);
    }
  }
import java.util.*;

public class Main {
  /*Задача №3 
  Напечатать полную таблицу сложения в виде:
  1 + 1 = 2     1 + 2 = 3  ... 1 + 9 = 10
  2 + 1 = 3     2 + 2 = 4  ... 2 + 9 = 11
  ...
  9 + 1 = 10   9 + 2 = 11  ... 9 + 9 = 18*/
  
    public static void table(int num1, int num2) {
       for (int i = num1; i <= num2; i++) {
            for (int j = 1; j <= num2; j++) {
              System.out.printf("%d + %d = %d\t", i, j, i + j);
            }
        System.out.println("");
        
        }
    }
    public static void main(String[] args) {
    table(1, 9);
    }
  }
import java.util.*;

public class Main {
  /*Задача №4 
  Последовательность Фибоначчи образуется так: первый и второй члены последовательности 
  равны 1, каждый следующий равен сумме двух предыдущих (1, 1, 2, 3, 5, 8, 13, ...). 
 Найти k-й член последовательности Фибоначчи.
  Решить задачу с помощью рекурсивных функций.*/
    public static int fibonacci(int x) {
      if (x == 1 || x == 2) {
        return 1;
      }
      return fibonacci(x - 2) + fibonacci(x - 1);
    }
    public static void main(String[] args) {
    System.out.print(fibonacci(7));
    }
  }
import java.util.*;

public class Main {
  /*Задача №5 
  Написать рекурсивную функцию для вычисления факториала натурального числа n.*/
    public static int factorial(int x) {
      if (x == 1) {
        return 1;
      }
      return x * factorial(x - 1);
    }
    
    public static void main(String[] args) {
    System.out.print(factorial(7));
    }
  }
import java.util.*;

public class Main {
  /*Задача №6 
  Реализовать функцию нахождения минимума:
  1.Из трёх чисел
  2.Из четырёх чисел*/
    public static int min2(int a, int b) {
      if ( a <= b) {
        return a;
      }
      return b;
    }
    public static int min3(int a, int b, int c) {
     
        return min2(min2(a, b),c);
    }  
    public static int min4(int a, int b, int c, int d) {
              return min2((min3(a, b, c), d);
    }
    public static void main(String[] args) {
    System.out.println(min2(12, 5)); //5
    System.out.println(min3(6, 11, 8)); //6
    System.out.println(min4(6, 11, 4, 9)); //4
    }
  }
import java.util.*;

public class Main {
  /*Задача №7 
Даны стороны двух треугольников. Найти сумму их периметров и сумму их площадей.
(Определить процедуру для расчета периметра и площади треугольника по его сторонам.)*/
    public static String trangle(double a, double b, double c) {
      if ( a + b <= c || b + c <= a || c + a <= b || a <= 0 || b <= 0 || c <= 0) {
        return "треугольник не существует";
      }
      double perimeter = a + b + c;
      double halfPerimeter = perimeter / 2;
      double square = Math.sqrt(halfPerimeter * (halfPerimeter - a) * (halfPerimeter - b) * (halfPerimeter - c));
      return ("perimeter = " + perimeter + "\n" + "square = " + square);
    }
    
    public static void main(String[] args) {
    System.out.print(trangle(3, 7, 4)); //5
    
    }
  }
import java.util.*;

public class Main {
    public static String trangle2(double a1, double b1, double c1, double a2, double b2, double c2) {
      if ( a1 + b1 <= c1 || b1 + c1 <= a1 || c1 + a1 <= b1 || a1 <= 0 || b1 <= 0 || c1 <= 0) {
        return "треугольник №1 не существует";
      }
      if ( a2 + b2 <= c2 || b2 + c2 <= a2 || c2 + a2 <= b2 || a2 <= 0 || b2 <= 0 || c2 <= 0) {
        return "треугольник №2 не существует";
      }
       //расчет для треугольника №1
      double perimeter1 = a1 + b1 + c1;
      double halfPerimeter1 = perimeter1 / 2;
      double square1 = Math.sqrt(halfPerimeter1 * (halfPerimeter1 - a1) * (halfPerimeter1 - b1) * (halfPerimeter1 - c1));
      //расчет для треугольника №2     
      double perimeter2 = a2 + b2 + c2;
      double halfPerimeter2 = perimeter2 / 2;
      double square2 = Math.sqrt(halfPerimeter2 * (halfPerimeter2 - a2) * (halfPerimeter2 - b2) * (halfPerimeter2 - c2));
      //сумма       
      double squareSum =square1 + square2;
      double perimeterSum = perimeter1 + perimeter2;
      
      return ("Сумма периметров треугольников №1 и №2 = " + perimeterSum + "\n" + "Сумма площадей треугольников №1 и №2 = " + squareSum + "\n");
    }
    
    public static void main(String[] args) {
    System.out.print(trangle2(3, 7, 4, 3, 7, 4)); 
    }
  }
import java.util.*;

public class Main {
  /*Задача №8 
Написать метод, который принимает на вход натуральное число
и возвращает True, усди число - четное*/
    public static boolean even(int a) {
      return a % 2 == 0;
      }
  public static void main(String[] args) {
    System.out.print(even(11)); 
    }
  }
import java.util.*;

public class Main {
  /*Задача №9 
Имеется зарплата сотрудника - натуральное число. Реализовать функцию, 
которая рассчитывает премию сотрудника - вещественное чило, исодя из таблицы:
         Зарплата                              Премия
        < 40 000                        50% от зарплаты
   40 000 < x < 80 000         70% от зарплаты
        >= 80 000                     110% от зарплаты*/
    public static double prize(double salary) {
      return salary < 40000 ? salary * 0.5 : salary < 80000 ? salary * 0.7 : salary * 1.1;
      }
      
    
    public static void main(String[] args) {
    System.out.print(prize(90000)); 
    }
  }
import java.util.*;

public class Main {
  /*Задача №10 
Реализовать функцию, которая принимает на вход два числа n и m и возвращает n^m.
Реализовать перегрузку для разных типов данных*/
    public static int degree(int n, int m) {
      int index1 = 2;
      int sum = n;
     
      if (m == 0) {
        return 1;
      }
      if (m < 0) {
        while (index1 <= (- m)) {
        sum = sum * n;
        index1++;
      }
      return 1/sum;
      }
      
      while (index1 <= m ) {
        sum = sum * n;
        index1++;
      }
      return sum;
    }
    public static double degree(double n, double m) {
      int index1 = 2;
      double sum = n;
     
      if (m == 0) {
        return 1;
      }
      if (m < 0) {
        while (index1 <= (- m)) {
        sum = sum * n;
        index1++;
      }
      return 1/sum;
      }
      
      while (index1 <= m ) {
        sum = sum * n;
        index1++;
      }
      return sum;
    }
    
    public static void main(String[] args) {
    System.out.println(degree(2, -3.0)); 
    System.out.println(degree(3, 2)); 
    }
  }
import java.util.*;
/*Реализуйте метод, который определяет, является ли переданное число натуральной
степенью тройки. Например, число 27 – это третья степень (3^3), 
а 81 – четвёртая (3^4).*/
public class Main {
  public static boolean isPowerOfThree(double number) {
      double num = 1;
      if (number >= 1) {
        for (int i = 3; i <= number; i *= 3) {
        num = num * 3;
        }
          if (num == number) {
          return true;
          }
        return false;
      }
      if (number < 1) {
        return false;
      }
      return false;
  }
    public static void main(String[] args) {
  System.out.println(isPowerOfThree(1));

    }
  }
