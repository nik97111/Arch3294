package ModelElements;

import java.util.ArrayList;
import java.util.List;

public class PoligonalModel {
    public ArrayList<Poligon> poligons;
    public List<Texture> textures;
    public PoligonalModel(List<Texture> textures) {
        this.textures = textures;
        this.poligons = new ArrayList<Poligon>();
    }

}
