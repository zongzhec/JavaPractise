package zongzhe.design_pattern.abstract_fact;

import common.constants.Constants;

public class ColorFactory extends AbstractFactory {

	@Override
	public Color getColor(String colorType) {
		switch (colorType) {
		case Constants.RED:
			return new Red();
		case Constants.GREEN:
			return new Green();
		case Constants.BLUE:
			return new Blue();
		default:
			break;
		}
		return null;
	}

	@Override
	public Shape getShape(String shape) {
		// Color factory does not contain shape
		return null;
	}

}
