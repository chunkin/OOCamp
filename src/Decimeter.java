public class Decimeter {
    private double decimeter_2_meter =0.1;

    private double value;

    public Decimeter(double value) {
        this.value = value;
    }



    public Meter add(Meter m) {
        return this.add(m.toDecimeter()).toMeter();
    }

    public Meter toMeter(){
        return new Meter(this.value * decimeter_2_meter);
    }

    public Decimeter add(Decimeter d){
        return new Decimeter(d.value + this.value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Decimeter decimeter = (Decimeter) o;

        if (Double.compare(decimeter.value, value) != 0) return false;

        return true;
    }

    @Override
    public int hashCode() {
        long temp = value != +0.0d ? Double.doubleToLongBits(value) : 0L;
        return (int) (temp ^ (temp >>> 32));
    }
}
