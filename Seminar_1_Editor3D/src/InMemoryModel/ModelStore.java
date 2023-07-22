package InMemoryModel;

import ModelElements.PoligonalModel;
import ModelElements.Scene;
import ModelElements.Flash;
import ModelElements.Camera;
import java.util.List;

public class ModelStore {
   public List<PoligonalModel> models;
   public List<Scene> scenes;
   public List<Flash> flashes;
   public List<Camera> cameras; 
   private List<IModelChangeObserver> changeObservers;

   public Scene getScene(int) {
       return (Scene) scenes;
   }

   public void notifyChange(IModelChanger) {
   }

   ModelStore MS = new ModelStore();

}
