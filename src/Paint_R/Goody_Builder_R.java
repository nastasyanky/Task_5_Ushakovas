package Paint_R;

import Figure_R.Activities_R;
import Figure_R.Event_R;
import Figure_R.Sequence_Flow_R;
import javafx.scene.paint.Color;

public class Goody_Builder_R implements Builder_R{
    private Smile_R smile;
    public Goody_Builder_R() {
        smile = new Smile_R();
    }
    @Override
    public void buildActivities_R() {
        smile.setActivities_R(
                new Activities_R(200,150,Color.YELLOW));

    }

    @Override
    public void buildEvent_R() {
        smile.setEvent_R(new Event_R(50,50,10, Color.GREENYELLOW));
        smile.setEvent_R(new Event_R(150,50,20, Color.GREENYELLOW));
    }

    @Override

    public void buildSequence_Flow_R() {
        //левая
        smile.setSequence_Flow_R
                (new Sequence_Flow_R(50, 100, 100, 125));
        smile.setSequence_Flow_R
                (new Sequence_Flow_R(50, 100, 52, 109));
        smile.setSequence_Flow_R
                (new Sequence_Flow_R(50, 100, 56, 95));
        //правая
        smile.setSequence_Flow_R
                (new Sequence_Flow_R(100, 125, 150, 100));
        smile.setSequence_Flow_R
                (new Sequence_Flow_R(150, 100, 148, 109));
        smile.setSequence_Flow_R
                (new Sequence_Flow_R(150, 100, 144, 95));
    }
        @Override
    public Smile_R getSmile_R() {
        return smile;
    }
}
