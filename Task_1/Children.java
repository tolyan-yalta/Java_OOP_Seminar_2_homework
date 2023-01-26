package Task_1;

import java.util.HashMap;

public class Children extends Family implements InterfaceSearch{
    public HashMap<Human, Human> children;

    public void SetChildren(Human ch, Human p){
        HashMap<Human, Human> temp = new HashMap<>();
        temp.put(ch, p);
        this.children = temp;
        listChildren.add(this.children);
    }

    @Override
    public void interfaceSearch(Family t, Human h){
        System.out.println("Для:");
        System.out.println(h.getInfo());
        System.out.println("Детьми будут:");
        for (HashMap<Human,Human> i : listParent) {
            if (i.containsKey(h)) {
                Human p = i.get(h);
            System.out.println(p.getInfo());
            }
        }
    }
    
}
