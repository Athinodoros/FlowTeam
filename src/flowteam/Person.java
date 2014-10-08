/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package flowteam;

/**
 *
 * @author Athinodwros
 */
public class Person {
    private String name;
    private int admin;
    private int finisher;
    private int analyzer;
    private int creator; 

    public Person(String name, int admin, int finisher, int analyzer, int creator) {
        this.name = name;
        this.admin = admin;
        this.finisher = finisher;
        this.analyzer = analyzer;
        this.creator = creator;
    }

    public Person(String fullString) {
       
        String[] splited = fullString.split(",");//seperate by commas
                name= splited[0];
                admin= Integer.parseInt(splited[1]);
                finisher= Integer.parseInt(splited[2]);
                analyzer= Integer.parseInt(splited[3]);
                creator= Integer.parseInt(splited[4]);
    }
    

    public String getName() {
        return name;
    }

    public int getAdmin() {
        return admin;
    }

    public int getFinisher() {
        return finisher;
    }

    public int getAnalyzer() {
        return analyzer;
    }

    public int getCreator() {
        return creator;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAdmin(int admin) {
        this.admin = admin;
    }

    public void setFinisher(int finisher) {
        this.finisher = finisher;
    }

    public void setAnalyzer(int analyzer) {
        this.analyzer = analyzer;
    }

    public void setCreator(int creator) {
        this.creator = creator;
    }

    @Override
    public String toString() {
        return name + "," + admin + "," + finisher + "," + analyzer + "," + creator ;
    }
    
    
}
