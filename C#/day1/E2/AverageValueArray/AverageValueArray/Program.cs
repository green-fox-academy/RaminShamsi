using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AverageValueArray
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] sampleArray = new int[] { 1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14};
            double averageOfOdds = sampleArray.Where(n => n % 2 != 0).Average(n => n);
            Console.WriteLine(averageOfOdds);
            Console.ReadKey();
        }
    }
}
