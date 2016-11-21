package test_break;

public class Test_break {
	
	public static void main(String[] args)
	{
		one:  for(int i=0;i<3;i++)
		     {
			    System.out.print("the password "+ i+" :");
			    
			    for(int j=0;j<100;j++)
			    {
			    	System.out.print(j);
			    	if(j==10)
			    	{
			    		break;
			    	}
			    }
			    System.out.println("\n");
		      }
	    second:  for(int i=0;i<3;i++)
	            {
		            System.out.print("the password "+ i+" :");
		    
		             for(int j=0;j<100;j++)
		              {
		    	        System.out.print(j);
		    	        if(j==10)
		    	        {
		    		     break second;
		    	        }
		               }
		                    System.out.println("\n");
	             }
	}

}
