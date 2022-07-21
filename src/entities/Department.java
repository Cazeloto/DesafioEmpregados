package entities;

import java.util.ArrayList;
import java.util.List;

public class Department {

	private String name;
	private Integer payDay;

	private Address adddres;
	private static List<Employee> employees = new ArrayList<>();

	public Department() {
	}

	public Department(String name, Integer payDay, Address adddres) {
		this.name = name;
		this.payDay = payDay;
		this.adddres = adddres;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPayDay() {
		return payDay;
	}

	public void setPayDay(Integer payDay) {
		this.payDay = payDay;
	}

	public Address getAdddres() {
		return adddres;
	}

	public void setAdddres(Address adddres) {
		this.adddres = adddres;
	}

	public void addEmployee(Employee fte) {
		employees.add(fte);
		return;
	}

	public void removeEmployee(Employee fte) {
		employees.remove(fte);
	}

	public double payRoll() {
		double sum = 0;
		for (Employee emp : employees) {
			sum = sum + emp.getSalary();
		}
		return sum;
	}

	public static void showReport(Department dept) {
		
		System.out.println("FOLHA DE PAGAMENTOS");
		System.out.println();
		double folhaTotal = dept.payRoll();
		
		System.out.print("DEPARTAMENTO               : " + dept.getName()+ " = R$ " + String.format("%,.2f",folhaTotal) );
		System.out.println();
		System.out.print("PAGAMENTO REALIZADO NO DIA : " + dept.getPayDay());
		System.out.println();
		System.out.println("FUNCIONÁRIOS               : ");
		System.out.println();
		
		for (Employee emp : employees) {
			
			System.out.println(emp.getName());
		
		}
		System.out.println("Para dúvidas favor entrar em contato: " + dept.getAdddres().getEmail());
	}


	@Override
	public String toString() {
		return "Department [name=" + name + ", payDay=" + payDay + ", adddres=" + adddres + ", employees=" + employees
				+ "]";
	}

}
