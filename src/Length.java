public class Length {
    private double value;
    private Unit unit;

    public  Length(double length, Unit unit) {
        this.value = length;
        this.unit = unit;
    }

    public Length add(Length l){
       return new Length(this.toMeter().value + l.toMeter().value,Unit.Meter);
    }

    private Length toMeter(){
        return new Length(value*unit.Factor(),Unit.Meter);
    }

    @Override
    public boolean equals(Object o) {

        if(o instanceof Length){
            Length length = (Length) o;

            if (Double.compare(length.toMeter().value, this.toMeter().value) == 0) return true;
       }
        return false;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = value != +0.0d ? Double.doubleToLongBits(value) : 0L;
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + (unit != null ? unit.hashCode() : 0);
        return result;
    }
}

 enum Unit{
     Meter(1),
     Decimeter(0.1),
     Centimeter(0.01);

     private double factor;

     Unit(double factor) {
         this.factor = factor;
     }

     public double Factor(){
         return factor;
     }
 }
