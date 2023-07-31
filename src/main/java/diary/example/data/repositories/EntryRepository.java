package diary.example.data.repositories;

import diary.example.data.models.Entry;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface EntryRepository extends MongoRepository<Entry, String> {

}
