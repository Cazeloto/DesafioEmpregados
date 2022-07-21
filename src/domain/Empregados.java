package domain;

import java.util.Locale;
import java.util.Scanner;

import entities.Address;
import entities.Department;
import entities.Employee;

public class Empregados {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nome do departamento : ");
		String deptName = sc.next();
		System.out.print("Dia do pagamento: ");
		int payDay = sc.nextInt();
		System.out.print("Email : ");
		String email = sc.next();
		System.out.print("Telefone : ");
		String phone = sc.next();
		System.out.print("Quantos funcionários tem o departamento? : ");
		int fte = sc.nextInt();
		
		Department dept = new Department(deptName, payDay, new Address(email, phone));
		
		for (int i = 0;i < fte; i=i+1) {
			System.out.print("Entre com dados do Funcionario " + (i+1));
			System.out.println();
			System.out.print("Nome : ");
			String nome = sc.next();
			System.out.print("Salario : ");
			double salario = sc.nextDouble();
			
			Employee emp = new Employee(nome, salario);
			dept.addEmployee(emp);
			
		}
		
	
		Department.showReport(dept);
		
		sc.close();
		
		

		
		
	}
}
