package basicMath1st;



//Will create an instance of the equation class that contains an a, b, c elements as well as the equation and answer.
public class Equation {

	private int a;
	private int b;
	private int c;
	private String equation;
	private String answerEquation;
	private int answer;
	//private final int typeOfEquation = 0;
	
	public Equation() {
		a = (int) (Math.random() * 11 + 0);
		b = (int) (Math.random() * 11 + 0);
		c = a+b;
		
		int typeOfEquation = (int) (Math.random() * 6 + 0);
		
				switch (typeOfEquation) {
				case 0:
					equation = "" + a + " + " + b + " = x";
					answerEquation = "" + a + " + " + b + " = " + c;
					answer = c;
					break;
				case 1:
					equation = "" + a + " + x = " + c;
					answerEquation = "" + a + " + " + b + " = " + c;
					answer = b;
					break;
				case 2:
					equation = "x + " + b + " = " + c;
					answerEquation = "" + a + " + " + b + " = " + c;
					answer = a;
					break;
				case 3:
					equation = "x - " + a + " = " + b;
					answerEquation = "" + c + " - " + a + " = " + b;
					answer = c;
					break;
				case 4:
					equation = "" + c + " - x = " + b;
					answerEquation = "" + c + " - " + a + " = " + b;
					answer = a;
					break;
				case 5:
					equation = "" + c + " - " + a + " = x";
					answerEquation = "" + c + " - " + a + " = " + b;
					answer = b;
					break;
				default:
					equation = "" + a + " + " + b + " = x";
					answerEquation = "" + a + " + " + b + " = " + c;
					answer = c;
					break;	
				}
		
	}
	
	public String getEquation() {
		return equation;
	}
	
	public String getAnswerEquation() {
		return answerEquation;
	}
	
	public int getAnswer() {
		return answer;
	}
	
	
}
