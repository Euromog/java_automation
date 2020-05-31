package javaClasses;

public class Square {
  public double l;
  public Square(double l) {   //Конструктор
    this.l = l;
  }

  public double area() {             //Функция площади квадрата
    return this.l * this.l;
  }
}
