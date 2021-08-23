package Animal;

import java.util.ArrayList;

import Animal.Fruits.Apple;
import Animal.Fruits.Fruits;
import Animal.Fruits.Orange;

public class test {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());
        }
        Fruits[] fruitss = new Fruits[2];
        fruitss[0] = new Orange();
        fruitss[1] = new Apple();
        for (Fruits fruits : fruitss) {
            System.out.println(fruits.howToEat());
        }

    }
}
