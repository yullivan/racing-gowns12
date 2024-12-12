package racing;

import java.util.List;

public class Output {

    //참가 자동차 목록을 요청
    public static void carNameInput() {
        System.out.println("레이스에 참가할 자동차들의 이름을 쉼표(,)로 구분하여 입력하세요.");
    }

    //참가 자동차 목록 출력
    public static void carNameOutput(String carsStr) {
        System.out.println(": " + carsStr);
    }

    //몇 회 시행할 것인지 질문
    public static void countQuestion() {
        System.out.println("몇 회 시행할까요?");
    }

    //시행 횟수 출력
    public static void count(int count) {
        System.out.println(": " + count);
    }

    //게임화면 출력
    public static void game(Cars cars,int roundCount){
        System.out.println("("+roundCount+")");
        for (Car car : cars.getCars()) {
            System.out.printf(car.getName()+" ");
            System.out.print("🚗");
            for (int i = 0; i < car.getDistanceTraveled(); i++) {
                System.out.print("-");
            }
            System.out.println();
        }
        System.out.println();
    }
}
