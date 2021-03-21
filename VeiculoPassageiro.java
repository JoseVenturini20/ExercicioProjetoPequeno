public class VeiculoPassageiro implements Veiculo {
    public String placa;
    public String marca;
    public String modelo;
    public Integer ano;
    public Double valor;
    public Integer nroPass;

    public VeiculoPassageiro(String placa, String marca, String modelo, Integer ano, Double valor, Integer nroPass) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.valor = valor;
        this.nroPass = nroPass;
    }

    @Override
    public String toString() {
        String aux = "Placa: " + placa + " Marca: " + marca + " Modelo: " + modelo + " Ano: " + ano + " Valor: " + valor
                + " Numero de passageiros " + nroPass;
        return aux;
    }
}
