package lootgenerator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ListView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@SuppressWarnings({"rawtypes", "unused"})
public class Controller {

    @FXML
    public Button loot_btn;
    public Button sav_txt_btn;
    public ListView loot_lst;

    //cant get this to show in choicebox when running!!!!

    @FXML
    private final ChoiceBox<String> loot_settings;

    {
        loot_settings = new ChoiceBox<>();
        loot_settings.getItems().addAll("All", "3.5", "Modern", "Future", "Pathfinder", "5e");
        loot_settings.getItems().add("test");
        loot_settings.setValue("All");
    }


    public void handleButtonAction(ActionEvent actionEvent) {
    }


    public void fileChooser(ActionEvent actionEvent) {
    }

        public static class randomgen {

            // Drive Function
            public static void main(String[] args)
            {

                // create a list of Integer type
                List<Integer> list = new ArrayList<>();
                // add 5 element in ArrayList
                list.add(10);
                list.add(20);
                list.add(30);
                list.add(40);
                list.add(50);

                randomgen obj = new randomgen();

                // take a random element from list and print them
                System.out.println(obj.getRandomElement(list));
            }

            // Function select an element base on index
            // and return an element
            public int getRandomElement(List<Integer> list)
            {
                Random rand = new Random();
                return list.get(rand.nextInt(list.size()));
            }
        }
    }

