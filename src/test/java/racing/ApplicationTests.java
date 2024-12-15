package racing;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest(classes = Application.class)
class ApplicationTests {


    //입력받은 자동차 목록이 Cars 클래스로 잘 반환되는가 테스트
    @Test
    void carError() {
        String longName = "asdsfaffsdagadsgadgasdfdsaf";

        assertThrows(IllegalArgumentException.class, () -> {
            new Car(longName);
        });
    }

    @Test
    void countError() {
        int count = -1;
        assertThrows(IllegalArgumentException.class, () -> {
            new Count(count);
        });
    }

    @Test
    void winner() {
        Car car = new Car("A", 1);
        Car car2 = new Car("B", 2);
        Car car3 = new Car("C", 3);
        Car car4 = new Car("D", 5);
        Car car5 = new Car("F", 5);

        List<Car> carList = List.of(car, car2, car3, car4, car5);

        Cars cars = new Cars(carList);

        Cars winner = cars.winner();

        Assertions.assertThat(winner.equals(new Cars(List.of(car4, car5)))).isTrue();

    }

    @Test
    void getToCarStr() {
        Car car = new Car("A", 1);
        Car car2 = new Car("B", 2);
        Car car3 = new Car("C", 3);
        Car car4 = new Car("D", 5);
        Car car5 = new Car("F", 5);

        List<Car> carList = List.of(car, car2, car3, car4, car5);

        Cars cars = new Cars(carList);

        Assertions.assertThat(cars.getToCarsStr()).isEqualTo(List.of("A", "B", "C", "D", "F"));
    }

    @Test
    void carMoveTest() {
        Car car = new Car("현대", 0);
        int dice1 = 1;
        int dice2 = 2;
        int dice3 = 3;
        int dice4 = 6;

        //정지 distance=0
        GameController.carMove(car,GameController.move(dice1));
        assertEquals(0,car.getDistanceTraveled());

        //정지 distance=0
        GameController.carMove(car,GameController.move(dice2));
        assertEquals(0,car.getDistanceTraveled());

        //전진 distance=1
        GameController.carMove(car,GameController.move(dice3));
        assertEquals(1,car.getDistanceTraveled());

        //전진 distance=2
        GameController.carMove(car,GameController.move(dice4));
        assertEquals(2,car.getDistanceTraveled());
    }
}
