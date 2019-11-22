package sample;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private String name;
    boolean winner;
    ArrayList<String> listOfPlayer = new ArrayList();
    static List<ArrayList> listOfWinButtons;

    private static void setListOfWinButtons() {
        if (listOfWinButtons == null) {
            listOfWinButtons = new ArrayList<>();
            ArrayList<String> list = new ArrayList<>();
            list.add("b11");
            list.add("b22");
            list.add("b31");
            listOfWinButtons.add(list);
            list = new ArrayList<>();
            list.add("b13");
            list.add("b22");
            list.add("b33");
            listOfWinButtons.add(list);
            list = new ArrayList<>();
            list.add("b11");
            list.add("b12");
            list.add("b13");
            listOfWinButtons.add(list);
            list = new ArrayList<>();
            list.add("b21");
            list.add("b22");
            list.add("b23");
            listOfWinButtons.add(list);
            list = new ArrayList<>();
            list.add("b31");
            list.add("b32");
            list.add("b33");
            listOfWinButtons.add(list);
            list = new ArrayList<>();
            list.add("b11");
            list.add("b23");
            list.add("b33");
            listOfWinButtons.add(list);
            list = new ArrayList<>();
            list.add("b12");
            list.add("b22");
            list.add("b32");
            listOfWinButtons.add(list);
            list = new ArrayList<>();
            list.add("b13");
            list.add("b21");
            list.add("b31");
            listOfWinButtons.add(list);
        }
    }

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void isWinner() {
        setListOfWinButtons();


        int amount = 0;

        for (int k = 0; k < listOfWinButtons.size(); k++) {
            for (int i = 0; i < listOfWinButtons.get(k).size(); i++) {
                for (int j = 0; j < listOfPlayer.size(); j++) {
                    if (listOfPlayer.get(j).equals(listOfWinButtons.get(k).get(i))) {
                        amount++;
                    }
                }
            }
            if (amount < 3){
                amount = 0;
            }
        }
        if (amount >= 3) {
            winner = true;
        }
    }
}
