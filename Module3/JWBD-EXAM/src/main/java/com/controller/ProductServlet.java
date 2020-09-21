package com.controller;

import com.jdbc.JDBC;
import com.model.Product;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "ProductServlet", urlPatterns = "/product")
public class ProductServlet extends HttpServlet {
    JDBC jdbc = new JDBC();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        try {
            switch (action) {
                case "addNewProduct":
                    insertProduct(request, response);
                    break;
                case "updateProduct":
                    updateProduct(request, response);
                    break;
                default:
                    listProduct(request,response);
            }
        } catch (SQLException ex) {
            throw new ServletException(ex);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        try {
            switch (action) {
                case "addProduct":
                    request.setAttribute("categoryList",jdbc.Category());
                    RequestDispatcher addDispatcher = request.getRequestDispatcher("/view/add.jsp");
                    addDispatcher.forward(request, response);
                    break;
                case "editProduct":
                    editProduct(request,response);
                    break;
                case "deleteProduct":
                    deleteProduct(request,response);
                    break;
                case "search":
                    search(request,response);
                    break;
                default:
                    listProduct(request, response);
                    break;
            }
        } catch (SQLException ex) {
            throw new ServletException(ex);
        }

    }

    public void listProduct(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
        request.setAttribute("listProduct", jdbc.selectAll());
        RequestDispatcher dispatcher = request.getRequestDispatcher("/view/list.jsp");
        dispatcher.forward(request, response);
    }

    public void editProduct(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
        int id = Integer.parseInt(request.getParameter("id"));
        request.setAttribute("categoryList",jdbc.Category());
        request.setAttribute("product",jdbc.selectId(id));
        RequestDispatcher dispatcher = request.getRequestDispatcher("/view/edit.jsp");
        dispatcher.forward(request, response);
    }

    public void deleteProduct(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
        int id = Integer.parseInt(request.getParameter("id"));
        jdbc.deleteProduct(id);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/product?action");
        dispatcher.forward(request, response);
    }

    public void insertProduct(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
        //int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        float price = Float.parseFloat(request.getParameter("price"));
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        String color = request.getParameter("color");
        String category = request.getParameter("category");
        Product product = new Product(name,price,quantity,color,category);
        jdbc.insertProduct(product);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/product?action");
        dispatcher.forward(request, response);
    }

    public void updateProduct(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        float price = Float.parseFloat(request.getParameter("price"));
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        String color = request.getParameter("color");
        String category = request.getParameter("category");
        Product product = new Product(id,name,price,quantity,color,category);
        jdbc.editProduct(product);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/product?action");
        dispatcher.forward(request, response);
    }

    public void search(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException, ServletException{
        String name = "%"+ request.getParameter("name") +"%";
        request.setAttribute("listProduct",jdbc.selectName(name));
        RequestDispatcher dispatcher = request.getRequestDispatcher("/view/list.jsp");
        dispatcher.forward(request, response);
    }
}
