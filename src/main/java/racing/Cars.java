package racing;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Cars {
    List<Car> cars;

    public Cars(List<Car> cars) {
        this.cars = cars;
    }

    public Cars(String carsInput){
        String[] carsArr = carsInput.split(",");
        List<Car> carsList = new ArrayList<>();

        for (String s : carsArr) {
            carsList.add(new Car(s));
        }
        this.cars = carsList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cars cars1 = (Cars) o;
        return Objects.equals(cars, cars1.cars);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(cars);
    }
}
