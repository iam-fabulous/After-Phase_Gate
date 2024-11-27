import org.junit.Test;

import java.util.Stack;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class StackTest {
    @Test
    public void testThatStackExist() {
        Stacks stacks = new Stacks();
        assertTrue(stacks.stackExists());
    }

    public void testThatStackSizeOfStackIsThree(){
        Stacks stacks = new Stacks();
        assertTrue(stacks.capacity(3));

    }
}


