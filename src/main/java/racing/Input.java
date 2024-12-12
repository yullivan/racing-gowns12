package racing;

import java.util.Scanner;

public class Input {

    //참가 자동차 목록을 입력
    public static String carsInput(){
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public static int count(){
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
}
