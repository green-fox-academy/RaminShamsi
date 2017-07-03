using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SquaredValueOfPositives
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] sampleArray = new int[] { 1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14 };
           
            IEnumerable<int> positiveElements = sampleArray.Where(n => n >= 0);
            var sq = from int element in positiveElements
                     let squared = element * element
                     select new {squared};
            foreach(double item in positiveElements)
                Console.WriteLine(Math.Pow(item, 2));
            foreach (var item in sq)
            Console.WriteLine(item);
            Console.ReadKey();
        }
    }
}
