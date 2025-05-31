public class Dog {
    private String name;
    private String breed;


    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }


    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog("Goldi", "Golden Retriever");
        Dog dog2 = new Dog("Kala", "German Shepherd");
        
        System.out.println("Initial values:");
        System.out.println("Dog 1: " + dog1.getName() + " - " + dog1.getBreed());
        System.out.println("Dog 2: " + dog2.getName() + " - " + dog2.getBreed());
        
  
        dog1.setName("Sheru");
        dog2.setBreed("kali");
        
        System.out.println("\nUpdated values:");
        System.out.println("Dog 1: " + dog1.getName() + " - " + dog1.getBreed());
        System.out.println("Dog 2: " + dog2.getName() + " - " + dog2.getBreed());
    }
}