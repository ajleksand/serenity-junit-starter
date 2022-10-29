package service;

import models.Page;
import models.ResponseUser;

import java.util.HashMap;

public interface UsersService extends ConfigApiService {

    Page getPage(String pageNumber);

    ResponseUser createUser(HashMap<String,String> randomUser);

}
