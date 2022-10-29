package impl;

import models.Page;
import models.ResponseUser;
import net.thucydides.core.annotations.Step;
import service.UsersService;

import java.util.HashMap;

import static config.Specification.*;
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

    @Step("Создаем пользователя")
    @Override
    public ResponseUser createUser(HashMap<String, String> randomUser) {
        return given()
                .spec(requestSpec(URI))
                .body(randomUser)
                .when()
                .post(SERVICE)
                .then()
                .spec(respSpecCod201())
                .extract().body().as(ResponseUser.class);
    }
}
