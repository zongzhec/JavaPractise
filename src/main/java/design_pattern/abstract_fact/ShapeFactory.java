package design_pattern.abstract_fact;

import common.constants.Constants;

public class ShapeFactory extends AbstractFactory {

	@Override
	public Color getColor(String color) {
		// No Color in Shape factory
		return null;
	}

	@Override
	public Shape getShape(String shapeType) {
		if (shapeType == null) {
			return null;
		}
		switch (shapeType) {
		case Constants.CIRCLE:
			return new Circle();
		case Constants.RECTANGLE:
			return new Rectangle();
		case Constants.SQUARE:
			return new Square();
		default:
			break;
		}
		return null;
	}

}
