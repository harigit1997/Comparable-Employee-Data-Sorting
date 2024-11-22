package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Employee implements Comparable<Employee> {
    private String Name;
    private String Surname;
    private int age;
    private int salary;
    private float exp;

    public float getExp() {
        return exp;
    }

    public void setExp(float exp) {
        this.exp = exp;
    }

    public Employee(String name, String surname, int age, int salary, float exp) {
        Name = name;
        Surname = surname;
        this.age = age;
        this.salary =salary;
        this.exp=exp;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Name='" + Name + '\'' +
                ", Surname='" + Surname + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", exp=" + exp +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        if (this.getName().compareTo(o.getName()) == 0) {
            if(this.getSurname().compareTo(o.getSurname())==0)
            {
                if(this.getAge()- o.getAge()==0)
                {
                    return (int) (this.getExp()-o.getExp());
                }
                return this.getAge()- o.getAge();
            }
            return this.getSurname().compareTo(o.getSurname());
        }
        else
        {
            return this.getName().compareTo(o.getName());
        }
    }

    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        Employee e1 = new Employee("Vishal", "More", 26, 25000,1.5f);
        Employee e2 = new Employee("Akash", "More", 22, 30000,2.0f);
        Employee e3 = new Employee("Akshay", "Kale", 21, 23000,1.2f);
        Employee e4 = new Employee("Ajay", "Kale", 20, 29000,3.0f);
        Employee e5 = new Employee("Vishal", "Kumar", 23, 25000,1.5f);
        Employee e6 = new Employee("Ajay", "Kale", 20, 35000, 2.7f);

        list.add(e1);
        list.add(e6);
        list.add(e5);
        list.add(e3);
        list.add(e4);
        list.add(e2);




        System.out.println("Given list: ");
        System.out.println(list);
        System.out.println("Sorted list: ");
        Collections.sort(list);
        for(Employee e: list)
        {
            System.out.println(e);
        }
    }
}
