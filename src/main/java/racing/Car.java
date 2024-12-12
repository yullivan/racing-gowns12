package racing;

import java.util.Objects;

public class Car {
    String name;
    int distanceTraveled;

    public Car(String name) {
        this.name = name;
        this.distanceTraveled = 0;
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
