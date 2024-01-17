package game;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*; 
import javax.swing.border.Border;

public class MasterPanel extends JPanel implements ActionListener
{
	private int WIDTH = 500, HEIGHT = 700;
	private Dimension size = new Dimension(WIDTH, HEIGHT);
	private String firstColor, secondColor, thirdColor, fourthColor, inputColor;
	private int one, two, three, four, currentGuesses = 0, counter = 0;
	String wOne, wTwo, wThree, wFour;
	private JTextField textField;
	public Color [] colors = {Color.BLUE, Color.GREEN, Color.RED, 
			Color.YELLOW, Color.WHITE, Color.BLACK, Color.ORANGE, Color.PINK};
	Random rand = new Random();
	public MasterPanel() 
	{
		JOptionPane.showMessageDialog(null, "The objective of the game is to guess a randomly generated code. If the correct color dot is in the correct position,"
				+ " the corresponding dot on the right will turn black, otherwise it will remain white.");
		JOptionPane.showMessageDialog(null,  " You have 10 attempts to guess the code. The available colors are blue, green, red, yellow, orange, and pink.");
		JOptionPane.showMessageDialog(null, "Enter all four of your color guesses in the order you desire into the textbox at the top of the screen. Make sure that "
				+ " you have included only four colors, they are spelled correctly, and there are no repeat colors.");
		this.setPreferredSize(size);
		setFocusable(true);
		 textField = new JTextField();
		 textField.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		 textField.setHorizontalAlignment(SwingConstants.CENTER);
		 textField.setBounds(150,0,20,20);
		 add(textField);
		 textField.setColumns(40);
		 textField.addActionListener(this);
		 winningCode();
			System.out.println("Winning code: " + wOne + ", " + wTwo + ", " + wThree + ", " + wFour);
	}
	public void paintComponent(Graphics g)
	{
		if (counter == 1)
		{
			super.paintComponent(g);
			counter = 0;
		}
		draw(g);
	}
	public void draw(Graphics g)
	{
		
			if (currentGuesses == 1)
			{
				g.setColor(colors[one]);
				g.fillOval(100,100,35,35);
				g.setColor(colors[two]);
				g.fillOval(150,100,35,35);
				g.setColor(colors[three]);
				g.fillOval(200,100,35,35);
				g.setColor(colors[four]);
				g.fillOval(250,100,35,35);
				g.setColor(Color.RED);
				g.setFont(new Font("Times New Roman", Font.BOLD, 14));
				g.drawString("Attempt #1", 20, 125);
				if (firstColor.equals(wOne))
				{
					g.setColor(colors[5]);
				}
				else
				{
					g.setColor(colors[4]);
				}
				g.fillOval(400,100,17,17);
				if (secondColor.equals(wTwo))
				{
					g.setColor(colors[5]);
				}
				else
				{
					g.setColor(colors[4]);
				}
				g.fillOval(420,100,17,17);
				if (thirdColor.equals(wThree))
				{
					g.setColor(colors[5]);
				}
				else
				{
					g.setColor(colors[4]);
				}
				g.fillOval(400,120,17,17);
				if (fourthColor.equals(wFour))
				{
					g.setColor(colors[5]);
				}
				else
				{
					g.setColor(colors[4]);
				}
				g.fillOval(420,120,17,17);
			}
			else if (currentGuesses == 2)
			{
				g.setColor(colors[one]);
				g.fillOval(100,150,35,35);
				g.setColor(colors[two]);
				g.fillOval(150,150,35,35);
				g.setColor(colors[three]);
				g.fillOval(200,150,35,35);
				g.setColor(colors[four]);
				g.fillOval(250,150,35,35);
				g.setColor(Color.RED);
				g.setFont(new Font("Times New Roman", Font.BOLD, 14));
				g.drawString("Attempt #2", 20, 175);
				if (firstColor.equals(wOne))
				{
					g.setColor(colors[5]);
				}
				else
				{
					g.setColor(colors[4]);
				}
				g.fillOval(400,150,17,17);
				if (secondColor.equals(wTwo))
				{
					g.setColor(colors[5]);
				}
				else
				{
					g.setColor(colors[4]);
				}
				g.fillOval(420,150,17,17);
				if (thirdColor.equals(wThree))
				{
					g.setColor(colors[5]);
				}
				else
				{
					g.setColor(colors[4]);
				}
				g.fillOval(400,170,17,17);
				if (fourthColor.equals(wFour))
				{
					g.setColor(colors[5]);
				}
				else
				{
					g.setColor(colors[4]);
				}
				g.fillOval(420,170,17,17);
			}
			else if (currentGuesses == 3)
			{
				g.setColor(colors[one]);
				g.fillOval(100,200,35,35);
				g.setColor(colors[two]);
				g.fillOval(150,200,35,35);
				g.setColor(colors[three]);
				g.fillOval(200,200,35,35);
				g.setColor(colors[four]);
				g.fillOval(250,200,35,35);
				g.setColor(Color.RED);
				g.setFont(new Font("Times New Roman", Font.BOLD, 14));
				g.drawString("Attempt #3", 20, 225);
				if (firstColor.equals(wOne))
				{
					g.setColor(colors[5]);
				}
				else
				{
					g.setColor(colors[4]);
				}
				g.fillOval(400,200,17,17);
				if (secondColor.equals(wTwo))
				{
					g.setColor(colors[5]);
				}
				else
				{
					g.setColor(colors[4]);
				}
				g.fillOval(420,200,17,17);
				if (thirdColor.equals(wThree))
				{
					g.setColor(colors[5]);
				}
				else
				{
					g.setColor(colors[4]);
				}
				g.fillOval(400,220,17,17);
				if (fourthColor.equals(wFour))
				{
					g.setColor(colors[5]);
				}
				else
				{
					g.setColor(colors[4]);
				}
				g.fillOval(420,220,17,17);
			}
			else if (currentGuesses == 4)
			{
				g.setColor(colors[one]);
				g.fillOval(100,250,35,35);
				g.setColor(colors[two]);
				g.fillOval(150,250,35,35);
				g.setColor(colors[three]);
				g.fillOval(200,250,35,35);
				g.setColor(colors[four]);
				g.fillOval(250,250,35,35);
				g.setColor(Color.RED);
				g.setFont(new Font("Times New Roman", Font.BOLD, 14));
				g.drawString("Attempt #4", 20, 275);
				if (firstColor.equals(wOne))
				{
					g.setColor(colors[5]);
				}
				else
				{
					g.setColor(colors[4]);
				}
				g.fillOval(400,250,17,17);
				if (secondColor.equals(wTwo))
				{
					g.setColor(colors[5]);
				}
				else
				{
					g.setColor(colors[4]);
				}
				g.fillOval(420,250,17,17);
				if (thirdColor.equals(wThree))
				{
					g.setColor(colors[5]);
				}
				else
				{
					g.setColor(colors[4]);
				}
				g.fillOval(400,270,17,17);
				if (fourthColor.equals(wFour))
				{
					g.setColor(colors[5]);
				}
				else
				{
					g.setColor(colors[4]);
				}
				g.fillOval(420,270,17,17);
			}
			else if (currentGuesses == 5)
			{
				g.setColor(colors[one]);
				g.fillOval(100,300,35,35);
				g.setColor(colors[two]);
				g.fillOval(150,300,35,35);
				g.setColor(colors[three]);
				g.fillOval(200,300,35,35);
				g.setColor(colors[four]);
				g.fillOval(250,300,35,35);
				g.setColor(Color.RED);
				g.setFont(new Font("Times New Roman", Font.BOLD, 14));
				g.drawString("Attempt #5", 20, 325);
				if (firstColor.equals(wOne))
				{
					g.setColor(colors[5]);
				}
				else
				{
					g.setColor(colors[4]);
				}
				g.fillOval(400,300,17,17);
				if (secondColor.equals(wTwo))
				{
					g.setColor(colors[5]);
				}
				else
				{
					g.setColor(colors[4]);
				}
				g.fillOval(420,300,17,17);
				if (thirdColor.equals(wThree))
				{
					g.setColor(colors[5]);
				}
				else
				{
					g.setColor(colors[4]);
				}
				g.fillOval(400,320,17,17);
				if (fourthColor.equals(wFour))
				{
					g.setColor(colors[5]);
				}
				else
				{
					g.setColor(colors[4]);
				}
				g.fillOval(420,320,17,17);
			}
			else if (currentGuesses == 6)
			{
				g.setColor(colors[one]);
				g.fillOval(100,350,35,35);
				g.setColor(colors[two]);
				g.fillOval(150,350,35,35);
				g.setColor(colors[three]);
				g.fillOval(200,350,35,35);
				g.setColor(colors[four]);
				g.fillOval(250,350,35,35);
				g.setColor(Color.RED);
				g.setFont(new Font("Times New Roman", Font.BOLD, 14));
				g.drawString("Attempt #6", 20, 375);
				if (firstColor.equals(wOne))
				{
					g.setColor(colors[5]);
				}
				else
				{
					g.setColor(colors[4]);
				}
				g.fillOval(400,350,17,17);
				if (secondColor.equals(wTwo))
				{
					g.setColor(colors[5]);
				}
				else
				{
					g.setColor(colors[4]);
				}
				g.fillOval(420,350,17,17);
				if (thirdColor.equals(wThree))
				{
					g.setColor(colors[5]);
				}
				else
				{
					g.setColor(colors[4]);
				}
				g.fillOval(400,370,17,17);
				if (fourthColor.equals(wFour))
				{
					g.setColor(colors[5]);
				}
				else
				{
					g.setColor(colors[4]);
				}
				g.fillOval(420,370,17,17);
			}
			else if (currentGuesses == 7)
			{
				g.setColor(colors[one]);
				g.fillOval(100,400,35,35);
				g.setColor(colors[two]);
				g.fillOval(150,400,35,35);
				g.setColor(colors[three]);
				g.fillOval(200,400,35,35);
				g.setColor(colors[four]);
				g.fillOval(250,400,35,35);
				g.setColor(Color.RED);
				g.setFont(new Font("Times New Roman", Font.BOLD, 14));
				g.drawString("Attempt #7", 20, 425);
				if (firstColor.equals(wOne))
				{
					g.setColor(colors[5]);
				}
				else
				{
					g.setColor(colors[4]);
				}
				g.fillOval(400,400,17,17);
				if (secondColor.equals(wTwo))
				{
					g.setColor(colors[5]);
				}
				else
				{
					g.setColor(colors[4]);
				}
				g.fillOval(420,400,17,17);
				if (thirdColor.equals(wThree))
				{
					g.setColor(colors[5]);
				}
				else
				{
					g.setColor(colors[4]);
				}
				g.fillOval(400,420,17,17);
				if (fourthColor.equals(wFour))
				{
					g.setColor(colors[5]);
				}
				else
				{
					g.setColor(colors[4]);
				}
				g.fillOval(420,420,17,17);
			}
			else if (currentGuesses == 8)
			{
				g.setColor(colors[one]);
				g.fillOval(100,450,35,35);
				g.setColor(colors[two]);
				g.fillOval(150,450,35,35);
				g.setColor(colors[three]);
				g.fillOval(200,450,35,35);
				g.setColor(colors[four]);
				g.fillOval(250,450,35,35);
				g.setColor(Color.RED);
				g.setFont(new Font("Times New Roman", Font.BOLD, 14));
				g.drawString("Attempt #8", 20, 475);
				if (firstColor.equals(wOne))
				{
					g.setColor(colors[5]);
				}
				else
				{
					g.setColor(colors[4]);
				}
				g.fillOval(400,450,17,17);
				if (secondColor.equals(wTwo))
				{
					g.setColor(colors[5]);
				}
				else
				{
					g.setColor(colors[4]);
				}
				g.fillOval(420,450,17,17);
				if (thirdColor.equals(wThree))
				{
					g.setColor(colors[5]);
				}
				else
				{
					g.setColor(colors[4]);
				}
				g.fillOval(400,470,17,17);
				if (fourthColor.equals(wFour))
				{
					g.setColor(colors[5]);
				}
				else
				{
					g.setColor(colors[4]);
				}
				g.fillOval(420,470,17,17);
			}
			else if (currentGuesses == 9)
			{
				g.setColor(colors[one]);
				g.fillOval(100,500,35,35);
				g.setColor(colors[two]);
				g.fillOval(150,500,35,35);
				g.setColor(colors[three]);
				g.fillOval(200,500,35,35);
				g.setColor(colors[four]);
				g.fillOval(250,500,35,35);
				g.setColor(Color.RED);
				g.setFont(new Font("Times New Roman", Font.BOLD, 14));
				g.drawString("Attempt #9", 20, 525);
				if (firstColor.equals(wOne))
				{
					g.setColor(colors[5]);
				}
				else
				{
					g.setColor(colors[4]);
				}
				g.fillOval(400,500,17,17);
				if (secondColor.equals(wTwo))
				{
					g.setColor(colors[5]);
				}
				else
				{
					g.setColor(colors[4]);
				}
				g.fillOval(420,500,17,17);
				if (thirdColor.equals(wThree))
				{
					g.setColor(colors[5]);
				}
				else
				{
					g.setColor(colors[4]);
				}
				g.fillOval(400,520,17,17);
				if (fourthColor.equals(wFour))
				{
					g.setColor(colors[5]);
				}
				else
				{
					g.setColor(colors[4]);
				}
				g.fillOval(420,520,17,17);
			}
			else if (currentGuesses == 10)
			{
				g.setColor(colors[one]);
				g.fillOval(100,550,35,35);
				g.setColor(colors[two]);
				g.fillOval(150,550,35,35);
				g.setColor(colors[three]);
				g.fillOval(200,550,35,35);
				g.setColor(colors[four]);
				g.setColor(Color.RED);
				g.setFont(new Font("Times New Roman", Font.BOLD, 14));
				g.drawString("Attempt #10", 20, 575);
				if (firstColor.equals(wOne))
				{
					g.setColor(colors[5]);
				}
				else
				{
					g.setColor(colors[4]);
				}
				g.fillOval(400,550,17,17);
				if (secondColor.equals(wTwo))
				{
					g.setColor(colors[5]);
				}
				else
				{
					g.setColor(colors[4]);
				}
				g.fillOval(420,550,17,17);
				if (thirdColor.equals(wThree))
				{
					g.setColor(colors[5]);
				}
				else
				{
					g.setColor(colors[4]);
				}
				g.fillOval(400,570,17,17);
				if (fourthColor.equals(wFour))
				{
					g.setColor(colors[5]);
				}
				else
				{
					g.setColor(colors[4]);
				}
				g.fillOval(420,570,17,17);
			}
		g.setColor(Color.RED);
		g.setFont(new Font("Ink Free", Font.BOLD, 14));
		g.drawString("Enter BLUE, GREEN, RED, YELLOW, ORANGE or PINK to select a color",10, 60);
		g.drawString("IN THE ORDER YOU WANT THEM TO APPEAR IN", 65, 80);
		g.drawString("Enter STARTOVER If You Give Up or Messed Up", 65, 650);
		if (checkWinner() == true)
		{
			g.setColor(Color.CYAN);
			g.fillOval(100,100,35,35);
			g.fillOval(150,100,35,35);
			g.fillOval(200,100,35,35);
			g.fillOval(250,100,35,35);
			g.fillOval(400,100,17,17);
			g.fillOval(420,100,17,17);
			g.fillOval(400,120,17,17);
			g.fillOval(420,120,17,17);
			repaint();
		}
	}
	 
	 private boolean checkWinner() 
	 {
		 if (currentGuesses > 0 && firstColor.equals(wOne) && secondColor.equals(wTwo) && thirdColor.equals(wThree) && fourthColor.equals(wFour))
		 {
			 return true;
		 }
		 return false;
	 }
	 private void startOver() 
		{
			repaint();
			currentGuesses = 0;
			firstColor = "";
			secondColor = "";
			thirdColor = "";
			fourthColor = "";
			winningCode();
			System.out.println("Winning code: " + wOne + ", " + wTwo + ", " + wThree + ", " + wFour);
		}
	 private void winningCode()
	 {
		 int a = 0, b = 0, c = 0, d = 0;
		 a = rand.nextInt(7);
			b = rand.nextInt(7);
			c = rand.nextInt(7);
			d = rand.nextInt(7);
			if (a == 0)
			{
				a++;
			}
			if (b == 0)
			{
				b++;
			}
			if (c == 0)
			{
				c++;
			}
			if (d == 0)
			{
				d++;
			}
			while (a == b || a == c || a == d)
			{
				a = rand.nextInt(7);
				if (a == 0)
				{
					a++;
				}
			}
			while (b == a || b == c || b == d)
			{
				b = rand.nextInt(7);
				if (b == 0)
				{
					b++;
				}
			}
			while (c == a || c == b || c == d)
			{
				c = rand.nextInt(7);
				if (c == 0)
				{
					c++;
				}
			}
			while (d == a || d == b || d == c)
			{
				d = rand.nextInt(7);
				if (d == 0)
				{
					d++;
				}
			}
			if (a == 1)
			{
				wOne = "blue";
			}
			else if (a == 2)
			{
				wOne = "green";
			}
			else if (a == 3)
			{
				wOne = "red";
			}
			else if (a == 4)
			{
				wOne = "yellow";
			}
			else if (a == 5)
			{
				wOne = "orange";
			}
			else if (a == 6)
			{
				wOne = "pink";
			}
			
			if (b == 1)
			{
				wTwo = "blue";
			}
			else if (b == 2)
			{
				wTwo = "green";
			}
			else if (b == 3)
			{
				wTwo = "red";
			}
			else if (b == 4)
			{
				wTwo = "yellow";
			}
			else if (b == 5)
			{
				wTwo = "orange";
			}
			else if (b == 6)
			{
				wTwo = "pink";
			}
			if (c == 1)
			{
				wThree = "blue";
			}
			else if (c == 2)
			{
				wThree = "green";
			}
			else if (c == 3)
			{
				wThree = "red";
			}
			else if (c == 4)
			{
				wThree = "yellow";
			}
			else if (c == 5)
			{
				wThree = "orange";
			}
			else if (c == 6)
			{
				wThree = "pink";
			}
			if (d == 1)
			{
				wFour = "blue";
			}
			else if (d == 2)
			{
				wFour = "green";
			}
			else if (d == 3)
			{
				wFour = "red";
			}
			else if (d == 4)
			{
				wFour = "yellow";
			}
			else if (d == 5)
			{
				wFour = "orange";
			}
			else if (d == 6)
			{
				wFour = "pink";
			}
	 }
	 private void getColors()
	 {
		 if (inputColor.startsWith("b"))
		 {
			 firstColor = "blue";
			 one = 0;
			 String temp = inputColor.substring(4, inputColor.length());
			 inputColor = temp;
		 }
		 else if (inputColor.startsWith("g"))
		 {
			 firstColor = "green";
			 one = 1;
			 
			 String temp = inputColor.substring(5, inputColor.length());
			 inputColor = temp;
		 }
		 else if (inputColor.startsWith("r"))
		 {
			 firstColor = "red";
			 one = 2;
			 String temp = inputColor.substring(3, inputColor.length());
			 inputColor = temp;
		 }
		 else if (inputColor.startsWith("y"))
		 {
			 firstColor = "yellow";
			 one = 3;
			 String temp = inputColor.substring(6, inputColor.length());
			 inputColor = temp;
		 }
		 else if (inputColor.startsWith("o"))
		 {
			 firstColor = "orange";
			 one = 6;
			 String temp = inputColor.substring(6, inputColor.length());
			 inputColor = temp;
		 }
		 else if (inputColor.startsWith("p"))
		{
			 firstColor = "pink";
			 one = 7;
			 String temp = inputColor.substring(4, inputColor.length());
			 inputColor = temp;
		}
		 else if (inputColor.startsWith("s"))
		{
			int loser = JOptionPane.showConfirmDialog(null, "The correct code was: " + wOne + ", " + wTwo + ", " + wThree + ", " + wFour + ". Play Again?", "Game Over",JOptionPane.YES_NO_OPTION);
   			if (loser == 0)
      		 {
      			 startOver();
      			 
      			this.setBackground(Color.CYAN);
      		 }
   			else
   			{
   				System.exit(0);
   			}
   			counter = 1;	 
		}
		 if (inputColor.startsWith("b"))
		 {
			 secondColor = "blue";
			 two = 0;
			 String temp = inputColor.substring(4, inputColor.length());
			 inputColor = temp;
		 }
		 else if (inputColor.startsWith("g"))
		 {
			 secondColor = "green";
			 two = 1;
			 String temp = inputColor.substring(5, inputColor.length());
			 inputColor = temp;
		 }
		 else if (inputColor.startsWith("r"))
		 {
			 secondColor = "red";
			 two = 2;
			 String temp = inputColor.substring(3, inputColor.length());
			 inputColor = temp;
		 }
		 else if (inputColor.startsWith("y"))
		 {
			 secondColor = "yellow";
			 two = 3;
			 String temp = inputColor.substring(6, inputColor.length());
			 inputColor = temp;
		 }
		 else if (inputColor.startsWith("o"))
		 {
			 secondColor = "orange";
			 two = 6;
			 String temp = inputColor.substring(6, inputColor.length());
			 inputColor = temp;
		 }
		 else if (inputColor.startsWith("p"))
		{
			 secondColor = "pink";
			 two = 7;
			 String temp = inputColor.substring(4, inputColor.length());
			 inputColor = temp;
		}
		 if (inputColor.startsWith("b"))
		 {
			 thirdColor = "blue";
			 three = 0;
			 String temp = inputColor.substring(4, inputColor.length());
			 inputColor = temp;
		 }
		 else if (inputColor.startsWith("g"))
		 {
			 thirdColor = "green";
			 three = 1;
			 String temp = inputColor.substring(5, inputColor.length());
			 inputColor = temp;
		 }
		 else if (inputColor.startsWith("r"))
		 {
			 thirdColor = "red";
			 three = 2;
			 String temp = inputColor.substring(3, inputColor.length());
			 inputColor = temp;
		 }
		 else if (inputColor.startsWith("y"))
		 {
			 thirdColor = "yellow";
			 three = 3;
			 String temp = inputColor.substring(6, inputColor.length());
			 inputColor = temp;
		 }
		 else if (inputColor.startsWith("o"))
		 {
			 thirdColor = "orange";
			 three = 6;
			 String temp = inputColor.substring(6, inputColor.length());
			 inputColor = temp;
		 }
		 else if (inputColor.startsWith("p"))
		{
			 thirdColor = "pink";
			 three = 7;
			 String temp = inputColor.substring(4, inputColor.length());
			 inputColor = temp;
		}
		 if (inputColor.startsWith("b"))
		 {
			 fourthColor = "blue";
			 four = 0;
			 String temp = inputColor.substring(4, inputColor.length());
			 inputColor = temp;
		 }
		 else if (inputColor.startsWith("g"))
		 {
			 fourthColor = "green";
			 four = 1;
			 String temp = inputColor.substring(5, inputColor.length());
			 inputColor = temp;
		 }
		 else if (inputColor.startsWith("r"))
		 {
			 fourthColor = "red";
			 four = 2;
			 String temp = inputColor.substring(3, inputColor.length());
			 inputColor = temp;
		 }
		 else if (inputColor.startsWith("y"))
		 {
			 fourthColor = "yellow";
			 four = 3;
			 String temp = inputColor.substring(6, inputColor.length());
			 inputColor = temp;
		 }
		 else if (inputColor.startsWith("o"))
		 {
			 fourthColor = "orange";
			 four = 6;
			 String temp = inputColor.substring(6, inputColor.length());
			 inputColor = temp;
		 }
		 else if (inputColor.startsWith("p"))
		{
			 fourthColor = "pink";
			 four = 7;
			 String temp = inputColor.substring(4, inputColor.length());
			 inputColor = temp;
		}
		 
	 }
	 @Override
	 public void actionPerformed(ActionEvent e)
	 {
		repaint();
		String str = "";
		 inputColor = textField.getText().toLowerCase();
		 for (int x = 0; x < inputColor.length(); x++)
		 {
			 if (Character.isLetter(inputColor.charAt(x)))
			 {
				 str += inputColor.charAt(x);
			 }
		 }
		 inputColor = str;
		 str = "";
		 if (inputColor != "" )
		 {
			 currentGuesses++;
			getColors();
			
		 }
		 
		 textField.setText("");
		 if (checkWinner() == true)
		 {
			 int winner = JOptionPane.showConfirmDialog(null, "You Won in " + currentGuesses + " Attempts! Play Again?", "Game Over",JOptionPane.YES_NO_OPTION);
	   			if (winner == 0)
	      		 {
	      			 startOver();
	      			this.setBackground(Color.CYAN);
	      		 }
	   			else
	   			{
	   				System.exit(0);
	   			}
			 counter = 1;
		 }
		 else if (currentGuesses >= 10)
		 {
			 int loser = JOptionPane.showConfirmDialog(null, "The correct code was: " + wOne + ", " + wTwo + ", " + wThree + ", " + wFour + ". Play Again?", "Game Over",JOptionPane.YES_NO_OPTION);
	   			if (loser == 0)
	      		 {
	      			 startOver();
	      			this.setBackground(Color.CYAN);
	      		 }
	   			else
	   			{
	   				System.exit(0);
	   			}
	   			counter = 1;
		 }
	 }
	
}

