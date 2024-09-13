// Declare an array of integers
int[] myArray;

// Initialize the array with values
myArray = new int[]{1, 2, 3, 4, 5};


// Declare a two-dimensional array of integers
int[][] my2DArray;

// Initialize the two-dimensional array with values
my2DArray = new int[][]{
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};


// Declare and initialize an array
int[] myArray = {1, 2, 3, 4, 5};

// Traverse the array using a for loop
for (int i = 0; i < myArray.length; i++) {
    System.out.println("Element at index " + i + ": " + myArray[i]);
}


// Declare and initialize an array of strings
String[] stringArray = {"Hello", "World", "Java"};

// Concatenate the strings in the array
StringBuilder concatenatedString = new StringBuilder();
for (String str : stringArray) {
    concatenatedString.append(str);
}

// Print the concatenated string
System.out.println(concatenatedString.toString());
