public class kanyikan {
   public static void main (String []args ){
   int[] arr={5,2,0,1,3,1,4};
   System .out.ptintln ("befor:");
     for (int num:arr){
      System.out.print(num+"");}
   for(int i=0;i<arr.length-1;i++)
   for (int j=0;j<arrlength-1-i;j++)
  {if(arr[j]>arr[j+1])
   {int temp=arr[j];
   arr[j]=arr[j+1];
   arr[j+1]=temp; }
}


}  System.out.println();
   System.out.println ("after:");
    for(int num:arr){System.out.print(num+"");
}
}



}