package ro.teamnet.zth.api.em;

import ro.teamnet.zth.api.annotations.Column;
import ro.teamnet.zth.api.annotations.Id;
import ro.teamnet.zth.api.annotations.Table;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by user on 7/8/2016.
 */
public class EntityUtils {

    private EntityUtils() throws UnsupportedOperationException {
    }

    public static String getTableName(Class Entity) {
        Table t = (Table) Entity.getAnnotation(Table.class);
        if (t != null)
            return t.name();
        return Entity.getSimpleName();
    }

    public static List<ColumnInfo> getColumns(Class entity) {
        List<ColumnInfo> ci = new ArrayList<ColumnInfo>();
        Field[] fields = entity.getDeclaredFields();

        for (Field f : fields) {
            ColumnInfo inf = new ColumnInfo();
            inf.setColumnName(f.getName());
            inf.setColumnType(f.getType());
            Id i = (Id) f.getAnnotation(Id.class);
            if (i != null) {
                inf.setId(true);
                inf.setDbName(i.name());
            } else {
                inf.setId(false);
                Column c = f.getAnnotation(Column.class);
                inf.setDbName(c.name());
            }
            ci.add(inf);
        }
        return ci;
    }

    public static Object castFromSqlType(Object value, Class wantedType) {

        if (value instanceof BigDecimal) {
            BigDecimal bd = (BigDecimal) value;
            if (wantedType.equals(Integer.class)) {
                return bd.intValue();
            }
            if (wantedType.equals(Long.class)) {
                return bd.longValue();
            }
            if (wantedType.equals(Float.class)) {
                return bd.floatValue();
            }
            if (wantedType.equals(Double.class)) {
                return bd.doubleValue();
            }
        }
        return value;
    }

    public static List<Field> getFieldsByAnnotations(Class clazz, Class annotation) {
        List<Field> fs = new ArrayList<Field>();
        Field[] fields = clazz.getDeclaredFields();

        for (Field f : fields) {
            Object i = f.getAnnotation(annotation);
            if (i != null)
                fs.add(f);
        }
        return fs;
    }

    public static Object getSqlValue(Object object) throws IllegalAccessException {
        Table t = object.getClass().getAnnotation(Table.class);
        if(t != null)
        {
            List<Field> fields = getFieldsByAnnotations(object.getClass(), Id.class);
            fields.get(0).setAccessible(true);
            try {
                return fields.get(0).get(object);
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return object;
    }
}

