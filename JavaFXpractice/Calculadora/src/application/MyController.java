package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class MyController {
	@FXML
	private Button btnSuma;
	@FXML
	private Button btnResta;
	@FXML
	private Button btnMult;
	@FXML
	private TextField TextFieldNum1;
	@FXML
	private TextField TextFieldNum2;
	@FXML
	private TextField TextFieldResultado;

	public void suma(ActionEvent event) {
		if (TextFieldNum1.getText().length() == 0) {
			TextFieldResultado.setText("Sin valores");

		} else {

			int num1 = Integer.parseInt(TextFieldNum1.getText());
			int num2 = Integer.parseInt(TextFieldNum2.getText());
			int result = num1 + num2;

			TextFieldResultado.setText(Integer.toString(result));
		}
	}

	public void resta(ActionEvent event) {
		if (TextFieldNum1.getText().length() == 0) {
			TextFieldResultado.setText("Sin valores");

		} else {
			int num1 = Integer.parseInt(TextFieldNum1.getText());
			int num2 = Integer.parseInt(TextFieldNum2.getText());
			int result = num1 - num2;

			TextFieldResultado.setText(Integer.toString(result));
		}
	}

	public void multiplicacion(ActionEvent event) {
		if (TextFieldNum1.getText().length() == 0) {
			TextFieldResultado.setText("Sin valores");

		} else {
			int num1 = Integer.parseInt(TextFieldNum1.getText());
			int num2 = Integer.parseInt(TextFieldNum2.getText());
			int result = num1 * num2;

			TextFieldResultado.setText(Integer.toString(result));
		}
	}

	public void division(ActionEvent event) {
		if (TextFieldNum1.getText().length() == 0) {
			TextFieldResultado.setText("Sin valores");

		} else {
			int num1 = Integer.parseInt(TextFieldNum1.getText());
			int num2 = Integer.parseInt(TextFieldNum2.getText());
			double result = (double) num1 / num2;
			if (num1 == 0 && num2 == 0) {
				TextFieldResultado.setText("Indeterminado");
			} else {
				TextFieldResultado.setText(String.valueOf(result));
			}
		}
	}

	public void limpiar(ActionEvent event) {

		TextFieldNum1.setText("");
		TextFieldNum2.setText("");
		TextFieldResultado.setText("");

	}

}
