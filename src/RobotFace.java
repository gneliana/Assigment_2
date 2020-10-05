/* File: RobotFace.java */
/* This program draws a robot face. */
import acm.graphics.*; 
import acm.program.*; 
import java.awt.*;

public class RobotFace extends GraphicsProgram {

	private static final int HEAD_WIDTH =200;
	private static final int HEAD_HEIGHT =300;
	private static final int EYE_RADIUS = 40;
	private static final int MOUTH_WIDTH = 80;
	private static final int MOUTH_HEIGHT = 40;
	
	public void run () {
		buildHead();
		buildLeftEye();
		buildRightEye();
		buildMouth();
	
	}
	private void buildHead() {
		double startingWidth = ((getWidth()/2) - (HEAD_WIDTH/2));
		double startingHeight = ((getHeight()/2) - (HEAD_HEIGHT/2));
		GRect face = new GRect (startingWidth, startingHeight, HEAD_WIDTH, HEAD_HEIGHT);
		add(face);
		face.setFilled(true);
		face.setFillColor(Color.GRAY);
		
	}
	private void buildLeftEye() {
		double startingWidth = getWidth()/2 - HEAD_WIDTH/4 - EYE_RADIUS/2;
		double startingHeight = getHeight()/2 - HEAD_HEIGHT/4 - EYE_RADIUS/2;
		GOval leftEye = new GOval (startingWidth, startingHeight, EYE_RADIUS, EYE_RADIUS);
		add(leftEye);
		leftEye.setColor(Color.YELLOW);
		leftEye.setFilled(true);
		leftEye.setFillColor(Color.YELLOW);
		
	}
	private void buildRightEye() {
		double startingWidth = getWidth()/2 + HEAD_WIDTH/4 - EYE_RADIUS/2;
		double startingHeight = getHeight()/2 - HEAD_HEIGHT/4 - EYE_RADIUS/2;
		GOval rightEye = new GOval (startingWidth, startingHeight, EYE_RADIUS, EYE_RADIUS);
		add(rightEye);
		rightEye.setColor(Color.YELLOW);
		rightEye.setFilled(true);
		rightEye.setFillColor(Color.YELLOW);
		
	}
	private void buildMouth() {
		double startingWidth = getWidth()/2 - MOUTH_WIDTH/2;
		double startingHeight = getHeight()/2 + HEAD_HEIGHT/4 - MOUTH_HEIGHT/2;
		GRect mouth = new GRect (startingWidth, startingHeight, MOUTH_WIDTH, MOUTH_HEIGHT);
		add(mouth);
		mouth.setColor(Color.WHITE);
		mouth.setFilled(true);
		mouth.setFillColor(Color.WHITE);
		
	}
}

