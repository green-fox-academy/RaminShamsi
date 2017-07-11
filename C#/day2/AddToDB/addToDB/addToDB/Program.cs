using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace addToDB
{
    class Program
    {
        static void Main(string[] args)
        {
            var myDB = new csharpdatabaseEntities1();
            
            var item = new testtable()
            {
               id = 1,
                name = "first table"
            };
            myDB.testtables.Add(item);
            myDB.SaveChanges();
            Console.WriteLine("the item added to BD!");
            Console.ReadKey();
        }
    }
}
