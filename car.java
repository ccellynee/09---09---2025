public class car {
    //property class
    int numDoors;
    boolean isElectric;

    //constractor
    public car () {
        numDoors = 4;
        isElectric = false;
    }

    public car (int numDoors, boolean isElectric) {
        this.numDoors = numDoors;
        this.isElectric = isElectric;
    }

    //method
    public void print () {
        System.out.println("Num doors: "+ numDoors);
        System.out.println("Is electric: "+ isElectric);
    }
}
