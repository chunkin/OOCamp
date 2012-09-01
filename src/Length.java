public class Length {
    protected double value;
    protected static final String meter = new String("meter");
    protected static final String decimeter =new String("decimeter");
    protected static final String centimeter =new String("centimeter");
    protected static final double factor_d2m = 0.1;
    protected static final double factor_c2m = 0.01;



    protected String unit;

    public  Length(double length,String unit) {
        this.value = length;
        this.unit = unit;
    }

    public Length add(Length l){
       return new Length(this.toMeter().value + l.toMeter().value,meter);


    }


    private Length toMeter(){
        if(decimeter.equals(unit)) return new Length(value * factor_d2m,meter);
        if(centimeter.equals(unit)) return new Length(value * factor_c2m,meter);

        return this;
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
