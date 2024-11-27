import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiaryTest {
    private Diary diary;

    @BeforeEach
    public void setUp() {
        diary = new Diary();
    }

    @Test
    public void testThatDiaryIsUnlockAtCreation(){
        assertTrue(diary.isUnlocked());
    }

    @Test
    public void testThatDiaryIsEmpty(){
        assertTrue(diary.isUnlocked());
        assertTrue(diary.isEmpty());
    }

    @Test
    public void testThatDiaryCanBeLocked(){
        assertTrue(diary.isUnlocked());
        diary.lock();
        assertFalse(diary.isUnlocked());
    }

    @Test
    public void testThatDiaryCanAddEntryWhenUnlocked(){
        assertTrue(diary.isUnlocked());
        assertTrue(diary.isEmpty());
        assertEquals(0,diary.size());
        diary.add();
        assertEquals(1, diary.size());
    }

    @Test
    public void testThatDiaryCannotAddEntryWhenLocked(){
        assertTrue(diary.isUnlocked());
        diary.add();
        assertEquals(1, diary.size());
        diary.lock();
        assertFalse(diary.isUnlocked());
        diary.add();
        assertEquals(1, diary.size());
    }

    @Test
    public void testThatDiaryCanFindEntryWhenUnlocked(){
        assertTrue(diary.isUnlocked());
        diary.add();
    }
}
