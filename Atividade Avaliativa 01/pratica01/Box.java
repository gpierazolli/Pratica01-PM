package pratica01;
import.java.ArrayList;

public class Box{
    private ArrayList<Ordem> ordemLista;
    private Ordem ordem;
    private Mecanico mecanico;
    private int numero, qntdMaxDeVeiculos;
    private String servico, localizacao;

    public Box(Ordem ordem, int numero, int qntdMaxDeVeiculos, String servico, String localizacao){
        this.ordem = ordem;
        this.numero = numero;
        this.qntdMaxDeVeiculos = qntdMaxDeVeiculos;
        this.servico = sevico;
        this.localizacao = localizacao;
    }

    public void ordensBox(){
        ordemLista.add(ordem);
    }

    public void listarOrdens(){
        System.out.println(ordemLista);
    }
}