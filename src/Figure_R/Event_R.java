package Figure_R;

import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;

public class Event_R extends Circle {

    public Event_R(double x, double y, double radius, Paint fill) {
        super(x,y,radius, fill);
    }
    public Event_R() {
        super(50,50,20, Color.PINK);
    }
}
