package fabdiary.data.repositories;

import fabdiary.data.models.Diary;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class DiaryRepositoryImplTest {
    private DiaryRepositoryImpl diaryRepository;
    @BeforeEach
    public void startWith() {
        diaryRepository = new DiaryRepositoryImpl();
    }

    @Test
    public void saveDiary_DiaryIsEmpty() {
        Diary diary = new Diary("fabulous", "1234");
        assertEquals(0,diaryRepository.count());
        diaryRepository.save(diary);
        assertEquals(1,diaryRepository.count());
    }


    @Test
    public void saveTwoDiaries_FindDiaryById(){
        Diary diary = new Diary("fabulous", "1234");
        Diary diary2= new Diary("cletus", "1235");
        diaryRepository.save(diary);
        diaryRepository.save(diary2);
        assertEquals(2,diaryRepository.count());

    }

    @Test
    public void saveDiary_FindDiaryById(){
        Diary diary = new Diary("fabulous", "1234");
        diaryRepository.save(diary);
        assertEquals(1,diaryRepository.count());
        assertEquals("fabulous",  diaryRepository.findByUserName("fabulous").getUsername());

    }

    @Test
    public void addDiary_DeleteDiary() {
        assertEquals(0,diaryRepository.count());
        Diary diary = new Diary("fabulous", "1234");
        diaryRepository.save(diary);
        assertEquals(1,diaryRepository.count());
        Diary diary2 = new Diary("cletus", "1235");
        diaryRepository.save(diary2);
        assertEquals(2,diaryRepository.count());
        diaryRepository.delete(diary);
        assertEquals(1,diaryRepository.count());
    }

//    @Test
//    public void diaryEmpty_CannotDeleteDiary() {
//        Diary diary = new Diary("fabulous", "1234");
//        assertEquals(0,diaryRepository.count());
//        assertThrows(IllegalArgumentException.class, ()->diaryRepository.delete(diary));
//        diaryRepository.delete(diary);
//        Diary diary1 = new Diary("fabulous", "1234");
//        diaryRepository.save(diary1);
//        assertEquals(1,diaryRepository.count());
//        diaryRepository.delete(diary1);
//        assertEquals(0,diaryRepository.count());
//
//    }
}