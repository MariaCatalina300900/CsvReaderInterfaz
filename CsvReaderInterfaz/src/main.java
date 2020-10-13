import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class main {
    



 
    public static final String delimiter = ",";
   
   public static void read(String csvFile1) {
  
	   String csvFile = csvFile1;
		BufferedReader br = null;
		String line = "";
		int promedioIndividual=0;
		int promedio1=0;
		int promedio2=0;
		int promedio3=0;
		int promedio4=0;
		
		
		try
		{
			String[] tempArr;
			br = new BufferedReader(new FileReader(csvFile));
		
			
			while((line = br.readLine()) != null) {
	            tempArr = line.split(delimiter);
	            promedioIndividual+=Integer.parseInt(tempArr[2]);
	            promedioIndividual+=Integer.parseInt(tempArr[3]);
	            promedioIndividual+=Integer.parseInt(tempArr[4]);
	            promedioIndividual+=Integer.parseInt(tempArr[5]);
	            promedioIndividual=promedioIndividual/4;
	            promedio1+=Integer.parseInt(tempArr[2]);
	            promedio2+=Integer.parseInt(tempArr[3]);
	            promedio3+=Integer.parseInt(tempArr[4]);
	            promedio4+=Integer.parseInt(tempArr[5]);
	           
	            
	            
	            System.out.println(tempArr[1]+": "+promedioIndividual);
	            promedioIndividual=0;
	            }
			    promedio1=promedio1/19;
	            promedio2=promedio2/19;
	            promedio3=promedio3/19;
	            promedio4=promedio4/19;
			    System.out.println("Promedio 1: "+ promedio1);
			    System.out.println("Promedio 2: "+ promedio2);
			    System.out.println("Promedio 3: "+ promedio3);
			    System.out.println("Promedio 4: "+ promedio4);
	            System.out.println();
			
			 br.close();
		
       }
		
		catch(IOException ioe) {
        ioe.printStackTrace();
		}
		
	
	}

	   
	   
	   
  
   public static void main(String[] args) {
      // csv file to read
      String csvFile = "data/PromedioCSVjava.csv";
      main.read(csvFile);
   }
}