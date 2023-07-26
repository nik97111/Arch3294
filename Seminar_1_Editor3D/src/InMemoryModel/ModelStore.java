package InMemoryModel;

import ModelElements.Camera;
import ModelElements.Flash;
import ModelElements.PoligonalModel;
import ModelElements.Scene;
import ModelElements.Texture;
import java.util.ArrayList;
import java.util.List;

public class ModelStore implements IModelChanger{
   public List<PoligonalModel> models;
   public List<Scene> scenes;
   public List<Flash> flashes;
   public List<Camera> cameras; 
   private IModelChangeObserver[] changeObservers;

   public ModelStore(IModelChangeObserver[] changeObservers) {
      this.changeObservers = changeObservers;

      this.models = new ArrayList<PoligonalModel>();
      this.scenes = new ArrayList<Scene>();
      this.flashes = new ArrayList<Flash>();
      this.cameras = new ArrayList<Camera>();

      //   Добавляем элементы в списки
      models.add(new PoligonalModel(Texture: null));
      flashes.add(new Flash());
      cameras.add(new Camera());
      scenes.add(new Scene(id: 0, models, flashes, cameras));
   }

   @Override
   public void notifyChange(IModelChanger sender) {

   }

   public Scene getScene(int id) {
      return scenes.get(id);
   }

}
