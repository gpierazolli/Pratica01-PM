package pratica01;

public class Ordem{
    private String codigo, nomeCliente, modeloVeiculo, placaVeiculo, status, data;
    private double valorEstimado;
    public statusFinalizados = 0;
    
    public Ordem(String codigo, String nomeCliente, String modeloVeiculo, String placaVeiculo, String status, String data, double valorEstimado){
        this.codigo = codigo;
        this.nomeCliente = nomeCliente;
        this.modeloVeiculo = modeloVeiculo;
        this.placaVeiculo = placaVeiculo;
        this.status = status;
        this.valorEstimado = valorEstimado;

    }

    public String cadastrarInformacoes(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o codigo: ");
        codigo = new scanner;
        System.out.println("Digite o nome do cliente: ");
        nomeCliente = new scanner;
        System.out.println("Digite o modelo do veiculo: ");
        modeloVeiculo = new scanner;
        System.out.println("Digite a placa do veiculo: ");
        placaVeiculo = new scanner;
        System.out.println("Digite o status (aberta, em execucao, finalizada): ");
        status = new scanner;

        if (status == "finalizada"){
            statusFinalizados =+ 1;
        }
        else {
            break;
        }

        System.out.println("Digite a data (dd/mm/aaaa): ");
        data = new scanner;
        System.out.println("Digite o valor estimado: ");
        valorEstimado = new scanner;
    }

    public void setCodigo(){
        this.codigo = codigo;
    }

    public void setNomeCliente(){
        this.nomeCliente = nomeCliente;
    }

    public void setModeloVeiculo(){
        this.modeloVeiculo = modeloVeiculo;
    }

    public void setPlacaVeiculo(){
        this.placaVeiculo = placaVeiculo;
    }

    public void setStatus(){
        this.status = status;
    }

    public void setData(){
        this.data = data;
    }

    public void ValorEstimado(){
        this.valorEstimado = valorEstimado;
    }

    public String getCodigo(){
        return codigo;
    }

    public String getNomeCliente(){
        return nomeCliente;
    }

    public String getModeloVeiculo(){
        return modeloVeiculo;
    }

    public String getPlacaVeiculo(){
        return placaVeiculo;
    }

    public String getStatus(){
        return status;
    }

    public String getData(){
        return data;
    }

    public void exibirInformacoes(){
        System.out.println(codigo);
        System.out.println(nomeCliente);
        System.out.println(modeloVeiculo);
        System.out.println(placaVeiculo);
        System.out.println(status);
        System.out.println(data);
    }
}