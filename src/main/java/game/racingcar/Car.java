package game.racingcar;

/**
 * 자동차
 *
 * @author ttuop
 */
class Car {

	private final Engine engine = new Engine();
	private final Mileage mileage = new Mileage();
	private final CarName name;

	Car(CarName name) {
		this.name = name;
	}

	void move(Fuel fuel) {
		mileage.increase(engine.run(fuel));
	}

	CarName getName() {
		return name;
	}

	Mileage getMileage() {
		return mileage;
	}
}
