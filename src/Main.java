
public class Main {
    public static void main(String[] args) {
        VeiculoTerrestre meuCarro = new Carro();
        VeculoAquatico meuBarco = new Barco();

        System.out.println("Testando carro:");
        meuCarro.ligarMotor();
        meuCarro.acelerar();
        meuCarro.buzinar();
        meuCarro.frear();
        meuCarro.desligarMotor();

        System.out.println("Testando barco:");
        meuBarco.ligarMotor();
        meuBarco.acelerar();
        meuBarco.ancorar();
        meuBarco.ancorar();
        meuBarco.frear();
        meuBarco.desligarMotor();
        }
}