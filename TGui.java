package TTT_lib;

import javax.swing.*;
import java.awt.*;
public class TGui
{
	JButton b[],re,undo,singleplr,disable;
	JFrame f;
	JPanel p;//main panel
	JPanel tic;//panel for game gui
	JPanel tool;
	JLabel l;
	
	TGui()
	{
		f=new JFrame("TIC-TAC-TOE");
		b=new JButton[9];
		
		p=new JPanel(new BorderLayout());
		
		tic=new JPanel(new GridLayout(3,3));
		GameEng ge=new GameEng(this);
		for(int i=0;i<b.length;i++)
		{
			b[i]=new JButton("");
			b[i].addActionListener(ge);
			b[i].setFont(new Font("Arial", Font.PLAIN, 40));//newly learned!
			b[i].setBackground(Color.WHITE);
			tic.add(b[i],BorderLayout.CENTER);
		}
		p.add(tic,BorderLayout.CENTER);
		
		tool=new JPanel(new GridLayout());//tool panel
		re=new JButton("Reset!!");//reset button
		re.addActionListener(ge);
		tool.add(re);
		undo=new JButton("UNDO");//undo button
		undo.addActionListener(ge);
		tool.add(undo);
		singleplr=new JButton("Single Player!!");//single player
		singleplr.addActionListener(ge);
		tool.add(singleplr);
		disable=new JButton("  DISABLE!!  ");//disable single player
		disable.addActionListener(ge);
		disable.setBackground(Color.RED);
		singleplr.add(disable);
		disable.setVisible(false);
		p.add(tool,BorderLayout.SOUTH);
		
		l=new JLabel("    ******Game Developed By Jaskirat Singh******");
		p.add(l,BorderLayout.NORTH);
		
		f.add(p);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(450,450);
		f.setVisible(true);
	}
	
	
	public static void main(String... s)
	{
		new TGui();
	}
}