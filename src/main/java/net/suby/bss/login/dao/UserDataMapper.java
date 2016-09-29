package net.suby.bss.login.dao;

import java.util.HashMap;

import org.springframework.stereotype.Repository;

@Repository
public interface UserDataMapper {
	public HashMap<String, String> findUserId(HashMap<String, String> hashMap);
}
