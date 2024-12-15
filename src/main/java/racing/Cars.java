package racing;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Cars {
    private List<Car> cars;

    public Cars(List<Car> cars) {
        this.cars = cars;
    }

    public Cars(String carsInput) {
        String[] carsArr = carsInput.split(",");
        List<Car> carsList = new ArrayList<>();

        for (String s : carsArr) {
            carsList.add(new Car(s));
        }
        this.cars = carsList;
    }

    public List<Car> getCars() {
        return cars;
    }

    public List<String> getToCarsStr() {
        List<String> temp = new ArrayList<>();

        for (Car car : cars) {
            temp.add(car.getName());
        }
        return temp;
    }

    public Cars winner() {
        List<Integer> distances = cars.stream()
                .map(Car::getDistanceTraveled)
                .sorted().toList();

        return new Cars(cars.stream()
                .filter(car -> car.getDistanceTraveled() == distances.get(distances.size() - 1))
                .toList());
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
