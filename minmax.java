import java.util.*;

class Solution{
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        
        int arr[]=new int[5];
       
        int result[]=new int[5];
          
                for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            
        }
     for(int j=0;j<5;j++){
         int total=0; 
         for(int k=0;k<5;k++){
            if(j==k){
                continue;
                
            } 
              total=total+arr[k]; 
         
         }
         result[j]=total;
      
         }
            
       int f=result[0];
       for(int l=0;l<arr.length;l++){
        if (f<result[l]) {
            f=result[l];
            
        }

       }
        int p=result[0];
       for(int l=0;l<arr.length;l++){
        if (p>result[l]) {
           p =result[l];
            
        }

       }
       System.out.print(p+" "+f);


      
    }
}
