package Task_1;

import java.util.HashMap;

public class Parent extends Family implements InterfaceSearch{
    public HashMap<Human, Human> parent;
    
    public void SetParent(Human p, Human ch){
        HashMap<Human, Human> temp1 = new HashMap<>();
        temp1.put(p, ch);
        this.parent = temp1;
        listParent.add(this.parent);
        /*
        HashMap<Human, Human> temp2 = new HashMap<>();
        temp2.put(ch, p);
        this.children = temp2;
        listChildren.add(this.children);*/
    }

    @Override
    public void interfaceSearch(Family t, Human h){
        System.out.println("Для:");
        System.out.println(h.getInfo());
        System.out.println("Родителями будут:");
        for (HashMap<Human,Human> i : listChildren) {
            if (i.containsKey(h)) {
                Human p = i.get(h);
            System.out.println(p.getInfo());
            }
        }
    }

/*
    // поиск родителей
    public static void SearchParents(Human h){
        System.out.println("Для:");
        System.out.println(h.getInfo());
        System.out.println("Родителями будут:");
        for (HashMap<Human,Human> i : listChildren) {
            if (i.containsKey(h)) {
                Human p = i.get(h);
            System.out.println(p.getInfo());
            }
        }
    }
*/
    
}
    