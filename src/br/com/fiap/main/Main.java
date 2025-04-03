package br.com.fiap.main;

import br.com.fiap.bean.DespesaFamiliar;

import java.util.Scanner;

// Isis Macedo e Andrade RM561497 | Ana clara RM.... | Theodoro
public class Main {
    public static void main(String[] args) {
        DespesaFamiliar despesas = new DespesaFamiliar();
        //declaracao dos atributos
        double rendaFamiliar;
        int numeroDeMoradores;
        double gastoComLuz;
        double gastoComAgua;
        double gastoComInternet;
        double valorMensalidadeDaAcademia;

        Scanner scan;

        try{
            scan = new Scanner(System.in);

            System.out.println("Digite o valor da sua renda familiar: ");
            rendaFamiliar = scan.nextDouble();

            System.out.println("Digite o número de moradores da casa: ");
            numeroDeMoradores = scan.nextInt();

            System.out.println("Digite o seu gasto com contas de luz: ");
            gastoComLuz = scan.nextDouble();

            System.out.println("Digite o seu gasto com contas de água: ");
            gastoComAgua = scan.nextDouble();

            System.out.println("Digite o seu gasto com contas de internet: ");
            gastoComInternet = scan.nextDouble();

            System.out.println("Digite o seu gasto com mensalidade da academia: ");
            valorMensalidadeDaAcademia = scan.nextDouble();

            despesas.rendaFamiliar = rendaFamiliar;
            despesas.numeroDeMoradores = numeroDeMoradores;
            despesas.gastoComLuz = gastoComLuz;
            despesas.gastoComAgua = gastoComAgua;
            despesas.gastoComInternet = gastoComInternet;
            despesas.valorMensalidadeDaAcademia = valorMensalidadeDaAcademia;

            // Calcula e armazena os resultados
            despesas.totalDespesas = despesas.calcularTotalDeDespesas();
            despesas.rendaFamiliarLiquida = despesas.calcularRendaFamiliarLiquida();


            System.out.printf("""
                Tabela de renda e gastos
                =========================
                Renda familiar bruta: %.3f
                Total de gastos com despesas: %.3f
                Valor da renda familiar líquida: %.3f
                ==========================
                """,
                    despesas.rendaFamiliar,
                    despesas.totalDespesas,
                    despesas.rendaFamiliarLiquida);


        } catch (RuntimeException e) {
            System.out.println("Formato inválido de numero");
        }
    }
}
