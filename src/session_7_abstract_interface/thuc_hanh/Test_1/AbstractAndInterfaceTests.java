package session_7_abstract_interface.thuc_hanh.Test_1;

import session_7_abstract_interface.thuc_hanh.Animal.Chicken;
import session_7_abstract_interface.thuc_hanh.Animal.LopAnimal;
import session_7_abstract_interface.thuc_hanh.Animal.Tiger;
import session_7_abstract_interface.thuc_hanh.Fruit.Apple;
import session_7_abstract_interface.thuc_hanh.Fruit.Fruits;
import session_7_abstract_interface.thuc_hanh.Fruit.Orange;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        LopAnimal[] animals = new LopAnimal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (LopAnimal animal : animals) {
            System.out.println(animal.makesounds());
        }
        System.out.println();
        Fruits[] fruits=new Fruits[2];
        fruits[0]=new Apple();
        fruits[1]=new Orange();
        for (Fruits fruit:fruits) {
            System.out.println(fruit.howToEat());
        }
    }
}
