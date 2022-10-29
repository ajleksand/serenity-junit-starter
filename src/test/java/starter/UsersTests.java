package starter;

import com.github.javafaker.Faker;
import impl.UsersServiceImpl;
import models.Page;
import models.ResponseUser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import service.UsersService;

import java.util.HashMap;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UsersTests {

    UsersService usersService = new UsersServiceImpl();

    @Test
    void getPageTest() {

        Page page = usersService.getPage("2");

        Assertions.assertAll(
                () -> assertTrue(page.getData().stream().anyMatch(x -> x.getFirst_name().contains("Lindsay"))),
                () -> assertEquals(page.getPage(), 2)
        );
    }

    @Test
    void createUser() {
        HashMap<String, String> userMap = new HashMap<>();
        Faker faker = new Faker();
        Random rand = new Random();

        String randomJob = rand.ints(48, 123)
                .filter(num -> (num < 58 || num > 64) && (num < 91 || num > 96))
                .limit(8)
                .mapToObj(c -> (char) c).collect(StringBuffer::new, StringBuffer::append, StringBuffer::append)
                .toString();

        String firstName = faker.name().firstName();

        userMap.put("name", firstName);
        userMap.put("job", randomJob);

        ResponseUser createdUser = usersService.createUser(userMap);

        Assertions.assertAll(
                () -> assertEquals(createdUser.getName(), userMap.get("name")),
                () -> assertEquals(createdUser.getJob(), userMap.get("job"))
        );

    }
}
