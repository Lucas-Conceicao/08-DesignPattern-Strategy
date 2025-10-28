package strategy;

public class Aritmetica implements MediaStrategy  {

    @Override
    public double calcularMedia(double P1, double p2) {
        return (P1 + p2) / 2;
    }

    @Override
    public String verificarSituacao(double media) {
        if (media >= 5) 
            return "Aprovado";
        return "Reprovado";
    }
}
