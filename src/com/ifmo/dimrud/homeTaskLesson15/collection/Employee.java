package com.ifmo.dimrud.homeTaskLesson15.collection;

// и сортировать по:
// имени
// имени и зарплате
// имени, зарплате, возрасту и компании


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class Employee implements Comparable<Employee> {

    private String name;
    private String company;
    private int salary;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.length() < 3)
            throw new IllegalArgumentException("name is null");
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public Employee(String name, String company, int salary, int age) {
        setName(name);
        setCompany(company);
        setSalary(salary);
        setAge(age);
    }

    public void setCompany(String company) {
        if (company == null || company.length() < 3)
            throw new IllegalArgumentException("company is null");
        this.company = company;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        if (salary >= 20000 && salary <= 60000) {
            this.salary = salary;
        } else throw new IllegalArgumentException("Некорректная зп");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 21 && age <= 60) {
            this.age = age;
        } else throw new IllegalArgumentException("Возраст должен быть от 21 до 60");
    }


    // TODO: конструктор, геттеры и сеттеры

    public static List<Employee> employeeGenerator(int num) {
        // метод для создания списка объектов класса Employee
        String[] names = {"Mike", "Tom", "Alex", "John", "Peter", "Jack", "Charlie", "Max", "Jenifer", "Linda", "Elizabeth"}; // массив с именами
        String[] companies = {"Microsoft", "IBM", "Google", "General Electric", "Siemens", "Samsung", "Apple"}; // массив с названиями компаний

        List<Employee> employees = new ArrayList<>(num);

        // добавление num объектов Employee в список (employees)
        for (int i = 0; i < num; i++) {
            employees.add(new Employee(
                    names[(int) (Math.random() * names.length)],
                    companies[(int) (Math.random() * companies.length)],
                    20000 + (int) (Math.random() * ((60000 - 20000) + 1)),
                    21 + (int) (Math.random() * ((60 - 21) + 1))
            ));

        }
        return employees;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return salary == employee.salary &&
                age == employee.age &&
                Objects.equals(name, employee.name) &&
                Objects.equals(company, employee.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, company, salary, age);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        return Integer.compare(this.age, o.age);
    }
}

class AgeComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}

class CompanyComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getCompany().compareTo(o2.getCompany());
    }
}

class SalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return Integer.compare(o1.getSalary(), o2.getSalary());
    }
}
    class NameComparator implements Comparator<Employee> {

        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }
