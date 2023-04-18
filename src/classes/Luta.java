package classes;
import java.util.Random;


public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    public Luta() {

    }
    
    
    public void marcarLuta(Lutador desafiado, Lutador desafiante) {
        if (desafiado.getCategoria() == desafiante.getCategoria() && desafiado != desafiante) {
            this.aprovada = true;
            this.desafiado = desafiado;
            this.desafiante = desafiante;            
        } else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null; 
        }
    }

    public void lutar() {
        if (this.aprovada == true) {
            this.desafiado.apresentar();
            this.desafiante.apresentar();
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(2);
            if (vencedor == 0) {
                System.out.println("Empatou!");
                this.desafiado.empatarLuta();
                this.desafiante.empatarLuta();
            } else if (vencedor == 1) {
                System.out.println("O desafiado ganhou!");
                this.desafiado.ganharLuta();
                this.desafiante.perderLuta();
            }else if (vencedor == 2) {
                System.out.println("O desafiante ganhou!");
                this.desafiado.perderLuta();
                this.desafiante.ganharLuta();
            }
        }
    }



    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

}
