package Paint_R;

public class Director_R {
    public Smile_R construct (Builder_R builder_r){
        builder_r.buildActivities_R();
        builder_r.buildEvent_R();
        builder_r.buildSequence_Flow_R();
        return builder_r.getSmile_R();
    }
}
