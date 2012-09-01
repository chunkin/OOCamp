public class Meter extends Length{
    private double meter_2_decimeter =10;

    public Meter(double value) {
        super(value,"meter");
    }

    public Meter add(Meter m) {
        return new Meter(this.value + m.value);
    }





    public Meter add(Decimeter d1) {
        return this.add(d1.toMeter()) ;
    }

    public Decimeter toDecimeter(){
        return  new Decimeter(this.value * meter_2_decimeter);
    }
}
