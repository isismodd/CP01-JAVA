package br.com.fiap.bean;
// Isis Macedo e Andrade RM561497 | Ana Clara O. Nascimento RM561957 | Theodoro S. Furtado RM566019
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
     totalDespesas = gastoComLuz + gastoComAgua + gastoComInternet + (valorMensalidadeDaAcademia * numeroDeMoradores);

      return totalDespesas;
    }

    public double calcularRendaFamiliarLiquida(){
       rendaFamiliarLiquida =  rendaFamiliar - totalDespesas;

        return rendaFamiliarLiquida;
    }
}
