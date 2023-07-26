package ModelElements;

import java.util.ArrayList;
import java.util.List;

public class Scene {
  public  int id;
  public List<PoligonalModel> models;
  public List<Flash> flashes;
  public List<Camera> cameras = new ArrayList<>();

  public Scene(int id, List<PoligonalModel> models, List<Flash> flashes) {
    this.id = id;
    this.models = models;
    Throwable message = null;
    if (models.size() > 0) {
      this.models = models;
    } else {
        throw new Exception(message: "Должна быть одна модель");
    }

    this.flashes = flashes;
    if (cameras.size() > 0) {
      this.cameras = cameras;
    } else {
      throw new Exception(message: "Должна быть одна модель");
    }

    public <T> T method1(T flash) {
      return Flash;
    }

    public <T, E> T method2(T Model, E Flash) {
      return Model;
    }

//    public Type1 method1(Type1 t) {
//      return t;
//    }
//
//    public Type2 method2(Type1 t, Type2 t) {
//      return t1;
//    }

  }

}
