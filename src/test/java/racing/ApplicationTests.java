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
}
