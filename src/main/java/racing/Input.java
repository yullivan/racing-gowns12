package racing;

import java.util.Scanner;

public class Input {

    //참가 자동차 목록을 입력
    public static String carsInput() {
        Scanner sc = new Scanner(System.in);
        String carsStr;
        while (true) {
            try {
                carsStr = sc.nextLine();
                Cars cars = new Cars(carsStr);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("자동차의 이름은 10자를 넘을 수 없습니다.");
            }
        }
        return carsStr;
    }


    public static Count count() {
        Scanner sc = new Scanner(System.in);
        Count count;
        while (true){
            try {
                count = new Count(sc.nextInt());
                break;
            }catch (IllegalArgumentException e){
                System.out.println("시행 횟수는 최소 1번 이상이어야 합니다.");
            }
        }

        return count;
    }
}
