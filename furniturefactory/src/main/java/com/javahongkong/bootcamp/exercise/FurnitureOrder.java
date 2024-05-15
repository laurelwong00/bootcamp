package com.javahongkong.bootcamp.exercise;

import java.util.HashMap;
import java.util.Map;

public class FurnitureOrder implements FurnitureOrderInterface {
   
    HashMap<Furniture, Integer> ordersOfFurnitures;

    /**
     * Initialize a new mapping of Furniture types to order quantities.
     */
    FurnitureOrder() {
        ordersOfFurnitures = new HashMap<Furniture, Integer> ();
    }

    public void addToOrder(final Furniture type, final int furnitureCount) {
        ordersOfFurnitures.put(type, furnitureCount);
    }

    public HashMap<Furniture, Integer> getOrderedFurniture() {
        return ordersOfFurnitures;
    }

    public float getTotalOrderCost() {
        float cost = 0.0f;
        for (Map.Entry<Furniture, Integer> entry : ordersOfFurnitures.entrySet()) {
          cost += entry.getKey().cost()*entry.getValue();
        }
        return cost;
    }

    public int getTypeCount(Furniture type) {
      if (ordersOfFurnitures.containsKey(type)) {
        return ordersOfFurnitures.get(type);
      }
      return 0;
    }

    public float getTypeCost(Furniture type) {
        return type.cost()*getTypeCount(type);
    }

    public int getTotalOrderQuantity() {
        int quantity = 0;
        for (Map.Entry<Furniture, Integer> entry: ordersOfFurnitures.entrySet()) {
          quantity += entry.getValue();
        }
        return quantity;
    }
}
