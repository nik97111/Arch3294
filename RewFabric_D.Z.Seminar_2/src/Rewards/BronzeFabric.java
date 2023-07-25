package Rewards;

import Classes.iGameItem;
import Classes.itemGenerator;

public class BronzeFabric extends itemGenerator {

  @Override
  public iGameItem createItem() {
    return new Bronze();
  }
}