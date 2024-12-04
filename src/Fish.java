
public  class Fish extends Animal {
    private boolean hasScales;
    public Fish() {
        super();
        this.hasScales = true;
    }
    public Fish(String name, int age, double weight, boolean hasScales) {
        super();
        this.hasScales = hasScales;
    }
    public boolean isHasScales() {
        return hasScales;
    }
    public void setHasScales(boolean hasScales) {
        this.hasScales = hasScales;
    }
    public String getVoice() {
        return "Blub blub";
    }
    @Override
    public String toString() {
        return super.toString() + ", hasScales=" + hasScales;
    }
}