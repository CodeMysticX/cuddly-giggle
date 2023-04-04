import java.util.Scanner;
public class MarksObtained{
    public static void main(String[] args)
    {
        int n,a=0,b=0,c=0,d=0,i=0;
        System.out.println("Enter the no. of students: ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[];
        arr=new int[n];
        System.out.println("Enter the marks obtained by students: ");
        for(i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        for(i=0; i<n; i++)
        {
            if(arr[i]>81 && arr[i]<=100)
               a++;
            else if(arr[i]<=80 && arr[i]>=61)
               b++;
            else if(arr[i]<=60 && arr[i]>=41)
               c++;
            else if(arr[i]<=40 && arr[i]>=0)
               d++;
        }
        System.out.println("Number of students having marks in range of 81-100: "+a);
        System.out.println("Number of students having marks in range of 61-80: "+b);
        System.out.println("Number of students having marks in range of 41-60: "+c);
        System.out.println("Number of students having marks in range of 0-40: "+d);
    }
}
