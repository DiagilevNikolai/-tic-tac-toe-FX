package sample;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    public ButtonMain b11 = new ButtonMain();
    @FXML
    public ButtonMain b12 = new ButtonMain();
    @FXML
    public ButtonMain b13 = new ButtonMain();
    @FXML
    public ButtonMain b21 = new ButtonMain();
    @FXML
    public ButtonMain b22 = new ButtonMain();
    @FXML
    public ButtonMain b23 = new ButtonMain();
    @FXML
    public ButtonMain b31 = new ButtonMain();
    @FXML
    public ButtonMain b32 = new ButtonMain();
    @FXML
    public ButtonMain b33 = new ButtonMain();
    @FXML
    public Button startButton = new Button();
    @FXML
    public Button newGameButton = new Button();


    @FXML
    public Label player1label = new Label();
    @FXML
    public Label player2label = new Label();
    @FXML
    public Label playersturn = new Label();


    @FXML
    TextField textPlayer1 = new TextField();
    @FXML
    TextField textPlayer2 = new TextField();

    boolean playerOne = true;
    boolean haveWinner = false;

    Player player1 = new Player("Игрок 1");
    Player player2 = new Player("Игрок 2");

    @FXML
    void playerName() {

        player1.setName(textPlayer1.getText());
        player2.setName(textPlayer2.getText());

        player1label.setText("Игрок: " + player1.getName());
        player2label.setText("Игрок: " + player2.getName());
    }

    @FXML
    void b11Aclion() {
        b11.click(b11, playerOne, player1, player2);
        playerOne = b11.player;
        playersturn.setText(b11.turnText);
        haveWinner = b11.haveWinner;
        if(haveWinner){
            blockAllButtons();
        } else if(isDrow()){
            playersturn.setText("Ничья");
        }
    }
    @FXML
    void b12Aclion() {
        b12.click(b12, playerOne, player1, player2);
        playerOne = b12.player;
        playersturn.setText(b12.turnText);
        haveWinner = b12.haveWinner;
        if(haveWinner){
            blockAllButtons();
        } else if(isDrow()){
            playersturn.setText("Ничья");
        }
    }
    @FXML
    void b13Aclion() {
        b13.click(b13,playerOne,player1,player2);
        playerOne = b13.player;
        playersturn.setText(b13.turnText);
        haveWinner = b13.haveWinner;
        if(haveWinner){
            blockAllButtons();
        } else if(isDrow()){
            playersturn.setText("Ничья");
        }
    }
    @FXML
    void b21Aclion() {
        b21.click(b21,playerOne,player1,player2);
        playerOne = b21.player;
        playersturn.setText(b21.turnText);
        haveWinner = b21.haveWinner;
        if(haveWinner){
            blockAllButtons();
        } else if(isDrow()){
            playersturn.setText("Ничья");
        }
    }
    @FXML
    void b22Aclion() {
        b22.click(b22,playerOne,player1,player2);
        playerOne = b22.player;
        playersturn.setText(b22.turnText);
        haveWinner = b22.haveWinner;
        if(haveWinner){
            blockAllButtons();
        } else if(isDrow()){
            playersturn.setText("Ничья");
        }
    }
    @FXML
    void b23Aclion() {
        b23.click(b23,playerOne,player1,player2);
        playerOne = b23.player;
        playersturn.setText(b23.turnText);
        haveWinner = b23.haveWinner;
        if(haveWinner){
            blockAllButtons();
        } else if(isDrow()){
            playersturn.setText("Ничья");
        }
    }

    @FXML
    void b32Aclion() {
        b32.click(b32,playerOne,player1,player2);
        playerOne = b32.player;
        playersturn.setText(b32.turnText);
        haveWinner = b32.haveWinner;
        if(haveWinner){
            blockAllButtons();
        } else if(isDrow()){
            playersturn.setText("Ничья");
        }
    }
    @FXML
    void b31Aclion() {
        b31.click(b31,playerOne,player1,player2);
        playerOne = b31.player;
        playersturn.setText(b31.turnText);
        if(haveWinner) {
            blockAllButtons();
        }
        if(isDrow()){
            playersturn.setText("Ничья");
        }

    }
    @FXML
    void b33Aclion() {
        b33.click(b33,playerOne,player1,player2);
        playerOne = b33.player;
        playersturn.setText(b33.turnText);
        haveWinner = b33.haveWinner;
        if(haveWinner){
            blockAllButtons();
        } else if(isDrow()){
            playersturn.setText("Ничья");
        }

    }

    void blockAllButtons(){
        b11.setDisable(true);
        b12.setDisable(true);
        b13.setDisable(true);

        b21.setDisable(true);
        b22.setDisable(true);
        b23.setDisable(true);

        b31.setDisable(true);
        b32.setDisable(true);
        b33.setDisable(true);
    }

    @FXML
    void startNew(){

        playersturn.setText("Очередь игрока: " + player1.getName());
        playersturn.setVisible(true);

        b11.setDisable(false);
        b12.setDisable(false);
        b13.setDisable(false);

        b21.setDisable(false);
        b22.setDisable(false);
        b23.setDisable(false);

        b31.setDisable(false);
        b32.setDisable(false);
        b33.setDisable(false);

        b11.setText("");
        b12.setText("");
        b13.setText("");
        b21.setText("");
        b22.setText("");
        b23.setText("");
        b31.setText("");
        b32.setText("");
        b33.setText("");

        b11.player = false;
        b12.player = false;
        b13.player = false;

        b21.player = false;
        b22.player = false;
        b23.player = false;

        b31.player = false;
        b32.player = false;
        b33.player = false;

        b11.haveWinner = false;
        b12.haveWinner = false;
        b13.haveWinner = false;

        b21.haveWinner = false;
        b22.haveWinner = false;
        b23.haveWinner = false;

        b31.haveWinner = false;
        b32.haveWinner = false;
        b33.haveWinner = false;

        b11.turnText = "";
        b12.turnText = "";
        b13.turnText = "";

        b21.turnText = "";
        b22.turnText = "";
        b23.turnText = "";

        b31.turnText = "";
        b32.turnText = "";
        b33.turnText = "";

        player1.listOfPlayer.clear();
        player2.listOfPlayer.clear();

        playerOne = true;
        haveWinner = false;
        player1.winner = false;
        player2.winner = false;
    }

    boolean isDrow(){
        boolean drow = false;
        if (!haveWinner && b11.isDisabled() && b12.isDisabled() && b13.isDisabled() && b21.isDisabled() && b22.isDisabled() && b23.isDisabled() && b31.isDisabled() && b32.isDisabled() && b33.isDisabled()){
            drow = true;
        }
        return drow;
    }
}
