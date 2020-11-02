package com.ifmo.dimrud.homeTaskLesson15.collection;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class Index {
    public static void main(String[] args) {
        List<Employee> employees = Employee.employeeGenerator(10);

        System.out.println("Сортировка по имени:\n");

        Comparator<Employee> employeeComparator1 = new NameComparator();
        TreeSet<Employee> employeeTreeSet1 = new TreeSet<>(employeeComparator1);
        for (int i = 0; i < employees.size(); i++) {
            employeeTreeSet1.add(employees.get(i));
        }
        Iterator<Employee> iterator1 = employeeTreeSet1.descendingIterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }
        System.out.println();
        System.out.println("Сортировка по имени и зарплате:\n");

        Comparator<Employee> employeeComparator2 = new NameComparator().thenComparing(new SalaryComparator());
        TreeSet<Employee> employeeTreeSet2 = new TreeSet<>(employeeComparator2);
        for (int i = 0; i < employees.size(); i++) {
            employeeTreeSet2.add(employees.get(i));
        }
        Iterator<Employee> iterator2 = employeeTreeSet2.descendingIterator();
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }
        System.out.println();
        System.out.println("Сортировка по имени, зарплате, возрасту и компании:\n");

        Comparator<Employee> employeeComparator3 =
                new NameComparator()
                        .thenComparing(new SalaryComparator())
                        .thenComparing(new AgeComparator())
                        .thenComparing(new CompanyComparator());
        TreeSet<Employee> employeeTreeSet3 = new TreeSet<>(employeeComparator3);
        for (int i = 0; i < employees.size(); i++) {
            employeeTreeSet3.add(employees.get(i));
        }
        Iterator<Employee> iterator3 = employeeTreeSet3.descendingIterator();
        while (iterator3.hasNext()) {
            System.out.println(iterator3.next());
        }

    }
}
