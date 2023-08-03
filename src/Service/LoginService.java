/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

/**
 *
 * @author max
 */
import java.sql.SQLException;

public interface LoginService {
    boolean login(String username, String password) throws SQLException;
}

