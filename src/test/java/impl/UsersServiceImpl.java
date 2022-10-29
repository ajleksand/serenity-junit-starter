package impl;

import models.Page;
import net.thucydides.core.annotations.Step;
import service.UsersService;

import static config.Specification.requestSpec;
import static config.Specification.responseSpecOk;
import static io.restassured.RestAssured.given;

public class UsersServiceImpl implements UsersService {
    private final String SERVICE = "/users";

    @Step("Получаем список пользователей")
    @Override
    public Page getPage(String pageNumber) {
        return given()
                .spec(requestSpec(URI))
                .queryParam("page", pageNumber)
                .when()
                .get(SERVICE)
                .then()
                .spec(responseSpecOk())
                .extract().body().as(Page.class);
    }
}
