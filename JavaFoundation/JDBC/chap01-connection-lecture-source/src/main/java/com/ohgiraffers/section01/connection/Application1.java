package com.ohgiraffers.section01.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Application1 {
    public static void main(String[] args) {
        Connection con = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");  //사용할 드라이버 등록
            /* 드라이버 url user pwd */
            con = DriverManager.getConnection("jdbc:mysql://localhost/employee", "ohgiraffers", "ohgiraffers");
            System.out.println("con = " + con);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if(con != null){
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
