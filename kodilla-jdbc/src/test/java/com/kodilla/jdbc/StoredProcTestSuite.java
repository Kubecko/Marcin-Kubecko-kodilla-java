package com.kodilla.jdbc;

import org.junit.Assert;
import org.junit.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static org.junit.Assert.assertEquals;

public class StoredProcTestSuite {
    @Test
    public void testUpdateVipLevels() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();
        String sqlUpdate = "UPDATE READERS SET Vip_Level=\"Not set\"";
        Statement statement = dbManager.getConnection().createStatement();
        statement.executeUpdate(sqlUpdate);

        //When
        String sqlProcedureCall = "CALL UpdateVipLevels()";
        statement.execute(sqlProcedureCall);
        //Then
        String sqlCheckTable = "SELECT COUNT(*) AS HOW_MANY FROM READERS WHERE VIP_LEVEL=\"Not set\"";
        ResultSet rs = statement.executeQuery(sqlCheckTable);
        int howMany = -1;
        if(rs.next()) {
            howMany = rs.getInt("HOW_MANY");
        }
        assertEquals(0,howMany);
    }
    @Test
    public void testUpdateBestsellers() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();
        String sqlUpdate = "UPDATE BOOKS SET BESTSELLER=1";
        Statement statement = dbManager.getConnection().createStatement();
        statement.executeUpdate(sqlUpdate);

        //When
        String sqlPRocedureCall = "CALL UpdateBestseller";
        statement.execute(sqlPRocedureCall);

        //Then
        String sqlChechTable = "SELECT COUNT(*)HOW_BOOKS FROM BOOKS WHERE BESTSELLER =\"0\"";
        ResultSet rs = statement.executeQuery(sqlChechTable);
        int howBooks = -1;
        if(rs.next()) {
            howBooks = rs.getInt("HOW_BOOKS");
        }

        Assert.assertEquals(0,howBooks);
    }
}
