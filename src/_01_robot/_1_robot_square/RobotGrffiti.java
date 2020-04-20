package _01_robot._1_robot_square;

import org.jointheleague.graphical.robot.Robot;

public class RobotGrffiti{
public static void main(String[] args) {
	

 Robot rob = new Robot();
 rob.penDown();
 for (int i = 0; i < 360; i++) {
	 rob.move(1);
	rob.turn(1); 
 }
}
}
