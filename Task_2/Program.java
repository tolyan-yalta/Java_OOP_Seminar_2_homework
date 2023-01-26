package Task_2;

public class Program {
    public static void main(String[] args) {

        Human man = new Human("Karl", "husband");
        Human woman = new Human("Klara", "wife");
        Cat cat = new Cat("Cat", "Tom");
        Dog dog = new Dog("Dog", "Bim");

        man.CallCat();
        cat.AnswerAnimals();
        woman.CallDog();
        dog.AnswerAnimals();
        woman.FeedAnimals();
        dog.animalsEats(dog);
        cat.animalsEats(dog);
               
        
    }
    
}
