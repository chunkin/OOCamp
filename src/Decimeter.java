public class Decimeter extends Length {
    private double decimeter_2_meter =0.1;


    public Decimeter(double value) {
        super(value,"decimeter");
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


}
