package Aula09_POO;

public class Employee extends Person {

    private String office;
    private double salary;

    public Employee(String nome, String CPF, String RG, String office, double salary){
        super(nome, CPF, RG);
        this.office = office;
        this.salary = salary;
    }


    public void setOffice(String office) {
        this.office = office;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getOffice() {
        return office;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                " nome='" + name + '\'' +
                ", CPF='" + CPF + '\'' +
                ", RG='" + RG + '\'' +
                ",cargo='" + office + '\'' +
                ", salario=" + salary +
                '}';
    }
}

