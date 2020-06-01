package sample;

import Paint_R.Bad_Builder_R;
import Paint_R.Director_R;
import Paint_R.Goody_Builder_R;
import Paint_R.Smile_R;
import javafx.event.ActionEvent;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

public class Controller {
    public AnchorPane pane_canva;
    public Canvas canva;
    public Button button_good;
    public Button button_evil;
    public Button button_clean;
    Director_R direct_r=new Director_R();

    public void good_click(ActionEvent actionEvent) {
        Smile_R smile=new Smile_R();
        smile=direct_r.construct(new Goody_Builder_R());
        pane_canva.getChildren().add(smile);// добавление к панели pane
    }

    public void evil_click(ActionEvent actionEvent) {
        Smile_R smile=new Smile_R();
        smile=direct_r.construct(new Bad_Builder_R());
        pane_canva.getChildren().add(smile);// добавление к панели pane
    }

    public void clean_click(ActionEvent actionEvent) {
        pane_canva.getChildren().clear();
    }
}
