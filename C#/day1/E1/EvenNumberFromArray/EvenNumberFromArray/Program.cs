using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace EvenNumberFromArray
{
    class Array
    {
        static void Main(string[] args)
        {
            int[] myArray = new int[] { 1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14 };

            IEnumerable<int> evenNumbers = myArray.Where(n => n % 2 == 0);
            Console.WriteLine("All even numbers: " + String.Join(",", evenNumbers));
            IEnumerable<int> positiveEvenNumbers = myArray.Where(n => n % 2 == 0 && n>=0);
            Console.WriteLine("All positive even numbers: " + String.Join(",", positiveEvenNumbers));
            Console.ReadKey();
        }
    }
}
