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
    public Student(String name, String surname,int age,int _raiting) {          //конструктор
        super(name, surname,age);
        this.raiting=_raiting;
    }
public int GetRaiting(){return raiting;}
public void IsGrant(int rait)                                                   //Функція для визначення чи студент може мати стипендію
{                                                                               //порівнюємо вік(протектед) і рейтинг...
if(rait>10&&this.age>18)
    System.out.print("Grant Yesss\n");
else System.out.print("Grant Noo((\n");
}
   @Override                                                                    
    public void InfoPeople()                                                    //Метод з абстрактного класу, ми його переозначаємо
    {
        System.out.print("Name: " + super.getName() + " SurName: "+ 
                super.getSurname() + " Raiting: " + raiting+"\n");
    }
    
}
