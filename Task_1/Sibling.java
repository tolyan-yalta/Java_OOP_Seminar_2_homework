package Task_1;

import java.util.HashMap;

public class Sibling extends Family implements InterfaceSearch{
    public HashMap<Human, Human> sibling;

    public void SetSibling(Human h1, Human h2){
        HashMap<Human, Human> temp1 = new HashMap<>();
        temp1.put(h1, h2);
        this.sibling = temp1;
        listSibling.add(this.sibling);
        HashMap<Human, Human> temp2 = new HashMap<>();
        temp2.put(h2, h1);
        this.sibling = temp2;
        listSibling.add(this.sibling);
    }

    @Override
    public void interfaceSearch(Family t, Human h){
        System.out.println("Для:");
        System.out.println(h.getInfo());
        System.out.println("Братьями и сестрами будут:");
        for (HashMap<Human,Human> i : listSibling) {
            if (i.containsKey(h)) {
                Human p = i.get(h);
            System.out.println(p.getInfo());
            }
        }
    }
    
}
