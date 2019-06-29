
import java.util.Scanner;
import java.lang.Math;
import java.lang.reflect.Array;
import java.text.DecimalFormat;

public class matrix
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number Of Rows of matrix  "); 
        int row = sc.nextInt();
        System.out.println("Enter The Number Of Columns of matrix  "); 
        int cols = sc.nextInt();
              
        int[][] matrix = new int[row][cols];   
        System.out.println("Enter Matrix 1 Data");
         
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                matrix[i][j] = sc.nextInt();
            }
        }
        
              
        int[][] matrix2 = new int[row][cols];   
        System.out.println("Enter Matrix 2 Data");
         
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                matrix2[i][j] = sc.nextInt();
            }
        }


        System.out.println("Your Matrix 1 is : ");
         
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                System.out.print(matrix[i][j]+"\t");
            }
             
            System.out.println();
        }
         
        System.out.println("Your Matrix 2 is : ");
         
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                System.out.print(matrix2[i][j]+"\t");
            }
             
            System.out.println();
        }
        
            System.out.println("MATRIX OPERATIONS");
        
            System.out.println("1. Addition");
            System.out.println("2. Substraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Transpose");
            System.out.println("6. Sum of upper triangle");
            System.out.println("7. Sum of lower triangle");

            System.out.println("Enter your choice: ");
            int w= sc.nextInt();
        
            switch(w)
            {
                case 1:    
                System.out.println("Addition of given 2 matrix is: ");   
                int[][] sum = new int[row][cols];
                for (int i = 0; i < row; i++)
                {
                     for (int j = 0; j < cols; j++)
                     {
                        sum[i][j] = matrix[i][j] + matrix2[i][j]; 
                        System.out.print(sum[i][j]+"\t");  
                     }   
                     System.out.println();
                }
                break;

                case 2: 
                System.out.println("Substraction of given 2 matrix is: ");      
                int[][] subs = new int[row][cols];
                for (int i = 0; i < row; i++)
                {
                     for (int j = 0; j < cols; j++)
                     {
                        subs[i][j] = matrix[i][j] - matrix2[i][j]; 
                        System.out.print(subs[i][j]+"\t");  
                     }   
                     System.out.println();
                }
                break;


                case 3:     
                System.out.println("Multiplication of given 2 matix is: ");  
                int[][] mul = new int[row][cols];
                for (int i = 0; i < row; i++)
                {
                     for (int j = 0; j < cols; j++)
                     {
                        for(int k=0; k<row; k++)
                        mul[i][j] =mul[i][j] + matrix[i][k] * matrix2[k][j]; 
                        System.out.print(mul[i][j]+"\t");  
                     }   
                     System.out.println();
                }
                break;

                case 4:  
                System.out.println("Division of given 2 matix is:  ");   
                double [][] div = new double[row][cols];
                DecimalFormat df = new DecimalFormat("##0.00");
                for (int i = 0; i < row; i++)
                {
                     for (int j = 0; j < cols; j++)
                     {
                        div[i][j] = matrix[i][j] /(double) matrix2[i][j]; 
                        System.out.print(df.format(div[i][j])+"\t");  
                     }   
                     System.out.println();
                }
                break;


                case 5:
                System.out.println("Transpose of matrix 1: ");
                int transpose[][] = new int[cols][row];
                for (int i = 0; i < row; i++)
                {
                    for (int j = 0; j < cols; j++)
                    {
                        transpose[i][j] = matrix[j][i];
                        System.out.print(transpose[i][j]+"\t");                                                               
                    }   
                    System.out.println();
                }
                System.out.println("Transpose of matrix 2: ");
                int transpose1[][] = new int[cols][row];
                for (int i = 0; i < row; i++)
                {
                    for (int j = 0; j < cols; j++)
                    {
                        transpose1[i][j] = matrix2[j][i];
                        System.out.print(transpose1[i][j]+"\t");                                  
                    }   
                    System.out.println();
                }
                break;

                case 6:    
                System.out.println("Sum of upper triangle of matrix 1: ");
                int upt=0;
                for (int j = 0; j < cols; j++)
                {
                    for (int i=j ; i>=0 ; i--) 
                    {
                        upt= upt + matrix[i][j];                   
                    }  
                }
                System.out.print(upt);
                System.out.println();
                System.out.println("Sum of upper triangle of matrix 2: ");
                int upt1=0;
                for (int j = 0; j < cols; j++)
                {
                    for (int i=j ; i>=0 ; i--) 
                    {
                        upt1= upt1 + matrix2[i][j];                  
                    }  
                }
                System.out.print(upt1); 
                System.out.println();
                break;


                case 7:    
                System.out.println("Sum of lower triangle of matrix 1: ");
                int dpt=0;
                for (int i = 0; i < row; i++)
                {
                    for (int j=i ; j>=0 ; j--) 
                    {
                        dpt= dpt + matrix[i][j];                   
                    }  
                }
                System.out.print(dpt);
                System.out.println();
                System.out.println("Sum of lower triangle of matrix 2: ");
                int dpt1=0;
                for (int i = 0; i < row; i++)
                {
                    for (int j=i ; j>=0 ; j--) 
                    {
                        dpt1= dpt1 + matrix2[i][j];                  
                    }  
                }
                System.out.print(dpt1); 
                System.out.println();
                break;
                
                       
                }
            }

    }
