package multiplyList;

import javax.swing.JOptionPane;

public class MultiplyList {
	
	String result="";
	public String multi()
	{
	    for(int i=1;i<10;i++)
	    {
	    	one : for(int j=1;j<10;j++)
	    	      {
	    	 	    /* do{
	    	 	    	 result=i+"*"+j+"="+i*j+"\t";
	    	 	    	 j++;
	    	 	       }while(j<=i);
	    		      break one;*/
	    		     if(j<=i)
	    		     {
	    		    	 result+=i+"*"+j+"="+i*j+"\t";
	    		     }
	    		     else{
	    		    	 result+="\n";break one;
	    		     }
	    	      }
	    	
	    }
		return result;
	}
	
	public void output()
	{
	  result=multi();
      JOptionPane.showMessageDialog(null, result,"九九乘法表",JOptionPane.INFORMATION_MESSAGE);
	}
	
	public MultiplyList()
	{
	   output();
	}
	
	public static void main(String[] args)
	{
		MultiplyList multiplyslist=new MultiplyList();
		System.exit(0);
	}
	

}
