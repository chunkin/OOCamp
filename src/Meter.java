public class Meter {
    private double value;
    private double meter_2_decimeter =10;

    public Meter(double value) {
        this.value = value;
    }

    public Meter add(Meter m) {
        return new Meter(this.value + m.value);
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Meter meter = (Meter) o;

        if (Double.compare(meter.value, value) != 0) return false;

        return true;
    }

    @Override
    public int hashCode() {
        long temp = value != +0.0d ? Double.doubleToLongBits(value) : 0L;
        return (int) (temp ^ (temp >>> 32));
    }

    public Meter add(Decimeter d1) {
        return this.add(d1.toMeter()) ;
    }

    public Decimeter toDecimeter(){
        return  new Decimeter(this.value * meter_2_decimeter);
    }
}
