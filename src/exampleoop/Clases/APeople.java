/*Привіт. Написав невеличкий приклад , так як Java не вивчав , а програмую на 
*c#. І хочу сказати, що Java мені сподобалась (простотою), ну і звичайно
*багатьма відміностями. Тому Вибачте за мінімальнсть)), часу було мало
*/
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exampleoop.Clases;                                                      //назва папки , (типу namespase в с++,с#)

import exampleoop.interfaces.CommandPeople;                                     //імпорт інтерфейсу

/**
 *
 * @author Roman
 */
public abstract class APeople implements CommandPeople                          //Створюємо абстрактний клас який наслідує інтерфейс
{
    protected int age;                                                          //доступний лише в цьому класі , або наслідниках цього класу
    private String name;                                                        //доступ лише в цьому класі
    private String surname;
    @Override                                                                   //Переозначення методів
    public String getName() { return name; }                                    //Метод з інтерфейсу 
    public String getSurname() { return surname; }                              //Метод класу щоб отримати значення , але змінити його не можна
    
    public APeople(String name, String surname,int age)                         //Конструктор
    {    
        this.name=name;
        this.surname=surname; 
        this.age=age;
    }
    public abstract void InfoPeople();                                          //Абстрактний метод
}
