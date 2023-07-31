package diary.example.services;

import diary.example.data.models.Entry;
import diary.example.data.repositories.EntryRepository;
import diary.example.dtos.requests.CreateEntryRequest;
import diary.example.dtos.requests.UpdateEntryRequest;
import diary.example.dtos.responses.CreateEntryResponse;
import diary.example.dtos.responses.UpdateEntryResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntryServicesImpl implements EntryServices {

@Autowired
private EntryRepository entryRepository;

    @Override
    public Entry createEntry(CreateEntryRequest createGistRequest) {
        Entry entry = new Entry();
        entry.setTitle(createGistRequest.getTitle());
        entry.setBody(createGistRequest.getBody());
        entryRepository.save(entry);
        CreateEntryResponse createEntryResponse = new CreateEntryResponse();
        createEntryResponse.setBody(entry.getBody());
        createEntryResponse.setTitle(entry.getTitle());
        createEntryResponse.setId(entry.getId());
        System.out.println(" At creation" + entry.getId());
        return entry;
    }

    @Override
    public UpdateEntryResponse updateEntry(UpdateEntryRequest updateEntryRequest) {
//    entryRepository.findById()
        return null;
    }
   public Long entryListSize(){
        return entryRepository.count();
   }

    @Override
    public List<Entry> findAllEntry() {
        return entryRepository.findAll();
    }

    @Override
    public Entry findEntryByTitle(String title) {

        return null;
    }

    @Override
    public Entry findEntryById(String id) {
        var findEntry = entryRepository.findById(id);
        if (findEntry.isPresent()){
            //return findEntry.get();
            return entryRepository.findById(id).get();
        }
        throw new NullPointerException("Entry does not exist");
    }

}
