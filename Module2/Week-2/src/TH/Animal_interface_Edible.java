package TH;
interface Edible {
    String howToEat();
}

abstract class Animal {
    public abstract String makeSound();
}

class Tiger extends Animal {
    @Override
    public String makeSound() {
        return "Tiger: roarrrr!";
    }
}

class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}

public class Animal_interface_Edible {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());

            if (animal instanceof Chicken) {
                Edible edibler = (Edible) animal;
                System.out.println(edibler.howToEat());
            }
        }
    }
}
