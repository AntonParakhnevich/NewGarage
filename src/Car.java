import java.util.Objects;

public abstract class Car {
    private String model;
    private String mark;
    private int year;
    private String color;

    public String getModel() {
        return model;
    }

    public String getMark() {
        return mark;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public Car(String model, String mark, int year, String color) {
        this.model = model;
        this.mark = mark;
        this.year = year;
        this.color = color;
    }


}
