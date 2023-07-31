package diary.example.data.repositories.Mocks.RepositoriesTest;

import diary.example.data.repositories.Mocks.RepositoriesMocls.UserRepositoryMock;
import diary.example.data.models.User;
import diary.example.data.repositories.UserRepository;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class UserRepositoryTest {
    UserRepository userRepository;
    @Test
    public void testThat_UserRepository_IsNotNull(){
        userRepository = new UserRepositoryMock();
        assertNotNull(userRepository);
    }
    @Test
    public void testThat_User_CanBe_Created(){
        userRepository = new UserRepositoryMock();
        userRepository.save(new User());
        assertEquals(1, userRepository.count());
    }
    @Test
    public void testThat_TwoUser_CanBe_Created(){
        userRepository = new UserRepositoryMock();
        userRepository.save(new User());
        userRepository.save(new User());
        assertEquals(2, userRepository.count());
    }
}
