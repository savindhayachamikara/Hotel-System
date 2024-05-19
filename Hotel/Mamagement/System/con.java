package Hotel.Mamagement.System;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class con {
    Connection connection;

    Statement statement;

    public con(){
        try{
            connection = DriverManager.getConnection("jdcb(mysql//localhost:3306/hotelMS", "root", "Chamika1234");
            statement = (Statement) connection.createStatement();

        }catch(Exception e){
            e.printStackTrace();
        }



    }
}
