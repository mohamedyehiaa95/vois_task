import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadCSVFile {

    public String[][] readFile() throws IOException, InvalidFormatException {
       FileInputStream myFile = new FileInputStream(new File("src/main/resources/Automation_practice_selenium.xlsx"));

        XSSFWorkbook workBook = new XSSFWorkbook(myFile);
        XSSFSheet mySheet = workBook.getSheetAt(0);

        int numberOfColumns = mySheet.getRow(0).getLastCellNum();

        String[][] sheetObject = new String[1][numberOfColumns];


            for (int j = 0; j < numberOfColumns; j++) {
                XSSFRow row = mySheet.getRow(0);

                sheetObject[0][j] = row.getCell(j).getStringCellValue();

            }



        return sheetObject;
    }

    public static void main(String[] args) throws IOException, InvalidFormatException {
        ReadCSVFile readCSVFile = new ReadCSVFile();

        readCSVFile.readFile();
    }

}

