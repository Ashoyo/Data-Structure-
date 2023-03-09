//package edu.temple.datastructures.dyee.oop.assignment.episode1;
public class Person extends Creature {
  private int currentDirection1;
    public Person(Model model, int row, int column) {
        super(model, row, column);
    }
    
    int decideMove() {
      
      for (int i= Model.MIN_DIRECTION; i<=Model.MAX_DIRECTION;i++){
        if(look(i)== Model.MONSTER){
          if(canMove(Model.turn(i,-3))){
            return Model.turn(i,-3);
          }
          if(canMove(Model.turn(i, -5))){
            return Model.turn(i, -5);
          }
          if(canMove(Model.turn(i, 1))){
            return Model.turn(i, 1);
          }
          if(canMove(Model.turn(i, -2))){
            return Model.turn(i, -2);
          }
        }
   }
      return Model.STAY;
}
}
