using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace BattleShip
{

    class BattleShipBoard
    {
        public void DisplayBoard(char[,] grid)
        {
            Console.WriteLine("    A B C D E F G H I J K L M N O P Q R S T");
            for (int i = 1; i <= 20; i++)
            {
                if (i <= 9)
                {
                    Console.Write(" " + i + ":");
                }
                else
                {
                    Console.Write(i + ":");
                }
                for (int j = 1; j <= 20; j++)
                {
                    Console.Write(" " + grid[i - 1, j - 1]);

                }
                Console.WriteLine("");
            }
        }
    }

    class Player
    {
        char[,] Grid = new char[20, 20];
        public int HitCount = 0;
        public int MissCount = 0;
        int x = 0;
        int y = 0;

        public int getHitCount()
        {
            return HitCount;
        }
        public int getMissCount()
        {
            return MissCount;
        }
        public char[,] GetGrid()
        {
            return Grid;
        }
        public void SetGrid()
        {
           
            for (int x = 0; x < 20; x++)
            {
                for (int y = 0; y < 20; y++)
                {
                    Grid[x, y] = '.';
                }
            }
            for (int i = 1; i <= 13; i++)
                {
                x = RandomNumber();
                y = RandomNumber();
                while (Grid[x,y] == 'S')
                {
                    x = RandomNumber();
                    y = RandomNumber(); 
                }    
                Grid[x, y] = 'S';
                Console.WriteLine(x + y + Grid[x,y]);
                }
        }

        public int RandomNumber()
        {
            Random r = new Random(DateTime.Now.Millisecond);
            return r.Next(1, 20);
        }

        public void AskCoordinates()
        {
        }

        class Program
        {
            static void Main(string[] args)
            {
                Player p = new Player();
                BattleShipBoard b = new BattleShipBoard();
                p.SetGrid();
                b.DisplayBoard(p.GetGrid());

                Console.ReadKey();
            }
        }
    }
}
