package pratica01;
import.java.util.scanner;

public Main{
    public static void Main(Strings[] args){
        Scanner scanner = new Scanner(System.in);
        //Professor, não sei nenhum tipo de especialidade de mecanico, por isso, coloquei numeros
        Mecanico mecanico01 = new Mecanico("Joao", "123.123.123-12", "Especialidade: 01", "(31)99999-9999");
        Mecanico mecanico02 = new Mecanico("Gabriel", "456.456.456-45", "Especialidade: 02", "(31)91234-1234");
        Mecanico mecanico03 = new Mecanico("Arthur", "789.789.789-78", "Especialidade: 03", "(31)95678-5678");
    
    do{
        System.out.println("--Menu--");
        System.out.println("1 - Cadastrar ordem de servico");
        System.out.println("2 - Associar um mecânico a um box");
        System.out.println("3 - Atribuir ordem de um servico a um box");
        System.out.println("4 - Ordens de um unico box");
        System.out.println("5 - Quantidade total de ordens finalizadas");
        System.out.println("6 - Buscar ordem por status");
        System.out.println("7 - Exibir detalhes de uma ordem");
        System.out.println("8 - Encerrar");

        opcao = new scanner;
        opcao.newInt();

        if (opcao == 1){
            Ordem.cadastrarInformacoes();
        }
        else if (opcao == 2){
            //FINALIZAR AQUI
        }
        else if (opcao == 3){
            Box.ordensBox();
        }
        else if (opcao == 4){
            Box.listarOrdens;
        }
        else if (opcao == 5){
            System.out.println(statusFinalizados);
        }
        else if (opcao == 6){
            //FINALIZAR AQUI
        }
        else if (opcao == 7){
            Ordem.exibirInformacoes();
        }
        else{
            System.out.println("Tente novamente com algum numero valido")
        }



    }while(opcao != 8)
    
    }
}