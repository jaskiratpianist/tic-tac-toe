package TTT_lib;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class GameEng implements ActionListener
{
	TGui tg;
	boolean resBt=false,singleplayer=false;
	int gameState[];//to store all moves by player
	int programCounter=0;
	
	GameEng(TGui tg)
	{
		this.tg=tg;
		gameState=new int[tg.b.length+1];//it gives array index out of bound.that why we have to give 1 extra space in array
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==tg.b[0] && resBt==false)
		{
			markButton(0);
		}
		
		if(e.getSource()==tg.b[1]  && resBt==false)
		{
			markButton(1);
		}
		
		if(e.getSource()==tg.b[2]  && resBt==false)
		{
			markButton(2);
		}
		
		if(e.getSource()==tg.b[3]  && resBt==false)
		{
			markButton(3);
		}
		
		if(e.getSource()==tg.b[4]  && resBt==false)
		{
			markButton(4);
		}
		
		if(e.getSource()==tg.b[5]  && resBt==false)
		{
			markButton(5);
		}
		
		if(e.getSource()==tg.b[6]  && resBt==false)
		{
			markButton(6);
		}
		
		if(e.getSource()==tg.b[7]  && resBt==false)
		{
			markButton(7);
		}
		
		if(e.getSource()==tg.b[8]  && resBt==false)
		{
			markButton(8);
		}
		
		if(e.getSource()==tg.re)//reset everything:-all button clear,button color,resBt=false(makes button resBtponsive again) and programCounter=0!
		{
			for(int i=0;i<tg.b.length;i++)
			{
				tg.b[i].setText("");
				tg.b[i].setBackground(Color.WHITE);
			}
			tg.re.setBackground(null);
			tg.re.setText("Reset!!");
			resBt=false;
			programCounter=0;
		}
		
		if(e.getSource()==tg.undo && resBt==false && singleplayer==false)
		{
			if(tg.b[gameState[programCounter]].getText()=="X" || tg.b[gameState[programCounter]].getText()=="O")
			{	
				tg.b[gameState[programCounter]].setText("");
				programCounter--;
				//System.out.println(gameState[programCounter]+" gamestate");
				//System.out.println(programCounter+" pc");
			}
		}
		
		if(e.getSource()==tg.singleplr)
		{
			singleplayer=true;
			tg.disable.setVisible(true);
			tg.undo.setText("UNDO(disabled)");
			tg.undo.setBackground(Color.GRAY);
		}
		
		if(e.getSource()==tg.disable)
		{
			singleplayer=false;
			tg.disable.setVisible(false);
			tg.undo.setText("UNDO");
			tg.undo.setBackground(null);
		}
		if(programCounter%2!=0 && singleplayer==true)
		{
			new GameAI(tg,this,gameState[programCounter]);
			
		}//game AI
	
	}
	
	public void verify()
	{
		//rows
		if((tg.b[0].getText()=="X" && tg.b[1].getText()=="X" && tg.b[2].getText()=="X")||(tg.b[0].getText()=="O" && tg.b[1].getText()=="O" && tg.b[2].getText()=="O"))
		{
			makeChanges(0,1,2);
		}
		if((tg.b[3].getText()=="X" && tg.b[4].getText()=="X" && tg.b[5].getText()=="X")||(tg.b[3].getText()=="O" && tg.b[4].getText()=="O" && tg.b[5].getText()=="O"))
		{
			makeChanges(3,4,5);
		}
		if((tg.b[6].getText()=="X" && tg.b[7].getText()=="X" && tg.b[8].getText()=="X")||(tg.b[6].getText()=="O" && tg.b[7].getText()=="O" && tg.b[8].getText()=="O"))
		{
			makeChanges(6,7,8);
		}
		//coloumn
		if((tg.b[0].getText()=="X" && tg.b[3].getText()=="X" && tg.b[6].getText()=="X")||(tg.b[0].getText()=="O" && tg.b[3].getText()=="O" && tg.b[6].getText()=="O"))
		{
			makeChanges(0,3,6);
		}
		if((tg.b[1].getText()=="X" && tg.b[4].getText()=="X" && tg.b[7].getText()=="X")||(tg.b[1].getText()=="O" && tg.b[4].getText()=="O" && tg.b[7].getText()=="O"))
		{
			makeChanges(1,4,7);
		}
		if((tg.b[2].getText()=="X" && tg.b[5].getText()=="X" && tg.b[8].getText()=="X")||(tg.b[2].getText()=="O" && tg.b[5].getText()=="O" && tg.b[8].getText()=="O"))
		{
			makeChanges(2,5,8);
		}
		//diagonal
		if((tg.b[0].getText()=="X" && tg.b[4].getText()=="X" && tg.b[8].getText()=="X")||(tg.b[0].getText()=="O" && tg.b[4].getText()=="O" && tg.b[8].getText()=="O"))
		{
			makeChanges(0,4,8);
		}
		if((tg.b[2].getText()=="X" && tg.b[4].getText()=="X" && tg.b[6].getText()=="X")||(tg.b[2].getText()=="O" && tg.b[4].getText()=="O" && tg.b[6].getText()=="O"))
		{
			makeChanges(2,4,6);
		}
	}
	
	public void markButton(int target)//fuc for making changes in button which is clicked
	{
		if(tg.b[target].getText()!="X" && tg.b[target].getText()!="O")
		{	
			if(programCounter%2==0)
			{	
				tg.b[target].setText("X");
			}
			if(programCounter%2!=0)
			{	
				tg.b[target].setText("O");
			}
			programCounter++;
			gameState[programCounter]=target;
		}
		verify();
	}
	
	public void makeChanges(int first,int second,int third)//for making changes in those buttons which succssesfully made pair
	{
		tg.b[first].setBackground(Color.RED);
		tg.b[second].setBackground(Color.RED);
		tg.b[third].setBackground(Color.RED);
		fin();
	}
	
	public void fin()//when game finishes it make changes to gamestate:-make buttons unresponsive(resBt=true),change color and text of resBtet button 
	{
		resBt=true;
		tg.re.setBackground(Color.GREEN);
		tg.re.setText("PLAY AGAIN?");
	}
}