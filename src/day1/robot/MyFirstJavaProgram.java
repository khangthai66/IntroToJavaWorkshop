package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE
 Robot mason=new Robot();
 for (int i = 0; i < 4; i++) {
mason.setRandomPenColor();
 mason.penDown();
 mason.move(255);
 mason.turn(90);
}
	}
}
