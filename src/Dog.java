public  class Dog extends Mammal {
    private String breed;

    public Dog() {
        super();
        this.breed = "Unknown";
    }

    public Dog(String name, int age, double weight, String furColor, String breed) {
        super(name, age, weight, furColor);
        this.breed = breed;
    }
    public Dog(String name, int age) {
        super();
        this.breed = "Unknown";
    }
    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
    public String getVoice() {
        return "Woof!";
    }
    @Override
    public String toString() {
        return super.toString() + ", breed='" + breed + "'";
    }

}