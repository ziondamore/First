class ArrayBubble {
    public static void main(String[] args) {
        int top = 10;
        OldMan[] listMen = {
            new OldMan(1, "Alex", 125),
            new OldMan(2, "Vlad", 121),
            new OldMan(3, "Kolya", 88),
            new OldMan(4, "Tima", 133),
            new OldMan(5, "Vova", 198),
            new OldMan(6, "Victor", 142),
            new OldMan(7, "Dimon", 112),
            new OldMan(8, "Oleg", 119),
            new OldMan(9, "Gleb", 85),
            new OldMan(10, "Artem", 133),
            new OldMan(11, "Goga", 146),
            new OldMan(12, "Kostya", 78),
            new OldMan(13, "Vadim", 89),
            new OldMan(14, "Alexander", 165),
            new OldMan(15, "Garic", 156),
            new OldMan(16, "Grisha", 130),
            new OldMan(17, "Sergey", 129),
            new OldMan(18, "Stas", 135),
            new OldMan(19, "Gosha", 79),
            new OldMan(20, "Albert", 96),
        };

        System.out.println("\nUnsorted");
        printMen(listMen);
        sortMenByIQWithBubbleSort(listMen);

        System.out.println("\nSorted Top " + top);
        for (int i = 0; i < top; i++) {
            System.out.println(listMen[i]);
        }
    }

    private static void printMen(OldMan[] listMen) {
        for (int i = 0; i < listMen.length; i++) {
            System.out.println(listMen[i]);
        }
    }

    private static void sortMenByIQWithBubbleSort(OldMan[] source) {
        int length = source.length;
        OldMan temporaryVariable;

        for (int i = 0; i < length; i++) {
            for (int j = 1; j < length - i; j++) {
                if (source[j - 1].iq < source[j].iq) {
                    temporaryVariable = source[j - 1];
                    source[j - 1] = source[j];
                    source[j] = temporaryVariable;
                }
            }
        }
    }
}

class OldMan {
    public int indexNumber;
    public String name;
    public int iq;

    public OldMan(int indexNumber, String name, int iq) {
        this.name = name;
        this.indexNumber = indexNumber;
        this.iq = iq;
    }

    public String toString() {
        return this.indexNumber + " " + this.name + " " + this.iq;
    }
}