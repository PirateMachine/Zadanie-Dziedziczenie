public  class Blowfish extends Fish {
    private boolean canInflate;

    public Blowfish() {
        super();
        this.canInflate = true;
    }
    public Blowfish(String name, int age, double weight, boolean hasScales, boolean canInflate) {
        super(name, age, weight, hasScales);
        this.canInflate = canInflate;
    }
    public Blowfish(String name, int age) {
        super();
        this.canInflate = true;
    }
    public boolean isCanInflate() {
        return canInflate;
    }
    public void setCanInflate(boolean canInflate) {
        this.canInflate = canInflate;
    }
    public String getVoice() {
        return "Blowfish bubbles!";
    }
    @Override
    public String toString() {
        return super.toString() + ", canInflate=" + canInflate;
    }

}