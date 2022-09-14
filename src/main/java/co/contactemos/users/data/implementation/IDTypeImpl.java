package co.contactemos.users.data.implementation;

import co.contactemos.users.data.dao.IDTypeDAO;
import co.contactemos.users.data.dto.IDType;
import co.contactemos.users.data.service.IDTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IDTypeImpl implements IDTypeService {
    @Autowired
    private IDTypeDAO idType;
    /**
     * Lists all registers from entity
     *
     * @return List\<Object\>
     */
    @Override
    public List<?> listAll() {
        return (List<IDType>) idType.findAll();
    }

    /**
     * Save one registry to entity
     *
     * @param dto
     */
    @Override
    public void save(Object dto) {
        idType.save((IDType) dto);
    }

    /**
     * Delete one registry from entity
     *
     * @param dto
     */
    @Override
    public void delete(Object dto) {
        idType.delete((IDType) dto);
    }

    /**
     * Find an object specifically
     *
     * @param id
     * @return Object from it's ID
     */
    @Override
    public Object findById(Long id) {
        return idType.findById(id).orElse(null);
    }
}
