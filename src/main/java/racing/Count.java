package racing;

public class Count {
    private int count;

    public Count(int count) {
        if (count<1){
            throw new IllegalArgumentException("[ERROR] 시행 횟수 오류");
        }
        this.count = count;
    }

    public int getCount() {
        return count;
    }
}
