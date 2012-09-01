public class Length {
    protected double value;
    protected String unit;

    public Length(double length,String unit) {
        this.value = length;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Length length = (Length) o;

        if (Double.compare(length.value, value) != 0) return false;
        if (unit != null ? !unit.equals(length.unit) : length.unit != null) return false;

        return true;
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
