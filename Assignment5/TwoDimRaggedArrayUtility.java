
/*
 * Class: CMSC203 
 * Instructor:
 * Description: (Give a brief description for each Class)
 * Due: 4/19/2021
 * Platform/compiler:
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: ____Arifun Nabi______
*/



import java.io.*;

import java.util.*;

import java.lang.*;

class TwoDimRaggedArrayUtility

{

    
     // pass in a file and return a two dimensional ragged array of doubles

     public static double[][] readFile(File file)

     {

          double[][] raggedArr = new double[6][];

          String line;

          int i = 0;

          try

          {

              // open the file

              BufferedReader br = new BufferedReader(new FileReader(file));

              // read the file

              while ((line = br.readLine()) != null)

              {

                   String[] temp = line.split(" ");

                   int size = temp.length;

                   raggedArr[i] = new double[size];

                   // covert into doubles

                   for (int j = 0; j < size; j++)

                   {

                        raggedArr[i][j] = Double.parseDouble(temp[j]);

                   }

                   i++;

              }

              br.close();

          }

          catch (Exception ep)

          {

              ep.printStackTrace();

          }

          return raggedArr;

     }

    

     // pass in a two dimensional ragged array of doubles and a file,

     // and writes the ragged array into the file. Each row is on a

     // separate line and each double is separated by a space.

     public static void writeToFile(double[][] raggedArr, File file)

     {

          try

          {

              // open the file

              BufferedWriter br = new BufferedWriter(new FileWriter(file));

              // read the array and print into file with spaces

              for (int i = 0; i < raggedArr.length; i++)

              {

                   for (int j = 0; j < raggedArr[i].length; j++)

                   {

                        br.write(raggedArr[i][j] + " ");

                   }

                   br.newLine();

              }

              br.close();

          }

          catch (Exception ep)

          {

              ep.printStackTrace();

          }

     }


     // pass in a two dimensional ragged array of doubles

     // and returns the total of the elements in the array.

     public static double getTotal(double[][] raggedArr)

     {

          double total = 0;

          // find the sum of the values of the 2D array

          for (int i = 0; i < raggedArr.length; i++)

          {

              for (int j = 0; j < raggedArr[i].length; j++)

              {

                   total += raggedArr[i][j];

              }

          }

          return total;

     }


     // pass in a two dimensional ragged array of doubles

     // and returns the average of the elements in the array

     
	public static double getAverage(double[][] raggedArr)

     {

          double total = 0;

          int numOfElements = 0;

          // find the sum of the values of the 2D array

          for (int i = 0; i < raggedArr.length; i++)

          {

              for (int j = 0; j < raggedArr[i].length; j++)

              {

                   total += raggedArr[i][j];

                   numOfElements += 1;

              }

          }

          // find and return the average

          return new Double(total / numOfElements);

     }


     // pass in a two dimensional ragged array of doubles and a row index

     // and returns the total of that row. Row index 0 is the first row in the

     // array.

     public static double getRowTotal(double[][] raggedArr, int rowIndex)

     {

          double total = 0;

          for (int j = 0; j <raggedArr[rowIndex].length; j++)

          {

              total += raggedArr[rowIndex][j];

          }

          return total;

     }

     // pass in a two dimensional ragged array of doubles

     // and a column index and returns the total of that column.

     public static double getColumnTotal(double[][] raggedArr, int colIndex)

     {

          double total = 0;

          for (int i = 0; i < raggedArr.length; i++)

          {

              if (colIndex <= raggedArr[i].length - 1)

                   total += raggedArr[i][colIndex];

          }

          return total;

     }


     // pass in a two dimensional ragged array of doubles and a

     // row index and returns the largest element in that row.

     public static double getHighestInRow(double[][] raggedArr, int rowIndex)

     {

          double highest = raggedArr[rowIndex][0];

          for (int j = 0; j < raggedArr[rowIndex].length; j++)

          {

              if (raggedArr[rowIndex][j] > highest)

                   highest = raggedArr[rowIndex][j];

          }

          return highest;

     }


     // takes a two dimensional ragged array of doubles and a

     // row index and returns the index of the largest element in that row

     public static int getHighestInRowIndex(double[][] raggedArr, int row)

     {

          int index = 0;

          for (int i = 0; i < raggedArr[row].length; ++i)

          {

              if (raggedArr[row][i] > raggedArr[row][index])

              {

                   index = i;

              }

          }

          return index;

     }


     // takes a two dimensional ragged array of doubles and a

     // row index and returns the smallest element in that row.

     public static double getLowestInRow(double[][] raggedArr, int rowIndex)

     {

          double lowest = raggedArr[rowIndex][0];

          for (int j = 0; j < raggedArr[rowIndex].length; j++)

          {

              if (raggedArr[rowIndex][j] < lowest)

                   lowest = raggedArr[rowIndex][j];

          }

          return lowest;

     }


     // takes a two dimensional ragged array of doubles and a

     // row index and returns the index of the smallest element in that row.

     public static int getLowestInRowIndex(double[][] raggedArr, int row)

     {

          int index = 0;

          for (int i = 0; i < raggedArr[row].length; ++i)

          {

              if (raggedArr[row][i] < raggedArr[row][index])

              {

                   index = i;

              }

          }

          return index;

     }


     // pass in a two dimensional ragged array of doubles

     // and a column index and returns the largest element in that column

     public static double getHighestInColumn(double[][] raggedArr, int colIndex)

     {

          double highest = raggedArr[0][colIndex];

          for (int i = 0; i < raggedArr.length; i++)

          {

              if (colIndex <= raggedArr[i].length - 1)

              {

                   if (raggedArr[i][colIndex] > highest)

                        highest = raggedArr[i][colIndex];

              }

          }

          return highest;

     }


     // takes a two dimensional ragged array of doubles and a

     // row index and returns the index of the largest element in that column.

     public static int getHighestInColumnIndex(double[][] raggedArr, int col_index)

     {

          int highest_ind = 0;

          for (int i = 0; i < raggedArr.length; i++)

          {

              if (raggedArr[i].length > col_index)

              {

                   if (raggedArr[i][col_index] > raggedArr[highest_ind][col_index])

                        highest_ind = i;

              }

          }

          return highest_ind;

     }


     // pass in a two dimensional ragged array of doubles and a column

     // index and returns the smallest element in that column

     public static double getLowestInColumn(double[][] raggedArr, int colIndex)

     {

          double lowest = raggedArr[0][colIndex];

          for (int i = 0; i < raggedArr.length; i++)

          {

              if (colIndex <= raggedArr[i].length - 1)

                   if (raggedArr[i][colIndex] < lowest)

                        lowest = raggedArr[i][colIndex];

          }

          return lowest;

     }


     // takes a two dimensional ragged array of doubles and a

     // row index and returns the index of the lowest element in that column.

     public static int getLowestInColumnIndex(double[][] raggedArr, int col_index)

     {

          int highest_ind = 0;

          for (int i = 0; i < raggedArr.length; i++)

          {

              if (raggedArr[i].length > col_index)

              {

                   if (raggedArr[i][col_index] < raggedArr[highest_ind][col_index])

                        highest_ind = i;

              }

          }

          return highest_ind;

     }


     // pass in a two dimensional ragged array of doubles

     // and returns the largest element in the array.

     public static double getHighestInArray(double[][] raggedArr)

     {

          double highest = raggedArr[0][0];

          for (int i = 0; i < raggedArr.length; i++)

          {

              for (int j = 0; j < raggedArr[i].length; j++)

              {

                   if (raggedArr[i][j] > highest)

                        highest = raggedArr[i][j];

              }

          }

          return highest;

     }


     // pass in a two dimensional ragged array of doubles

     // and returns the smallest element in the array.

     public static double getLowestInArray(double[][] raggedArr)

     {

          double lowest = raggedArr[0][0];

          for (int i = 0; i < raggedArr.length; i++)

          {

              for (int j = 0; j < raggedArr[i].length; j++)

              {

                   if (raggedArr[i][j] < lowest)

                        lowest = raggedArr[i][j];

              }

          }

          return lowest;

     }

}