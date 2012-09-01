public class Meter {
    private double value;

    public Meter(double value) {
        this.value = value;
    }

    public Meter add(Meter m) {
        return new Meter(this.value + m.value());
    }

    public double value() {
        return this.value;
    }

    public boolean equals(Object o){
        if(o instanceof Meter){
            return this.value() == ((Meter)o).value() ? true : false;
        }
        return false;
    }
}
