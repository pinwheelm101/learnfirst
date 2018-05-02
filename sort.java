//ÐÞ¸Ä²âÊÔ
public class BubbleSort {
¡¡¡¡public static void main(String[] args) {
¡¡¡¡¡¡¡¡int[] arr={52,0,1,11,8,9};
¡¡¡¡¡¡¡¡System.out.println("before£º");
¡¡¡¡¡¡¡¡for(int num:arr){
¡¡¡¡¡¡¡¡¡¡¡¡System.out.print(num+" ");
¡¡¡¡¡¡¡¡}
¡¡¡¡¡¡¡¡for(int i=0;i<arr.length-1;i++){//Íâ²ãÑ­»·¿ØÖÆÅÅÐòÌËÊý
¡¡¡¡¡¡¡¡¡¡¡¡for(int j=0;j<arr.length-1-i;j++){//ÄÚ²ãÑ­»·¿ØÖÆÃ¿Ò»ÌËÅÅÐò¶àÉÙ´Î
¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡if(arr[j]>arr[j+1]){
¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡int temp=arr[j];
¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡arr[j]=arr[j+1];
¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡arr[j+1]=temp;
¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡}
¡¡¡¡¡¡¡¡¡¡¡¡}
¡¡¡¡¡¡¡¡} 
¡¡¡¡¡¡¡¡System.out.println();
¡¡¡¡¡¡¡¡System.out.println("after£º");
 ¡¡¡¡¡¡¡¡for(int num:arr){
 ¡¡¡¡¡¡¡¡¡¡¡¡System.out.print(num+" ");
 ¡¡¡¡¡¡¡¡} 
¡¡¡¡}
 }