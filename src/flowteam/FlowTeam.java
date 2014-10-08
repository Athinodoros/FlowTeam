/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package flowteam;

import java.util.ArrayList;
import load_and_save.FileHandlerStat;

/**
 *
 * @author Athinodwros
 */
public class FlowTeam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
             
        
        String p1 = "Nos,10,5,5,10";
        String p2 = "Adam,8,12,5,5";
        String p3 = "Luke,10,5,5,10";
        String p4 = "Maria,5,5,5,15";
        
        Person  per = new Person("Tom",2,8,10,10);
        
        ArrayList<String> personList = new  ArrayList<String>();
        personList.add(p1);
        personList.add(p2);
        personList.add(p3);
        personList.add(p4);
        personList.add(per.toString());
        
        ArrayList<Person> listOfPeople = new ArrayList<Person>();
        
        
        FileHandlerStat.savePersons(personList, "people.txt");
        
        ArrayList<String> fromTheDeadList= new ArrayList<String>();
        fromTheDeadList = FileHandlerStat.load("people.txt");
        if (fromTheDeadList == null) {
            System.out.println("No file found");
            
        }else{ for (String peopleString : fromTheDeadList) {
            Person tempPerson = new Person(peopleString);
            listOfPeople.add(tempPerson);
            System.out.println(peopleString);
            }
        
            for (String onePerson : fromTheDeadList) {
                System.out.println("Person: "+ onePerson.toString());
                
            }
        }
    }
    
}
