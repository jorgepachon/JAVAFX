package application;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class MyController {

	@FXML
	Button btnCero;
	@FXML
	Button btnUno;
	@FXML
	Button btnDos;
	@FXML
	Button btnTres;
	@FXML
	Button btnCuatro;
	@FXML
	Button btnCinco;
	@FXML
	Button btnSeis;
	@FXML
	Button btnSiete;
	@FXML
	Button btnOcho;
	@FXML
	Button btnNueve;
	
	@FXML
	Button btnPunto;
	@FXML
	TextField txtVisor;
	@FXML
	private Button btnSuma;
	@FXML
	public void initialize() {

	}

	public void onClickButtonZero(ActionEvent evento) {
		Button btnClick = (Button) evento.getSource();
		String button = btnClick.getId();
		switch (button) {
		case "btnPunto":
			txtVisor.appendText( "." );
			break;
		case "btnUno":
			txtVisor.appendText( "1" );
			break;
		case "btnDos":
			txtVisor.appendText( "2" );
			break;
		case "btnTres":
			txtVisor.appendText( "3" );
			break;
		case "btnCuatro":
			txtVisor.appendText( "4" );
			break;
		case "btnCinco":
			txtVisor.appendText( "5" );
			break;
		case "btnSeis":
			txtVisor.appendText( "6" );
			break;
		case "btnSiete":
			txtVisor.appendText( "7" );
			break;
		case "btnOcho":
			txtVisor.appendText( "8" );
			break;
		case "btnNueve":
			txtVisor.appendText( "9" );
			break;
		default: txtVisor.appendText( "0" );
		}
	}
	
	public void suma(ActionEvent event) {
		if (txtVisor.getText().length() == 0) {
			txtVisor.setText("Sin valores");

		} else {

			int num1 = Integer.parseInt(txtVisor.getText());
			int num2 = Integer.parseInt(txtVisor.getText());
			int operacion = num1 + num2;

			txtVisor.setText(Integer.toString(operacion));
		}
	}
	

}