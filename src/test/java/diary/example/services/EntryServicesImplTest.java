package diary.example.services;

import diary.example.dtos.requests.CreateEntryRequest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

//@DataMongoTest
//@ExtendWith(SpringExtension.class)
//@ContextConfiguration(classes = TestConfig.class)
@SpringBootTest
public class EntryServicesImplTest {

    @Autowired
   private EntryServices entryServices;


   @DisplayName("Creating Diary")
    @Test
    public void testThat_Entry_CanBeCreated(){
    CreateEntryRequest createEntry =  new CreateEntryRequest();
    createEntry.setTitle("Good Girl");
    createEntry.setBody("I am a good Girl");
    entryServices.createEntry(createEntry);
    assertEquals(entryServices.entryListSize(), 1L);
//    assertThat(entryRepository.findAll().get(0).getTitle(), is("Good Girl"));
    assertEquals(createEntry.getTitle(), "Good Girl");
}
@DisplayName("Two diary can be created")
    @Test
    public void testThat_TwoEntry_CanBeCreated(){
        CreateEntryRequest createEntry =  new CreateEntryRequest();
        CreateEntryRequest createEntry1 =  new CreateEntryRequest();
        createEntry.setTitle("Good Girl");
        createEntry.setBody("I am a good Girl");
        entryServices.createEntry(createEntry1);
        createEntry1.setTitle("Girl");
        createEntry1.setBody("I am not a good Girl");
        entryServices.createEntry(createEntry1);
        assertEquals(entryServices.entryListSize(), 2L);
        //assertThat(entryServices.findAllEntry().get(0).getTitle(), is("Good Girl"));
        assertEquals(createEntry.getTitle(), "Good Girl");
        assertEquals(createEntry1.getTitle(), "Girl");

    }
    @DisplayName("Entry can be found by Id")
    @Test
    public void testThat_Entry_CanBe_Found(){
        CreateEntryRequest createEntryRequest = new CreateEntryRequest();
        createEntryRequest.setTitle("Programming");
        createEntryRequest.setBody("I started Learning programming some month ago");
        assertEquals(entryServices.findEntryById(entryServices.createEntry(createEntryRequest).getId()),entryServices.createEntry(createEntryRequest));
        //assertEquals();
    }
    @Test
    @DisplayName("Entry can be found by title")
    public void testThat_Entry_CanBe_Found_ByTitle(){
       CreateEntryRequest createEntryRequest = new CreateEntryRequest();
       createEntryRequest.setTitle("I will win");
       createEntryRequest.setBody("Trying to change my habit");
       assertEquals(entryServices.findEntryByTitle(createEntryRequest.getTitle()),entryServices.createEntry(createEntryRequest));
    }

//    @Test
//    public void that_Entry_CanBe_Updated(){
//        CreateEntryRequest createEntry =  new CreateEntryRequest();
//        createEntry.setTitle("Good Girl");
//        createEntry.setBody("I am a good Girl");
//        entryServices.createEntry(createEntry);
//        UpdateEntryRequest updateEntryRequest =  new UpdateEntryRequest();
//        updateEntryRequest.setTitle("Hope");
//        updateEntryRequest.setBody("I won't give up");
//        entryServices.updateEntry(updateEntryRequest);
//        assertEquals(updateEntryRequest.getBody(), createEntry.getBody());
//        assertEquals(updateEntryRequest.getTitle(),createEntry.getTitle());
//    }

}