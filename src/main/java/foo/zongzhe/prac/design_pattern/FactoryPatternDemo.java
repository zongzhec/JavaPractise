package foo.zongzhe.prac.design_pattern;

public class FactoryPatternDemo {

	public static void main(String[] args) {
		ShapeFactory sf = new ShapeFactory();

		Shape shape1 = sf.getShape("circle");
		shape1.draw();

		Shape shape2 = sf.getShape("square");
		shape2.draw();

	}

}
