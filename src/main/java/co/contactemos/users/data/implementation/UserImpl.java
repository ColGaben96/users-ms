package co.contactemos.users.data.implementation;

import co.contactemos.users.data.dao.UserDAO;
import co.contactemos.users.data.dto.User;
import co.contactemos.users.data.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserImpl implements UserService {
    @Autowired
    private UserDAO user;
    /**
     * Lists all registers from entity
     *
     * @return List\<Object\>
     */
    @Override
    public List<?> listAll() {
        return (List<User>) user.findAll();
    }

    /**
     * Save one registry to entity
     *
     * @param dto
     */
    @Override
    public void save(Object dto) {
        user.save((User) dto);
    }

    /**
     * Delete one registry from entity
     *
     * @param dto
     */
    @Override
    public void delete(Object dto) {
        user.delete((User) dto);
    }

    /**
     * Find an object specifically
     *
     * @param id
     * @return Object from it's ID
     */
    @Override
    public Object findById(Long id) {
        return user.findById(id).orElse(null);
    }
}
