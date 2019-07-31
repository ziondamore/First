package sorting;

import java.util.Comparator;

class  Sort implements Comparator<Man> {
    public int compare(Man a, Man b) {
        return b.getIq() - a.getIq();
    }
}