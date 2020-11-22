package basicMath1st;

import java.util.Timer;
import java.util.TimerTask;

public class Main {

	private static MathGUI window;
	private static String equationString;
	private static String answerString;
	private static int answerInt;
	private static int score = 0;
	private static int level = 1;
	private static int incorrect = 0;
	private static long currentSpeed;
	private static final int passingScore = 29;
	private static TimerTask timerTrigger;
	private static Timer theTimer;
	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		window = new MathGUI();
		window.setVisible(true);
		setUpEquation();
	}

	
	private static void setUpEquation() {
		Equation currentEquation = new Equation();
		equationString = currentEquation.getEquation();
		answerString = currentEquation.getAnswerEquation();
		answerInt = currentEquation.getAnswer();
		window.updateEquationLabel(equationString);
		
		if (level > 1) {
			timer();
		}
		
	}
	
	public static void checkAnswer(int answerToCheck) {
		if (answerToCheck == answerInt) {
			window.updateFeedbackLabel(positiveFeedback());
			score++;
			if (level > 1) {
			theTimer.cancel();
			}
			if (score > passingScore) {
				level++;
				window.updateLevelLabel("Level: " + level);
				switch (level) {
				case 2:
					currentSpeed = 60000L;
					break;
				case 3:
					currentSpeed = 30000L;
					break;
				case 4:
					currentSpeed = 10000L;
					break;
				case 5:
					window.updateEquationLabel("You are a master!");
					window.updateFeedbackLabel("Tell your Teacher.");
					window.disableTextField();
					break;
				
				}
				score = 0;
			}
			incorrect = 0;
			if (level < 5) {
				setUpEquation();
			}
		} else {
			if (incorrect > 0) {
				window.updateFeedbackLabel("No.     " + answerString);
				incorrect = 0;
				setUpEquation();
			} else {
			window.updateFeedbackLabel("That's not it. Try again.");
			incorrect++;
			}
		}
	}
	
	private static String positiveFeedback() {
		int number = (int) (Math.random() * 4 + 0);
		switch (number) {
		case 0:
			return "Great job!!!";
		case 1:
			return "Well done!!!";
		case 2:
			return "That's it!!!";
		case 3:
			return "You rock!!!";
		default:
			return "Great job!!!";
		}
	}
	
	
	private static void timer() {
        
        
        
        timerTrigger = new TimerTask() {
        @Override
        public void run() {
        	window.updateFeedbackLabel("Sorry, you ran out of time");
        	setUpEquation();
        }
        };
        
        theTimer = new Timer(true);
        
        //System.out.println("timer was called. Speed is " + currentSpeed);
        
        theTimer.schedule(timerTrigger, currentSpeed);
        
        
    
}
	
	
}
