package HomeWork_3.Task3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserRepositoryTest {

    @Test
    void logOutUsersExceptAdmins() {
        UserRepository repository = new UserRepository();
        User user1 = new User("first", "123", true);
        User user2 = new User("second", "456", false);
        User user3 = new User("third", "789", false);
        repository.addUser(user1);
        repository.addUser(user2);
        repository.addUser(user3);
        repository.logOutUsersExceptAdmins();
        assertEquals(1, repository.data.size());
    }
}