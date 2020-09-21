package com.jdbc;

import com.model.Product;

import java.util.List;

public interface JDBCInT {
    public void insertProduct(Product product);

    public List<Product> selectAll();

    public Product selectId(int id);

    public List<Product> selectName(String name);

    public void editProduct(Product product);

    public void deleteProduct(int id);
}
