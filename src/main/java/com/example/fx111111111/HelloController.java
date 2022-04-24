package com.example.fx111111111;

import java.net.URL;
import java.util.LinkedList;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class HelloController {

        @FXML
        private ResourceBundle resources;

        @FXML
        private URL location;

        @FXML
        private Button AddLIFO;
    public void ButtonAddLifo()
    {
        AddLIFO.setOnAction(actionEvent ->
        {
            Integer Num = Integer.parseInt(LNum.getText().toString());
            Character simbolic = LSimbol.getText().toString().charAt(0);
            LifoRealise f1 = new LifoRealise();
            f1.add(Num,simbolic);
            LList.getItems().add(Num + "   " + simbolic);
           // LNum.setText(" ");
           // LSimbol.setText(" ");
        });
    }
        @FXML
        private Button AddFIFO;
       public void ButtonAddFifo()
        {


                AddFIFO.setOnAction(actionEvent ->
                {
                    Integer number = Integer.parseInt(FNum.getText().toString());
                    Character simbol = FSimbol.getText().toString().charAt(0);
                    FifoRealise f1 = new FifoRealise();
                    f1.add(number,simbol);
                    FList.getItems().add(number + "   " + simbol);

                });
            //FNum.setText(" ");
           // FSimbol.setText(" ");
        }

        @FXML
        private Button DeleteFifo;

        @FXML
        private Button DeleteLiFo;

        @FXML
        private ListView<String> FList;

        @FXML
        private TextField FNum;

        @FXML
        private TextField FSimbol;

        @FXML
        private ListView<String> LList;

        @FXML
        private TextField LNum;

        @FXML
        private TextField LSimbol;

        @FXML
        private Label LabelFIFO;

        @FXML
        void initialize() {
                assert AddFIFO != null : "fx:id=\"AddFIFO\" was not injected: check your FXML file 'hello-view.fxml'.";
                assert DeleteFifo != null : "fx:id=\"DeleteFifo\" was not injected: check your FXML file 'hello-view.fxml'.";
                assert DeleteLiFo != null : "fx:id=\"DeleteLiFo\" was not injected: check your FXML file 'hello-view.fxml'.";
                assert FList != null : "fx:id=\"FList\" was not injected: check your FXML file 'hello-view.fxml'.";
                assert FNum != null : "fx:id=\"FNum\" was not injected: check your FXML file 'hello-view.fxml'.";
                assert FSimbol != null : "fx:id=\"FSimbol\" was not injected: check your FXML file 'hello-view.fxml'.";
                assert LList != null : "fx:id=\"LList\" was not injected: check your FXML file 'hello-view.fxml'.";
                assert LNum != null : "fx:id=\"LNum\" was not injected: check your FXML file 'hello-view.fxml'.";
                assert LSimbol != null : "fx:id=\"LSimbol\" was not injected: check your FXML file 'hello-view.fxml'.";
                assert LabelFIFO != null : "fx:id=\"LabelFIFO\" was not injected: check your FXML file 'hello-view.fxml'.";

        }

}