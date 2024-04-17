class Animal
{
public Animal()
{
System.out.println("Animal constructor");
}
}
class Canine extends Animal
{
//base() takes a string value called "Lion"
public Canine() 
{
    super();
    System.out.println("Derived Canine Constructor");
}
}
public class ConstructorDemo
{
public static void main(String[] args)
{
Canine objCanine = new Canine();
}
}