package Rewards;

import Classes.iGameItem;
import Classes.itemGenerator;

public class SilkFabric extends itemGenerator {

  @Override
  public iGameItem createItem() {
    return new Silk();
  }
}