package org.vmware.spring.service;

import org.vmware.spring.model.Circle;
import org.vmware.spring.model.Triangle;

public class ShapeService {
	
	private Circle circle;
	private Triangle triangle;
	public Circle getCircle() {
		System.out.println("circle object inj");
		return circle;
	}
	public void setCircle(Circle circle) {
		this.circle = circle;
	}
	public Triangle getTriangle() {
		System.out.println("tri object inj");
		return triangle;
	}
	public void setTriangle(Triangle triangle) {
		this.triangle = triangle;
	}
	

}
