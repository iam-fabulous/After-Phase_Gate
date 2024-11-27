package arrayList;


import org.junit.Test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.*;

public class ArrayListTest {


    @Test
    public void test_That_New_ArrayList_Is_Empty() {
        ArrayList list = new ArrayList();
        assertTrue(list.isEmpty());
    }

    @Test
    public void test_add_One_Element_ArrayList_Not_Empty() {
        ArrayList list = new ArrayList();
        assertTrue(list.isEmpty());
        list.myAdd(1, "list One");
        list.myAdd(2, "list Two");
        assertEquals(2, list.getSize());
    }

    @Test
    public void test_add_Two_Or_More_Element_ArrayList_Not_Empty() {
        ArrayList list = new ArrayList();
        list.myAdd(1, "list One");
        list.myAdd(2, "list Two");
        list.myAdd(3, "list Three");
        list.myAdd(4, "list Four");
        assertEquals(4, list.getSize());
    }

    @Test
    public void test_add_Element_Remove_2_Remainder_1() {
        ArrayList list = new ArrayList();
        assertTrue(list.isEmpty());
        list.myAdd(1, "list One");
        list.myAdd(2, "list Two");
        list.myAdd(3, "list Three");
        Assertions.assertEquals(3, list.getSize());
        list.myRemove(1);
        list.myRemove(2);
        assertEquals(1, list.getSize());
    }

    @Test
    public void test_add_Element_Add_2_Remove_2_Remainder_0() {
        ArrayList list = new ArrayList();
        assertTrue(list.isEmpty());
        list.myAdd(0, "list One");
        list.myAdd(1, "list Two");
        list.myAdd(2, "list Three");
        assertEquals(3, list.getSize());
        list.myRemove(0);
        list.myRemove(1);
        list.myRemove(2);
        assertEquals(0, list.getSize());
    }
}

