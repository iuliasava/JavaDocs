package ro.teamnet.zth.api.em;

import org.junit.Test;
import ro.teamnet.zth.api.annotations.Column;
import ro.teamnet.zth.appl.domain.Department;
import sun.plugin.com.ParameterListCorrelator;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by user on 7/8/2016.
 */
public class EntityutilsTest {

    @Test
    public void testGetTableNameMethod() {
        String tableName = EntityUtils.getTableName(Department.class);
        assertEquals("Table name should be departments!", "departments", tableName);
    }

    @Test
    public void testGetColumns(){

        List<ColumnInfo> test = EntityUtils.getColumns(Department.class);
        System.out.println(test);
        assertEquals("Number of columns should be 3", 3,test.size() );
    }

    @Test
    public void testCastFromSqlType(){
        Object o = EntityUtils.castFromSqlType(100, Integer.class);
        assertTrue("Object should be Integer!",o instanceof Integer);
    }

    @Test
    public void TestGetValueByAnnotation(){
        List<Field> test = EntityUtils.getFieldsByAnnotations(Department.class, Column.class);
        assertEquals("Number of columns should be 2", 2,test.size() );
    }

    @Test
    public void testGetSqlValue() throws IllegalAccessException {
        Department d = new Department();
        d.setId((long)5);
        assert (long)EntityUtils.getSqlValue(d) == (long)5;
    }






}
