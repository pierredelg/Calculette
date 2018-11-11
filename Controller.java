package calculette;



import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import java.lang.Math;

public class Controller {
	@FXML
	TextField labelDisplay;

	private int number1,number2;

	private String operator;


	//    public void initialize() {
	//            System.out.println("Initialisation...");
	//    }
	//    
	public String eventID(ActionEvent event) {

		return event.getSource().toString().substring(event.getSource().toString().length()-2,event.getSource().toString().length()-1);
	}

	public void pressedNumber(ActionEvent event) {

		if (labelDisplay.getText().equals("0")) {
			labelDisplay.setText(eventID(event));
		}
		else {    	
			labelDisplay.setText(labelDisplay.getText() + eventID(event));

		}
	}

	public void pressedOperator(ActionEvent event) {

		if (number1 == 0) {
			number1 = Integer.parseInt(labelDisplay.getText());
			labelDisplay.setText("0");
		}
		else {

			number2 = Integer.parseInt(labelDisplay.getText());

			switch (operator) {

			case "+":
				number1 = number1 + number2;


				break;

			case "-":

				number1 = number1 - number2;

				break;

			case "*":

				number1 = number1 * number2;

				break;

			case "/":

				number1 = number1 / number2;
				break;
			}
			number2 = 0;
			labelDisplay.setText(""+number1);
		}
		operator = eventID(event);

	}

	public void pressedButtonEqual(ActionEvent event) {

		if(!labelDisplay.getText().equals(""+number1)) {

			number2 = Integer.parseInt(labelDisplay.getText());

			switch (operator) {

			case "+":
				number1 = number1 + number2;


				break;

			case "-":

				number1 = number1 - number2;

				break;

			case "*":

				number1 = number1 * number2;

				break;

			case "/":

				number1 = number1 / number2;
				break;
			}

		}
		labelDisplay.setText("" +number1);
	}

	public void pressedButtonC(ActionEvent event) {
		number1 = 0;
		labelDisplay.setText("0");

	}
}
