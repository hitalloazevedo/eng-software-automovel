import java.sql.Time;
import java.sql.Date;

public class Locacao {
    private Date dataLocacao;
    private Time horaLocacao;
    private Date dataDevolucao;
    private Time horaDevolucao;
    private long quilometragemLocacao;
    private long quilometragemDevolucao;
    private double valorCaucao;
    private double valorLocacao;
    private boolean locacaoDevolvida;

    public Locacao(Date dataLocacao, Time horaLocacao, long quilometragemLocacao, double valorCaucao) {
        this.dataLocacao = dataLocacao;
        this.horaLocacao = horaLocacao;
        this.quilometragemLocacao = quilometragemLocacao;
        this.valorCaucao = valorCaucao;
    }

    public void setdataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public void sethoraDevolucao(Time horaDevolucao) {
        this.horaDevolucao = horaDevolucao;
    }

    public void setvalorLocacao(double valorLocacao) {
        this.valorLocacao = valorLocacao;
    }

    public void setlocacaoDevolvida(boolean locacaoDevolvida) {
        this.locacaoDevolvida = locacaoDevolvida;
    }

    public int regLoc(){
        // Nao sei o que esse metodo deveria fazer...
        return 1;
    }
    
    @Override
    public String toString() {
        return "Locacao{" + "dataLocacao=" + dataLocacao + ", horaLocacao=" + horaLocacao + ", dataDevolucao=" + dataDevolucao + ", horaDevolucao=" + horaDevolucao + ", quilometragem=" + quilometragem + ", valorCaucao=" + valorCaucao + ", valorLocacao=" + valorLocacao + ", locacaoDevolvida=" + locacaoDevolvida + '}';
    }    
}
