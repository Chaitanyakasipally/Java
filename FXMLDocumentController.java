/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication8;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.application.Platform;

/**
 *
 * @author Team 2
 */
public class FXMLDocumentController implements Initializable {

    public static int counter = 0, X_wins = 0, O_wins = 0, Draws = 0;  //Declaring the overview of the game(wins and draws)
    String ch, str_top_left;
    @FXML
    private Label lbl_top_left;
    @FXML
    private Label lbl_top;
    @FXML
    private Label lbl_top_right;
    @FXML
    private Label lbl_center;
    @FXML
    private Label lbl_center_left;
    @FXML
    private Label lbl_center_right;
    @FXML
    private Label lbl_bottom;
    @FXML
    private Label lbl_bottom_left;
    @FXML
    private Label lbl_bottom_right;
    @FXML
    private Label lbl_x_wins, x;
    @FXML
    private Label lbl_o_wins, o;

    @FXML
    private Label lbl_draws, d;

    //declaring buttons
    @FXML
    private Button btn_top_left;
    @FXML
    private Button btn_top;
    @FXML
    private Button btn_top_right;
    @FXML
    private Button btn_center_left;
    @FXML
    private Button btn_center;
    @FXML
    private Button btn_center_right;
    @FXML
    private Button btn_bottom_left;
    @FXML
    private Button btn_bottom_center;
    @FXML
    private Button btn_bottom_right;

    @FXML
    private void handleTopLeftAction(ActionEvent event) {  //Top left Button action definition
        print_x_or_o(counter);
        if (counter < 9) {                              
            lbl_top_left.setText(ch);

            counter++;
            logic_win_loss_draws(ch);
        }

    }

    @FXML
    private void handleTopAction(ActionEvent event) {    //Top Button action definition
        print_x_or_o(counter);

        if (counter < 9) {
            lbl_top.setText(ch);

            counter++;
            logic_win_loss_draws(ch);
        }
    }

    @FXML
    private void handleTopRightAction(ActionEvent event) {   //Top Right Button action definition
        print_x_or_o(counter);

        if (counter < 9) {
            lbl_top_right.setText(ch);

            counter++;
            logic_win_loss_draws(ch);
        }
    }

    @FXML
    private void handleCenterLeftAction(ActionEvent event) {   //Center Left Button action definition
        print_x_or_o(counter);

        if (counter < 9) {
            lbl_center_left.setText(ch);

            counter++;
            logic_win_loss_draws(ch);
        }

    }

    @FXML
    private void handleCenterAction(ActionEvent event) {     //Center Button action definition
        print_x_or_o(counter);

        if (counter < 9) {
            lbl_center.setText(ch);

            counter++;
            logic_win_loss_draws(ch);
        }
    }

    @FXML
    private void handleCenterRightAction(ActionEvent event) {     //Center Right Button action definition
        print_x_or_o(counter);

        if (counter < 9) {
            lbl_center_right.setText(ch);

            counter++;
            logic_win_loss_draws(ch);
        }
    }

    @FXML
    private void handleBottomLeftAction(ActionEvent event) {    //Bottom Left Button action definition
        print_x_or_o(counter);

        if (counter < 9) {
            lbl_bottom_left.setText(ch);

            counter++;
            logic_win_loss_draws(ch);
        }

    }

    @FXML
    private void handleBottomAction(ActionEvent event) {      //Bottomm Button action definition
        print_x_or_o(counter);

        if (counter < 9) {
            lbl_bottom.setText(ch);

            counter++;
            logic_win_loss_draws(ch);
        }
    }

    @FXML
    private void handleBottomRightAction(ActionEvent event) {     //Bottom Right Button action definition
        print_x_or_o(counter);

        if (counter < 9) {
            lbl_bottom_right.setText(ch);

            counter++;
            logic_win_loss_draws(ch);
        }
    }

    @FXML
    private void handleResetAction(ActionEvent event) { //Reset Button action definition
        reset();
    }
    
    @FXML
    private void handleButtonQuitAction(ActionEvent event){
    Platform.exit();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
    

    public void reset() {                           // Reseting all values
        lbl_top_left.setText(" ");
        lbl_top.setText(" ");
        lbl_top_right.setText(" ");
        lbl_center.setText(" ");
        lbl_center_left.setText(" ");
        lbl_center_right.setText(" ");
        lbl_bottom.setText(" ");
        lbl_bottom_left.setText(" ");
        lbl_bottom_right.setText(" ");
        lbl_o_wins.setText(" ");
        lbl_x_wins.setText(" ");
        lbl_draws.setText(" ");

        counter = 0;
        X_wins = 0;
        O_wins = 0;
        Draws = 0;

    }

    public void clear() {          // clears the label values for the event X or O wins or draws
        lbl_top_left.setText(" ");
        lbl_top.setText(" ");
        lbl_top_right.setText(" ");
        lbl_center.setText(" ");
        lbl_center_left.setText(" ");
        lbl_center_right.setText(" ");
        lbl_bottom.setText(" ");
        lbl_bottom_left.setText(" ");
        lbl_bottom_right.setText(" ");

        counter = 0;

    }

    public void print_x_or_o(int counter) { // to know the character X or O based on counter value
        if (counter % 2 == 0) {
            ch = "X";
        } else {
            ch = "O";
        }
    }

    public void logic_win_loss_draws(String ch) { // logic which verifies all the labels to check the possibility of winning                  
        if (ch.equals(lbl_top_left.getText()) && ch.equals(lbl_top.getText()) && ch.equals(lbl_top_right.getText())) {
            logic_win_counter(ch);
        }
        if (ch.equals(lbl_center_left.getText()) && ch.equals(lbl_center.getText()) && ch.equals(lbl_center_right.getText())) {
            logic_win_counter(ch);
        }
        if (ch.equals(lbl_bottom_left.getText()) && ch.equals(lbl_bottom.getText()) && ch.equals(lbl_bottom_right.getText())) {
            logic_win_counter(ch);
        }
        if (ch.equals(lbl_top_left.getText()) && ch.equals(lbl_center_left.getText()) && ch.equals(lbl_bottom_left.getText())) {
            logic_win_counter(ch);
        }
        if (ch.equals(lbl_top.getText()) && ch.equals(lbl_center.getText()) && ch.equals(lbl_bottom.getText())) {
            logic_win_counter(ch);
        }
        if (ch.equals(lbl_top_right.getText()) && ch.equals(lbl_center_right.getText()) && ch.equals(lbl_bottom_right.getText())) {
            logic_win_counter(ch);
        }
        if (ch.equals(lbl_top_left.getText()) && ch.equals(lbl_center.getText()) && ch.equals(lbl_bottom_right.getText())) {
            logic_win_counter(ch);
        }
        if (ch.equals(lbl_bottom_left.getText()) && ch.equals(lbl_center.getText()) && ch.equals(lbl_top_right.getText())) {
            logic_win_counter(ch);
        }
        if (counter == 9) { // when all the buttons are pressed i.e., 9 clicks resembles the game is draw
            Draws++;
            lbl_draws.setText(String.valueOf(Draws));
            clear();
        }
    }

    public void logic_win_counter(String ch) {              //If Statement calculates the number of wins of "X" and "O"
        if (ch.equals("X")) {
            X_wins++;
            lbl_x_wins.setText(String.valueOf(X_wins));
            clear();

        } else {
            O_wins++;
            lbl_o_wins.setText(String.valueOf(O_wins));
            clear();

        }
    }

}
