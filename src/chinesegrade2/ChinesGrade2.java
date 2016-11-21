package chinesegrade2;

import javax.swing.JOptionPane;

public class ChinesGrade2 {
	
	public String chinesescore,grade="";	
	public ChinesGrade2()
	{
		do{
		chinesescore=JOptionPane.showInputDialog(null, "输入一个学生的语文成绩","输入", JOptionPane.INFORMATION_MESSAGE);
		int integerpart=Integer.parseInt(chinesescore);
		if(integerpart<=100&&integerpart>=0)
		{
			switch(integerpart/10)
			{
			   case 10: 
			   case 9 : {grade="A";break;}
			   case 8 : {grade="B";break;}
			   case 7 : {grade="C";break;}
			   case 6 : {grade="D";break;}
			   default  : {grade="E";break;}
			}
		}
		else{
			JOptionPane.showMessageDialog(null,"成绩输入错误", "错误", JOptionPane.WARNING_MESSAGE);
			
		}
		}while(grade=="");
		
		 JOptionPane.showMessageDialog(null, grade, chinesescore+"成绩等级",JOptionPane.INFORMATION_MESSAGE);
	}
	
	public static void main(String[] args)
	{
		ChinesGrade2 chinesegrade=new ChinesGrade2();
		System.exit(0);
		
	}
}
