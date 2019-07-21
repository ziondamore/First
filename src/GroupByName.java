import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


public class GroupByName {

    public static void main(String[] args) {
        ArrayList<Man> newListMen = new ArrayList<Man>();
        HashSet<String> namesSet = new HashSet<String>();

        newListMen.add(new Man(1, "Alex", 125));
        newListMen.add(new Man(2, "Vlad", 121));
        newListMen.add(new Man(3, "Kolya", 88));
        newListMen.add(new Man(4, "Tima", 133));
        newListMen.add(new Man(5, "Vova", 198));
        newListMen.add(new Man(6, "Victor", 142));
        newListMen.add(new Man(7, "Dimon", 112));
        newListMen.add(new Man(8, "Alex", 119));
        newListMen.add(new Man(9, "Vlad", 85));
        newListMen.add(new Man(10, "Kolya", 133));
        newListMen.add(new Man(11, "Tima", 146));
        newListMen.add(new Man(12, "Vova", 78));
        newListMen.add(new Man(13, "Victor", 89));
        newListMen.add(new Man(14, "Alexander", 165));
        newListMen.add(new Man(15, "Dimon", 156));
        newListMen.add(new Man(16, "Alexander", 130));
        newListMen.add(new Man(17, "Vova", 129));
        newListMen.add(new Man(18, "Dimon", 135));
        newListMen.add(new Man(19, "Vova", 79));
        newListMen.add(new Man(20, "Tima", 96));
        newListMen.add(new Man(21, "Alex", 126));
        newListMen.add(new Man(22, "Vlad", 127));
        newListMen.add(new Man(23, "Kolya", 89));
        newListMen.add(new Man(24, "Tima", 134));
        newListMen.add(new Man(25, "Vova", 199));
        newListMen.add(new Man(26, "Victor", 143));
        newListMen.add(new Man(27, "Dimon", 113));


        for (Man man: newListMen) {
            namesSet.add(man.getName());
        }
        // System.out.println(namesSet);

        ArrayList<String> namesList = new ArrayList<>(namesSet);
        ArrayList<HashSet<Man>> menByNamesMap = new ArrayList<>(namesSet.size());

        //System.out.println(namesSet.size());

        for (int i = 0; i < namesSet.size(); i++) {
            menByNamesMap.add(new HashSet<>());
        }

        for (Man man: newListMen) {
            String name = man.getName();
            int index = namesList.indexOf(name);
            menByNamesMap.get(index).add(man);
        }
        for (HashSet<Man> manList: menByNamesMap) {
            for (Man men: manList){
                System.out.println(men.toString() + " ");
                //System.out.println();
            }
            System.out.println();
        }
    }
}
