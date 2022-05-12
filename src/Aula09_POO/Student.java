package Aula09_POO;

import java.util.HashMap;

public class Student extends Person {

    private int age;
    private HashMap<String, Double> gradesBySubject = new HashMap<String, Double>();

    public Student(String name, String CPF, String RG, int age){
        super(name, CPF, RG);
        this.age = age;

    }


    public Student(String name, String CPF, String RG, int age, String subject, double grade){
        super(name, CPF, RG);
        this.age = age;
        this.gradesBySubject.put(subject, grade);
    }


    public void setGradesBySubject(String subject, double grade){
        this.gradesBySubject.put(subject, grade);
    }


    public void setAge(int age) {
        this.age = age;
    }

    public double gradeAverage(){
        double average;
        double sum=0;
        for(double d : gradesBySubject.values()){
            sum += d;
        }
        average = sum/ gradesBySubject.size();
        return average;
    }


    @Override
    public String toString() {
        return "Aluno{" +
                " Nome='" + name + '\'' +
                ", CPF='" + CPF + '\'' +
                ", RG='" + RG + '\'' +
                ", Idade=" + age +
                ", Notas Por Disciplina=" + gradesBySubject.toString()+
                ", Média das notas do aluno= "+ gradeAverage()+
                '}';
    }

}
