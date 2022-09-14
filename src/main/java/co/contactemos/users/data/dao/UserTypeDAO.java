package co.contactemos.users.data.dao;

import co.contactemos.users.data.dto.UserType;
import org.springframework.data.repository.CrudRepository;

public interface UserTypeDAO extends CrudRepository<UserType, Long> {
}
