//俐個霞編
public class BubbleSort {
　　public static void main(String[] args) {
　　　　int[] arr={52,0,1,11,8,9};
　　　　System.out.println("before��");
　　　　for(int num:arr){
　　　　　　System.out.print(num+" ");
　　　　}
　　　　for(int i=0;i<arr.length-1;i++){//翌蚊儉桟陣崙電會緬方
　　　　　　for(int j=0;j<arr.length-1-i;j++){//坪蚊儉桟陣崙耽匯緬電會謹富肝
　　　　　　　　if(arr[j]>arr[j+1]){
　　　　　　　　　　int temp=arr[j];
　　　　　　　　　　arr[j]=arr[j+1];
　　　　　　　　　　arr[j+1]=temp;
　　　　　　　　}
　　　　　　}
　　　　} 
　　　　System.out.println();
　　　　System.out.println("after��");
 　　　　for(int num:arr){
 　　　　　　System.out.print(num+" ");
 　　　　} 
　　}
 }