import java.util.ArrayList;

class ArrayBubble {
    public static void main(String[] args) {
        int top = 10;

        ArrayList<Man> listMen = new ArrayList<>();

        listMen.add(new Man(1, "Alex", 125));
        listMen.add(new Man(2, "Vlad", 121));
        listMen.add(new Man(3, "Kolya", 88));
        listMen.add(new Man(4, "Tima", 133));
        listMen.add(new Man(5, "Vova", 198));
        listMen.add(new Man(6, "Victor", 142));
        listMen.add(new Man(7, "Dimon", 112));
        listMen.add(new Man(8, "Oleg", 119));
        listMen.add(new Man(9, "Gleb", 85));
        listMen.add(new Man(10, "Artem", 133));
        listMen.add(new Man(11, "Goga", 146));
        listMen.add(new Man(12, "Kostya", 78));
        listMen.add(new Man(13, "Vadim", 89));
        listMen.add(new Man(14, "Alexander", 165));
        listMen.add(new Man(15, "Garic", 156));
        listMen.add(new Man(16, "Grisha", 130));
        listMen.add(new Man(17, "Sergey", 129));
        listMen.add(new Man(18, "Stas", 135));
        listMen.add(new Man(19, "Gosha", 79));
        listMen.add(new Man(20, "Albert", 96));


        System.out.println("\nUnsorted");
        printMen(listMen);
        sortMenByIQWithBubbleSort(listMen);

        System.out.println("\nSorted Top " + top);
        for (int i = 0; i < top; i++) {
            System.out.println(listMen.get(i));
        }
    }

    private static void printMen(ArrayList<Man> listMen) {
        for (int i = 0; i < listMen.size(); i++) {
            System.out.println(listMen.get(i));
        }
    }

    private static void sortMenByIQWithBubbleSort(ArrayList<Man> source) {
        int length = source.size();
        boolean swapped;
        Man temporaryVariable;

        for (int i = 0; i < length - 1; i++) {
            swapped = false;

            for (int j = 0; j < length - i - 1; j++) {
                if (source.get(j).iq < source.get(j + 1).iq) {
                    temporaryVariable = source.get(j);
                    source.set(j, (source.get(j +1)));
                    source.set((j + 1),temporaryVariable);
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }
    }
}

