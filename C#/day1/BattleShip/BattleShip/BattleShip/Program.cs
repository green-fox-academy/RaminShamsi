using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace BattleShip
{

    class BattleShipBoard
    {
        public void DisplayBoard()
        {
            Console.WriteLine("    A B C D E F G H I J K L M N O P Q R S T");
            for (int i = 1; i <= 20; i++)
            {
                if(i <= 9)
                {
                    Console.Write(" " + i + ":");
                } else
                {
                    Console.Write(i + ":");
                }
                Console.Write(" . . . . . . . . . . . . . . . . . . . .\n");
               
            }
        }
    }

    class Player
    {

    }

    class Program
    {
        static void Main(string[] args)
        {
            BattleShipBoard b = new BattleShipBoard();
            b.DisplayBoard();
            Console.ReadKey();
        }
    }
}
