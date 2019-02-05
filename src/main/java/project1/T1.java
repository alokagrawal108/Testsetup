package project1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.apache.poi.ss.usermodel.Cell;

public class T1 {

	public static void main(String[] args) throws IOException {
		
		FileInputStream FI = new FileInputStream("//home//decimal//Automation//TestData//Test.xlsx");
		
		XSSFWorkbook WB = new XSSFWorkbook(FI);
		XSSFSheet WS = WB.getSheetAt(0);
		Row row = WS.getRow(0);
		Cell column = row.getCell(1);
		int rowcount = WS.getLastRowNum();
		
		for (int i=1;i<=rowcount;i++) {
			
			int colcount = WS.getRow(i).getLastCellNum();
			
			for (int j=0;j<colcount;j++)
			{
			
			Cell Text = WS.getRow(i).getCell(j);
			System.out.println(Text);
			
			}
		
			
		}
		
		//System.out.println(column);
		//System.out.println(rowcount);
		
		// TODO Auto-generated method stub
		
		System.out.println("hello");

	}

}
