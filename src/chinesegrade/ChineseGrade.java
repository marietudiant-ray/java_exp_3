package chinesegrade;


public class ChineseGrade {
	
	public  static String scoreString;
	public  static double score;
	public  static String grade;
	
	public ChineseGrade(double score)
	{
		if(score >= 90)
		{
			grade="A";
		}
		else if(score<90&&score >=80)
		{
			grade="B";
		}
		else if(score <80 && score>=70)
		{
			grade="C";
		}
		else if(score <70 && score >=60)
		{
			grade="D";
		}
		else 
		{
			grade="E";
		}
	}
	 
	
	public static void main(String[] args)
	{
		Input_Output.gradeOutput();
	}

}
