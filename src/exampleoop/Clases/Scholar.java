/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exampleoop.Clases;

/**
 *
 * @author Roman
 */
public class Scholar extends APeople 
{
public int age_class;
    public Scholar(String name, String surname, int age,int age_class) {
        super(name, surname, age);
        this.age_class=age_class;
    }
public    int Get_age_class(){return age_class; }
public void haracteristics(int ageclass)
{
System.out.print("This scholar in "+ageclass+"\n");
}
    @Override
    public void InfoPeople() {
       System.out.print("Name: " + super.getName() + " SurName: "+ 
                super.getSurname() + " Age_class: " + age_class+"\n");
    }
 
   
}
