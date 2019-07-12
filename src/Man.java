public class Man {
    public int indexNumber;
    public String name;
    public int iq;

    public Man(int indexNumber, String name, int iq) {
        this.name = name;
        this.indexNumber = indexNumber;
        this.iq = iq;
    }
    public String toString() {
        return this.indexNumber + " " + this.name + " " + this.iq;
    }

}