package ModelElements;

import java.util.List;

public class Scene {
    public int id;
    public List<PoligonalModel> models;
    public List<Flash> flashes;

    public void method1(Type);
    public void method2(Type, Type);

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
}
