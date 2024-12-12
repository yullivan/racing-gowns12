package racing;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class ApplicationTests {


    //입력받은 자동차 목록이 Cars 클래스로 잘 반환되는가 테스트
    @Test
    void carsListInput() {


        Car car1 = new Car("Hyundai");
        Car car2 = new Car("Porsche");
        Car car3 = new Car("Toyota");

        List<Car> carsList = new ArrayList<>(List.of(car1, car2, car3));


        Cars cars = new Cars(carsList);

        String carsStr = "Hyundai,Porsche,Toyota";


        Cars cars2 = new Cars("Hyundai,Porsche,Toyota");

        Assertions.assertThat(cars2.equals(cars)).isTrue();
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

        List<Car> winner = GameController.winner(cars);

        Assertions.assertThat(winner.equals(List.of(car4, car5))).isTrue();

    }
}
