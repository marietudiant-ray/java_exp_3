package chinesegrade;

import javax.swing.JOptionPane;
import static chinesegrade.ChineseGrade.*;


public class Input_Output {
	public static double ScoreInput()
	{
		int i=0;
		do{
		scoreString=JOptionPane.showInputDialog(null, "输入成绩百分值", "输入", JOptionPane.INFORMATION_MESSAGE);
		score=Double.parseDouble(scoreString);
		if(score>100||score<0){JOptionPane.showMessageDialog(null,"输入信息错误");continue;}
		else{break;}
		}while(i==0);
		return score;
	}
	public  static void gradeOutput()
	{
		score=ScoreInput();
		ChineseGrade chinesegrade=new ChineseGrade(score);
		JOptionPane.showMessageDialog(null, grade, "学生的成绩等级",JOptionPane.INFORMATION_MESSAGE);
	}
	
}
