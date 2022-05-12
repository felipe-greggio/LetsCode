package Aula09_POO;

import java.util.*;

public class Teacher extends Employee {


    private List<String> subjects = new ArrayList<String>();
    private List<String> classes = new ArrayList<String>();


    public Teacher(String name, String CPF, String RG, double salary){
        super(name, CPF, RG, "Professor", salary);
    }

    public Teacher(String name, String CPF, String RG, double salary, List<String> subjects, List<String> classes){
        super(name, CPF, RG, "Professor", salary);
        this.subjects = subjects;
        this. classes = classes;
    }


    private String getSubjectsString() {
        String listSubjects ="";
        for(String d : subjects){
            listSubjects = listSubjects+" "+d;
        }
        return listSubjects;
    }

    private String getClassesString() {
        String listClasses ="";
        for(String t : classes){
            listClasses = listClasses+" "+t;
        }
        return listClasses;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    public void addSubject(String subject){
        if (this.subjects.contains(subject)){
            return;
        }
        this.subjects.add(subject);
    }

    public void setClasses(List<String> classes) {
        this.classes = classes;
    }

    public void addClass(String turma){
        if (this.classes.contains(turma)){
            return;
        }
        this.classes.add(turma);
    }

    @Override
    public String toString() {
        return "Professor{" +
                " nome='" + name + '\'' +
                ", CPF='" + CPF + '\'' +
                ", RG='" + RG + '\'' +
                ", salario=" + getSalary() +
                ", disciplinas= [" + subjects.toString()+"/////////"+ this.getSubjectsString() +"]"+
                ", turmas= [" + this.getClassesString() + "] }";
    }
}
