package racing;

import java.util.List;
import java.util.Objects;

public class Car {
    private String name;
    private int distanceTraveled;

    public Car(String name) {
        if (name.length() > 10) {
            throw new IllegalArgumentException("[ERROR] 글자수 초과!!");
        }
        this.name = name;
        this.distanceTraveled = 0;
    }

    public Car(String name, int distanceTraveled) {
        this.name = name;
        this.distanceTraveled = distanceTraveled;
    }

    public String getName() {
        return name;
    }

    public int getDistanceTraveled() {
        return distanceTraveled;
    }

    public void setDistanceTraveled(int distanceTraveled) {
        this.distanceTraveled = distanceTraveled;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return distanceTraveled == car.distanceTraveled && Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, distanceTraveled);
    }
}
