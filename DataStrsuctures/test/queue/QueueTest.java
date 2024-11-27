package queue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QueueTest {
    Queue queue;
    @BeforeEach
    public void setUp() {
        queue = new Queue();
    }

    @Test
    public void testThatQueueIsEmpty() {
        assertTrue(queue.queueIsEmpty(), "true");
    }

    @Test
    public void testThatQueueIsFull() {
        assertFalse(queue.queueIsFull(), "false");
    }

    @Test
    public void testThatQueueCanAddElementToTheQueue() {
        queue.add(5);
        assertEquals(queue.getSize(), 1);
    }

    @Test
    public void testThatQueueCanRemoveElementFromTheQueue() {
        queue.add(5);
        queue.add(6);
        queue.add(7);
        queue.add(8);
        assertEquals(queue.getSize(), 4);
        assertEquals(queue.remove(), 5);
    }

    @Test
    public void testThatQueueSizeDecreasesAfterItRemoveElementFromTheQueue() {
        queue.add(5);
        queue.add(6);
        queue.add(7);
        queue.add(8);
        assertEquals(queue.getSize(), 4);
        assertEquals(queue.remove(), 5);
        assertEquals(queue.getSize(), 3);
    }

    @Test
    public void testThatQueueCanPeekAnElementFromTheQueue() {
        queue.add(5);
        queue.add(6);
        queue.add(7);
        queue.add(8);
        assertEquals(queue.getSize(), 4);
        assertEquals(queue.peek(), 5);
    }
}
