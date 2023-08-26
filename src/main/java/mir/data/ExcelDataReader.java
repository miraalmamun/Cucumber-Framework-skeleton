package mir.data;

import org.apache.poi.ss.usermodel.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ExcelDataReader {

    public static List<DataRow> readDataFromExcel(String filePath) throws IOException {
        List<DataRow> dataRows = new ArrayList<>();
        FileInputStream fis = new FileInputStream(filePath);
        Workbook workbook = WorkbookFactory.create(fis);
        Sheet sheet = workbook.getSheetAt(0); // Assuming the data is in the first sheet

        for (int rowIndex = 1; rowIndex <= sheet.getLastRowNum(); rowIndex++) {
            Row row = sheet.getRow(rowIndex);
            int number1 = (int) row.getCell(0).getNumericCellValue();
            int number2 = (int) row.getCell(1).getNumericCellValue();
            int expectedResult = (int) row.getCell(2).getNumericCellValue();
            dataRows.add(new DataRow(number1, number2, expectedResult));
        }

        workbook.close();
        fis.close();
        return dataRows;
    }
}
