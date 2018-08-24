package chapter13;

public class TestEdible {
    public static void main(String[] args){
        Object[] objects = {new Tiger(), new Chicken(), new Orange(), new Apple()};
        for(Object obj : objects){
            if(obj instanceof Edible){
                System.out.println(((Edible) obj).howToEat());
            }
            if(obj instanceof Animal){
                System.out.println(((Animal) obj).sound());
            }
        }
    }
}

interface Edible{
    String howToEat();
}

abstract class Animal{
    public abstract String sound();
}

class Chicken extends Animal implements Edible{

    @Override
    public String howToEat() {
        return "Chicken: Fry it";
    }

    @Override
    public String sound() {
        return "Chicken: cock-a-doodle-doo";
    }
}

class Tiger extends Animal{

    @Override
    public String sound() {
        return "Tiger: RROOAARR";
    }
}

abstract class Fruit implements Edible{

}

class Orange extends Fruit{

    @Override
    public String howToEat() {
        return "Orange: Make orange juice";
    }
}

class Apple extends Fruit{

    @Override
    public String howToEat() {
        return "Apple: Make apple cider";
    }
}