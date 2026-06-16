package Diarios_de_Jogos.Menu;

import Diarios_de_Jogos.SalvarJogos.SalvarJogos;

import java.util.Scanner;

public class MenuUsuario {
    Scanner sc = new Scanner(System.in);
    public void menuInterface () {
        System.out.println("Insira o caminho do arquivo para criar");
        String path = sc.nextLine() + "\\meus_jogos.txt";

        String [] jogos = new String[5];
        System.out.println("Olá digite o nome de 5 jogos");
        for (int i = 0; i < jogos.length; i ++){
            jogos[i] = sc.nextLine();
        }
        SalvarJogos salvador = new SalvarJogos(jogos,path);
        salvador.salvarJogos();
        salvador.lerJogos();

    }
}
