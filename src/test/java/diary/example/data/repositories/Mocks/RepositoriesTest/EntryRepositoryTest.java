package diary.example.data.repositories.Mocks.RepositoriesTest;

import diary.example.data.repositories.Mocks.RepositoriesMocls.EntryRepositoryMock;
import diary.example.data.models.Entry;
import diary.example.data.repositories.EntryRepository;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EntryRepositoryTest  {

EntryRepository entryRepository;
@Test
    public void testThatEntryRepository_IsNot_Null(){
    entryRepository = new EntryRepositoryMock();
    assertNotNull(entryRepository);
}
@Test
    public void testThat_Entry_CanBe_Created(){
    entryRepository = new EntryRepositoryMock();
    Entry entry = new Entry();
    entryRepository.save(entry);
    assertEquals(1, entryRepository.count());
}
    @Test
    public void testThat_TwoEntry_CanBe_Created() {
        entryRepository = new EntryRepositoryMock();
        Entry entry = new Entry();
        Entry entry1 = new Entry();
        entryRepository.save(entry);
        entryRepository.save(entry1);
        assertEquals(2, entryRepository.count());
    }
}
