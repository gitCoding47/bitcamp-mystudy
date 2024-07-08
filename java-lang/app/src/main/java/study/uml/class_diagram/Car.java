package study.uml.class_diagram;

public class Car {

	Engine engine;
	Insurance insuarance;
	Navigation navigation;

	public Car(Engine engine) {
		this.engine = engine;
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
