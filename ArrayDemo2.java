class ArrayDemo2 {

 


 public static void main(String[] args) {
 
 


   int[] nums = {10,20,30,40,50};
  
   
   ArrayDemo2 demo2 = new ArrayDemo2();

 

   int result = demo2.findSum(nums);
 

 

   System.out.println("Sum:"+result);

 


 }

 


   int findSum(int[] arry) {

 

   int sum = 0;

 

   for(int i=0;i<arry.length;i++) {

 

    sum = sum+arry[i];

 

   }

 

   return sum;

 

  }  

 


}