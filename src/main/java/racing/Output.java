package racing;

public class Output {

    //참가 자동차 목록을 요청
    public static void carNameInput(){
        System.out.println("레이스에 참가할 자동차들의 이름을 쉼표(,)로 구분하여 입력하세요.");
    }
    //참가 자동차 목록 출력
    public static void carNameOutput(String carsStr){
        System.out.println(": "+carsStr);
    }
    //몇 회 시행할 것인지 질문
    public static void countQuestion(){
        System.out.println("몇 회 시행할까요?");
    }
    //
    public static void count(int count){
        System.out.println(": "+count);
    }

}
