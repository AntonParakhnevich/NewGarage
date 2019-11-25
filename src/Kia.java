import java.util.Objects;

public class Kia extends Car {
    private int door;
    @Override
    public String toString() {
        return "Kia{" +
                "model='" + getModel() +
                "', mark='"+getMark()+
                "', year='"+getYear()+
                "', color='"+getColor()+
                "', door='"+door+
                "'}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Kia kia = (Kia) o;
        return door == kia.door;
    }

    @Override
    public int hashCode() {
        return Objects.hash(door);
    }


    public Kia(String model, String mark, int year, String color,int door) {
        super(model, mark, year, color);
        this.door=door;
    }
}
