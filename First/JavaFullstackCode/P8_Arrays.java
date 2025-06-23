package sveri;
//All Array Operations.
import java.util.Arrays;
public class P8_Arrays 
{
 
	    // Method 1: Demonstrate array initialization and assignment
	    public static void initializeAndAssign()
	    {
	        // 1. Static Initialization (Direct Values)
	        int[] staticArray = {10, 20, 30, 40, 50};

	        // 2. Dynamic Initialization (Size Only)
	        int[] dynamicArray = new int[5]; // Default values (0)
	        
	        // Assigning values to dynamic array
	        for (int i = 0; i < dynamicArray.length; i++) {
	            dynamicArray[i] = i + 1;//it will assign value up to size i.e(5)by increment i.
	        }
System.out.println("-----Static and Dynamic Array Representation------");
	        System.out.println("\nStatic Array: " + Arrays.toString(staticArray));
	        System.out.println("Dynamic Array (After Assignment): " + Arrays.toString(dynamicArray));
	    System.out.println();
	    }

	    // Method 2: Update an array element
	    public static void updateArrayElement( int index, int newValue)
	    {
	        int arr[]= {1,2,3,4,5};
System.out.println("-------Updation of array--------");
	        System.out.println("Before Update: " + Arrays.toString(arr));
	        arr[index] = newValue; // Update element
	        System.out.println("After Update at index " + index + ": " + Arrays.toString(arr));
	   System.out.println();
	    }
	    

	    // Method 3: Print array length and iterate using different loops
	    public static void printArrayInfo(int[] arr) 
	    {
	        System.out.println("Array Length: " + arr.length);

	        // Using for loop
	        System.out.print("Using for loop: ");
	        for (int i = 0; i < arr.length; i++) 
	        {
	            System.out.print(""+arr[i]);
	        }
	 
	        // Using enhanced for loop
	        System.out.print("Using enhanced for loop: ");
	        for (int num : arr)
	        {
	            System.out.print(num + " ");
	        }
	      

	        // Using while loop
	        System.out.print("Using while loop: ");
	        int i = 0;
	        while (i < arr.length) 
	        {
	            System.out.print(arr[i] + " ");
	            i++;
	        }
	        System.out.println();
	    }

	    // Method 4: Print indexes and values of an array
	    public static void printArrayWithIndices(int[] arr) 
	    {
	        for (int i = 0; i < arr.length; i++) 
	        {
	            System.out.println("Index " + i + " -> Value: " + arr[i]);
	        }
	        System.out.println();
	    }

	    // Method 5: Demonstrating Multi-Dimensional Array (2D Array)
	    public static void multiDimensionalArray()
	    {
String[][] names = {{"Mr.", "Mrs.", "Ms."},{"Kadam", "Pranjal", "Sara"}};
System.out.println("-----2 Dimensional arary-----\n");
	        System.out.println(names[0][1] + names[1][0]); // Mr.Kadam
	        System.out.println(names[0][2] + names[1][1]); // Ms.Sara
	        System.out.println(names[0][1] + names[1][2]); // Mrs.Pranjal

	        // Updating an element
	        names[1][0] = "Patil";
	        System.out.println(names[0][0] + names[1][0]); // Mr.Kadam
	        for (int i = 0; i < names.length; i++) 
	        { 
	        	
	            for (int j = 0; j < names[i].length; j++) 
	            { 
	                System.out.println("names[" + i + "][" + j + "] = " + names[i][j]);
	            }
	            
	            System.out.println(); //new line/space
	        }
	    }

	    // Method 6: Updating an array based on sum and difference of first two elements
	    public static int[] calculateSumDiff() 
	    {
	    	int arr[]= {50,40,30,20,10};
	        if (arr.length < 3) 
	        {
	            System.out.println("Array size must be at least 3 for calculations.");
	            return arr;
	        }
System.out.println("----Updating array based on sum and difference----");
	        System.out.println("Original Array: " + Arrays.toString(arr));

	        arr[1] = arr[0] + arr[1];//Sum 
	        arr[2] = arr[0] - arr[1];//Difference.

	        System.out.println("Updated Array: " + Arrays.toString(arr));
	        return arr;
	    }

	    // Main Method to Execute All Operations
	    public static void main(String[] args) 
	    {
	        initializeAndAssign(); 
	        updateArrayElement( 2, 99); 
	        multiDimensionalArray();
	        calculateSumDiff();
	    }//Main() End.
	}//Class End.
