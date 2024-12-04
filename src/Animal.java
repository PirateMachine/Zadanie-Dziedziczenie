public abstract class Animal {

    String name;
    int age;
    double weight;

    public Animal() {
        this.name = name;

    }
    String getName(){
        return name;

    }
    public Animal(double weight) {
        this.weight = weight;

    }
    public int getAge() {
        return age;
    }
    public double getWeight() {
        return weight;
    }

    public Animal(int age) {
        this.age = age;

    }
    public String getVoice() {
        return "Some animal sound";
    }
    @Override
    public String toString() {
        return "Animal{name='" + name + "', age=" + age + ", weight=" + weight + "}";
    }
}
