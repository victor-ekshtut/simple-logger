package com.sql;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

public class Controller {
  
  public void unsafeFindAccountsByCustomerId(String customerId) throws SQLException {
    DataSource dataSource = null;
    
    String sql = "select "
      + "customer_id,acc_number,branch_id,balance "
      + "from Accounts where customer_id = '"
      + customerId 
      + "'";
    @SuppressWarnings("null")
    Connection c = dataSource.getConnection();
    @SuppressWarnings("unused")
    ResultSet rs = c.createStatement().executeQuery(sql);
}
}
