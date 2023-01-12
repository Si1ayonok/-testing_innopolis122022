import java.util.*;
import java.util.Scanner;
/*/Задача №4
Найти: 2.сумму всех целых чиселот a до b (значения a и b вводятся с клавиатуры; b>=a)./*/
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

/*/Задача №7
Дана непустая последовательность целых чисел, оканчивающаяся нулем. 
Найти: 1.сумму всех чисел последовательности; 
2.количество всех чисел последовательности/*/
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
/*/Задача №8
Дано натуральное число. Определить: 
1.количество цифр 3 в нем; 
2.сколько раз внем встречается последняя цифра; 
3.количество четных цифр в нем;
4.сумму его цифр, больших пяти; 
5.произведение его цифр, больших семи; 
6.сколько раз в нем встречаются цифры 0 и 5 (всего)/*/
      
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