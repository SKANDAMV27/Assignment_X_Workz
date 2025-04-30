package com.Xworkz.External.Main;


import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;


import java.io.FileInputStream;
import java.io.IOException;

public class Employee {
    public void Excel() throws IOException {
        String path="C:\\Users\\skand\\OneDrive\\Documents\\Assignment_X_Workz\\heppooo\\src\\detafiles\\Book1.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);

        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
        XSSFSheet Sheet =

    }
}
