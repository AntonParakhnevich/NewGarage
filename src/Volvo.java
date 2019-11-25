import java.util.Objects;

public class Volvo extends Car {
    private int speed;
    @Override
    public String toString() {
        return "Volvo{" +
                "model='" + getModel() +
                "', mark='"+getMark()+
                "', year='"+getYear()+
                "', color='"+getColor()+
                "', speed='"+speed+
                "'}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Volvo volvo = (Volvo) o;
        return speed == volvo.speed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed);
    }

    public Volvo(String model, String mark, int year, String color,int speed) {
        super(model, mark, year, color);
        this.speed=speed;
    }
}

