//�޸Ĳ���
public class BubbleSort {
����public static void main(String[] args) {
��������int[] arr={52,0,1,11,8,9};
��������System.out.println("before��");
��������for(int num:arr){
������������System.out.print(num+" ");
��������}
��������for(int i=0;i<arr.length-1;i++){//���ѭ��������������
������������for(int j=0;j<arr.length-1-i;j++){//�ڲ�ѭ������ÿһ��������ٴ�
����������������if(arr[j]>arr[j+1]){
��������������������int temp=arr[j];
��������������������arr[j]=arr[j+1];
��������������������arr[j+1]=temp;
����������������}
������������}
��������} 
��������System.out.println();
��������System.out.println("after��");
 ��������for(int num:arr){
 ������������System.out.print(num+" ");
 ��������} 
����}
 }