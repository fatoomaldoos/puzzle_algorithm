package com.company;

import java.util.Scanner;

public class Algorithms
{
    public Scanner scanner = new Scanner(System.in);
    public Game game = new Game();
    public int numberOfGrid;

    public void bfs()
    {
        System.out.println("please enter number from 1 to 10");
        numberOfGrid=scanner.nextInt();
        while (numberOfGrid<1||numberOfGrid>10){
            System.out.println("please enter number from 1 to 10");
            numberOfGrid=scanner.nextInt();
        }
        game.setUpdatedgrid(numberOfGrid);
        game.setinsial(numberOfGrid);
        while(!game.queue.isEmpty())
        {
            if (!game.state.isWin(game.queue.peek()))
                game.nextStateBfs(game.queue.remove());
            else break;
        }
        if (game.queue.isEmpty())
        {
            System.out.println("grid cannot solve");
        }
        else
            {
            game.queue.peek().printGrid();
            System.out.println("solved");
            }
    }
//________________________________End of bfs()____________________________________________
    public void dfs()
    {
        System.out.println("please enter number from 1 to 10");
        numberOfGrid=scanner.nextInt();
        while (numberOfGrid<1||numberOfGrid>10)
        {
            System.out.println("please enter number from 1 to 10");
            numberOfGrid=scanner.nextInt();
        }
        game.setUpdatedgrid(numberOfGrid);
        game.setinsial(numberOfGrid);
        while (!game.states.empty())
        {
            if (!game.state.isWin(game.states.peek()))
                game.nextStateDfs(game.states.pop());

            else break;

        }
        if (game.states.empty())
            System.out.println("grid cannot solve");

        else {
            game.states.peek().printGrid();
            System.out.println("solved");
        }

    }
//__________________________________End of dfs()_________________________________________
        public void Astare()
        {
            System.out.println("please enter number from 1 to 10");
            numberOfGrid=scanner.nextInt();
            while (numberOfGrid<1||numberOfGrid>10){
                System.out.println("please enter number from 1 to 10");
                numberOfGrid=scanner.nextInt();
            }
            game.setUpdatedgrid(numberOfGrid);
            game.setinsial(numberOfGrid);
            while(!game.priorityQueue.isEmpty())
            {
                if (!game.state.isWin(game.priorityQueue.peek()))
                    game.nextStateAStare(game.priorityQueue.remove());
                else break;
            }
            if (game.priorityQueue.isEmpty())
            {
                System.out.println("sorry!!this grid will not be solved");
            }
            else
            {
                game.priorityQueue.peek().printGrid();

                System.out.println("the number of node: "+game.priorityQueue.peek().step);
                System.out.println("____________Concradulation!!____________");
            }
        }
//_____________________________________End of Astare()__________________________________

}
