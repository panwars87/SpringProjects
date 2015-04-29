package com.ys.spring.bean;

public class ShapeHelper {
	Shape shape;

	public void setShape(Shape shape) {
		this.shape = shape;
	}

	public String drawShape(){
		return shape.draw();
	}
}
