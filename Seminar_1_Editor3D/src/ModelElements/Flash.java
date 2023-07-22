package ModelElements;

import InMemoryModel.ModelStore;

public class Flash {
    public Point3d location;
    public Angle3d angle;
    public Color color;
    public Float power;

    public void rotate(Angle3D) {
        return;
    }
    public void move(Point3D) {
        return;
    }

    public Flash(Scene S) {
        this.scene = S;
    }
    public Flash(ModelStore MS) {
        this.MS = new ModelStore();
    }
}
