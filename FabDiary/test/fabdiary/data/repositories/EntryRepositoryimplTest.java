package fabdiary.data.repositories;

import fabdiary.data.models.Entry;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EntryRepositoryimplTest {
    private EntryRepositoryimpl entries;
    @BeforeEach
    void startWith() {
        entries = new EntryRepositoryimpl();
    }

    @Test
    public void testThatOnCreationListIsEmpty() {
        assertEquals(0, entries.count());
    }

    @Test
    public void testThatWhenEntryIsAddedListSizeIncreases() {
        Entry entry = new Entry();
        entry.setTitle("myHobby");
        entry.setBody("Drumming");
        entry.setEntryId(1);
        entry.setDiary_id("fabulous");
        entries.save(entry);
        assertEquals(1, entries.count());
    }

    @Test
    public void newEntryAdded_EntryHasId(){
        Entry entry = new Entry();
        entry.setTitle("myHobby");
        entry.setBody("Drumming");
        entry.setEntryId(1);
        entry.setDiary_id("fabulous");
        entries.save(entry);
        assertEquals(1, entries.count());
        assertEquals(1, entry.getEntryId());
    }

    @Test
    public void twoEntriesAdded_EntriesHaveSeparateId(){
        Entry entry = new Entry();
        Entry entry2 = new Entry();
        entry.setTitle("myHobby");
        entry.setBody("Drumming");
        entry.setEntryId(1);
        entry.setDiary_id("fabulous");
        entry2.setTitle("myBooks");
        entry2.setBody("Physics");
        entry2.setEntryId(1);
        entry2.setDiary_id("ebuka");
        entries.save(entry);
        entries.save(entry2);
        assertEquals(2, entries.count());
        assertEquals(1, entry.getEntryId());
        assertEquals(1, entry2.getEntryId());
    }

    @Test
    public void entriesAdded_FindEntryById(){
        Entry entry = new Entry();
        entry.setTitle("myHobby");
        entry.setBody("Drumming");
        entry.setEntryId(1);
        entry.setDiary_id("fabulous");
        entries.save(entry);
        assertEquals(1, entries.count());
        assertEquals("myHobby", entries.findById(1, "fabulous").getTitle());

    }

    @Test
    public void entriesAdded_FindEachEntryById(){
        Entry entry = new Entry();
        Entry entry2 = new Entry();
        entry.setTitle("myHobby");
        entry.setBody("Drumming");
        entry.setEntryId(1);
        entry.setDiary_id("fabulous");
        entry2.setTitle("myBooks");
        entry2.setBody("Physics");
        entry2.setEntryId(1);
        entry2.setDiary_id("ebuka");
        entries.save(entry);
        entries.save(entry2);
        assertEquals(2, entries.count());
        assertEquals("myHobby", entries.findById(1, "fabulous").getTitle());
        assertEquals("myBooks", entries.findById(1, "ebuka").getTitle());

    }

    @Test
    public void entriesAdded_DeleteEntryById(){
        Entry entry = new Entry();
        Entry entry2 = new Entry();
        entry.setTitle("myHobby");
        entry.setBody("Drumming");
        entry.setEntryId(1);
        entry.setDiary_id("fabulous");
        entry2.setTitle("myBooks");
        entry2.setBody("Physics");
        entry2.setEntryId(2);
        entry2.setDiary_id("ebuka");
        entries.save(entry);
        entries.save(entry2);
        assertEquals(2, entries.count());
        assertEquals("myHobby", entries.findById(1, "fabulous").getTitle());
        assertEquals("myBooks", entries.findById(2, "ebuka").getTitle());
        entries.deleteById(1, "fabulous");
        assertNull(entries.findById(1, "fabulous"));
    }

    @Test
    public void entriesAdded_DeleteAllEntries(){
        Entry entry = new Entry();
        entry.setTitle("myHobby");
        entry.setBody("Drumming");
        entry.setEntryId(1);
        entry.setDiary_id("fabulous");
        entries.save(entry);
        Entry entry2 = new Entry();
        entry2.setTitle("myBooks");
        entry2.setBody("Physics");
        entry2.setEntryId(2);
        entry2.setDiary_id("fabulous");
        entries.save(entry2);
        assertEquals(2, entries.count());
        entries.deleteAll("fabulous");
        assertNull(entries.findById(1, "fabulous"));
        assertNull(entries.findById(2, "fabulous"));
    }

    @Test
    public void entriesAdded_FindEntryByDiaryId(){
        Entry entry = new Entry();
        entry.setTitle("myHobby");
        entry.setBody("Drumming");
        entry.setEntryId(1);
        entry.setDiary_id("fabulous");
        entries.save(entry);
        assertEquals(1, entries.count());
        assertTrue(entries.existByDiaryId("fabulous"));
    }

    @Test
    public void entriesAdded_FindEntryByTitle(){
        Entry entry = new Entry();
        entry.setTitle("myHobby");
        entry.setBody("Drumming");
        entry.setEntryId(1);
        entry.setDiary_id("fabulous");
        entries.save(entry);
        assertEquals(1, entries.count());
        assertEquals("Drumming", entries.findByTitle("myHobby", "fabulous").getBody());
    }

    @Test
    public void entriesAdded_FindAllEntries(){
        Entry entry = new Entry();
        entry.setTitle("myHobby");
        entry.setBody("Drumming");
        entry.setEntryId(1);
        entry.setDiary_id("fabulous");
        entries.save(entry);
        Entry entry2 = new Entry();
        entry2.setTitle("myBooks");
        entry2.setBody("Physics");
        entry2.setEntryId(2);
        entry2.setDiary_id("fabulous");
        entries.save(entry2);
        assertEquals(2, entries.count());
        assertNotNull(entries.findAllEntriesByDiaryId("fabulous"));
    }
}