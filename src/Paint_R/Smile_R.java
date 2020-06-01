package Paint_R;

import Figure_R.Activities_R;
import Figure_R.Event_R;
import Figure_R.Sequence_Flow_R;
import javafx.scene.Group;

public class Smile_R extends Group {
    public Smile_R() {
    }
    public void setActivities_R(Activities_R m)    {
        getChildren().add(m);
    }
    public void setSequence_Flow_R(Sequence_Flow_R m)   {
        getChildren().add(m);
    }
    public void setEvent_R(Event_R m)    {
        getChildren().add(m);
    }
    public String toString()
    {
        return new String ("Смайлик");
    }
}
