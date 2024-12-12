package racing;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        //참가 자동차 목록 입력
        Output.carNameInput();
        Cars cars = Input.carsInput();
        Output.carNameOutput(cars);

        //시행 횟수 입력
        Output.countQuestion();
        Count count = Input.count();
        Output.count(count);
        System.out.println();

        //레이싱 시작
        Game.game(cars, count);

        //우승자 시상
        Cars winner = GameController.winner(cars);
        Output.win(winner);
    }

}
