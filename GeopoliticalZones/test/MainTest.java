import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    @BeforeEach
    public void setUp() {
        Main main = new Main();
    }

    @Test
    public void testThatDisplayFunctionExists() {
        int[][] fabArray = new int[3][3];
        Main.display(fabArray);
    }

    @Test
    public void testThatDisplayFunctionPrintsAsteriksIfElementIsOneAndSpaceIfElementIsZero() {
        int[][] fabArray = {{1,1,0},{0,1,0},{1,1,0}};
        String[][] result = Main.display(fabArray);
        String [][] expected = {{"*","*"," "},{" ","*"," "},{"*","*"," "}};
        assertArrayEquals(result, expected);
    }

    @Test
    public void testThatDisplayFunctionChecksLengthOfArrayRowAndColumnToBeThree(){
        int[][] fabArray = new int[3][3];
        String[][] result = Main.display(fabArray);
        String [][] expected = {{"*","*"," "},{" ","*"," "},{"*","*"," "}};
        assertTrue(result.length == 3, String.valueOf(result[0].length));
        int[][] fabArrays = new int[4][5];
        String[][] results = Main.display(fabArrays);
        //String [][] expect = {{"*","*"," "},{" ","*"," "},{"*","*"," "}};
        assertFalse(results.length == 4, String.valueOf(result[0].length));

    }
}
