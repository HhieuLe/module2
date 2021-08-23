package Animal;
import Animal.edible.Edible;

public class Chicken extends Animal implements Edible  {
    @Override
    public String makeSound() {
        return "Chicken: Clutch clutch ";
    }
    @Override
    public String howToEat(){
        return "could be fried";
    }
}
