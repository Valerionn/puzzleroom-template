package at.edu.c02.puzzleroom.fields;

import at.edu.c02.puzzleroom.Direction;
import at.edu.c02.puzzleroom.GameBoard;

/**
 * A path field. The player can freely walk onto this field, without any special effects.
 */
public class FieldOneWay extends BaseField {
    public FieldOneWay(GameBoard gameBoard, char name, int row, int col) {
        super(gameBoard, name, row, col);
    }

    public void initialize() {
    }
    @Override
    public boolean enterField(Direction direction) {
        gameBoard.getPlayer().walkStep();
        setPlayerPositionToField();
        return true;
    }
    @Override
    public boolean leaveField(Direction direction) {
        if ((name == '^' && direction == Direction.Up) ||
        (name == 'v' && direction == Direction.Down) ||
        (name == '<' && direction == Direction.Left) ||
        (name == '>' && direction == Direction.Right)) {
                        return true;
                    }
        return false;
    }
}
