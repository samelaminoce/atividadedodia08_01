package atividadesdodia08;

import java.util.Scanner;

public class Atividadesdodia08_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Exercicio 01: Dado o fluxograma desenvolva o algoritimo.
		
Scanner leia = new Scanner(System.in);
double salario, abono, novosalario;

System.out.println("Digite seu salário:");
salario = leia.nextDouble();

System.out.println("Digite seu abono:");
abono = leia.nextDouble();

novosalario = salario + abono;

System.out.println("Novo salário:" + novosalario);



	}

}
