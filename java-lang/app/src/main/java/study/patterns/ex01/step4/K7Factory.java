package study.patterns.ex01.step4;

public class K7Factory extends CarFactory {
	@Override
	public Car createCar() {
		Sedan s = new Sedan();
		s.maker = "기아자동차";
		s.model = "K7";
		s.cc = 2500;
		s.auto = true;
		s.sunroof = true;
		return s;
	}
}
