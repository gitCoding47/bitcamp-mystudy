package study.patterns.ex01.step4;

public class SonataFactory extends CarFactory {
	@Override
	public Car createCar() {
		Sedan s = new Sedan();

		s.maker = "현대자동차";
		s.model = "";
		s.cc = 1998;
		s.auto = true;
		s.sunroof = false;

		return s;

	}
}
