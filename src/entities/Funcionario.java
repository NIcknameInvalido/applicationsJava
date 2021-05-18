package entities;
public class Funcionario {
	private String name;
	private int id;
	private double salario;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	void increasySalary(int percentage) {
		this.setSalario(this.getSalario() + (this.getSalario() * percentage / 100));
	}
	
	
	
}
	

