package fabdiary.service;

import fabdiary.data.models.Entry;
import fabdiary.data.repositories.EntryRepositoryimpl;

import java.util.List;

public class EntryServiceImpl implements EntryService {
   private final EntryRepositoryimpl entryRepository = new EntryRepositoryimpl();
    private long currentEntryId;

    @Override
    public String createEntry(String title, String body, String diaryId) {
        Entry entryTitle = entryRepository.findByTitle(title,diaryId);
       if(entryTitle != null) {
           throw new IllegalArgumentException("Entry already exist");
       }
            Entry entry = new Entry();
            entry.setTitle(title);
            entry.setBody(body);
            entry.setEntryId(generateEntryId());
            entry.setDiary_id(diaryId);
            entryRepository.save(entry);
            return "Entry created successfully";
    }

    @Override
    public String updateEntry(String title, String body, String diaryId) {
        return null;
    }

    @Override
    public void deleteEntry(int entryId) {

    }

    @Override
    public Entry getEntry(int entryId) {
        return null;
    }

    @Override
    public List<Entry> getAllEntries(String diaryId) {
        if(diaryExistBy(diaryId)) {
            throw new IllegalArgumentException("Diary does not exist");
        }
        return List.of(entryRepository.findAllEntriesByDiaryId(diaryId));
    }

//    @Override
//    public List<Entry> getAllEntries(String diaryId) {
//        return List.of();
//    }

    @Override
    public Entry findEntryByEntryTitleAndDiaryId(String entryTitle, String diaryId) {
       if(diaryExistBy(diaryId)) {
           throw new IllegalArgumentException("Diary does not exist");
       }
       return entryRepository.findByTitle(entryTitle, diaryId);
    }

    @Override
    public long countEntries() {
       return entryRepository.count();
    }

    private boolean diaryExistBy(String diaryId) {
        return !entryRepository.existByDiaryId(diaryId);
    }

    private long generateEntryId() {
        return ++currentEntryId;
    }
}


