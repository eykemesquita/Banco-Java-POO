public class Main {
        public static void main(String[] args) {
            Banco bancoInicial = new Banco(); //instancia novo banco

            bancoInicial.setNome("Banco Digital"); //insere nome do banco

            Cliente eyke = new Cliente("Carla", bancoInicial);  //criado novo cliente carla
            eyke.setNome("Eyke Mesquita Teixeira"); //insere o nome do cliente

            Conta ccorrente = new ContaCorrente(eyke); //instanciada nova conta corrente

            ccorrente.depositar(100); //criado um deposito em conta corrente

            Cliente mesquita = new Cliente("Mesquita", bancoInicial);  //instancia novo cliente
            Conta cpoupanca = new ContaPoupanca(mesquita);  //instanciada nova conta poupanca

            ccorrente.imprimirExtrato();  //imprime extrato de ccorrente eyke
            cpoupanca.imprimirExtrato();  //imprime estrato de cpoupanca alisson

            ccorrente.transferir(48, cpoupanca);  //faz tranferencia de ccorrente carla pra cpoupanca alisson

            ccorrente.imprimirExtrato(); //imprime extrato atualizado de ccorrente eyke
            cpoupanca.imprimirExtrato(); //imprime extrato atualizado de cpoupanca alisson
            bancoInicial.mostrarClientes(); //mostra lista de clientes

            Cliente carolina = new Cliente("Mesquita", bancoInicial);  //instancia novo cliente mesquita
            Conta ccorrente2 = new ContaCorrente(carolina); //instancia nova ccorrente2 de mesquita
            ccorrente2.imprimirExtrato();  //imprime  ccorrente2 de mesquita
            bancoInicial.mostrarClientes(); //mostra lista atualizada de clientes do banco
        }

    }
