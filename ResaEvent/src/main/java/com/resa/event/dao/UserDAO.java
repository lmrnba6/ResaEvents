package com.resa.event.dao;

import com.resa.event.genric.Executer;
import com.resa.event.model.User;

public interface UserDAO extends Executer<User> {

	public boolean checkLogin(String userName, String userPassword);

}
