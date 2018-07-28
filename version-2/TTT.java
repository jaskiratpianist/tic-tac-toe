import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JFrame;
class TTT implements ActionListener
{
	JButton click[],reset;
	int counter=0;
	boolean gameOver=false;
	TTT()
	{
		JFrame f=new JFrame("tic-tac-toe");
		JPanel main=new JPanel(new BorderLayout());
		JPanel board=new JPanel(new GridLayout(3,3));
		click=new JButton[9];
		reset=new JButton("RESET");
		reset.addActionListener(this);

		for(int i=0;i<click.length;i++)
		{
			click[i]=new JButton();
			click[i].setBackground(Color.WHITE);
			click[i].addActionListener(this);
			click[i].setFont(new Font("Arial", Font.PLAIN, 40));
			click[i].setText(null);
			board.add(click[i]);
		}
		
 		main.add(board,BorderLayout.CENTER);
 		main.add(reset,BorderLayout.SOUTH);
 		f.add(main);
		f.setSize(400,400);
		f.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==reset)
		{
			for(int i=0;i<click.length;i++)
			{
				click[i].setBackground(Color.WHITE);
				click[i].setText(null);
				gameOver=false;
			}
		}
		for(int i=0;i<click.length;i++)
		{
			if(e.getSource()==click[i] && click[i].getText()==null &&  gameOver==false)
			{
				if(counter%2==0)
				click[i].setText("X");
				else
				click[i].setText("O");
			}
		}
		counter=counter+1;
		verify();
	}
	public void verify()
	{
		int win[][]={{0,1,2},{3,4,5},{6,7,8},{0,4,8},{2,4,6},{0,3,6},{1,4,7},{2,5,8}};
		for(int i=0;i<win.length;i++)
		{
			if((click[win[i][0]].getText()=="X" && click[win[i][1]].getText()=="X" && click[win[i][2]].getText()=="X")||(click[win[i][0]].getText()=="O" && click[win[i][1]].getText()=="O" && click[win[i][2]].getText()=="O"))
	 		{
	    		for(int k=0;k<3;k++)
	    		{
	    			click[win[i][k]].setBackground(Color.GREEN);
	    		}
	    		gameOver=true;
			}
		}
	}
	public static void main(String... arg)
	{
		new TTT();
	}
}