package TTT_lib;

class GameAI
{
	TGui tg;
	GameEng ge;
	int gamestate;
	boolean turn=true;
	GameAI(TGui tg,GameEng ge,int gamestate)
	{
		this.tg=tg;
		this.ge=ge;
		this.gamestate=gamestate;
	
		pL1();
	}
	
	void pL1()
	{
		System.out.println(tg);
		System.out.println(ge);
		System.out.println(ge.programCounter);
		System.out.println(gamestate);//for debugging!!
		
		if(gamestate==0 && turn==true)
		{
			if(tg.b[4].getText()!="X" && tg.b[4].getText()!="O"  && turn==true)
			{
				ge.markButton(4);
				turn=false;
			}
			if(tg.b[1].getText()!="X" && tg.b[1].getText()!="O" && turn==true)
			{
				if(tg.b[6].getText()=="X"  && tg.b[3].getText()!="X" && tg.b[3].getText()!="O")//cross check	
				{
					ge.markButton(3);
					turn=false;
				}
				else
				{
					ge.markButton(1);
					turn=false;
				}
			}
			if(tg.b[3].getText()!="X" && tg.b[3].getText()!="O" && turn==true)
			{
				if(tg.b[2].getText()=="X"  && tg.b[1].getText()!="X" && tg.b[1].getText()!="O")//cross check	
				{
					ge.markButton(1);
					turn=false;
				}
				else
				{
					ge.markButton(3);
					turn=false;
				}
			}
			if(tg.b[2].getText()!="X" && tg.b[2].getText()!="O" && turn==true)
			{
				if(tg.b[3].getText()=="X" && tg.b[6].getText()!="X" && tg.b[6].getText()!="O")//cross check	
				{
					ge.markButton(6);
					turn=false;
				}
				else
				{
					ge.markButton(2);
					turn=false;
				}
			}
			if(tg.b[6].getText()!="X" && tg.b[6].getText()!="O" && turn==true)
			{
				if(tg.b[1].getText()=="X" && tg.b[2].getText()!="X" && tg.b[2].getText()!="O")//cross check	
				{
					ge.markButton(2);
					turn=false;
				}
				else
				{
					ge.markButton(6);
					turn=false;
				}
			}
			if(tg.b[8].getText()!="X" && tg.b[8].getText()!="O" && turn==true)
			{
				ge.markButton(8);
				turn=false;
			}
			if(tg.b[7].getText()!="X" && tg.b[7].getText()!="O" && turn==true)
			{
				ge.markButton(7);
				turn=false;
			}
			if(tg.b[5].getText()!="X" && tg.b[5].getText()!="O" && turn==true)
			{
				ge.markButton(5);
				turn=false;
			}
			turn=false;
		}
		if(gamestate==1 && turn==true)
		{
			
			if(tg.b[4].getText()!="X" && tg.b[4].getText()!="O" && turn==true)
			{
				ge.markButton(4);
				turn=false;
			}
			if(tg.b[2].getText()!="X" && tg.b[2].getText()!="O" && turn==true)
			{
				ge.markButton(2);
				turn=false;
			}
			if(tg.b[0].getText()!="X" && tg.b[0].getText()!="O" && turn==true)
			{
				ge.markButton(0);
				turn=false;
			}
			if(tg.b[7].getText()!="X" && tg.b[7].getText()!="O" && turn==true)
			{
				ge.markButton(7);
				turn=false;
			}
			if(tg.b[3].getText()!="X" && tg.b[3].getText()!="O" && turn==true)
			{
				ge.markButton(3);
				turn=false;
			}
			if(tg.b[5].getText()!="X" && tg.b[5].getText()!="O" && turn==true)
			{
				ge.markButton(5);
				turn=false;
			}
			if(tg.b[6].getText()!="X" && tg.b[6].getText()!="O" && turn==true)
			{
				ge.markButton(6);
				turn=false;
			}
			if(tg.b[8].getText()!="X" && tg.b[8].getText()!="O" && turn==true)
			{
				ge.markButton(8);
				turn=false;
			}
			turn=false;
		}
		if(gamestate==2 && turn==true)
		{
			if(tg.b[4].getText()!="X" && tg.b[4].getText()!="O" && turn==true)
			{
				ge.markButton(4);
				turn=false;
			}
			if(tg.b[1].getText()!="X" && tg.b[1].getText()!="O" && turn==true)
			{
				if(tg.b[8].getText()=="X" && tg.b[5].getText()!="X" && tg.b[5].getText()!="O")//cross check	
				{
					ge.markButton(5);
					turn=false;
				}
				else
				{
					ge.markButton(1);
					turn=false;
				}
			}
			if(tg.b[5].getText()!="X" && tg.b[5].getText()!="O" && turn==true)
			{
				if(tg.b[0].getText()=="X" && tg.b[1].getText()!="X" && tg.b[1].getText()!="O")//cross check	
				{
					ge.markButton(1);
					turn=false;
				}
				else
				{
					ge.markButton(5);
					turn=false;
				}
			}
			if(tg.b[8].getText()!="X" && tg.b[8].getText()!="O" && turn==true)
			{
				if(tg.b[1].getText()=="X" && tg.b[0].getText()!="X" && tg.b[0].getText()!="O")//cross check	
				{
					ge.markButton(0);
					turn=false;
				}
				else
				{
					ge.markButton(8);
					turn=false;
				}
			}
			if(tg.b[0].getText()!="X" && tg.b[0].getText()!="O" && turn==true)
			{
				if(tg.b[5].getText()=="X" && tg.b[8].getText()!="X" && tg.b[8].getText()!="O")//cross check	
				{
					ge.markButton(8);
					turn=false;
				}
				else
				{
					ge.markButton(0);
					turn=false;
				}
			}
			if(tg.b[6].getText()!="X" && tg.b[6].getText()!="O" && turn==true)
			{
				ge.markButton(6);
				turn=false;
			}
			if(tg.b[7].getText()!="X" && tg.b[7].getText()!="O" && turn==true)
			{
				ge.markButton(7);
				turn=false;
			}
			if(tg.b[3].getText()!="X" && tg.b[3].getText()!="O" && turn==true)
			{
				ge.markButton(3);
				turn=false;
			}
			turn=false;
		}
		if(gamestate==3 && turn==true)
		{
			if(tg.b[4].getText()!="X" && tg.b[4].getText()!="O" && turn==true)
			{
				ge.markButton(4);
				turn=false;
			}
			if(tg.b[0].getText()!="X" && tg.b[0].getText()!="O" && turn==true)
			{
				ge.markButton(0);
				turn=false;
			}
			if(tg.b[6].getText()!="X" && tg.b[6].getText()!="O" && turn==true)
			{
				ge.markButton(6);
				turn=false;
			}
			if(tg.b[5].getText()!="X" && tg.b[5].getText()!="O" && turn==true)
			{
				ge.markButton(5);
				turn=false;
			}
			if(tg.b[1].getText()!="X" && tg.b[1].getText()!="O" && turn==true)
			{
				ge.markButton(1);
				turn=false;
			}
			if(tg.b[7].getText()!="X" && tg.b[7].getText()!="O" && turn==true)
			{
				ge.markButton(7);
				turn=false;
			}
			if(tg.b[2].getText()!="X" && tg.b[2].getText()!="O" && turn==true)
			{
				ge.markButton(2);
				turn=false;
			}
			if(tg.b[8].getText()!="X" && tg.b[8].getText()!="O" && turn==true)
			{
				ge.markButton(8);
				turn=false;
			}
			turn=false;
		}
		if(gamestate==4 && turn==true)//need work
		{
			if(tg.b[0].getText()!="X" && tg.b[0].getText()!="O" && turn==true)
			{
				ge.markButton(0);
				turn=false;
			}
			if(tg.b[1].getText()!="X" && tg.b[1].getText()!="O" && turn==true)
			{
				ge.markButton(1);turn=false;
			}
			if(tg.b[2].getText()!="X" && tg.b[2].getText()!="O" && turn==true)
			{
				ge.markButton(2);turn=false;
			}
			if(tg.b[3].getText()!="X" && tg.b[3].getText()!="O" && turn==true)
			{
				ge.markButton(3);turn=false;
			}
			if(tg.b[5].getText()!="X" && tg.b[5].getText()!="O" && turn==true)
			{
				ge.markButton(5);turn=false;
			}
			if(tg.b[6].getText()!="X" && tg.b[6].getText()!="O" && turn==true)
			{
				ge.markButton(6);turn=false;
			}
			if(tg.b[7].getText()!="X" && tg.b[7].getText()!="O" && turn==true)
			{
				ge.markButton(7);turn=false;
			}
			if(tg.b[8].getText()!="X" && tg.b[8].getText()!="O" && turn==true)
			{
				ge.markButton(8);turn=false;
			}
			turn=false;
			
		}
		if(gamestate==5 && turn==true)
		{
			if(tg.b[4].getText()!="X" && tg.b[4].getText()!="O" && turn==true)
			{
				ge.markButton(4);turn=false;
			}
			if(tg.b[2].getText()!="X" && tg.b[2].getText()!="O" && turn==true)
			{
				ge.markButton(2);turn=false;
			}
			if(tg.b[8].getText()!="X" && tg.b[8].getText()!="O" && turn==true)
			{
				ge.markButton(8);turn=false;
			}
			if(tg.b[3].getText()!="X" && tg.b[3].getText()!="O" && turn==true)
			{
				ge.markButton(3);turn=false;
			}
			if(tg.b[1].getText()!="X" && tg.b[1].getText()!="O" && turn==true)
			{
				ge.markButton(1);turn=false;
			}
			if(tg.b[7].getText()!="X" && tg.b[7].getText()!="O" && turn==true)
			{
				ge.markButton(7);turn=false;
			}
			if(tg.b[0].getText()!="X" && tg.b[0].getText()!="O" && turn==true)
			{
				ge.markButton(0);turn=false;
			}
			if(tg.b[6].getText()!="X" && tg.b[6].getText()!="O" && turn==true)
			{
				ge.markButton(6);turn=false;
			}
			turn=false;
		}
		if(gamestate==6 && turn==true)
		{
			if(tg.b[4].getText()!="X" && tg.b[4].getText()!="O" && turn==true)
			{
				ge.markButton(4);turn=false;
			}
			if(tg.b[3].getText()!="X" && tg.b[3].getText()!="O" && turn==true)
			{
				if(tg.b[8].getText()=="X" && tg.b[7].getText()!="X" && tg.b[7].getText()!="O")//cross check	
				{
					ge.markButton(7);turn=false;
				}
				else
				{
					ge.markButton(3);turn=false;
				}
			}
			if(tg.b[7].getText()!="X" && tg.b[7].getText()!="O" && turn==true)
			{
				if(tg.b[1].getText()=="X" && tg.b[0].getText()!="X" && tg.b[0].getText()!="O")//cross check	
				{
					ge.markButton(0);turn=false;
				}
				else
				{
					ge.markButton(8);turn=false;
				}
			}
			if(tg.b[0].getText()!="X" && tg.b[0].getText()!="O" && turn==true)
			{
				if(tg.b[7].getText()=="X" && tg.b[8].getText()!="X" && tg.b[8].getText()!="O")//cross check	
				{
					ge.markButton(8);turn=false;
				}
				else
				{
					ge.markButton(0);turn=false;
				}
			}
			if(tg.b[8].getText()!="X" && tg.b[8].getText()!="O" && turn==true)
			{
				if(tg.b[3].getText()=="X" && tg.b[0].getText()!="X" && tg.b[0].getText()!="O")//cross check	
				{
					ge.markButton(0);turn=false;
				}
				else
				{
					ge.markButton(8);turn=false;
				}
			}
			if(tg.b[1].getText()!="X" && tg.b[1].getText()!="O" && turn==true)
			{
				ge.markButton(1);turn=false;
			}
			if(tg.b[7].getText()!="X" && tg.b[7].getText()!="O" && turn==true)
			{
				ge.markButton(7);turn=false;
			}
			if(tg.b[2].getText()!="X" && tg.b[2].getText()!="O" && turn==true)
			{
				ge.markButton(2);turn=false;
			}
			turn=false;
		}
		if(gamestate==7 && turn==true)
		{
			if(tg.b[4].getText()!="X" && tg.b[4].getText()!="O" && turn==true)
			{
				ge.markButton(4);turn=false;
			}
			if(tg.b[6].getText()!="X" && tg.b[6].getText()!="O" && turn==true)
			{
				ge.markButton(6);turn=false;
			}
			if(tg.b[8].getText()!="X" && tg.b[8].getText()!="O" && turn==true)
			{
				ge.markButton(8);turn=false;
			}
			if(tg.b[1].getText()!="X" && tg.b[1].getText()!="O" && turn==true)
			{
				ge.markButton(1);turn=false;
			}
			if(tg.b[3].getText()!="X" && tg.b[3].getText()!="O" && turn==true)
			{
				ge.markButton(3);turn=false;
			}
			if(tg.b[5].getText()!="X" && tg.b[5].getText()!="O" && turn==true)
			{
				ge.markButton(5);turn=false;
			}
			if(tg.b[0].getText()!="X" && tg.b[0].getText()!="O" && turn==true)
			{
				ge.markButton(0);turn=false;
			}
			if(tg.b[2].getText()!="X" && tg.b[2].getText()!="O" && turn==true)
			{
				ge.markButton(2);turn=false;
			}
			turn=false;
		}
		if(gamestate==8 && turn==true)
		{
			if(tg.b[4].getText()!="X" && tg.b[4].getText()!="O" && turn==true)
			{
				ge.markButton(4);turn=false;
			}
			
			if(tg.b[7].getText()!="X" && tg.b[7].getText()!="O" && turn==true)
			{
				if(tg.b[2].getText()=="X" && tg.b[5].getText()!="X" && tg.b[5].getText()!="O")//cross check	
				{
					ge.markButton(5);turn=false;
				}
				else
				{
					ge.markButton(7);turn=false;
				}
			}
			if(tg.b[5].getText()!="X" && tg.b[5].getText()!="O" && turn==true)
			{
				if(tg.b[6].getText()=="X" && tg.b[7].getText()!="X" && tg.b[7].getText()!="O")//cross check	
				{
					ge.markButton(7);turn=false;
				}
				else
				{
					ge.markButton(5);turn=false;
				}
			}
			if(tg.b[6].getText()!="X" && tg.b[6].getText()!="O"  && turn==true)
			{
				if(tg.b[5].getText()=="X" && tg.b[2].getText()!="X" && tg.b[2].getText()!="O")//cross check	
				{
					ge.markButton(2);turn=false;
				}
				else
				{
					ge.markButton(6);turn=false;
				}
			}
			if(tg.b[2].getText()!="X" && tg.b[2].getText()!="O" && turn==true)
			{
				if(tg.b[7].getText()=="X" && tg.b[6].getText()!="X" && tg.b[6].getText()!="O")//cross check	
				{
					ge.markButton(6);turn=false;
				}
				else
				{
					ge.markButton(2);turn=false;
				}
			}
			if(tg.b[0].getText()!="X" && tg.b[0].getText()!="O" && turn==true)
			{
				ge.markButton(0);turn=false;
			}
			if(tg.b[3].getText()!="X" && tg.b[3].getText()!="O" && turn==true)
			{
				ge.markButton(3);turn=false;
			}
			if(tg.b[1].getText()!="X" && tg.b[1].getText()!="O" && turn==true)
			{
				ge.markButton(1);turn=false;
			}
			turn=false;
		}
	}
}