package sorting;

class Man {
    private int indexNumber;
    private String name;
    private int iq;

    public Man(int indexNumber, String name, int iq) {
        this.name = name;
        this.indexNumber = indexNumber;
        this.iq = iq;
    }

    public Integer getIq(){
        return iq;
    }

    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return this.indexNumber + " " + this.name + " " + this.iq;
    }

}