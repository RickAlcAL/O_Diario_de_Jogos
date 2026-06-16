package Diarios_de_Jogos.SalvarJogos;

import Diarios_de_Jogos.Enums.Execoe;

import java.io.*;
import java.util.Scanner;

public class SalvarJogos {
    //{"Valorant","League of Legends","BattleField","Resident Evil","Devil May Cry 5"}
    private final String [] lines ;
    private final String path;

    public SalvarJogos (String[] lines,String path){
        this.lines = lines;
        this.path = path;
    }
    public void salvarJogos () {

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
            for (String line : lines){
                bw.write(line);
                bw.newLine();
            }
            System.out.println(Execoe.CONFIRMADO.getMensagemUsuario());

        }catch (IOException e){
            System.out.println(Execoe.ERRO.getMensagemUsuario());
            e.printStackTrace();
        }
    }

    public void lerJogos () {
        File file = new File(path);
        try (Scanner sc = new Scanner(file)){
            while (sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
            System.out.println(Execoe.CONFIRMADO.getMensagemUsuario());
        }catch (IOException e){
            System.out.println(Execoe.ERRO.getMensagemUsuario());
            System.out.println("Erro !!!" + e.getMessage());
        }
    }
}
