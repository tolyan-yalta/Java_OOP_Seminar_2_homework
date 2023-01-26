package Task_2;

public class Cat extends Animals implements AnimalsEats{
    public String name;

    public Cat(String t, String n) {
        SetTypeAnimals(t);
        this.name = n;
    }

    @Override
    public void AnswerAnimals(){
        System.out.println("Мур-мур...");
    }


    @Override
    public void animalsEats(Animals target) { 
        System.out.println("Ням-Ням-Мяу-Мяу"); 
    }

}
