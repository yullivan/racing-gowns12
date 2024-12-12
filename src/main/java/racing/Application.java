package racing;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        //참가 자동차 목록 입력
        //시행 횟수 입력
        Output.carNameInput();
        String carsStr = Input.carsInput();
        Cars cars = new Cars(carsStr);
        Output.carNameOutput(carsStr);
        Output.countQuestion();
        Count count = Input.count();
        Output.count(count);
        System.out.println();

        //레이싱 시작
//        Output.game(cars, roundcount);
    }

}
