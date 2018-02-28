/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salesperson;

/**
 *
 * @author Aldair Cruz
 */
public class SalesPerson {

    /**
     * @param args the command line arguments
     */
    
        private Integer id;
    private double ve;
    
    public SalesPerson(Integer id, double ve){
        this.id = id;
        this.ve = ve;
    }

    
    public void setId(Integer id){
        this.id = id;
    }
    
    public void setVe(double ve){
        this.ve = ve;
    }
    
    public Integer getId(){
        return this.id;
    }
    
    public double getVe(){
        return this.ve;
    }
        // TODO code application logic here
    }
    

