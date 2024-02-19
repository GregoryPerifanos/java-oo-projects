package gr.aueb.cf.CodingFactoryTestbed.src.gr.aueb.cf.exercise.CloneSerialize;


public class AbstractShape implements IShape {
    private long id;

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public long getId() {
        return 0;
    }
}
