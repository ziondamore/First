import java.util.Arrays;
import java.util.Comparator;
import java.util.SplittableRandom;
import java.util.Scanner;
import java.util.*;


public class Men {
        public int Number;
        public String Name;
        public int IQ;

        public Men(int Number, String Name, int IQ) {
            this.Name = Name;
            this.Number = Number;
            this.IQ = IQ;
        }
        public String toString() {
            return this.Number + " " + this.Name + " " + this.IQ;
        }

}
//class  Sort implements Comparator<Men> {
   //public int compare(Men a, Men b) {
  //      return b.IQ - a.IQ;
  //  }
//}
class MenBubble {
    public static void main(String[] args) {
        Men[] Arr = {
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
         for (int i = 0; i < Arr.length; i++)
            System.out.println(Arr[i]);

 //        Arrays.sort(Arr, new Sort());

  //      System.out.println("\nSorted by IQ");
  //       for (int i = 0; i < Arr.length; i++)
   //           System.out.println(Arr[i]);



    }
}
