package stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {
    Stack stack;

    @BeforeEach
    public void setUp(){
        stack = new Stack();
    }

    @Test
    public void testThatStackIsEmpty(){
        assertTrue(stack.stackIsEmpty(), "true");
    }

    @Test
    public void testThatStackCanPushElementToTopOfStack(){
        stack.push(5);
        assertEquals(1, stack.getSize());
        stack.push(10);
        assertEquals(2, stack.getSize());
        stack.push(15);
        assertEquals(3, stack.getSize());
    }

    @Test
    public void testThatStackCannotPushMoreThanStackSize(){
        stack.push(5);
        stack.push(10);
        stack.push(15);
        stack.push(15);
        stack.push(15);
        assertEquals(5, stack.getSize());
        assertThrows(StackOverflowError.class, ()-> stack.push(34));
    }

    @Test
    public void testThatStackCanRemoveElementFromTopOfStack(){
        stack.push(5);
        assertEquals(1, stack.getSize());
        stack.push(10);
        assertEquals(2, stack.getSize());
        stack.push(15);
        assertEquals(3, stack.getSize());
        int result = stack.pop();
        assertEquals(15, result);
        assertEquals(2, stack.getSize());
    }

    @Test
    public void testThatStackCannotPopMoreThanStackSize(){
        stack.push(5);
        stack.push(10);
        stack.push(15);
        stack.push(16);
        stack.push(17);
        assertEquals(5, stack.getSize());
        int result = stack.pop();
        assertEquals(17, result);
        assertEquals(4, stack.getSize());
        int result2 = stack.pop();
        assertEquals(16, result2);
        assertEquals(3, stack.getSize());
        int result3 = stack.pop();
        assertEquals(15, result3);
        assertEquals(2, stack.getSize());
        int result4 = stack.pop();
        assertEquals(10, result4);
        int result5 = stack.pop();
        assertEquals(5, result5);
        assertThrows(EmptyStackException.class, ()->stack.pop());
    }

    @Test
    public void testThatStackCanPeekAtTheTopOfStack(){
        stack.push(5);
        stack.push(10);
        stack.push(15);
        assertEquals(3, stack.getSize());
        int result = stack.peek();
        assertEquals(15, result);
    }

    @Test
    public void testThatStackCanSearchForElementsInStack(){
        stack.push(5);
        stack.push(10);
        stack.push(15);
        stack.push(16);
        stack.push(17);
        assertEquals(5, stack.getSize());
        assertEquals(15, stack.search(15));
    }

    @Test
    public void testThatStackReturnsMinusOneIfElementRequestedNotInStack(){
        stack.push(5);
        stack.push(10);
        stack.push(15);
        assertEquals(3, stack.getSize());
        assertEquals(-1, stack.search(21));
    }

    @Test
    public void testThatStackCannotSearchForElementsInStackWhenStackIsEmpty(){
        assertThrows(EmptyStackException.class, ()->stack.search(5));
    }
}
