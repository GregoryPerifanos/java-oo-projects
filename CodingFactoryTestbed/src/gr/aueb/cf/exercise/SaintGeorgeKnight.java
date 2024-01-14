package gr.aueb.cf.exercise;

public class SaintGeorgeKnight {
    private static final SaintGeorgeKnight INSTANCE = new SaintGeorgeKnight();

    private SaintGeorgeKnight() {

    }

    public static SaintGeorgeKnight getInstance() {
        return INSTANCE;
    }

    public void embarkOnMission(){
        System.out.println("Sir George, the knight, is embarking on a mission!");
    }
}
