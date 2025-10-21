package A20_Tierverwaltungssystem.model;

public abstract class Animal {

    private String name;
    private String species;
    private int age;

    public Animal(String name, String species, int age) {
        this.name = name;
        this.species = species;
        this.age = age;
    }

    public String getName() { return name; }
    public String getSpecies() { return species; }
    public int getAge() { return age; }

    public void setSpecies(String species) { this.species = species; }
    public void setAge(int age) { this.age = age; }

    @Override
    public String toString() {
        return name + " (" + species + ", " + age + " Jahre)";
    }
}
