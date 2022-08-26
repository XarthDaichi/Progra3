/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll.logic;

import java.util.HashMap;

/**
 *
 * @author Escinf
 */
public class Service {
    public static HashMap<String,Employee> employees = new HashMap<String,Employee>();
    
    public static Employee buscar(String ssn){
        return employees.get(ssn);
    }
    
    public static void agregar(Employee e){
        employees.put(e.getSocialSecurityNumber(), e);
    }
}
