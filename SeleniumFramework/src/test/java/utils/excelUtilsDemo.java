package utils;

public class excelUtilsDemo {

	public static void main(String[] args) {
		
		String projectPath = System.getProperty("user.dir");
	Excelutils excel = new Excelutils(projectPath+ "/excel/New XLSX Worksheet.xlsx", "Sheet1");
	
	excel.getRowCount();
	excel.getCellDataString(0, 0);
	excel.getCellDataNumber(1, 1);

	}

}
