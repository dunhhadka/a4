package com.example.demo.test.B4and5;

import java.sql.*;

//câu lệnh sql tạo table
/*
create table KiemTra(
	username varchar(255),
    avatar varchar(200),
    email varchar(100),
    fullname varchar(100),
    updated_at timestamp,
    status tinyint(1),
    source varchar(15),
    password varchar(150)
)
 */
public class Runner {
    public static Connection getConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/main";
            String user="root";
            String password="1234567";
            return DriverManager.getConnection(url,user,password);
        }catch (ClassNotFoundException|SQLException exception){
            return null;
        }
    }
    public static void create(){
        Connection connection=getConnection();
        PreparedStatement preparedStatement=null;
        String sql="insert into kiemtra (username,avatar,email,full_name,password) values (?,?,?,?,?)";
        if(connection!=null){
            try {
                preparedStatement=connection.prepareStatement(sql);
                preparedStatement.setString(1,"long");
                preparedStatement.setString(2,"images");
                preparedStatement.setString(3,"email");
                preparedStatement.setString(4,"le long");
                preparedStatement.setString(5,"123");
                preparedStatement.executeUpdate();
            }catch (SQLException exception){
                System.out.println(exception.getMessage());
            }finally {
                try{
                    connection.close();
                    if(preparedStatement!=null){
                        preparedStatement.close();
                    }
                }catch (SQLException exception1){
                    System.out.println(exception1.getMessage());
                }
            }
            System.out.println("insert success");
        }
        else{
            System.out.println("insert fail");
        }
    }
    public static void query(){
        Connection connection=getConnection();
        PreparedStatement preparedStatement=null;
        ResultSet resultSet=null;
        String sql="select k.username,k.avatar,k.email,k.full_name,k.password from kiemtra as k";
        if(connection!=null){
            try{
                preparedStatement =connection.prepareStatement(sql);
                resultSet=preparedStatement.executeQuery();
                while (resultSet.next()){
                    String username=resultSet.getString("username");
                    String avatar=resultSet.getString("avatar");
                    String email=resultSet.getString("email");
                    String full_name=resultSet.getString("full_name");
                    String password=resultSet.getString("password");
                    System.out.println(username+" "+avatar+" "+email+" "+full_name+" "+password);
                }
            }catch (SQLException exception){
                System.out.println(exception.getMessage());
            }finally {
                try {
                    connection.close();
                    if(preparedStatement!=null){
                        preparedStatement.close();
                    }
                    if(resultSet!=null){
                        resultSet.close();
                    }
                } catch (SQLException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
        else{
            System.out.println("query fail");
        }
    }
    public static void main(String[] args) {
        //insert into databasw
        create();
        //
        query();
    }
}
