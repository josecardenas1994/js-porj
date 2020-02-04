public class competency{

    public static void main(String args[]){
        int[] array ={3,5,7,6,3,2,9};
        int sum=0;
    

       for(int num : array){
           sum = sum+num;
        
           if(num==7){
               System.out.println("hi everyone");

           }
       }

      System.out.println(sum);
      

    }
}