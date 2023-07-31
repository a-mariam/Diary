package diary.example.data.repositories;

import diary.example.data.models.Diary;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DiaryRepository extends MongoRepository<Diary, String> {

}
