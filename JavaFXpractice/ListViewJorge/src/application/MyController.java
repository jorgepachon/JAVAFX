package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class MyController {

	@FXML
	private ListView<String>ListViewLeft;
	
	@FXML
	private ListView<String>ListViewRigh;
	
	@FXML
	private Button Left;
	
	@FXML
	private Button Right;
	
	private ObservableList<String>lista1 = FXCollections.observableArrayList("A", "B", "C");
	private ObservableList<String>lista2 = FXCollections.observableArrayList();
	
	public void initialize(){
		ListViewLeft.setItems(this.lista1);
		ListViewRigh.setItems(this.lista2);
	}
	
	public void ViewRight(ActionEvent event){
		String Lado1 = (String) ListViewLeft.getSelectionModel().getSelectedItem();
		
		if(Lado1 != null){
			lista1.remove((String) ListViewLeft.getSelectionModel().getSelectedItem());
			lista2.add(Lado1);
		}
	}
	
	public void ViewLeft(ActionEvent event){
		String Lado2 = (String) ListViewRigh.getSelectionModel().getSelectedItem();
		
		if(Lado2 != null){
			lista1.add(Lado2);
			lista2.remove((String) ListViewRigh.getSelectionModel().getSelectedItem());
			
		}
	}
}
