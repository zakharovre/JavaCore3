package homework1;

public class BoxDemo {
    public static void main(String[] args) {
        Box<Orange> boxOr = new Box<>();
        Box<Apple> boxAp = new Box<>();
        boxOr.addFruit(new Orange());
        boxOr.addFruit(new Orange());
        boxAp.addFruit(new Apple());
        boxAp.addFruit(new Apple());
        boxAp.addFruit(new Apple());

        Box<Orange> anotherOrBox = new Box<>();

        System.out.println(boxOr.getWeight());
        System.out.println(boxAp.getWeight());

        System.out.println(boxOr.compare(boxAp));
        boxAp.addFruit(new Apple());
        System.out.println(boxOr.compare(boxAp));


        System.out.println("Вес новой коробки: " + anotherOrBox.getWeight());
        boxOr.fillAnotherBox(anotherOrBox);
        System.out.println("Пересыпали фрукты");
        System.out.println("Вес коробки, из которой пересыпали фрукты: " + boxOr.getWeight());
        System.out.println("Вес новой коробки после пересыпания: " + anotherOrBox.getWeight());
    }
}

