package com.resa.event.service;

import com.resa.event.genric.Executer;
import com.resa.event.model.User;

public interface UserService extends Executer<User> {

	public boolean checkLogin(String userName, String userPassword);

}
