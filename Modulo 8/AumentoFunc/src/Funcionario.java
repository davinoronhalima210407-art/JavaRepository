public class Funcionario {

    public String Name;

    public double GrossSalary;

    public double Tax;

    public double NetSalary(){
        return GrossSalary-Tax;
    }
    public double increaseSalary(double percentage){
        return GrossSalary*(percentage/100) + (GrossSalary-Tax);
    }
}
