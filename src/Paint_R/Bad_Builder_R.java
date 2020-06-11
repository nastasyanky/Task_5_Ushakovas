package Paint_R;

import Figure_R.Activities_R;
import Figure_R.Event_R;
import Figure_R.Sequence_Flow_R;
import javafx.scene.paint.Color;

/**
 * An exception class to implement <i>Event_R</i> (state in which a given test
 * is meaningful and should or should not be executed). A test for which an assumption
 * fails should not generate a test case failure.
 * Класс, представляющий Грустный Смайл из элементов BPMN
 * @author  Ushakova Anastasia
 * @version 1.3
 */
public class Bad_Builder_R implements Builder_R{
    private Smile_R smile;
    public Bad_Builder_R() {
        smile = new Smile_R();
    }

    /**
     * Этот метод вызывает строитель элемента Задача
     * и добавляет его к смайлу
     */
    @Override
    public void buildActivities_R() {
        Activities_R h=new Activities_R();
        smile.setActivities_R(h);
    }

    /**
     Этот метод вызывает строитель элемента События
     * и добавляет его к смайлу
     */
    @Override
    public void buildEvent_R() {
        smile.setEvent_R(new Event_R(50,50,20, Color.PINK));
        smile.setEvent_R(new Event_R(150,50,20, Color.PINK));
    }
    /**
     Этот метод вызывает строитель элемента Управляющий поток
     * и добавляет его к смайлу
     */
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
    /**
     * Этот метод получает значение Смайла
     * @return значение типа Smile_R
     */
    @Override
    public Smile_R getSmile_R() {
        return smile;
    }
}
