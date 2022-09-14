package co.contactemos.users.domain.utils;

import java.util.List;

/**
 * @author Gabriel Blanco
 * This interface has the default methods for CRUD implementation
 */
public interface RapidCrudConfiguration {
    /**
     * Lists all registers from entity
     * @return List\<Object\>
     */
    List<?> listAll();

    /**
     * Save one registry to entity
     * @param dto
     */
    void save(Object dto);

    /**
     * Delete one registry from entity
     * @param dto
     */
    void delete(Object dto);

    /**
     * Find an object specifically
     * @param id
     * @return Object from it's ID
     */
    Object findById(Long id);
}
