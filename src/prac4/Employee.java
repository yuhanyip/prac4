/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prac4;

/**
 *
 * @author User
 */
public class Employee{
    private String name;
    private double salary;


    public Employee(){
        name = " ";
        salary = 0.0;
    }
    public Employee(String n){
        name = n;
        salary = 0.0;
    }

    public Employee(String employeeName, double currentSalary) 
    {
        name = employeeName;
        salary = currentSalary;
     }


        public void raiseSalary(double percent)
        {
        salary = salary + (salary * percent / 100.0);
         }

        public String getName() {
            return name;
        }

        public void setName(String n) {
            name = n;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double ammount) {
            salary = ammount;
        }

    }
