package fabdiary.service;

import fabdiary.data.models.Diary;

public interface DiaryService {
    Diary login(String username, String password);
    void register(String username, String password);
    void deleteDiary(String username);
}
