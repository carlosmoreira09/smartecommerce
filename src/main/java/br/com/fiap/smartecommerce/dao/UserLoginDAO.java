package br.com.fiap.smartecommerce.dao;

public interface UserLoginDAO {

    public boolean authenticateUser(String username, String password);
    
}
