package homework1;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    private ArrayList<T> fruits = new ArrayList<>();


    public float getWeight() {
        if(!fruits.isEmpty()) {
            return fruits.size() * fruits.get(0).fruitWeight();
        }
        return 0.0f;
    }

    public boolean compare(Box<? extends Fruit> anotherBox){
        return this.getWeight() == anotherBox.getWeight();
    }

    public void addFruit(T fruit){
        fruits.add(fruit);
    }

    public void fillAnotherBox(Box<T> anotherBox){
        anotherBox.fruits = this.fruits;
        this.fruits = new ArrayList<>();
    }
}

