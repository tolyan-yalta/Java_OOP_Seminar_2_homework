package Task_1;

public class Program {
    public static void main(String[] args){
        // отец
        Human human1 = new Human("Иван", "Петрович", "Пушкин", 40);
        // мать
        Human human2 = new Human("Ольга", "Васильевна", "Пушкина", 38);
        // сын
        Human human3 = new Human("Сергей", "Иванович", "Пушкин", 20);
        // сын
        Human human4 = new Human("Игорь", "Иванович", "Пушкин", 17);
        // дочь
        Human human5 = new Human("Вера", "Ивановна", "Пушкина", 15);

        // создается Map родитель-ребенок
        Parent parent1 = new Parent();
        parent1.SetParent(human1, human3);
        Parent parent2 = new Parent();
        parent2.SetParent(human1, human4);
        Parent parent3 = new Parent();
        parent3.SetParent(human1, human5);
        Parent parent4 = new Parent();
        parent4.SetParent(human2, human3);
        Parent parent5 = new Parent();
        parent5.SetParent(human2, human4);
        Parent parent6 = new Parent();
        parent6.SetParent(human2, human5);

        // создается Map ребенок-родитель
        Children children1 = new Children();
        children1.SetChildren(human3, human1);
        Children children2 = new Children();
        children2.SetChildren(human4, human1);
        Children children3 = new Children();
        children3.SetChildren(human5, human1);
        Children children4 = new Children();
        children4.SetChildren(human3, human2);
        Children children5 = new Children();
        children5.SetChildren(human4, human2);
        Children children6 = new Children();
        children6.SetChildren(human5, human2);

        // создается Map ребенок-ребенок
        Sibling sibling1 = new Sibling();
        sibling1.SetSibling(human3, human4);
        Sibling sibling2 = new Sibling();
        sibling2.SetSibling(human3, human5);
        Sibling sibling3 = new Sibling();
        sibling3.SetSibling(human5, human4);

        // поиск родителей
        parent6.interfaceSearch(parent1, human5);
        System.out.println("-----------------------------");

        // поиск детей
        children1.interfaceSearch(children6, human1);
        System.out.println("-----------------------------");

        // поиск братьев (сестер)
        sibling1.interfaceSearch(sibling1, human4);

    }



}