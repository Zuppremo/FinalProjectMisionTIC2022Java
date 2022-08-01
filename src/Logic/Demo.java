/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

import java.util.List;

/**
 *
 * @author zuppremo
 */
public class Demo 
{
    public static void main(String[] args) 
    {
        Product noxpirinObject = new Product("210","noxpirin", 23.4, 2100);
        Product advilObject = new Product("220","Advil", 14.2, 2000);
        Product paxObject = new Product("221", "Pax", 11, 2300);

        List<Product> productList = new Product().listEverything();
        for (Product p : productList) {
            System.out.println(p);
        }
        
        System.out.println(advilObject.updateRegister());
        System.out.println(advilObject.getProduct());
                
    }
}
