package com.jdbc;

import com.model.Product;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBC implements JDBCInT{
    private String jdbcURL = "jdbc:mysql://localhost:3306/products?useSSL=false";
    private String jdbcUsername = "root";
    private String jdbcPassword = "12345";

    private String insertSQL = "INSERT INTO product( name, price, quantity, color, category) VALUES (?,?,?,?,?);";
    private String selectSQL = "SELECT * FROM product;";
    private String selectIdSQL = "SELECT * FROM product WHERE id = ?;";
    private String selectNameSQL = "SELECT * FROM product WHERE name LIKE ?;";
    private String updateSQL = "UPDATE product SET name = ?, price = ?, quantity = ?, color = ?, category = ? WHERE id = ?;";
    private String dropSQL = "DELETE FROM product WHERE id = ?;";
    private String categorySQL = "SELECT * FROM category;";


    public Connection getConnection(){
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public List<String> Category(){
        List<String> categoryList = new ArrayList<>();
        Connection connection = getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(categorySQL);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                String cate = rs.getString(1);
                categoryList.add(cate);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return categoryList;
    }

    @Override
    public void insertProduct(Product product) {
        Connection connection = getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(insertSQL);
            preparedStatement.setString(1, product.getName());
            preparedStatement.setFloat(2, product.getPrice());
            preparedStatement.setInt(3, product.getQuantity());
            preparedStatement.setString(4, product.getColor());
            preparedStatement.setString(5, product.getCategory());

            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public List<Product> selectAll() {
        List<Product> productList = new ArrayList<>();
        Connection connection = getConnection();
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(selectSQL);

            while (rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                float price = rs.getFloat("price");
                int quantity = rs.getInt("quantity");
                String color = rs.getString("color");
                String category = rs.getString("category");
                productList.add(new Product(id, name, price, quantity, color, category));
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return productList;
    }

    @Override
    public Product selectId(int id) {
        Product product = null;
        Connection connection = getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(selectIdSQL);
            preparedStatement.setInt(1,id);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                String name = rs.getString("name");
                float price = rs.getFloat("price");
                int quantity = rs.getInt("quantity");
                String color = rs.getString("color");
                String category = rs.getString("category");
                product = new Product(id, name,price,quantity,color,category);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return product;
    }

    @Override
    public List<Product> selectName(String nameSearch) {
        List<Product> listProduct = new ArrayList<>();
        Connection connection = getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(selectNameSQL);
            preparedStatement.setString(1,nameSearch);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                float price = rs.getFloat("price");
                int quantity = rs.getInt("quantity");
                String color = rs.getString("color");
                String category = rs.getString("category");
                listProduct.add(new Product(id, name,price,quantity,color,category));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return listProduct;
    }

    @Override
    public void editProduct(Product product) {
        Connection connection = getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(updateSQL);
            preparedStatement.setString(1, product.getName());
            preparedStatement.setFloat(2, product.getPrice());
            preparedStatement.setInt(3, product.getQuantity());
            preparedStatement.setString(4, product.getColor());
            preparedStatement.setString(5, product.getCategory());
            preparedStatement.setInt(6,product.getId());
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    @Override
    public void deleteProduct(int id) {
        Product product = null;
        Connection connection = getConnection();
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(dropSQL);
            preparedStatement.setInt(1,id);
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


    }
}
