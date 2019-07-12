class ArrayBubble {
    public static void main(String[] args) {
        int top = 10;
        Man[] listMen = {
                new Man(1, "Alex", 125),
                new Man(2, "Vlad", 121),
                new Man(3, "Kolya", 88),
                new Man(4, "Tima", 133),
                new Man(5, "Vova", 198),
                new Man(6, "Victor", 142),
                new Man(7, "Dimon", 112),
                new Man(8, "Oleg", 119),
                new Man(9, "Gleb", 85),
                new Man(10, "Artem", 133),
                new Man(11, "Goga", 146),
                new Man(12, "Kostya", 78),
                new Man(13, "Vadim", 89),
                new Man(14, "Alexander", 165),
                new Man(15, "Garic", 156),
                new Man(16, "Grisha", 130),
                new Man(17, "Sergey", 129),
                new Man(18, "Stas", 135),
                new Man(19, "Gosha", 79),
                new Man(20, "Albert", 96),
        };

        System.out.println("\nUnsorted");
        printMen(listMen);
        sortMenByIQWithBubbleSort(listMen);

        System.out.println("\nSorted Top " + top);
        for (int i = 0; i < top; i++) {
            System.out.println(listMen[i]);
        }
    }

    private static void printMen(Man[] listMen) {
        for (int i = 0; i < listMen.length; i++) {
            System.out.println(listMen[i]);
        }
    }

    private static void sortMenByIQWithBubbleSort(Man[] source) {
        int length = source.length;
        boolean swapped;
        Man temporaryVariable;

        for (int i = 0; i < length - 1; i++) {
            swapped = false;

            for (int j = 0; j < length - i - 1; j++) {
                if (source[j].iq < source[j + 1].iq) {
                    temporaryVariable = source[j];
                    source[j] = source[j + 1];
                    source[j + 1] = temporaryVariable;
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }
    }
}

