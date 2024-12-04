
public  class Bird extends Animal {

    private String featherColor;

    public Bird() {
        super();
        this.featherColor = "Unknown";
    }
    public Bird(String name, int age, double weight, String featherColor) {
        super();
        this.featherColor = featherColor;
    }
    public String getFeatherColor() {
        return featherColor;
    }

    public void setFeatherColor(String featherColor) {
        this.featherColor = featherColor;
    }
    public String getVoice() {
        return "Bird chirping";
    }
    @Override
    public String toString() {
        return super.toString() + ", featherColor='" + featherColor + "'";
    }
}


