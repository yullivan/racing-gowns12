package racing;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		Output.carNameInput();
		String carsStr = Input.carsInput();
		Cars cars = new Cars(carsStr);
		Output.carNameOutput(carsStr);
		Output.countQuestion();
		int count =Input.count();
		Output.count(count);
	}

}
