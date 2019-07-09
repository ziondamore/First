import java.util.Arrays;
import java.util.Comparator;

public class Men {
        public int indexNumber;
        public String name;
        public int iq;

        public Men(int indexNumber, String name, int iq) {
            this.name = name;
            this.indexNumber = indexNumber;
            this.iq = iq;
        }
        public String toString() {
            return this.indexNumber + " " + this.name + " " + this.iq;
        }

}
class  Sort implements Comparator<Men> {
   public int compare(Men a, Men b) {
       return b.iq - a.iq;
   }
}
class MenBubble {
    public static void main(String[] args) {
        Men[] listMen = {
                new Men(1, "Alex", 125),
                new Men(2, "Vlad", 121),
                new Men(3, "Kolya", 88),
                new Men(4, "Tima", 133),
                new Men(5, "Vova", 198),
                new Men(6, "Victor", 142),
                new Men(7, "Dimon", 112),
                new Men(8, "Oleg", 119),
                new Men(9, "Gleb", 85),
                new Men(10, "Artem", 133),
                new Men(11, "Goga", 146),
                new Men(12, "Kostya", 78),
                new Men(13, "Vadim", 89),
                new Men(14, "Alexander", 165),
                new Men(15, "Garic", 156),
                new Men(16, "Grisha", 130),
                new Men(17, "Sergey", 129),
                new Men(18, "Stas", 135),
                new Men(19, "Gosha", 79),
                new Men(20, "Albert", 96),
        };

        System.out.println("\nUnsorted");
        for (int i = 0; i < listMen.length; i++)
            System.out.println(listMen[i]);

        Arrays.sort(listMen, new Sort());


        System.out.println("\nSorted by IQ: Top 10");
        Men[] getCopy_Men = Arrays.copyOfRange(listMen, 0, 10);
        for (Men listMen1 : getCopy_Men)
            System.out.println(listMen1.toString() + " ");
            System.out.println();
    }
}
