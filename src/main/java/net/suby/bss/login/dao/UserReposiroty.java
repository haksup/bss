package net.suby.bss.login.dao;

import org.springframework.stereotype.Repository;

import net.suby.bss.login.vo.UserVO;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface UserReposiroty extends JpaRepository<UserVO, String>{
	public UserVO findByUserId(String userId);
}
