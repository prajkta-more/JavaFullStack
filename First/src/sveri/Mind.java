package sveri;

import java.util.Arrays;
public class Mind 
{
	public static void main(String[] args) 
	{
		
	Mind ob=new Mind();
	ob.requiredItemList("Chocolate cake", 2);
    ob.availableItemList();
	}

public void requiredItemList(String item_name,int quantity)
{
	System.out.println("You sent a order for :"+item_name+"\n Quantity:"+quantity);
}


public void availableItemList()
{
	System.out.println("----Our Product Names With Their Quantity----");
	String available[][]= {{"Chocolate Cake", "Ice Cake", "Cup Cake"},{"(10)", "(20)", "(30)"}};

	 System.out.println(available[0][1] + available[1][0]); // Mr.Kadam
     System.out.println(available[0][2] + available[1][1]); // Ms.Sara
     System.out.println(available[0][1] + available[1][2]); // Mrs.Pranjal

}
}