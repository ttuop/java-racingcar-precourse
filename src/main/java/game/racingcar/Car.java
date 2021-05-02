package game.racingcar;

public class Car {

	private final Engine engine = new Engine();
	private final Mileage mileage = new Mileage();
	private final CarName name;

	public Car(CarName name) {
		this.name = name;
	}

	public void move(Fuel fuel) {
		mileage.increase(engine.run(fuel));
	}

	public CarName getName() {
		return name;
	}

	public Mileage getMileage() {
		return mileage;
	}
}
