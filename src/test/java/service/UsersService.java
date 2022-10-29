package service;

import models.Page;

public interface UsersService extends ConfigApiService {

    Page getPage(String pageNumber);

}
