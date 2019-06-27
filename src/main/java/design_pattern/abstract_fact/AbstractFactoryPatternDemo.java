package design_pattern.abstract_fact;

import common.constants.Constants;

public class AbstractFactoryPatternDemo {

	public static void main(String[] args) {

		AbstractFactory shapeFactory = FactoryProducer.getFactory(Constants.SHAPE);
		Shape shape1 = shapeFactory.getShape(Constants.CIRCLE);
		shape1.draw();

	}

}
