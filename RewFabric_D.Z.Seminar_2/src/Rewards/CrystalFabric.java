package Rewards;

import Classes.iGameItem;
import Classes.itemGenerator;

public class CrystalFabric extends itemGenerator {

  @Override
  public iGameItem createItem() {
    return new Crystal();
  }
}