package foo.zongzhe.prac.design_pattern;

/**
 * Factory Pattern
 */
public class ShapeFactory {

	public Shape getShape(String shapeType) {
		switch (shapeType) {
		case "circle":
			return new Cycle();
		case "square":
			return new Square();
		case "rectangle":
			return new Rectangle();
		default:
			return null;
		}
	}

}
