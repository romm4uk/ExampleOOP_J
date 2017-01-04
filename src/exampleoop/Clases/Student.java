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
public class Student extends APeople                                            //Наслідуємо параметри  APeople
{
    
private int raiting;
private String Color;
    public Student(String name, String surname,int age,int _raiting, String color) {          //конструктор
        super(name, surname,age);
        this.raiting=_raiting;
        this.Color=Color;
    }
public int GetRaiting(){return raiting;}
public void IsGrant(int rait)                                                   //Функція для визначення чи студент може мати стипендію
{                                                                               //порівнюємо вік(протектед) і рейтинг...
if(rait>10&&this.age>18)
    System.out.print("Grant Yesss\n");
else System.out.print("Grant Noo((\n");
}

public void haracteristics(int raiting,String Color)
{
System.out.print("This student with "+Color+" hair and raiting: "+raiting+"\n");
}
   @Override                                                                    
    public void InfoPeople()                                                    //Метод з абстрактного класу, ми його переозначаємо
    {
        System.out.print("Name: " + super.getName() + " SurName: "+ 
                super.getSurname() + " Raiting: " + raiting+"\n");
    }
    
}
