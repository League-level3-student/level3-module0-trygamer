package arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	static Random ra = new Random();
	static boolean finish = false;
	//1. make a main method
public static void main(String[] args) {
	
	int x= ra.nextInt(10);
	//2. create an array of 5 robots.
	Robot[] robots= new Robot[x];
	//3. use a for loop to initialize the robots.
	for (int i = 0; i < robots.length; i++) {
		//4. make each robot start at the bottom of the screen, side by side, facing up
		robots[i]= new Robot();
		robots[i].miniaturize();
		robots[i].setY(500);
		robots[i].setX(100+i*100);
		robots[i].setSpeed(10000);
		
	}
		
	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.
	
	while(!finish) {
	
for(int j=0; j<robots.length;j++) {
	
	int y= ra.nextInt(50);
	robots[j].move(y);
int yc =	robots[j].getY();
if(yc<=0) {
	finish= true;
	JOptionPane.showMessageDialog(null, "the winner is robot "+j);
}


	
	
}
	}
	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

	//7. declare that robot the winner and throw it a party!

	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.



}
}
