using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SetupDatabase
{
    class Program
    {
        static void Main(string[] args)
        {
            var myDB = new csharpdatabaseEntities();
            var testtable = new testtable()
            { id = 1,
            name = "first table"
            };
            myDB.testtables.Add(testtable);
            myDB.SaveChanges();
            Console.WriteLine("item added to database");
        }
    }
}
