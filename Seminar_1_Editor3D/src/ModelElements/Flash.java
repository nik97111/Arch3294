package ModelElements;

import java.util.List;

public class Flash {
    public List<Point3D> location;
    public List<Angle3D> angle;
    public List<Color> color;
    public List<Float> power;

    public void rotate(Angle3D);
    public void move(Point3D);
}