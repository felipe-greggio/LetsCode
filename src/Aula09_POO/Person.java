package Aula09_POO;

public class Person {

    protected String name;
    protected String CPF;
    protected String RG;

    protected Person(String name, String CPF, String RG){
        this.name = name;
        this.CPF = CPF;
        this.RG = RG;
    }

    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected String getCPF() {
        return CPF;
    }

    protected void setCPF(String CPF) {
        this.CPF = CPF;
    }

    protected String getRG() {
        return RG;
    }

    protected void setRG(String RG) {
        this.RG = RG;
    }

    protected boolean checkCPF(String CPF){
        return this.CPF.equals(CPF);

    }
}


