package Maven2;

public class excel_data_config_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		excel_data_config e = new excel_data_config("./data/orangehrm.xlsx");
		System.out.println(e.getdata(0, 0, 1));
		
	}

}
