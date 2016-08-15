package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {
		
		Robot mason=new Robot();
		
		
		
		
 mason.penDown();
		
 mason.setSpeed(10);
		
 for (int i = 0; i < 75; i++) {
	

			
 mason.setRandomPenColor();
			
 mason.move(5*i);
			
	mason.turn(360/7);
			
 
			// 9. Set the pen width to i
 mason.setPenWidth(i);
 }
	}
}
