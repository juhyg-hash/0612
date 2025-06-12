class Animal{
    String name;
    public Animal(String name){
        this.name = name;
    }
    public void printName(String name){
        System.out.println("Animal name :"+ name);
    }
}
class Dog extends Animal{
    String breed;
    public Dog(String name, String breed){
        super(name);
        this.breed = breed;
        }
    }
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("도그","dog");
        dog.printName("독도");
    }
}