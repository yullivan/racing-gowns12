package racing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GameController {
    public static int dice() {
        List<Integer> dice = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6));
        Collections.shuffle(dice);
        return dice.get(0);
    }

    public static boolean move(int dice) {
        if (dice == 1 || dice == 2) {
            return false;
        }
        return true;
    }

    public static List<Car> winner(Cars cars) {
        List<Integer> distances = cars.getCars().stream()
                .map(Car::getDistanceTraveled)
                .sorted().toList();

        return cars.getCars().stream()
                .filter(car->car.getDistanceTraveled()==distances.get(distances.size()-1))
                .toList();
    }
}
