package com.sytax.class02;

public class AreaAndPerimeterOfRectangle {

	public static void main(String[] args) {
		// Calculating area and perimeter of rectangle
		int width=5;
		int height=8;
		int area,perimeter;
		area=width*height;
		perimeter=(2*height+2*width);
		
       System.out.println("The perimeter of a rectangle with width "+width+" and height "+height+" is equal to "+perimeter+" and the area is "+area);
	}

}
