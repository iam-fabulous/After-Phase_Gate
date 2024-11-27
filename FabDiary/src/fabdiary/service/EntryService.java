package fabdiary.service;

import fabdiary.data.models.Entry;

import java.util.List;


public interface EntryService {
    String createEntry(String title, String body, String diaryId);
    String updateEntry(String title, String body, String diaryId);
    void deleteEntry(int entryId);
    Entry getEntry(int entryId);
    List <Entry> getAllEntries(String diaryId);
    Entry findEntryByEntryTitleAndDiaryId(String entryTitle, String diaryId);
    long countEntries();
}
