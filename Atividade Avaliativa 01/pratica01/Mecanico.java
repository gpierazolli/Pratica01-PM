package pratica01;

public class Mecanico{
    private String nome, cpf, especialidade, telefone;

    public Mecanico(String nome, String cpf, String especialidade, String telefone){
        this.nome = nome;
        this.cpf = cpf;
        this.especialidade = especialidade;
        this.telefone = telefone;
    }

    public String informacoesMecanico(){
        System.out.println("Digite o nome: ");
        nome = new scanner;
        System.out.println("Digite o CPF: ");
        cpf = new scanner;
        System.out.println("Digite a especialidade: ");
        especialidade = new scanner;
        System.out.println("Digite o telefone: ");
        telefone = new scanner;
    }

    public void setNome(){
        this.nome = nome;
    }

    public void setCPF(){
        this.cpf = cpf;
    }

    public void setEspecilidade(){
        this.especialidade = especialidade;
    }

    public void setTelefone(){
        this.telefone = telefone;
    }
}