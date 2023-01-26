package Task_2;

public class Dog extends Animals implements AnimalsEats{
    public String name;

    public Dog(String t, String n) {
        SetTypeAnimals(t);
        this.name = n;
    }

    @Override
    public void AnswerAnimals(){
        System.out.println("Гав-гав...");
    }

    
    @Override
    public void animalsEats(Animals target) { 
        System.out.println("Ням-Ням-Гав-Гав"); 
    }
    
}
