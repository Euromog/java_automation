package javaClasses;

public class MyFirstProgram {
  public static void main(String[] args) {
    System.out.println("\n");
    hello("Evgeniy");

    Square s = new Square(2);                     //Объявление нового объекта класса Square
    System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

    Rectangle r = new Rectangle(3,4);                 //Объявление нового объекта класса Rectangle
    System.out.println("Площаль прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area() + "\n");

  }
    public static void hello(String user) {          //Функция Приветствия
        System.out.println("Hi, " + user + "!\n");
    }




}