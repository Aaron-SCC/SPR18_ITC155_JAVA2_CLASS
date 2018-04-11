// ITC 155 JAVA 2 CLASS
// SPRING QUARTER 2018
// 2018_04_11
// Aaron Lewis
// 
// Assignment 01:
// In Java, via Eclipse.
// Place on github.com
// Submit on CANVAS the URL of assignment on github.com 
// 
// 123456789 123456789 123456789 123456789 123456789 123456789 
// 
// 
// Write a program that uses the DrawingPanel to draw Figure 
// #G.21.
// 
// The window is 200 pixels wide and 150 pixels tall.  The 
// background is yellow.  There are two blue ovals of size 40x40 
// pixels.  They are 80 pixels apart, and the left oval's top-left 
// corner is located at position (50,25).  There is a red sqaure 
// whose top two corners exactly intersect the centers of the two 
// ovals.  Lastly, there is a black horizontal line through the 
// center of the square.
// 
//         ORDER:
// 1.  yellow background
// 2.  blue oval left
// 3.  blue oval right
// 4.  red square over both ovals
// 5.  black horizontal line over red square
// 
// 
// 
// 

import java.awt.Color;
import java.awt.Graphics;





public class Java2_Assignment01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// size measured in pixels
		DrawingPanel panel = new DrawingPanel(220, 150); 
		
		// 1.  yellow background
		panel.setBackground(Color.YELLOW);
		
		// get instance of graphics object to draw on the panel
		Graphics g = panel.getGraphics();
		
		// 2.  blue oval left
		g.setColor(Color.BLUE); // color of left oval
		g.fillOval( 50, 25, 40, 40);
		
		// 3.  blue oval right
		// They are 80 pixels apart
		// 50 + 40 + 80 = 170
		//   ah.. book meant centers of ovals are
		//     80 pixels apart
		// 50 + 20 = 70 for x
		// 25 + 20 = 45 for y  
		//     left center is  70, 45
		// 70 + 80 pixels apart = 150 for x
		//     right center is 150,45
		//150 - 20 = 130 x  corner
		// 45 - 20 =  25 y  corner 
		//    right oval start corner is 130, 25
		g.setColor(Color.BLUE); // color of left oval
		g.fillOval(130, 25, 40, 40);
		
		// 4.  red square over both ovals
		// whose top two corners exactly intersect 
		// the centers of the two ovals
		// from prior collections

		//     left center is  70, 45
		//    right center is 150, 45
		g.setColor(Color.RED); // color of square
		g.fillRect( 70, 45, 80, 80);
		
		// 5.  black horizontal line over red square
		//  x = 70
		//  y = 45 + 40 = 85...
		//    85 + 40 = 125
		//  70, 95 x,y start point
		//  length is 80
		//  70 + 80 = 150
		//  70, 150 x, y end point
		g.setColor(Color.BLACK); // color of left oval
		g.drawLine( 70, 85, 150, 85);
		
		
	}

}
