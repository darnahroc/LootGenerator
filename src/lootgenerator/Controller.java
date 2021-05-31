package lootgenerator;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ListView;

@SuppressWarnings({"unused", "rawtypes"})
public class Controller {

    public Button loot_btn;
    public Button sav_txt_btn;
    public ListView loot_lst;
    public ChoiceBox<String> loot_settings = new ChoiceBox<>();
      String a = "3.5";
      String b = "Pathfinder";
      String c = "5e";
      String d = "Modern";
      String e = "Future";
      String f = "All";




    public void handleButtonAction(ActionEvent actionEvent) {
    }


    public void fileChooser(ActionEvent actionEvent) {
    }
}
