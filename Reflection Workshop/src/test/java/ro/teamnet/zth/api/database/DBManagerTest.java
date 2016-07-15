package ro.teamnet.zth.api.database;

import org.junit.Test;

import java.sql.SQLException;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertFalse;


/**
 * Created by user on 7/9/2016.
 */
public class DBManagerTest {
    @Test
    public void testGetConnection() throws SQLException, ClassNotFoundException {
        assertFalse("NOT NULL", DBManager.getConnection().equals(null));
    }

    @Test
    public void testCheckConnection() throws SQLException, ClassNotFoundException {
        assertEquals("CONNECTION ESTABLISH",true, DBManager.checkConnection(DBManager.getConnection()));
    }
}
