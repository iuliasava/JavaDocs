package ro.teamnet.zth.api.em;

import ro.teamnet.zth.api.annotations.Column;
import ro.teamnet.zth.api.annotations.Id;
import ro.teamnet.zth.api.annotations.Table;
import ro.teamnet.zth.api.database.DBManager;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Objects;

/**
 * Created by user on 7/9/2016.
 */
public class EntityManagerImpl implements EntityManager {


    @Override
    public Object getNextIdVal(String tableName, String columnIdName) {
        return null;
    }

    @Override
    public Object insert(Object entity) {
        return null;
    }

    @Override
    public List findAll(Class entityClass) {
        return null;
    }

    @Override
    public <T> T findById(Class<T> entityClass, Long id) {
        T instance = null;
        try {
            Connection c = DBManager.getConnection();
            String tableName = EntityUtils.getTableName(entityClass);
            List<ColumnInfo> columns = EntityUtils.getColumns(entityClass);
            List<Field> idFields = EntityUtils.getFieldsByAnnotations(entityClass, Id.class);
            List<Field> colFields = EntityUtils.getFieldsByAnnotations(entityClass, Column.class);

            Id idd = idFields.get(0).getAnnotation(Id.class);
            Condition cond = new Condition(idd.name(), id);
            QueryBuilder qb = new QueryBuilder();
            qb.setTableName(tableName);
            qb.addQueryColumns(columns);
            qb.setQueryType(QueryType.SELECT);
            qb.addCondition(cond);
            String s = qb.createQuery();

            instance = entityClass.newInstance();
            Statement state = c.createStatement();
            ResultSet resultSet = state.executeQuery(s);
            Object result = resultSet.next();
            if (result != null) {
                for (ColumnInfo ci : columns) {
                    Field f = instance.getClass().getDeclaredField(ci.getColumnName());
                    f.setAccessible(true);
                    f.set(instance, EntityUtils.castFromSqlType(resultSet.getObject(ci.getDbName()), f.getType()));
                }
            }
        } catch (Exception ex) {}

        return instance;
    }
}

