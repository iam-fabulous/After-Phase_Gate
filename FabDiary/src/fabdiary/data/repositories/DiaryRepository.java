package fabdiary.data.repositories;

import fabdiary.data.models.Diary;

import java.util.List;

public interface DiaryRepository {
    Diary save(Diary diary);
    Diary findByUserName(String id);
    void delete(Diary diary);
    boolean existByUserName(String username);
}
