package study.uml.class_diagram;

public class Car {

	Insurance insuarance;
	Navigation navigation;
	Engine engine;

	public Car(Engine engine) {
		this.engine = engine;
	}

	public Engine getEngine() {
		return engine;
	}

	public Insurance getInsurance() {
		return insuarance;
	}

	public void setInsuarance(Insurance insuarance) {
		this.insuarance = insuarance;
	}

	public Navigation getNavigation() {
		return navigation;
	}

	public void setNavigation(Navigation navigation) {
		this.navigation = navigation;
	}

}
