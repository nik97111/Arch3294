package Rewards;

import Classes.iGameItem;
import Classes.itemGenerator;

public class VelvetFabric extends itemGenerator {

  @Override
  public iGameItem createItem() {
    return new Velvet();
  }
}