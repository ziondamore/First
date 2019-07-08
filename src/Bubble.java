import java.util.Arrays;
import java.util.SplittableRandom;

public class Bubble {
    public static void main(String[] args) {
        String[][]Men = new String[20][3];

        Men[0][0] = "1";
        Men[0][1] = "Alex";
        Men[0][2] = "125";

        Men[1][0] = "2";
        Men[1][1] = "Vlad";
        Men[1][2] = "121";

        Men[2][0] = "3";
        Men[2][1] = "Kolya";
        Men[2][2] = "88";

        Men[3][0] = "4";
        Men[3][1] = "Tima";
        Men[3][2] = "133";

        Men[4][0] = "5";
        Men[4][1] = "Vova";
        Men[4][2] = "198";

        Men[5][0] = "6";
        Men[5][1] = "Victor";
        Men[5][2] = "142";

        Men[6][0] = "7";
        Men[6][1] = "Ivan";
        Men[6][2] = "156";

        Men[7][0] = "8";
        Men[7][1] = "Dimon";
        Men[7][2] = "112";

        Men[8][0] = "9";
        Men[8][1] = "Oleg";
        Men[8][2] = "119";

        Men[9][0] = "10";
        Men[9][1] = "Gleb";
        Men[9][2] = "85";

        Men[10][0] = "11";
        Men[10][1] = "Artem";
        Men[10][2] = "133";

        Men[11][0] = "12";
        Men[11][1] = "Goga";
        Men[11][2] = "146";

        Men[12][0] = "13";
        Men[12][1] = "Kostya";
        Men[12][2] = "78";

        Men[13][0] = "14";
        Men[13][1] = "Vadim";
        Men[13][2] = "89";

        Men[14][0] = "15";
        Men[14][1] = "Alexander";
        Men[14][2] = "95";

        Men[15][0] = "16";
        Men[15][1] = "Garic";
        Men[15][2] = "156";

        Men[16][0] = "17";
        Men[16][1] = "Gosha";
        Men[16][2] = "79";

        Men[17][0] = "18";
        Men[17][1] = "Grisha";
        Men[17][2] = "130";

        Men[18][0] = "19";
        Men[18][1] = "Sergey";
        Men[18][2] = "129";

        Men[19][0] = "20";
        Men[19][1] = "Stas";
        Men[19][2] = "135";

        ///System.out.println(Arrays.deepToString(Men));

        for (int i = 0; i < Men.length; i++){
            for (int j = 0; j < Men[i].length; j++){
                System.out.print(Men[i][j] + "\t");
            }
            System.out.println();
        }
        };

    }
class Men{
    String Number;
    String Name;
    int IQ;
}

