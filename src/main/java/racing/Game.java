package racing;

public class Game {
    public static void game(Cars cars, Count count) {
        int roundCount = 1;

        for (int i = 0; i < count.getCount(); i++) {

            for (Car car : cars.getCars()) {
                int dice = GameController.dice();
                boolean move = GameController.move(dice);
                GameController.carMove(car, move);
            }

            Output.game(cars, roundCount);
            roundCount++;
        }
    }
}
