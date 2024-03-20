package com.example.jdk_test_hana;
public class JDKTest {
    public static void main(String[] args) {
        MyProxy jdkProxy = new MyProxy();
        UserDao userDao = new UserDaoImpl();
        UserDao userDao1 = (UserDao) jdkProxy.createProxy(userDao);
        userDao1.addUser();
        userDao1.deleteUser();
    }
}