package Logic;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import persistence.DBConnection;

public class Product 
{
    private String name;
    private String id;
    private double temperature;
    private double baseValue;

    public Product(){}
    public Product(String id,String nam)
    {
        name = nam;
        this.id = id;
    }

    public Product(String id,String nam, double temperature, double baseValue)
    {
        this.id = id;
        name = nam;
        this.temperature = temperature;
        this.baseValue = baseValue;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String nam)
    {
        name = nam;
    }

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public double getTemperature()
    {
        return temperature;
    }

    public void setTemperature(double temp)
    {
        temperature = temp;
    }

    public double getBaseValue(){
        return baseValue;
    }

    public void setBaseValue(double baseValue)
    {
        this.baseValue = baseValue;
    }
    
    public double calculateCostOfStorage(){
        double costOfStorage = 0;
        if(getBaseValue() > 0 || getBaseValue() <= 20){
            costOfStorage = getBaseValue() * 120 / 100;
        }
        else if (getTemperature() > 20){
            costOfStorage = getBaseValue() * 110 / 100;
        }
        return costOfStorage;
    }
    
    @Override
    public String toString()
    {
        return "nombre=" + name + ", id=" + getId() + ", temperatura=" + 
                getTemperature() + ", valorBase=" + getBaseValue();
    }
    
    public List<Product> listEverything() {
        List<Product> list = new ArrayList<Product>();
        String sqlRequest = "SELECT * FROM products;";
        DBConnection dbConnection = new DBConnection();
        ResultSet rs = dbConnection.consultarBD(sqlRequest);

        try {
            Product p;
            while (rs.next()) 
            {
                p = new Product();
                p.setId(rs.getString("id"));
                p.setName(rs.getString("name"));
                p.setTemperature(rs.getDouble("temperature"));
                p.setBaseValue(rs.getDouble("baseValue"));
                list.add(p);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return list;
    }
    
    public boolean saveRegister() {
        boolean sucess = false;
        DBConnection connection = new DBConnection();
        String sql = "INSERT INTO products(id,name,temperature,baseValue)"
                + "VALUES('" + id + "','" + name + "'," + temperature + "," + baseValue +")";
        if (connection.setAutoCommitBD(false)) {
            if (connection.insertarBD(sql)) {
                connection.commitBD();
                connection.cerrarConexion();
                sucess = true;
            } else {
                connection.rollbackBD();
                connection.cerrarConexion();
            }
        } else {
            connection.cerrarConexion();
        }

        return sucess;
    }
    
    public boolean updateRegister(){
        boolean sucess = false;
        DBConnection connection = new DBConnection();
        String sql = "UPDATE products SET id='" + id + "', name='" 
                + name +"', temperature=" + temperature + ", baseValue=" + baseValue  + " WHERE id='" + id + "';";
        
        if(connection.setAutoCommitBD(false)){
            if(connection.actualizarBD(sql))
            {
                connection.commitBD();
                connection.cerrarConexion();
                sucess = true;
            }else
            {
                connection.rollbackBD();
                connection.cerrarConexion();
            }
        }else
        {
            connection.cerrarConexion();
        }
        return sucess;
    }
    
     
    public boolean deleteRegister(){
        boolean sucess = false;
        DBConnection connection = new DBConnection();
        String sql = "DELETE FROM products WHERE id=" + id + ";";
        
        if (connection.setAutoCommitBD(false)){
            if(connection.borrarBD(sql)){
                connection.commitBD();
                connection.cerrarConexion();
                sucess = true;
            }else{
                connection.rollbackBD();
                connection.cerrarConexion();
            }
        }else{
            connection.cerrarConexion();
        }
        return sucess;
    }
    
    public Product getProduct(){
        String sqlRequest = "SELECT * FROM products WHERE ID=" + id + ";";
        DBConnection dbConnection = new DBConnection();
        ResultSet rs = dbConnection.consultarBD(sqlRequest);

        try {
            while (rs.next()) {
                this.id = (rs.getString("id"));
                this.name = (rs.getString("name"));
                this.temperature = (rs.getDouble("temperature"));
                this.baseValue = (rs.getDouble("baseValue"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally{
            dbConnection.cerrarConexion();
        }
        return this;
    }
}
