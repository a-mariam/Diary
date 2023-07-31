package diary.example.data.repositories.Mocks.RepositoriesTest;

import diary.example.data.repositories.Mocks.RepositoriesMocls.DiaryRepositoryMock;
import diary.example.data.models.Diary;
import diary.example.data.repositories.DiaryRepository;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;


public class DiaryRepositoryTest {
    DiaryRepository diaryRepository ;
    @Test
    public void testThat_DiaryRepository_IsNot_Null(){
        diaryRepository = new DiaryRepositoryMock();
        assertNotNull(diaryRepository);
    }
    @Test
    public void testThat_Diary_CanBe_Created(){
        diaryRepository = new DiaryRepositoryMock();
        Diary diary = new Diary();
        diaryRepository.save(diary);
        assertEquals(1,diaryRepository.count());
    }
    @Test
    public void testThat_TwoDiary_CanBe_Created(){
        diaryRepository = new DiaryRepositoryMock();
        Diary diary = new Diary();
        Diary diary1 = new Diary();
        diaryRepository.save(diary);
        diaryRepository.save(diary1);
        assertEquals(2,diaryRepository.count());
    }
}
