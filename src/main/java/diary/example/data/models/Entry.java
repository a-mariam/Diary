package diary.example.data.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("Entry")
public class Entry {
    @Id
    private String id;
    private String title;
    private String body;
}
