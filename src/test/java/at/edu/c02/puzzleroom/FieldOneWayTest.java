package at.edu.c02.puzzleroom;

import at.edu.c02.puzzleroom.commands.CommandLoad;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FieldOneWayTest {

            @Test
            public void fieldOneWay() throws Exception {
                GameBoard gameBoard = new GameBoardImpl();
                // Finish is reached when moving twice to the right
                new CommandLoad(new String[]{"src/test/resources/simple_FieldOneWay.maze"}).execute(gameBoard);
                Player player = gameBoard.getPlayer();

                // Player should start at 0 steps
                assertEquals(0, player.getStepCount());

                // Moving right should be possible, since there is a path field
                boolean success = player.moveRight();
                assertTrue(success);

                // Player should now be at 1 step
                assertEquals(1, player.getStepCount());
            }
        }