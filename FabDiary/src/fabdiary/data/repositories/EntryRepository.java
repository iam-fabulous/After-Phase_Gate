package fabdiary.data.repositories;

import fabdiary.data.models.Entry;

public interface EntryRepository {
    long count();
    void deleteAll(String diaryId);
    void deleteById(long entryId, String diaryId);
    Entry findById(long entryId, String diaryId);
    Entry findByTitle(String title, String diaryId);
    Entry findAllEntriesByDiaryId(String diaryId);
    Entry save(Entry entry);
}
