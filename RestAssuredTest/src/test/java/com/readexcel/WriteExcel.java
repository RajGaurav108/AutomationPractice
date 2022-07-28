package com.readexcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import groovyjarjarpicocli.CommandLine.IFactory;

public class WriteExcel 
{
	public static void main(String[] args) 
	{
		try
		{
			FileInputStream file = new FileInputStream(new File("C:\\Users\\ragaurav\\TestData\\LoginData.xlsx"));

			//Create Workbook instance holding reference to .xlsx file
			XSSFWorkbook workbook = new XSSFWorkbook(file);

			//Get first/desired sheet from the workbook
			XSSFSheet sheet = workbook.getSheetAt(0);

			//Iterate through each rows one by one
			Iterator<Row> rowIterator = sheet.iterator();
			int cnt = 0;
			rowIterator.next();
			String LoginRes;
			while (rowIterator.hasNext()) 
			{
				LoginRes = "LoginPass";
				Row row = rowIterator.next();
				workbook.setMissingCellPolicy(Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);

				//For each row, iterate through all the columns
				String username = row.getCell(1).getStringCellValue();
				String password = row.getCell(2).getStringCellValue();
				String expres = row.getCell(3).getStringCellValue();

				System.out.println(username+" "+password);
				if(username.isBlank() || password.isBlank()) {
					LoginRes = "LoginFail";
				}
				row.createCell(4).setCellValue(LoginRes);
				cnt++;

			}
			FileOutputStream out = new FileOutputStream(new File("C:\\Users\\ragaurav\\TestData\\LoginResult.xlsx"));
            workbook.write(out);
            out.close();
            
            file.close();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}