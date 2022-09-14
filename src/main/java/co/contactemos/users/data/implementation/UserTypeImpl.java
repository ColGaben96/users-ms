package co.contactemos.users.data.implementation;

import co.contactemos.users.data.dao.UserTypeDAO;
import co.contactemos.users.data.dto.UserType;
import co.contactemos.users.data.service.UserTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserTypeImpl implements UserTypeService {
    @Autowired
    private UserTypeDAO userType;

    /**
     * Lists all registers from entity
     *
     * @return List\<Object\>
     */
    @Override
    public List<?> listAll() {
        return (List<UserType>) userType.findAll();
    }

    /**
     * Save one registry to entity
     *
     * @param dto
     */
    @Override
    public void save(Object dto) {
        userType.save((UserType) dto);
    }

    /**
     * Delete one registry from entity
     *
     * @param dto
     */
    @Override
    public void delete(Object dto) {
        userType.delete((UserType) dto);
    }

    /**
     * Find an object specifically
     *
     * @param id
     * @return Object from it's ID
     */
    @Override
    public Object findById(Long id) {
        return userType.findById(id).orElse(null);
    }
}
