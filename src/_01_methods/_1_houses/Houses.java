package _01_methods._1_houses;

import org.jointheleague.graphical.robot.Robot;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */
public class Houses {
	Robot rob = new Robot();
	public void run() {
		
		// Check the recipe to find out what code to put her
		
		rob.setX(19);
		rob.setY(481);
		for (int i=0; i < 10; i+=1) {
			houses();
		}


		
		
	
		
	
	
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	private void houses() {
		rob.penDown();
		rob.setRandomPenColor();
		rob.setSpeed(9999991);
		rob.turn(90);
		rob.move(30);
		rob.turn(270);
		rob.move(100);
		rob.turn(90);
		rob.move(30);
		rob.turn(90);
		rob.move(100);
		rob.turn(270);
		rob.move(30);
		rob.turn(180);
		rob.turn(90);
	}

	private void method1(Object turn) {
		// TODO Auto-generated method stub
		
	}
}
