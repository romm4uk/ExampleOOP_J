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
public class Employer extends APeople {                                         //Клас робітник який наслідує параметри від APeople

    private int salary;
    public Employer(String name, String surname,int age,int _salary) {          //конструктор
        super(name, surname,age);
        this.salary=_salary;
    }

   
int GetSalary(){return salary;}     
    
    @Override
    public void InfoPeople() {                                                  //Переозначення методу з батьківського класу(c# virual)
      System.out.print("Name: " + super.getName() + " SurName: "+ 
              super.getSurname() + " Salary: " + salary+"\n");
    }
    
}
