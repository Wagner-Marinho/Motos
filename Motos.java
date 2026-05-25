import java.util.Scanner;

public class Motos {

    public static void main(String[] args){

        Scanner motos = new Scanner(System.in);

        System.out.print("Digite o nome do piloto: ");
        String piloto = motos.nextLine(); //Nome do piloto

        System.out.print("Digite a sua idade: ");
        int idade = motos.nextInt();
        motos.nextLine();

            if(idade >= 18){
                System.out.println("Tem idade para conduzir moto.");
            } else {
                System.out.println("Não possui idade requisitada.");
            }

        System.out.print("Possui CNH? ");
        String cnh = motos.nextLine();

            if (cnh.equalsIgnoreCase("sim")) {
                System.out.println("Você pode conduzir moto.");
                        
            } else{
                System.out.println("Você não pode conduzir moto.");
            }

        System.out.print("Informe a Marca da Motos: ");
        String marcasMotos = motos.nextLine(); //["Bajaj"+"Yamaha"+"Honda"+"Shineray" + "Suzuki"]; Maracas das Motos

        System.out.print("Qual o modelo da Moto: ");
        String modelosMotos = motos.nextLine(); //["Pulsa150"+"Dominar160"+"Fazer"+"Titan"+"Jef160"+"DL160"+"DK160"+"NK150"]; Modelos das Motos

        System.out.print("Insira o valor da Moto: R$");
        Double preco = motos.nextDouble(); //Preços das Motos

        System.out.println("O piloto é " + piloto + ", ele escolheu a marca " + marcasMotos + " do modelo " + modelosMotos + " que custando R$" + preco);
       
        System.out.print("Deseja ligar a moto? ");
        String ligar = motos.nextLine();

            if (ligar.equalsIgnoreCase("sim")) {
                System.out.println("Moto ligada.");
            }else {
                System.out.println("Moto desligada.");
            }
        
        
        //Troca de marchas

        /*System.out.print("Qual a marcha atual: ");
        int marchas = motos.nextInt(); //Marchas das Motos*/


        //Escolha das velocidades

        int marchaAtual = 0;
        int velocidadeAtual = 0;
        boolean continuarPilotando = true;

        while (continuarPilotando) {
            System.out.println("PAINEL DA MOTO:");
            System.out.println("Marcha " + (marchaAtual == 0 ? "Neutro" : marchaAtual));
            System.out.println("Velocidade: " + velocidadeAtual + " km/h");

            System.out.println("1 - Subir uma marcha");;
            System.out.println("2 - Acelerar");
            System.out.println("3 - Reduzir marcha / Frear");
            System.out.println("4 - Desligar a moto");
            System.out.println("Outra opção: ");

            int opcao = motos.nextInt();

            if (opcao == 1) {
                if (marchaAtual < 5) {
                    marchaAtual++;
                    System.out.println("Você mudou para a " + marchaAtual + "ª marcha!");
                } else {
                    System.out.println("Você já está na marcha máxima (5ª)!");
                }
            } else if (opcao == 2) {
                if (marchaAtual == 0) {
                    System.out.println("A moto está no neutro! Você acelerou, mas não saiu do lugar.");
                    
                }else if (marchaAtual == 1) {
                    System.out.println("Informe a velocidade para a 1ª marcha: ");
                    int novaVelocidade = motos.nextInt();

                    if (novaVelocidade <= 15) {
                        velocidadeAtual = novaVelocidade;
                        System.out.println("Moto andando suavemente na 1ª marcha.");
                    } else {
                        System.out.println("Você acelerou demais para a 1ª marcha! A moto estancou e voltou para o neutro.");
                        velocidadeAtual = 0;
                        marchaAtual = 0;
                    } 
                }else {
                    //Para marchas maiores (2, 3, 4, 5) apenas aumenta a velocidade livremente neste exemplo
                    System.out.print("Pa qual velocidade quer ir? ");
                    velocidadeAtual = motos.nextInt();
                    System.out.println("Velocidade atualizada!");
                }
            } else if (opcao == 3) {
                // Reduzir marcha e velocidade
                if (marchaAtual > 0) {
                    marchaAtual--;
                    velocidadeAtual = Math.max(0, velocidadeAtual - 15); //Reduz um pouco a velocidade ao reduzir a marcha
                } else {
                    System.out.println("Você já está no neutro.");
                }
            } else if (opcao == 4) {
                // Condições de parada do loop
                System.out.println("Desligando a moto... Até a próxima viagem!");
                continuarPilotando = false; // Isso faz o loop terminar na próxima verificação
            } else {
                System.out.println("Opção inválida! Escolha um número de 1 à 4.");
            }
        
        }
        motos.close();
    }
        /*System.out.print("Informe a sua velocidade: ");
        int velocidade = motos.nextInt(); //Velocidades das Motos

            if (marchas == 1 && velocidade <= 6) {
                System.out.println("Moto saindo do ponto de partida.");
            }else {
                System.out.println("Você estancou a moto");
            }*/

        //Controle/Informação da quantidade de combustível

        /*System.out.print("Informe a quantidade de combustível no tanque: ");
        int combustivel = motos.nextInt(); //Quantidade de combustível */

    }