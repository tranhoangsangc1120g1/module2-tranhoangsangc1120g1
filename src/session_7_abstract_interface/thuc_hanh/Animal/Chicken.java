package session_7_abstract_interface.thuc_hanh.Animal;

import session_7_abstract_interface.thuc_hanh.Animal.LopAnimal;

public  class Chicken extends LopAnimal {
    @Override
    public String makesounds() {
        return "Chicken : vivi";
    }
}
