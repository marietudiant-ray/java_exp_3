package multiplyslist;

import javax.swing.JOptionPane;

public class MulitplyList2 {

	
	public static void main(String[] args)
	{
		
		String output="";
		
		for(int i=0;i<10;i++)
		{
			
	          outer: for(int j=1;j<=i;j++)
			        {
		              if(i%2==1){ 
				                           output+=i+"*"+j+"="+i*j+"  ";
				                           System.out.println(output);
			     	                  }
				      else {break outer;}
			        }       
		       	output+="\n";
	   	 }   
		
		JOptionPane.showMessageDialog(null, output, "九九乘法表1", JOptionPane.INFORMATION_MESSAGE);
	}
	
	
}
