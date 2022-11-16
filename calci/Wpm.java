package basics;

import java.time.LocalTime;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Wpm
    {
    	static String[] words= {"binary","elephant","microchip","bluetooth","compilation","thrift","radio","biscuit","candy","watch"};
	public static void main(String[] args) throws InterruptedException
	    { 
	            System.out.println("\t\t  Typing Speed Calculator");
	                    System.out.println("Type the below given words to know your typing speed ");
	                            System.out.println("5");
	                                    TimeUnit.SECONDS.sleep(1);
	                                    		System.out.println("4");
	                                    				TimeUnit.SECONDS.sleep(1);
		System.out.println("3");
				TimeUnit.SECONDS.sleep(1);
		System.out.println("2");
				TimeUnit.SECONDS.sleep(1);
		System.out.println("1");
				TimeUnit.SECONDS.sleep(1);
		Random rand=new Random();
				for (int i=0;i<10;i++)  
						{
									System.out.print (words[rand.nextInt(9)] + "  ");
											}
														System.out.println();
			double start=LocalTime.now().toNanoOfDay();
			Scanner scan =new Scanner (System.in);
						String typedwords=scan.nextLine();
	double end=LocalTime.now().toNanoOfDay();
			
						double elapsedTime=end-start;
						
									double seconds=elapsedTime/1000000000.0;
									
				int numChars=typedwords.length();
												
			int wpm=(int) ((((double)numChars/5)/seconds)*60);
			System.out.println("   THE RESULTS");
			System.out.println("Your Words per Minute is " +wpm+ "!");
									
												System.out.println("REMARKS:");
															if (wpm>=60)
															
	System.out.println("You've got an excellent typing speed");
																		
					else if(wpm>=30&&wpm<=59) 
					
	System.out.println("Your typing speed is good");
	
					else 
	System.out.println("You can improve in your typing speed");
																		}
																		}