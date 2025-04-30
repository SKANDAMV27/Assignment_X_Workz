package com.xworkz.skanda.internal;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Bottle {
    public void readExcel() throws IOException {

        String path="C:\\Users\\skand\\OneDrive\\Documents\\Assignment_X_Workz\\untitled\\src\\datafiles\\Book1.xlsx";
        FileInputStream fileInputStream=new FileInputStream(path);


        XSSFWorkbook workbook=new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet=workbook.getSheetAt(0);
     //   XSSFSheet sheet=workbook.getSheet("sheet1");


        int rows=sheet.getLastRowNum();
        int cols=sheet.getRow(1).getLastCellNum();

        for(int r=0;r<=rows;r++){

            XSSFRow row=sheet.getRow(r);
            for(int c=0;c<cols;c++){

                XSSFCell cell=row.getCell(c);
                switch (cell.getCellType()){
                    case STRING :
                        System.out.println(cell.getStringCellValue());break;
                    case NUMERIC:
                        System.out.println(cell.getNumericCellValue()); break;
                }
            }
            System.out.println(" |  ");

        }
    }

}
