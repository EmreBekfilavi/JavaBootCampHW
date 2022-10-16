package overriding;

public class OgrenciKrediManager extends BaseKrediManager {

	public double calculate(double cost) {

		return cost * 1.10;

	}

}
