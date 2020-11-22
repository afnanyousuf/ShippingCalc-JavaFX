/*
 * TestingController.java (Controller File)
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testing_controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;


/**
 * FXML Controller class
 *
 * @author afnanwork
 */
public class TestingController implements Initializable {
@FXML
private Label lblOutput;
@FXML
private Label lblText;
@FXML
private CheckBox chkExpressShip;
@FXML
private TextField txtPackWeight;
@FXML
private ToggleGroup Location;

@FXML
private void Calculate(ActionEvent event) {
    if(txtPackWeight.getText().isEmpty() || !isNumeric(txtPackWeight.getText())){
        lblOutput.setText("Enter a valid number!");
        txtPackWeight.requestFocus();
        txtPackWeight.selectAll();
    }
    double price;
    double locationCost=0;
    
    switch(Location.getSelectedToggle().getUserData().toString()){
        case "USA":
            locationCost=10;
            break;
        case "intl":
            locationCost=25;
            break;
    }
    
    if(chkExpressShip.isSelected()){
        price = 1.05* Double.parseDouble(txtPackWeight.getText());
        lblOutput.setText(String.format("Price: $%.2f", price+locationCost));
        return;
    }
    price = 0.75*Double.parseDouble(txtPackWeight.getText());
    lblOutput.setText(String.format("Price: $%.2f", price+locationCost));
}
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
public static boolean isNumeric(String str) {
  return str.matches("-?\\d+(\\.\\d+)?");  //match a number with optional '-' and decimal.
}    
    
}//END CONTROLLER