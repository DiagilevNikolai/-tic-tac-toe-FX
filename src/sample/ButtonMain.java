package sample;

import javafx.scene.control.Button;

public class ButtonMain extends Button {
    int number;
    boolean player;
    boolean haveWinner;
    String turnText;

    public ButtonMain() {
    }

    public ButtonMain(int number) {
        this.number = number;
    }

    void click(ButtonMain button, boolean playerOne, Player player1, Player player2) {
        if (playerOne) {

            button.setText("X");

            player1.listOfPlayer.add(button.getId());

            button.setDisable(true);

            turnText = "Очередь игрока: " + player2.getName();


            player1.isWinner();

            if(player1.winner){
                turnText = "Победил " + player1.getName();
                haveWinner = true;
            }

            player = false;


        } else if (!playerOne) {

            button.setText("O");

            player2.listOfPlayer.add(button.getId());

            button.setDisable(true);

            turnText = "Очередь игрока: " + player1.getName();

            player2.isWinner();

            if(player2.winner){
                turnText = "Победил " + player2.getName();
                haveWinner = true;
            }
            player = true;
        }
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
