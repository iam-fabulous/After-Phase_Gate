package fabdiary.data.repositories;

import fabdiary.data.models.Entry;

import java.util.ArrayList;
import java.util.List;

public class EntryRepositoryimpl implements EntryRepository {
    List<Entry> entries = new ArrayList<Entry>();
    private long currentId;

    @Override
    public long count() {
        return entries.size();
    }


    @Override
    public void deleteAll(String diaryId) {
        entries.removeIf(entry -> entry.getDiary_id().equals(diaryId));
//        for (Entry entry : entries) {
//            if(entry.getDiary_id().equals(diaryId)) {
//                entries.remove(entry);
//            }
//        }
    }

    @Override
    public void deleteById(long entryId, String diaryId) {
        for (Entry entry : entries) {
            if (entry.getEntryId() == entryId && entry.getDiary_id().equals(diaryId)) {
                entries.remove(entry);
            }
        }
    }

    @Override
    public Entry findById(long entryId, String diaryId) {
        for (Entry entry : entries) {
            if (entry.getEntryId() == entryId && entry.getDiary_id().equals(diaryId)) {
                return entry;
            }
        }
        return null;
    }

    @Override
    public Entry findByTitle(String title, String diaryId) {
        for (Entry entry : entries) {
            if (entry.getTitle().equals(title) && entry.getDiary_id().equals(diaryId)) {
                return entry;
            }
        }
        return null;
    }

    @Override
    public Entry findAllEntriesByDiaryId(String diaryId) {
        return entries.stream().filter(entry -> entry.getDiary_id().equals(diaryId)).findFirst().get();
    }

    @Override
    public Entry save(Entry entry) {
        entries.add(entry);
        return  entry;
    }

    public boolean existByDiaryId(String diaryId) {
        return entries.stream().anyMatch(entry -> entry.getDiary_id().equals(diaryId));
    }



}
