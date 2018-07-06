package Day3_Questions;
 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
class Spiral_Memory
    {
        public static void main(String args[])throws IOException
            {
            System.out.print("Enter the size of matrix : ");
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            int n=Integer.parseInt(br.readLine());
            
            System.out.println("Enter the number to be searched : ");
            Scanner sc = new Scanner(System.in);
         	long x = sc.nextLong();
         	sc.close();
         	
         	 int dist = Spiral_Memory.distance(n, x);
         	 System.out.println("Distance to access point is: "+dist);
         			
        }
        
        public static int distance(int n, long x) {
            
            int A[][]=new int[n][n];
            int k=n*n, c1=0, c2=n-1, r1=0, r2=n-1;
            int step=0;
            
            //Generating the spiral matrix
 
            while(k>=1)
                {
                    for(int i=c1;i<=c2;i++)
                    {
                        A[r1][i]=k--;
                         }
 
                    for(int j=r1+1;j<=r2;j++)
                    {
                        A[j][c2]=k--;

                    }
 
                    for(int i=c2-1;i>=c1;i--)
                    {
                        A[r2][i]=k--;

                    }
 
                    for(int j=r2-1;j>=r1+1;j--)
                    {
                        A[j][c1]=k--;

                    }
 
                 c1++;
                 c2--;
                 r1++;
                 r2--;
                }
            
           //Calculating the shortest distance to the access point 
            int mid = n/2;
            for(int i=0; i<n; i++) {
            	for(int j=0; j<n; j++) {
            		if(A[i][j]==x) {
            			step = Math.abs(i-mid)+Math.abs(mid-j);
            			
            		}
            	}
            }
            return step;
           
            
            
        }
    }