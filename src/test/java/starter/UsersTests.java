package starter;

import impl.UsersServiceImpl;
import models.Page;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import service.UsersService;

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

}
