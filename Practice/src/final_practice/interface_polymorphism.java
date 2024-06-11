package final_practice;

interface Animal {void eat(); void sleep();}

class Lion implements Animal{
    @Override
    public void eat(){
        System.out.println("Lion Eat");
    }
    @Override
    public void sleep() {
        System.out.println("Lion Sleep");
    }
}

class Monkey implements Animal{
    @Override
    public void eat(){
        System.out.println("Monkey Eat");
    }
    @Override
    public void sleep(){
        System.out.println("Monkey Sleep");
    }

}
public class interface_polymorphism {
    public static void main(String[] args){
        Animal animal = new Lion();
        animal.eat();
        animal.sleep();

        animal = new Monkey();
        animal.eat();
        animal.sleep();

    }
}
