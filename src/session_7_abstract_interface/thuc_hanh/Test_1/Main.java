package session_7_abstract_interface.thuc_hanh.Test_1;

import session_7_abstract_interface.thuc_hanh.Animal.Chicken;

public class Main {
    public static void main(String[] args) {
     Chicken chicken= new Chicken() {
         @Override
         public String makesounds() {
             return super.makesounds();
         }
     };
        System.out.println(chicken.makesounds());
    }
}
