package Paint_R;

import Figure_R.Activities_R;
import Figure_R.Event_R;
import Figure_R.Sequence_Flow_R;
import javafx.scene.paint.Color;

public class Bad_Builder_R implements Builder_R{
    private Smile_R smile;
    public Bad_Builder_R() {
        smile = new Smile_R();
    }

    @Override
    public void buildActivities_R() {
        Activities_R h=new Activities_R();
        smile.setActivities_R(h);

    }

    @Override
    public void buildEvent_R() {
        smile.setEvent_R(new Event_R(50,50,20, Color.PINK));
        smile.setEvent_R(new Event_R(150,50,20, Color.PINK));
    }

    @Override

    public void buildSequence_Flow_R() {
        //левая
        smile.setSequence_Flow_R
                (new Sequence_Flow_R(50, 125, 100, 100));
        smile.setSequence_Flow_R
               (new Sequence_Flow_R(50, 125, 50, 118));
        smile.setSequence_Flow_R
                (new Sequence_Flow_R(50, 125, 56, 128));
        //правая
        smile.setSequence_Flow_R
                (new Sequence_Flow_R(100, 100, 150, 125));
        smile.setSequence_Flow_R
                (new Sequence_Flow_R(150, 125, 150, 118));
        smile.setSequence_Flow_R
               (new Sequence_Flow_R(150, 125, 144, 128));
   }
    @Override
    public Smile_R getSmile_R() {
        return smile;
    }
}
