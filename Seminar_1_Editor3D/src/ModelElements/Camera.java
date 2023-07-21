package ModelElements;

import java.util.List;

public class Camera {
    public List<Point3D> location;
    public List<Angle3D> angle;

    public void rotate(Angle3D);
    public void move(Point3D);
}