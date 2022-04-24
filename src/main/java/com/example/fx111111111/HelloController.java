package com.example.fx111111111;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class HelloController {

    FifoRealise F = new FifoRealise();
    LifoRealise L = new LifoRealise();
    int countF = 0;
    int countL = 0;

    public int getCountF() {
        return countF;
    }

    public int getCountL() {
        return countL;
    }

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
            try {

                Integer Num = Integer.parseInt(LNum.getText().toString());
                Character simbolic = LSimbol.getText().toString().charAt(0);
                Pattern patkirletter = Pattern.compile("[а-яА-Я]{1}"); //[a-zA-Z]{1}
                Matcher matkirletter = patkirletter.matcher(simbolic.toString());
                if (matkirletter.matches()==true) {
                    L.add(Num, simbolic);
                    LList.getItems().add(Num + "   " + simbolic);
                    countL++;
                    LNum.setText("");
                    LSimbol.setText("");
                }
                else
                {
                    LSimbol.setText(" Not Russian language");
                }
            }
            catch (NumberFormatException e)
            {
                LNum.setText(" Uncorrect type!!!");
            }
            catch (Exception e)
            {
                Stage stage1 = new Stage();
                Label label  = new Label(" Ups, something go wrong");
                Scene scene = new Scene(label, 100,200);
                stage1.setTitle(" Error");
                stage1.setScene(scene);
                stage1.show();
            }

        });
    }
        @FXML
        private Button AddFIFO;

    public void setCountF(int countF) {
        this.countF = countF;
    }

    public void setCountL(int countL) {
        this.countL = countL;
    }

    public void ButtonAddFifo()
        {
        AddFIFO.setOnAction(actionEvent ->
        {
            try {


                Integer number = Integer.parseInt(FNum.getText().toString());
                Character simbol = FSimbol.getText().toString().charAt(0);
                Pattern patkirletter = Pattern.compile("[а-яА-Я]{1}"); ///[a-zA-Z]{1}
                Matcher matkirletter = patkirletter.matcher(simbol.toString());
                if (matkirletter.matches() == true) {
                    F.add(number, simbol);
                    FList.getItems().add(number + "   " + simbol);
                    countF++;
                    FNum.setText("");
                    FSimbol.setText("");
                } else {
                    FSimbol.setText("Not Russian language");
                }
            }

            catch (NumberFormatException e)
            {
                FNum.setText(" Uncorrect type!!!");
            }
            catch (Exception e)
            {
                Stage stage1 = new Stage();
                Label label  = new Label(" Ups, something go wrong");
                Scene scene = new Scene(label, 100,200);
                stage1.setTitle(" Error");
                stage1.setScene(scene);
                stage1.show();
            }
            });
        }

        @FXML
        private Button DeleteFifo;
       public void ButtonDeleteFifo()
       {
           try {


               DeleteFifo.setOnAction(actionEvent ->
               {
                   F.delete();
                   FList.getItems().remove(0);

               }); countF--;
           }
           catch (NullPointerException e)
           {
               Stage stage1 = new Stage();
               Label label  = new Label(" Ups, something go wrong");
               Scene scene = new Scene(label, 400,600);
               stage1.setTitle(" Error");
               stage1.setScene(scene);
               stage1.show();

           }
       }

        @FXML
        private Button DeleteLiFo;
   public void ButtonDeleteLifo()
   {
       try {
           DeleteLiFo.setOnAction(actionEvent ->
           {
               L.delete();
                LList.getItems().remove(countL-1);
                countL--;
           });

       }
       catch (NullPointerException e)
       {
           Stage stage1 = new Stage();
           Label label  = new Label(" Ups, something go wrong");
           Scene scene = new Scene(label, 400,600);
           stage1.setTitle(" Error");
           stage1.setScene(scene);
           stage1.show();
       }
    }

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