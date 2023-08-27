package com.company;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Game game=new Game();
        Algorithms algorithms1=new Algorithms();
        Algorithms algorithms2=new Algorithms();
        Algorithms algorithms3=new Algorithms();
        Algorithms algorithms4=new Algorithms();
        Scanner scanner=new Scanner(System.in);
        int number;
        do {
            System.out.println("Enter -1- to display all the grids");
            System.out.println("Enter -2- to play your own game");
            System.out.println("Enter -3- to solve puzzle by bfs algorithm");
            System.out.println("Enter -4- to solve puzzle by dfs algorithm");
            System.out.println("Enter -5- to solve puzzle by Astare algorithm");
            System.out.println("Enter -6- to exite");
            number=scanner.nextInt();
            switch (number)
            {
                case 1:
                    game.printall();
                    break;
                case 2:
                    game.userPlay();
                    break;
                case 3:
                    algorithms1.bfs();
                    break;
                case 4:
                    algorithms2.dfs();
                    break;
                case 5:
                    algorithms3.Astare();
                    break;
                case 6:
                    return;
            }
        }while (number>=1&&number<=6);
    }
}
