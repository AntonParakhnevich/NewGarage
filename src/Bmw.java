import java.util.Objects;

public class Bmw extends Car {
    private int volume;

    Bmw(String model, String mark, int year, String color, int volume) {
        super(model, mark, year, color);
        this.volume=volume;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bmw bmw = (Bmw) o;
        return volume == bmw.volume;
    }

    @Override
    public int hashCode() {
        return Objects.hash(volume);
    }

    @Override
    public String toString() {
        return "Bmw{" +
                "model='" + getModel() +
                "', mark='"+getMark()+
                "', year='"+getYear()+
                "', color='"+getColor()+
                "', volume='"+volume+
                "'}";
    }
 //   Bmw{model='BMW', mark='X5', year=2010, color='black', v=2}
}

