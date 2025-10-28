package strategy;

public class Geometrica implements MediaStrategy {

    @Override
    public double calcularMedia(double P1, double p2) {
        return Math.sqrt(P1 * p2);
    }

    @Override
    public String verificarSituacao(double media) {
        if(media >= 7)
            return "Aprovado";
        return "Reprovado";
    }   

}
