package game.racingcar;

public class Car {

	static final String COLON = " : ";

	private final Engine engine = new Engine();
	private final Mileage mileage = new Mileage();
	private final CarName name;

	public Car(CarName name) {
		this.name = name;
	}

	public void move(Fuel fuel) {
		mileage.increase(engine.run(fuel));
	}

	@Override
	public String toString() {
		return name.get() + COLON + mileage;
	}

	public int getMileage() {
		return mileage.get();
	}
}
