public class Salesman
{
    String name;
    float sales;
    int counter = 0;
    
    Salesman[] temp = new Salesman[5];
    
    Salesman[] getTopFive(Salesman[] allSales)
    {
        for(int i = 0; i < allSales.length - 1; i++)
        {
            for(int j = 0; j < allSales.length - 1; j++)
            {
              if(allSales[i].sales < allSales[j].sales)
              {
                  counter++;
              }
            }
            
            if(counter == 0)
            {
                temp[0] = allSales[i];
            }
            else if(counter == 1)
            {
                temp[1] = allSales[i];
            }
            else if(counter == 2)
            {
                temp[2] = allSales[i];
            }
            else if(counter == 3)
            {
                temp[3] = allSales[i];
            }
            else if(counter == 4)
            {
                temp[4] = allSales[i];
            }
            counter = 0;
        }
        return temp;
    }
    
}