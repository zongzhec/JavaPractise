package zongzhe.design_pattern.abstract_fact;

import common.constants.Constants;

public class FactoryProducer {

	public static AbstractFactory getFactory(String choice) {
		switch (choice) {
		case Constants.COLOR:
			return new ColorFactory();
		case Constants.SHAPE:
			return new ShapeFactory();
		default:
			return null;
		}
	}

}
