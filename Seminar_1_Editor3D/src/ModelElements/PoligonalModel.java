package ModelElements;

import InMemoryModel.ModelStore;

public class PoligonalModel {
    public Poligon poligons;
    public Texture textures;

    /* агрегация (class Texture) */
    public PoligonalModel(Texture T) {
        this.textures = T;
    }

    /* композиция (class Poligon) */
    public PoligonalModel(Poligon P) {
        this.poligons = new Poligon();
    }

    public PoligonalModel(Scene S) {
        this.scene = S;
    }

    public PoligonalModel(ModelStore MS) {
        this.MS = new ModelStore();
    }
}
