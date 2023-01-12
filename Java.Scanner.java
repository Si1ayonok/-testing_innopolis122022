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
    }
  }