package com.testScripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import jxl.Workbook;

public class ExcelRead {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileInputStream fi=new FileInputStream("/Users/ctl-user/SeleniumMavenProject/Resources/Indegene_Testdata.xlsx");
		XSSFWorkbook w=new XSSFWorkbook(fi);
		Sheet s=w.getSheet("data");
		Row r=s.getRow(1);
		Cell c=r.getCell(1);
		System.out.println(c);
		
	}

}

