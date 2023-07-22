package ModelElements;

import InMemoryModel.ModelStore;

public class Camera {
    public Point3D locatiom;
    public Angle3D angle;

    public void rotate(Angle3D) {
      return;
    }
    public void move(Point3D) {
      return;
    }
    public Camera(Scene S) {
      this.scene = S;
    }

    public Camera(ModelStore MS) {
      this.MS = new ModelStore();
    }
}
