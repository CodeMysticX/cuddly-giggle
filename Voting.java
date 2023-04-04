import java.util.Scanner;
public class Voting {
        public void votes(int count[],int ballot[],int n,int a){
        int i,sb=0;
        for(i=0; i<a; i++){
            switch(ballot[i]){
                case 1:count[1]++;
                       break;
                case 2:count[2]++;
                       break;
                case 3:count[3]++;
                       break; 
                case 4:count[4]++;
                       break;
                case 5:count[5]++;
                       break;
                default:
                       sb++;
            }
        }
        for(i=1; i<=n; i++){
            System.out.println("\nNo. of Votes of candidate "+i+"= "+count[i]);}
            System.out.println("\nNo. of Spoilt ballots = "+sb);
        } 
        public static void main(String[] args){
            int n=5,i,a;
            //System.out.println("Enter the number of candidates: ");
            Scanner sc=new Scanner(System.in);
            //n=sc.nextInt();
            int count[]=new int[n+1];
            for(i=0; i<=n; i++){
                count[i]=0;
            }
            System.out.println("Enter the total no. of votings: ");
             a=sc.nextInt();
            int ballot[]=new int[a];
            System.out.println("Enter the ballot numbers: ");
            for(i=0; i<a; i++){
                ballot[i]=sc.nextInt();
            }
            Voting v=new Voting();
            v.votes(count,ballot,n,a);
    }
}
