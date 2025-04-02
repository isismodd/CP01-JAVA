package br.com.fiap.bean;
// Isis Macedo e Andrade RM561497 | Ana clara RM.... | Theodoro ... RM...
public class DespesaFamiliar {
    // Atributos
    public double rendaFamiliar;
    public int numeroDeMoradores;
    public double gastoComLuz;
    public double gastoComAgua;
    public double gastoComInternet;
    public double valorMensalidadeDaAcademia;
    public double totalDespesas;
    public double rendaFamiliarLiquida;

    // Metodos
    public double calcularTotalDeDespesas(){
     double totalDespesas = gastoComLuz + gastoComAgua + gastoComInternet + (valorMensalidadeDaAcademia * numeroDeMoradores);

      return totalDespesas;
    }

    public double calcularRendaFamiliarLiquida(double totalDespesas, double rendaFamiliar){
       double rendaFamiliarLiquida = totalDespesas - rendaFamiliar;

        return rendaFamiliarLiquida;
    }
}
