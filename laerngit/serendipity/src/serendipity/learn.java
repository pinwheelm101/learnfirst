package serendipity;
import java.util.Arrays;

public class learn {
 public static void main(String[] args) {
   learn good=new learn();
    int[] scores= {89,-64,151,63,98,73,-54,85,91,45};
     good.sort(scores);
  } 
  public int sort(int[] mark) {
	  Arrays.sort(mark);
		  System.out.println("¿¼ÊÔ³É¼¨Îª£º");
		  int count=0;
		  for(int i=mark.length-1;i>=0;i--) {
			  if(mark[i]>100||mark[i]<0)
				  continue;
			  System.out.println(mark[i]);
			  count++;
			  if(count==3)
				  break;
			 
		  }
		 return 0; 
 }
  
  
 
}
