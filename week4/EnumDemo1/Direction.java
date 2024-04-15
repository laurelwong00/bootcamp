package week4.EnumDemo1;

public enum Direction { //class: when starting the jaca program, JVM new 4 objects of Direction

  //Finite number of values
  EAST(1, 'E'), // 固定address
  SOUTH(2, 'S'), //
  WEST(-1, 'W'), //
  NORTH(-2, 'N'),//
  ;
  private final int value;
  private final char shortForm;

  private Direction(int value, char shortForm) {
    this.value = value;
    this.shortForm = shortForm;
  }


  public char getShortForm(){
    return shortForm;
  }

  public int getValue() {
    return this.value;
  }

  public static Direction opposite(Direction direction) {
    //if (direction == null ) { return null;}
    for (Direction d: Direction.values()) { //values() -> implicit static method
      if (d.getValue() == -direction.getValue()) {//enum compile time alr finished checking
        return d;
      }
    }
    return null;
  }

  //public void setValue(int value) {
    //this.value = value; //when private final int value, then can't set 

  // You cannot create Direction object by yourself
  public static void main(String[] args) {
    House house = new House(Direction.EAST);
    house.setDirection(Direction.EAST);

    System.out.println(house.getDirection() == Direction.EAST); //true
    System.out.println(Direction.NORTH.getValue()); //-2
    System.out.println(Direction.opposite(EAST)); //WEST
    System.out.println(Direction.opposite(EAST).getValue());//-1 value of west

    Direction direction = Direction.NORTH;

  }
  public static int getDirectionDegree(Direction direction) {
    switch(direction) {
      case NORTH: 
        //return 360;
        result = 360;
        break;
      case EAST:
        return 90;
      case SOUTH:
        return 180;
      case WEST:
        return 270;
    }
  }
}



