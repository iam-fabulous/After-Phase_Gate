package fabdiary.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EntryServiceImplTest {
    private EntryServiceImpl entryService;
    @BeforeEach
    void startWith() {entryService = new EntryServiceImpl();}

    @Test
    public void entryCanBeCreated() {
        entryService.createEntry("myHobby","Drumming","fabulous");
        assertNotNull(entryService.findEntryByEntryTitleAndDiaryId("myHobby","fabulous"));
        assertEquals(1, entryService.countEntries());
    }

    @Test
    public void entryIdIsOne_NewEntryAddedEntryIdIsTwo(){
        entryService.createEntry("myHobby","Drumming","fabulous");
        assertEquals(1, entryService.countEntries());
        assertEquals(1, entryService.findEntryByEntryTitleAndDiaryId("myHobby","fabulous").getEntryId());
        entryService.createEntry("myBooks","Physics","fabulous");
        assertEquals(2, entryService.countEntries());
        assertEquals(2, entryService.findEntryByEntryTitleAndDiaryId("myBooks","fabulous").getEntryId());

    }

}