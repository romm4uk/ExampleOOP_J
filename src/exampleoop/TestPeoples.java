package exampleoop;

import exampleoop.Clases.APeople;                                               //імпортуємо паки(namespace еквівалентно)
import exampleoop.Clases.Employer;
import exampleoop.Clases.Scholar;
import exampleoop.Clases.Student;
import exampleoop.interfaces.CommandPeople;
import java.util.ArrayList;
import java.util.List;


public class TestPeoples                                                        //Головний класи програми
{
    public static void main(String[] args)                                      //Основний метод, відправна точка виконання
  {
    Employer emp= new Employer("Roman","Kyryliuk",22,1000);                     //Створюємо обєкт класу і ініціалізуємо його
    emp.InfoPeople();                                                           //Викликаємо метод для виведення інформації про обєкти класу
     
    Student peop=new Student("Vova","Putin",50,12,"Red");                             //Створюємо обєкт класу і ініціалізуємо його
    peop.InfoPeople();
    peop.IsGrant(peop.GetRaiting());                                            //Викликаємо метод для рейтингу студента і передаємо параметр рейтингу 

        APeople people_test = new Employer("Roman","Kyryliuk",20,999);          //Обєкти одного типу можуть можуть мати методи по різному реалізовані
        System.out.println("Created Employer surName: " + 
                people_test.getSurname());
        
        people_test = new Student("Vova","Putin",22,9,"Black");
        System.out.println("Created Student SurName: " + 
                people_test.getSurname());
        
       // people_test = new APeople();
       //System.out.println("Created Base class, Surname: " + 
       //people_test.getSurname());                                             //Абстрактний клас не може бути ініціалізований тому що він абстрактний)!
        
        CommandPeople inter=new Student("Vova","Putin",22,9,"White");                   //Створюємо обєкт інтерфейсу
        System.out.println("Using implemented method: " + inter.getName());     //метод getName томуу , що він реалізований в інтерфейсі, доступу до getSurname немає
       
        inter=new Employer("Roman","Kyryliuk",22,1000);                         //тип інтерфейс створюємо робітника
        System.out.println("Using implemented method: " + inter.getName());
        
        System.out.println("Інший приклад поліморфізму"+"\n");
     //Приклад поліморфізму 
     //Функції не переозначені а перегружені, знову ж таки це напевно простий приклад
        List<APeople> listAPeople;                                              //створюємо список однотипних обєктів
        listAPeople = new ArrayList<>();
        listAPeople.add(new Employer("Roman","Kyryliuk",20,0));                 //ініціалізуємо
        listAPeople.add(new Student("Vova","Putin",22,77,"Black"));
        listAPeople.add(new Scholar("Adrian","Smit",16,8));
        for(APeople element:listAPeople)
        {
        element.haracteristics();                                               //до обєкту застосовуємо один і той же метод який в кожного обєкта працює по свойму
        }
  }
} 