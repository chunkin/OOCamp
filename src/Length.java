public class Length {
    protected double value;
    protected static final String meter = new String("meter");
    protected static final String decimeter =new String("decimeter");
    protected static final double factor_d2m = 0.1;
    protected static final double factor_m2d = 10;


    protected String unit;

    public Length(double length,String unit) {
        this.value = length;
        this.unit = unit;
    }

    public Length add(Length l){
        //unit equals;
        if(this.unit.equals(l.unit)) return new Length(this.value+l.value,this.unit);
        //unit not equal,l.unit is meter,this.unit is decimeter
        if(meter.equals(l.unit)) return new Length(this.value + l.toDecimeter().value,this.unit );
        //unit not equal,l.unit is decimeter, this.unit is meter
        if(decimeter.equals(l.unit)) return new Length(this.value + l.toMeter().value,this.unit );
        return null;


    }

    private Length toDecimeter(){
        if(meter.equals(unit)) return new Length(value * factor_m2d,decimeter);
        return this;
    }
    private Length toMeter(){
        if(decimeter.equals(unit)) return new Length(value * factor_d2m,meter);
        return this;
    }


    @Override
    public boolean equals(Object o) {

        if(o instanceof Length){
            Length length = (Length) o;

            if (Double.compare(length.toDecimeter().value, this.toDecimeter().value) == 0) return true;
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
