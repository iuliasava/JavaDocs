package ro.teamnet.zth.api.em;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by user on 7/9/2016.
 */
public interface EntityManager {
    <T> T findById(Class<T> entityClass, Long id);
    <T> T getNextIdVal(String tableName, String columnIdName);
    <T> Object insert(T entity);
    <T> List<T> findAll(Class<T> entityClass);

}
