import java.util.Arrays;
import java.util.Comparator;

class MenBubble {
    public static void main(String[] args) {
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
        for (int i = 0; i < listMen.length; i++) {
            System.out.println(listMen[i]);
        }
        Arrays.sort(listMen, new Sort());


        System.out.println("\nSorted by IQ: Top 10");
        Man[] getCopy_Man = Arrays.copyOfRange(listMen, 0, 10);
        for (Man listMen1 : getCopy_Man) {
            System.out.println(listMen1.toString() + " ");
            System.out.println();
        }
    }
}
