package fabdiary.service;

import fabdiary.data.models.Diary;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiaryServiceImplementationTest {
    private DiaryServiceImplementation diaryService;

    @BeforeEach
    void startWith() {
        diaryService = new DiaryServiceImplementation();
    }

    @Test
    public void registerUser_DiarySavesUserAndSizeIncreases() {
        assertEquals(0, diaryService.count());
        diaryService.register("fabulous", "1234");
        assertEquals(1,diaryService.count());
    }

    @Test
    public void registerUser_DiaryCannotSaveSameUserTwice() {
        diaryService.register("fabulous", "1234");
        diaryService.register("fabulous2", "1234");
        assertEquals(2,diaryService.count());
        assertTrue(diaryService.userNameExist("fabulous"));
        assertThrows(IllegalArgumentException.class, () -> diaryService.register("fabulous", "1234"));
        assertEquals(2,diaryService.count());
        diaryService.register("fabulous3", "1234");
        assertEquals(3,diaryService.count());
        assertThrows(IllegalArgumentException.class, () -> diaryService.register("fabulous3", "1234"));
    }

    @Test
    public void loginExistingUser_UnlockDiaryWithCorrectPassword() {
        diaryService.register("fabulous", "1234");
        assertEquals(1,diaryService.count());
        diaryService.login("fabulous", "1234");

    }

    @Test
    public void loginExistingUser_CannotUnlockDiaryWithIncorrectPassword() {
        diaryService.register("fabulous", "1234");
        assertEquals(1,diaryService.count());
        assertThrows(IllegalArgumentException.class, () -> diaryService.login("fabulous", "4321"));
        Diary diary = diaryService.findByUserName("fabulous");
        assertTrue(diary.isLocked());
    }

}