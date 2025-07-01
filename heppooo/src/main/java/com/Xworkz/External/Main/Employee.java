package com.Xworkz.External.Main;


import org.apache.poi.xssf.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


import java.io.FileInputStream;
import java.io.IOException;

public class Employee {
    public void Excel() throws IOException {
        String path="C:\\Users\\skand\\OneDrive\\Documents\\Assignment_X_Workz\\heppooo\\src\\detafiles\\Book1.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);

        XSSFWorkbook Workbook = new XSSFWorkbook(fileInputStream);
        XSSFSheet Sheet = Workbook.getSheetAt(0);

        int rows = Sheet.getLastRowNum();
        int column = Sheet.getRow(1).getLastCellNum();

        for(int r=0;r<=rows;r++){
            XSSFRow row = Sheet.getRow(r);
            for(int c=0;c<column;c++){
                XSSFComment cell = Sheet.getCellComment(c);
                switch (cell)
            }
        }

    }
}