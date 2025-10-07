package zoo;

public class Animal {
    private String getAniName;
    int age;
    String species;
    int theWeight;
    String someID;


    public Animal(String getAniName, String species) {
        this.getAniName = getAniName;
        this.species = species;
    }

    public Animal(int theWeight) {
        this.theWeight = theWeight;
    }

    public String getAniName() {
        return getAniName;
    }
}





