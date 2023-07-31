package diary.example.services;

import diary.example.data.models.Entry;
import diary.example.dtos.requests.CreateEntryRequest;
import diary.example.dtos.requests.UpdateEntryRequest;
import diary.example.dtos.responses.UpdateEntryResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EntryServices {
    Entry createEntry(CreateEntryRequest createGistRequest);
    UpdateEntryResponse updateEntry(UpdateEntryRequest updateEntryRequest);

    Entry findEntryById(String id);
    Long entryListSize();
    List<Entry> findAllEntry();
    Entry findEntryByTitle(String title);
}
