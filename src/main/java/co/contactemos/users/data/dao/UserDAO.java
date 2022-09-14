package co.contactemos.users.data.dao;

import co.contactemos.users.data.dto.User;
import org.springframework.data.repository.CrudRepository;

public interface UserDAO extends CrudRepository<User, Long> {
}
