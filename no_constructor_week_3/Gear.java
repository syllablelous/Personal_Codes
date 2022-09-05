public class Gear {
    //Gear attributes
    String name;
    String type;
    String rarity;
    float weight;
    String description;

    //Gear method
    public void sayGearDescription() {
        System.out.println("Description: " + description);
    }

    public void showAllAttributes() {
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Rarity: " + rarity);
        System.out.println("Weight: " + weight);
    }
}
