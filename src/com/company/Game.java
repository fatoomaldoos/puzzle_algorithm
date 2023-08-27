package com.company;
import java.util.*;

enum Side
{
    RIGHT,LEFT,UP,DOWN
}
public class Game
{
    public Side side;
    public Grid[]myGrid=new Grid[16];
    public ArrayList<Grid>myList=new ArrayList<>();
    public ArrayList <Grid> allstates = new ArrayList <>();
    public Queue<Grid> queue = new LinkedList<Grid>();
    public Stack<Grid> states=new Stack <Grid> ();
    public PriorityQueue<Grid>priorityQueue=new PriorityQueue<>();
    public Grid insial = new Grid();
    public Grid updatedgrid = new Grid();
    public State state=new State();

    public Grid grid_1=new Grid();
    public Grid grid_2=new Grid();
    public Grid grid_3=new Grid();
    public Grid grid_4=new Grid();
    public Grid grid_5=new Grid();
    public Grid grid_6=new Grid();
    public Grid grid_7=new Grid();
    public Grid grid_8=new Grid();
    public Grid grid_9=new Grid();
    public Grid grid_10=new Grid();
    public Grid grid_11=new Grid();
    public Grid grid_12=new Grid();
    public Grid grid_13=new Grid();
    public Grid grid_14=new Grid();
    public Grid grid_15=new Grid();


    public Game()
    {
        Type i=Type.HAVE_GOAL;
        Type j=Type.NOT_HAVE_GOAL;
        grid_1.list_grid[0][1]=new Shape(i.HAVE_GOAL,1);
        grid_1.list_grid[0][2]=new Shape(j.NOT_HAVE_GOAL,2);
        grid_1.list_grid[1][0]=new Shape(j.NOT_HAVE_GOAL,3);
        grid_1.list_grid[1][1]=new Shape(j.NOT_HAVE_GOAL,2);
        grid_1.list_grid[1][2]=new Shape(j.NOT_HAVE_GOAL,2);
        grid_1.list_grid[1][3]=new Shape(j.NOT_HAVE_GOAL,6);
        grid_1.list_grid[2][0]=new Shape(j.NOT_HAVE_GOAL,4);
        grid_1.list_grid[2][1]=new Shape(j.NOT_HAVE_GOAL,4);
        grid_1.list_grid[2][2]=new Shape(j.NOT_HAVE_GOAL,2);
        grid_1.list_grid[2][3]=new Shape(j.NOT_HAVE_GOAL,5);
        grid_1.list_grid[3][2]=new Shape(j.NOT_HAVE_GOAL,5);
        grid_1.list_grid[3][3]=new Shape(j.NOT_HAVE_GOAL,5);
        myList.add(grid_1);
        grid_1.manhattanDistance=this.manhattenDistance(grid_1);
        grid_1.comp=this.comp(grid_1);
//________________________________________________________________
        grid_2.list_grid[0][0]=new Shape(i.HAVE_GOAL,1);
        grid_2.list_grid[0][2]=new Shape(j.NOT_HAVE_GOAL,2);
        grid_2.list_grid[0][3]=new Shape(j.NOT_HAVE_GOAL,2);
        grid_2.list_grid[1][0]=new Shape(i.NOT_HAVE_GOAL,1);
        grid_2.list_grid[1][2]=new Shape(j.NOT_HAVE_GOAL,3);
        grid_2.list_grid[2][0]=new Shape(j.NOT_HAVE_GOAL,4);
        grid_2.list_grid[2][1]=new Shape(j.NOT_HAVE_GOAL,5);
        grid_2.list_grid[2][2]=new Shape(j.NOT_HAVE_GOAL,3);
        grid_2.list_grid[3][1]=new Shape(j.NOT_HAVE_GOAL,4);
        grid_2.list_grid[3][2]=new Shape(j.NOT_HAVE_GOAL,4);
        myList.add(grid_2);
        grid_2.manhattanDistance=this.manhattenDistance(grid_2);
        grid_2.comp=this.comp(grid_2);
//_________________________________________________________________
        grid_3.list_grid[0][2]=new Shape(i.NOT_HAVE_GOAL,1);
        grid_3.list_grid[0][3]=new Shape(i.HAVE_GOAL,1);
        grid_3.list_grid[1][0]=new Shape(j.NOT_HAVE_GOAL,2);
        grid_3.list_grid[1][1]=new Shape(i.NOT_HAVE_GOAL,2);
        grid_3.list_grid[1][3]=new Shape(i.NOT_HAVE_GOAL,1);
        grid_3.list_grid[2][1]=new Shape(j.NOT_HAVE_GOAL,3);
        grid_3.list_grid[2][2]=new Shape(j.NOT_HAVE_GOAL,4);
        grid_3.list_grid[3][0]=new Shape(j.NOT_HAVE_GOAL,3);
        grid_3.list_grid[3][1]=new Shape(j.NOT_HAVE_GOAL,3);
        grid_3.list_grid[3][2]=new Shape(j.NOT_HAVE_GOAL,4);
        myList.add(grid_3);
        grid_3.manhattanDistance=this.manhattenDistance(grid_3);
        grid_3.comp=this.comp(grid_3);

//_________________________________________________________________
        grid_4.list_grid[1][0]=new Shape(i.NOT_HAVE_GOAL,1);
        grid_4.list_grid[1][2]=new Shape(j.NOT_HAVE_GOAL,2);
        grid_4.list_grid[2][0]=new Shape(i.NOT_HAVE_GOAL,1);
        grid_4.list_grid[2][1]=new Shape(i.HAVE_GOAL,1);
        grid_4.list_grid[2][2]=new Shape(j.NOT_HAVE_GOAL,2);
        grid_4.list_grid[2][3]=new Shape(j.NOT_HAVE_GOAL,2);
        grid_4.list_grid[3][1]=new Shape(j.NOT_HAVE_GOAL,3);
        grid_4.list_grid[3][2]=new Shape(j.NOT_HAVE_GOAL,3);
        grid_4.list_grid[3][3]=new Shape(j.NOT_HAVE_GOAL,2);
        myList.add(grid_4);
        grid_4.manhattanDistance=this.manhattenDistance(grid_4);
        grid_4.comp=this.comp(grid_4);

//__________________________________________________________________
        grid_5.list_grid[0][0]=new Shape(i.NOT_HAVE_GOAL,1);
        grid_5.list_grid[0][1]=new Shape(i.NOT_HAVE_GOAL,1);
        grid_5.list_grid[0][2]=new Shape(i.NOT_HAVE_GOAL,1);
        grid_5.list_grid[1][0]=new Shape(i.NOT_HAVE_GOAL,1);
        grid_5.list_grid[1][1]=new Shape(j.NOT_HAVE_GOAL,2);
        grid_5.list_grid[1][2]=new Shape(j.NOT_HAVE_GOAL,1);
        grid_5.list_grid[2][0]=new Shape(j.NOT_HAVE_GOAL,2);
        grid_5.list_grid[2][1]=new Shape(j.NOT_HAVE_GOAL,2);
        grid_5.list_grid[2][2]=new Shape(i.HAVE_GOAL,1);
        myList.add(grid_5);
        grid_5.manhattanDistance=this.manhattenDistance(grid_5);
        grid_5.comp=this.comp(grid_5);

//__________________________________________________________________
        grid_6.list_grid[0][0]=new Shape(i.HAVE_GOAL,1);
        grid_6.list_grid[0][1]=new Shape(i.NOT_HAVE_GOAL,2);
        grid_6.list_grid[0][2]=new Shape(i.NOT_HAVE_GOAL,2);
        grid_6.list_grid[0][3]=new Shape(i.NOT_HAVE_GOAL,2);
        grid_6.list_grid[1][0]=new Shape(i.NOT_HAVE_GOAL,2);
        grid_6.list_grid[1][1]=new Shape(i.NOT_HAVE_GOAL,2);
        grid_6.list_grid[1][2]=new Shape(i.NOT_HAVE_GOAL,2);
        grid_6.list_grid[1][3]=new Shape(i.NOT_HAVE_GOAL,2);
        grid_6.list_grid[2][0]=new Shape(i.NOT_HAVE_GOAL,2);
        grid_6.list_grid[2][1]=new Shape(i.NOT_HAVE_GOAL,2);
        grid_6.list_grid[2][2]=new Shape(i.NOT_HAVE_GOAL,2);
        grid_6.list_grid[2][3]=new Shape(i.NOT_HAVE_GOAL,2);
        grid_6.list_grid[3][0]=new Shape(i.NOT_HAVE_GOAL,2);
        grid_6.list_grid[3][1]=new Shape(i.NOT_HAVE_GOAL,2);
        grid_6.list_grid[3][2]=new Shape(i.NOT_HAVE_GOAL,2);
        myList.add(grid_6);
        grid_6.manhattanDistance=this.manhattenDistance(grid_6);
        grid_6.comp=this.comp(grid_6);

//_________________________________________________________________
        grid_7.list_grid[3][3]=new Shape(i.HAVE_GOAL,1);
        myList.add(grid_7);
        grid_7.manhattanDistance=this.manhattenDistance(grid_7);
        grid_7.comp=this.comp(grid_7);

//__________________________________________________________________
        grid_8.list_grid[0][0]=new Shape(i.NOT_HAVE_GOAL,2);
        grid_8.list_grid[0][1]=new Shape(i.NOT_HAVE_GOAL,2);
        grid_8.list_grid[0][2]=new Shape(i.NOT_HAVE_GOAL,2);
        grid_8.list_grid[0][3]=new Shape(i.NOT_HAVE_GOAL,2);
        grid_8.list_grid[1][0]=new Shape(i.NOT_HAVE_GOAL,2);
        grid_8.list_grid[1][1]=new Shape(i.NOT_HAVE_GOAL,2);
        grid_8.list_grid[1][2]=new Shape(i.NOT_HAVE_GOAL,2);
        grid_8.list_grid[1][3]=new Shape(i.NOT_HAVE_GOAL,2);
        grid_8.list_grid[2][0]=new Shape(i.NOT_HAVE_GOAL,2);
        grid_8.list_grid[2][2]=new Shape(i.NOT_HAVE_GOAL,1);
        grid_8.list_grid[2][3]=new Shape(i.HAVE_GOAL,1);
        grid_8.list_grid[3][0]=new Shape(i.NOT_HAVE_GOAL,2);
        grid_8.list_grid[3][1]=new Shape(i.NOT_HAVE_GOAL,2);
        myList.add(grid_8);
        grid_8.manhattanDistance=this.manhattenDistance(grid_8);
        grid_8.comp=this.comp(grid_8);

//_______________________________________________________________________
        grid_9.list_grid[0][0]=new Shape(i.NOT_HAVE_GOAL,2);
        grid_9.list_grid[0][1]=new Shape(i.NOT_HAVE_GOAL,2);
        grid_9.list_grid[0][2]=new Shape(i.NOT_HAVE_GOAL,2);
        grid_9.list_grid[0][3]=new Shape(i.NOT_HAVE_GOAL,3);
        grid_9.list_grid[1][0]=new Shape(i.NOT_HAVE_GOAL,3);
        grid_9.list_grid[1][1]=new Shape(i.NOT_HAVE_GOAL,4);
        grid_9.list_grid[1][2]=new Shape(i.NOT_HAVE_GOAL,2);
        grid_9.list_grid[1][3]=new Shape(i.NOT_HAVE_GOAL,2);
        grid_9.list_grid[2][0]=new Shape(i.NOT_HAVE_GOAL,4);
        grid_9.list_grid[2][2]=new Shape(i.NOT_HAVE_GOAL,1);
        grid_9.list_grid[2][3]=new Shape(i.HAVE_GOAL,1);
        grid_9.list_grid[3][0]=new Shape(i.NOT_HAVE_GOAL,1);
        grid_9.list_grid[3][1]=new Shape(i.NOT_HAVE_GOAL,1);
        myList.add(grid_9);
        grid_9.manhattanDistance=this.manhattenDistance(grid_9);
        grid_9.comp=this.comp(grid_9);

//_________________________________________________________________________
        grid_10.list_grid[0][0]=new Shape(i.NOT_HAVE_GOAL,1);
        grid_10.list_grid[0][1]=new Shape(i.NOT_HAVE_GOAL,1);
        grid_10.list_grid[0][2]=new Shape(i.NOT_HAVE_GOAL,2);
        grid_10.list_grid[0][3]=new Shape(i.NOT_HAVE_GOAL,3);
        grid_10.list_grid[1][0]=new Shape(i.NOT_HAVE_GOAL,3);
        grid_10.list_grid[1][1]=new Shape(i.NOT_HAVE_GOAL,4);
        grid_10.list_grid[1][2]=new Shape(i.NOT_HAVE_GOAL,2);
        grid_10.list_grid[1][3]=new Shape(i.NOT_HAVE_GOAL,2);
        grid_10.list_grid[2][0]=new Shape(i.NOT_HAVE_GOAL,4);
        grid_10.list_grid[2][2]=new Shape(i.NOT_HAVE_GOAL,1);
        grid_10.list_grid[2][3]=new Shape(i.NOT_HAVE_GOAL,1);
        grid_10.list_grid[3][0]=new Shape(i.HAVE_GOAL,1);
        grid_10.list_grid[3][1]=new Shape(i.NOT_HAVE_GOAL,1);
        myList.add(grid_10);
        grid_10.manhattanDistance=this.manhattenDistance(grid_10);
        grid_10.comp=this.comp(grid_10);
    }
//___________________________End of constructor___________________________________
    public void printall()
    {
        for (int i=0 ;i<myList.size();i++)
        {
            System.out.println("grid number :"+(i+1));
            myList.get(i).printGrid();
            System.out.println("__________________________________________");
        }
    }

//______________________________End of printall()___________________________________

    public void setUpdatedgrid(int numberOfGrid) {
        for (int i=0 ; i<4 ;i ++){
            for (int j=0;j<4;j++){
                updatedgrid.list_grid[i][j]=myList.get(numberOfGrid-1).list_grid[i][j];
            }
        }
    }
//_______________________________End of setUpdatedgrid()______________________________
        public boolean checknum (int mark , Grid grid){
            grid.printGrid();
            boolean result = false;
            for (int i=0 ;i<4;i++){
                for(int j=0;j<4;j++){
                    if (grid.list_grid[i][j]!=null &&
                        grid.list_grid[i][j].mark==mark){
                        result = true;
                        break;
                    }

                }
            }
            return result;
        }
//______________________________End of checknum()__________________________________________
    public void setinsial(int numberOfGrid)
    {
        if (myList.get(numberOfGrid - 1) != null)
        {
            states.push(myList.get(numberOfGrid - 1));
            queue.add(myList.get(numberOfGrid - 1));
            allstates.add(myList.get(numberOfGrid - 1));
            priorityQueue.add(myList.get(numberOfGrid - 1));
        }
    }
//_____________________________End of setinsial()_______________________________________
    public void userPlay()
    {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        int numberOfGrid=0;
        System.out.println("please enter the number of grid: ");
        numberOfGrid=scanner.nextInt();
        while (numberOfGrid<1||numberOfGrid>10){
            System.out.println("please enter number from 1 to 10");
            numberOfGrid=scanner.nextInt();
        }
        this.setUpdatedgrid(numberOfGrid);
        this.updatedgrid.printGrid();

        do{
            System.out.println("enter the number of shape to move");
            int mark;
            mark=scanner.nextInt();
            while (this.checknum(mark, this.updatedgrid)==false)
            {
                System.out.println("enter the number of shape from the grid");
                mark=scanner.nextInt();
            }
            char direction;
            System.out.println("enter the direction");
            direction=scanner1.next().charAt(0);
            while(direction!='l' && direction!='r' && direction!='u' && direction!='d'){
                System.out.println("enter the direction");
                direction=scanner1.next().charAt(0);
            }
            if (direction=='l'){
                if(this.state.canMove(this.updatedgrid, mark, side.LEFT)){
                    System.out.println("pass");
                    this.updatedgrid=this.state.move(mark, this.updatedgrid, side.LEFT);
                    this.updatedgrid.printGrid();
                }
                else {System.out.println("you cant move .. please choose another sdie");}
            }
            if (direction=='r'){
                if(this.state.canMove(this.updatedgrid, mark, side.RIGHT)){
                    System.out.println("pass");
                    this.updatedgrid=this.state.move(mark, this.updatedgrid, side.RIGHT);
                    this.updatedgrid.printGrid();
                }
                else {System.out.println("you cant move .. please choose another sdie");}
            }
            if (direction=='u'){
                if(this.state.canMove(this.updatedgrid, mark, side.UP)){
                    System.out.println("pass");
                    this.updatedgrid= this.state.move(mark, this.updatedgrid, side.UP);
                    this.updatedgrid.printGrid();
                }
                else {System.out.println("you cant move .. please choose another sdie");}
            }
            if (direction=='d'){
                if(this.state.canMove(this.updatedgrid, mark, side.DOWN)){
                    System.out.println("pass");
                    this.updatedgrid= this.state.move(mark, this.updatedgrid, side.DOWN);
                    this.updatedgrid.printGrid();
                }
                else {System.out.println("you cant move .. please choose another sdie");}
            }

        }while(this.state.check(this.updatedgrid));

    }
//_________________________________End playUser()_______________________________________

    public boolean compare (Grid grid)
    {
        boolean result=true;
        for (int i=0;i<allstates.size();i++)
        {
            if (allstates.get(i).isEqual(grid))
            {
                result=false;
            }
        }
        return result;
    }
//______________________________End of compare()________________________________________

    public void nextStateBfs(Grid grid)
    {
        ArrayList<Integer>shapeKeyes=new ArrayList<>();
        for (int i = 0; i <4 ; i++)
        {
            for (int j = 0; j <4 ; j++)
            {
                if(grid.list_grid[i][j]!=null)
                    shapeKeyes.add(grid.list_grid[i][j].mark);
            }
        }
        //________________________________________________
        int s = 0;
        for (int k = 0; k < shapeKeyes.size(); k++)
        {
            if (shapeKeyes.get(k) != null)
            {
                s = shapeKeyes.get(k);
                for (int t = k + 1; t < shapeKeyes.size();)
                {
                    if (shapeKeyes.get(t) == s)
                    {
                        shapeKeyes.remove(t);
                        t+=0;
                    }
                    else t++;
                }
            }
        }
        //____________________________________________________________________
        for (int r=0 ; r<shapeKeyes.size();r++)
        {
            if (this.state.canMove(grid, shapeKeyes.get(r), side.DOWN))
            {
                Grid newgrid = new Grid();
                newgrid.equal(grid);
                state.move(shapeKeyes.get(r), newgrid, side.DOWN);
                if (compare(newgrid))
                {
                    allstates.add(newgrid);
                    newgrid.printGrid();
                    System.out.println("down"+shapeKeyes.get(r));
                    System.out.println("______________________________________________");
                    this.queue.add(newgrid);
                }
            }
            if (this.state.canMove(grid, shapeKeyes.get(r), side.UP))
            {
                Grid newgrid = new Grid();
                newgrid.equal(grid);
                state.move(shapeKeyes.get(r), newgrid, side.UP);
                if (compare(newgrid))
                {
                    allstates.add(newgrid);
                    newgrid.printGrid();
                    System.out.println("up"+shapeKeyes.get(r));
                    System.out.println("________________________________________________");
                    queue.add(newgrid);
                }
            }
            if (this.state.canMove(grid, shapeKeyes.get(r), side.LEFT))
            {
                Grid newgrid = new Grid();
                newgrid.equal(grid);
                state.move(shapeKeyes.get(r), newgrid, side.LEFT);
                if (compare(newgrid))
                {
                    allstates.add(newgrid);
                    newgrid.printGrid();
                    System.out.println("left"+shapeKeyes.get(r));
                    System.out.println("_________________________________________________");
                    this.queue.add(newgrid);
                }
            }
            if (this.state.canMove(grid, shapeKeyes.get(r), side.RIGHT))
            {
                Grid newgrid = new Grid();
                newgrid.equal(grid);
                state.move(shapeKeyes.get(r), newgrid, side.RIGHT);
                if (compare(newgrid))
                {
                    allstates.add(newgrid);
                    newgrid.printGrid();
                    System.out.println("right"+shapeKeyes.get(r));
                    System.out.println("_______________________________________________");
                    this.queue.add(newgrid);
                }
            }
        }
    }
//_________________________________End of nextStateBfs()___________________________________
    public void nextStateDfs(Grid grid)
    {
        ArrayList<Integer>shapeKeyes=new ArrayList<>();
        for (int i = 0; i <4 ; i++)
        {
            for (int j = 0; j <4 ; j++)
            {
                if(grid.list_grid[i][j]!=null)
                    shapeKeyes.add(grid.list_grid[i][j].mark);
            }
        }
        //________________________________________________
        int s = 0;
        for (int k = 0; k < shapeKeyes.size(); k++)
        {
            if (shapeKeyes.get(k) != null)
            {
                s = shapeKeyes.get(k);
                for (int t = k + 1; t < shapeKeyes.size();)
                {
                    if (shapeKeyes.get(t) == s)
                    {
                        shapeKeyes.remove(t);
                        t+=0;
                    }
                    else t++;
                }
            }
        }
        //________________________________________
        for (int r=0 ; r<shapeKeyes.size();r++)
        {
            if (this.state.canMove(grid,shapeKeyes.get(r), side.DOWN)){
                Grid newgrid = new Grid();
                newgrid.equal(grid);
                state.move(shapeKeyes.get(r), newgrid, side.DOWN);
                if (compare(newgrid))
                {
                    allstates.add(newgrid);
                    newgrid.printGrid();
                    System.out.println("down"+shapeKeyes.get(r));
                    System.out.println("_________________________________________");
                    states.push(newgrid);
                }
            }
            //______________________________
            if (this.state.canMove(grid,shapeKeyes.get(r), side.UP)){
                Grid newgrid = new Grid();
                newgrid.equal(grid);
                state.move(shapeKeyes.get(r), newgrid, side.UP);
                if (compare(newgrid))
                {
                    allstates.add(newgrid);
                    newgrid.printGrid();
                    System.out.println("up"+shapeKeyes.get(r));
                    System.out.println("____________________________________________");
                    states.push(newgrid);
                }
            }
            //______________________________
            if (this.state.canMove(grid,shapeKeyes.get(r), side.LEFT)){
                Grid newgrid = new Grid();
                newgrid.equal(grid);
                state.move(shapeKeyes.get(r), newgrid, side.LEFT);
                if (compare(newgrid)){
                    allstates.add(newgrid);
                    newgrid.printGrid();
                    System.out.println("left"+shapeKeyes.get(r));
                    System.out.println("_____________________________________________");
                    states.push(newgrid);
                }
            }
            //_______________________________
            if (this.state.canMove(grid,shapeKeyes.get(r), side.RIGHT)){
                Grid newgrid = new Grid();
                newgrid.equal(grid);
                state.move(shapeKeyes.get(r), newgrid, side.RIGHT);
                if (compare(newgrid)){
                    allstates.add(newgrid);
                    newgrid.printGrid();
                    System.out.println("right"+shapeKeyes.get(r));
                    System.out.println("_____________________________________________");
                    states.push(newgrid);
                }
            }
        }
    }
//______________________________End of nextStateDfs()___________________________________

    public int manhattenDistance(Grid grid)
    {

        for (int i = 0; i <4 ; i++) {
            for (int j = 0; j <4 ; j++)
            {
                if(grid.list_grid[i][j]!=null &&
                        grid.list_grid[i][j].type==Type.HAVE_GOAL)
                     grid.manhattanDistance=(Math.abs(3-i))+(Math.abs(3-j));
            }
        }
        return grid.manhattanDistance;
    }
//_______________________________End of manhattanDistance()___________________________
    public int comp(Grid grid)
    {
        return manhattenDistance(grid)+grid.step;
    }
//_______________________________________End of comp()__________________________________

    public void nextStateAStare(Grid grid)
    {
        ArrayList<Integer>shapeKeyes=new ArrayList<>();
        for (int i = 0; i <4 ; i++)
        {
            for (int j = 0; j <4 ; j++)
            {
                if(grid.list_grid[i][j]!=null)
                    shapeKeyes.add(grid.list_grid[i][j].mark);
            }
        }
        //________________________________________________
        int s = 0;
        for (int k = 0; k < shapeKeyes.size(); k++)
        {
            if (shapeKeyes.get(k) != null)
            {
                s = shapeKeyes.get(k);
                for (int t = k + 1; t < shapeKeyes.size();)
                {
                    if (shapeKeyes.get(t) == s)
                    {
                        shapeKeyes.remove(t);
                        t+=0;
                    }
                    else t++;
                }
            }
        }
        //____________________________________________________________________
        for (int r=0 ; r<shapeKeyes.size();r++)
        {
            if (this.state.canMove(grid, shapeKeyes.get(r), side.DOWN))
            {
                Grid newgrid = new Grid();
                newgrid.equal(grid);
                state.move(shapeKeyes.get(r), newgrid, side.DOWN);
                newgrid.step++;
                newgrid.manhattanDistance=manhattenDistance(newgrid);
                newgrid.comp=comp(newgrid);
                if (compare(newgrid))
                {
                    allstates.add(newgrid);
                    newgrid.printGrid();
                    System.out.println("down"+shapeKeyes.get(r));
                    System.out.println("______________________________________________");
                    this.priorityQueue.add(newgrid);
                }
            }
            if (this.state.canMove(grid, shapeKeyes.get(r), side.UP))
            {
                Grid newgrid = new Grid();
                newgrid.equal(grid);
                state.move(shapeKeyes.get(r), newgrid, side.UP);
                newgrid.step++;
                newgrid.manhattanDistance=manhattenDistance(newgrid);
                newgrid.comp=comp(newgrid);
                if (compare(newgrid))
                {
                    allstates.add(newgrid);
                    newgrid.printGrid();
                    System.out.println("up"+shapeKeyes.get(r));
                    System.out.println("________________________________________________");
                    priorityQueue.add(newgrid);
                }
            }
            if (this.state.canMove(grid, shapeKeyes.get(r), side.LEFT))
            {
                Grid newgrid = new Grid();
                newgrid.equal(grid);
                state.move(shapeKeyes.get(r), newgrid, side.LEFT);
                newgrid.step++;
                newgrid.manhattanDistance=manhattenDistance(newgrid);
                newgrid.comp=comp(newgrid);
                if (compare(newgrid))
                {
                    allstates.add(newgrid);
                    newgrid.printGrid();
                    System.out.println("left"+shapeKeyes.get(r));
                    System.out.println("_________________________________________________");
                    this.priorityQueue.add(newgrid);
                }
            }
            if (this.state.canMove(grid, shapeKeyes.get(r), side.RIGHT))
            {
                Grid newgrid = new Grid();
                newgrid.equal(grid);
                state.move(shapeKeyes.get(r), newgrid, side.RIGHT);
                newgrid.step++;
                newgrid.manhattanDistance=manhattenDistance(newgrid);
                newgrid.comp=comp(newgrid);
                if (compare(newgrid))
                {
                    allstates.add(newgrid);
                    newgrid.printGrid();
                    System.out.println("right"+shapeKeyes.get(r));
                    System.out.println("_______________________________________________");
                    this.priorityQueue.add(newgrid);
                }
            }
        }
    }
 //___________________________________End of nextStateAstare()____________________________

}
