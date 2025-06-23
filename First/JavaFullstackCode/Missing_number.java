package p1;

public class Missing_number 
{
    public static void main(String[] args) 
    {
        int[] a = {1,2,3,5,6,7};  //Missing number is 4.
        Missing_number obj = new Missing_number();
        obj.misingValueMethod(a);
    }
   public void misingValueMethod(int[] a)
    {
        int n = a.length + 1;
        for (int i = 1; i <= n; i++)
        {
            boolean found = false;
            
            for (int j = 0; j < a.length; j++) 
            {
                if (a[j] == i)
                {
                    found = true;
                    break;
                }
            }

            if (!found) 
            {
                System.out.println("Missing number: " + i);
                break;
            }
        }
    }
}
