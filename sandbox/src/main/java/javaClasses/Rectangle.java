package javaClasses;

public class Rectangle {
  public double a;
  public double b;
  public Rectangle(double a, double b) {   //Конструктор
    this.a = a;
    this.b = b;
  }

  public double area() {         //Функция площади прямогольника
    return this.a * this.b;
  }
}
