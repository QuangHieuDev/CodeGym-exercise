<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: Piuta
  Date: 7/31/2020
  Time: 2:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product List</title>
</head>
<body>
<%!
    List<String> list = new ArrayList<>();
%>
<%
    list.add("Tên,Ngày sinh,Địa chỉ,Ảnh");
    list.add("Mai Văn Hoàn,1983-08-20,Hà Nôi,https://cdn.tgdd.vn/Files/2019/11/14/1218860/chup-anh-3d-la-gi-cach-chup-anh-3d-bang-dien-thoai-may-anh-don-gian-5.jpg");
    list.add("Ngauyeenx Văn Nam,1983-08-21,Bắc Giang,https://aphoto.vn/wp-content/uploads/2018/02/anh-dep-chup-dien-thoai.jpg");
    list.add("Nguyễn Thái Hòa,1983-08-22,Nam ĐỊnh,https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcTQEURqQ3MC5hCU3ntlM38RFJMOmVnfxv7ofg&usqp=CAU");
    list.add("Tần Đặng Khoa,1983-08-17,Hà tây,https://img.lovepik.com/photo/40101/7049.jpg_wh860.jpg");
    list.add("Nguyễn Đình Thi,1983-08-19,,Hà Nội,https://i.pinimg.com/736x/41/54/21/4154213c5fe8479b982eac4c0b2bcc94.jpg");

    for (String i : list){
        
    }
%>
</body>
</html>
