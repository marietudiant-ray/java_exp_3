package chinesegrade3;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ChineseGrade3 {
	
	public String[] inputScore;
	public double[] score;
	public String[] grade;
    public String result;
	
	public double[] inputScore()
	{
		inputScore=new String[10];
		score=new double[10];
		System.out.println("please input students' scores: ");
		System.out.println("please pay attention to the range of students' scores, they must be in the range of 0-100! ");
		Scanner scanner=new Scanner(System.in);
		for(int i=0;i<10;i++)
		{  
			do{
				System.out.println("student "+(i+1)+":");
		      	inputScore[i]=scanner.nextLine();
		     }while(Double.parseDouble(inputScore[i])>100||Double.parseDouble(inputScore[i])<0);
			score[i]=Double.parseDouble(inputScore[i]);
		}
		scanner.close();
		return score;
	}
	
	public String[] judgeGrade(double[] score)
	{
		grade=new String[10];
		for(int i=0;i<10;i++)
		{
			switch((int)score[i]/10)
			{
			  case 10:
			  case  9: {grade[i]="A";break;}
			  case  8: {grade[i]="B";break;}
			  case  7: {grade[i]="C";break;}
			  case  6: {grade[i]="D";break;}
			  default : {grade[i]="E";break;}
			}
		}
        return grade;
	}
	
	public String count()
	{
		result=null;
		double[] average=new double[5];
		for(int i=0;i<5;i++) {average[i]=0.0;}
		int[] percentage=new int[5]; 
		for(int i=0;i<5;i++) {percentage[i]=0;}
		for(int i=0;i<10;i++)
		{
			switch(grade[i])
			{
			   case "A" : {average[0]+=score[i];percentage[0]+=1;break;}
			   case "B" : {average[1]+=score[i];percentage[1]+=1;break;}
			   case "C" : {average[2]+=score[i];percentage[2]+=1;break;}
			   case "D" : {average[3]+=score[i];percentage[3]+=1;break;}
			   case "E" : {average[4]+=score[i];percentage[4]+=1;break;}
			}
		}
		for(int i=0;i<5;i++)
		{
		   if(percentage[i]==0)
		   {
			   average[i]=0;
		   }
		   else{
		    average[i]=average[i]/percentage[i];
		    percentage[i]=percentage[i]*100/10;
		   }
			
		}
		for(int i=0;i<5;i++)
		{
			result +="等级"+grade[i]+"的百分比; "+percentage[i]+"%, 平均分： "+average[i]+"\n";
		}
		return result;
	}
	  
   public ChineseGrade3()
	{
		score=inputScore();
		grade=judgeGrade(score);
		for(int i=0;i<10;i++)
		{
			System.out.println("成绩"+score[i]+"的等级是"+grade[i]);
		}
		result=count();
		JOptionPane.showMessageDialog(null, result, "成绩统计", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public static void main(String[] args)
	{
		ChineseGrade3 chinesegrade=new ChineseGrade3();
		System.exit(0);
	}

}
