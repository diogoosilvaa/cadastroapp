package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Veiculo {
    String modelo, marca, cor, placa, combustivel;

    double preco;

    int ano;

    /** Instancia Scanner */
    Scanner teclado = new Scanner(System.in);


    public void CadastrarVeiculo(){

        System.out.println("------Cadastro Veiculo -------");
        System.out.println("Informe a marca: ");
        marca = teclado.nextLine();
        System.out.println("informe o modelo: ");
        modelo = teclado.nextLine();
        System.out.println("informe a Cor: ");
        cor = teclado.nextLine();
        System.out.println("Informe o Combustivel: ");
        combustivel = teclado.nextLine();
        System.out.println("Informe o ano: ");
        ano =  teclado.nextInt();
        System.out.println("Informe o Preco: ");
        preco = teclado.nextDouble();
        teclado.nextLine();
        System.out.println("-------Cadastro Finalizado--------");
        System.out.println("-----------------------------------");

        teclado.close();


    }

}
