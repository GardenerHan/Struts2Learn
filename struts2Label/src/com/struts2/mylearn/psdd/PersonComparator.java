package com.struts2.mylearn.psdd;

import com.struts2.mylearn.domian.Student;

import java.util.Comparator;

public class PersonComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getStundentName().compareTo(o2.getStundentName());
    }
}
