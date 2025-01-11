package at.edu.c02.puzzleroom.fields;

import at.edu.c02.puzzleroom.Direction;
import at.edu.c02.puzzleroom.GameBoard;



/**
 * A path field. The player can freely walk onto this field, without any special effects.
 */
public class FieldIce extends BaseField {
    public FieldIce(GameBoard gameBoard, char name, int row, int col) {
        super(gameBoard, name, row, col);
    }

    public void initialize() {
    }
    @Override
    public boolean enterField(Direction direction) {
        gameBoard.getPlayer().walkStep();
        setPlayerPositionToField();
        Field nextField;

        switch (direction){
            case Up :
                nextField = gameBoard.getField(row - 1, col);
                nextField.enterField(direction);
                return true;
            case Down :
                nextField = gameBoard.getField(row + 1, col);
                nextField.enterField(direction);
                return true;
            case Left :
                nextField = gameBoard.getField(row, col - 1);
                nextField.enterField(direction);
                return true;
            case Right :
                nextField = gameBoard.getField(row, col + 1);
                nextField.enterField(direction);
                return true;
            default : return false;

        }
    }
    @Override
    public boolean leaveField(Direction direction) {
        return true;
    }
}
