class DatabaseManager{
	static Connection con;
		static{
			init();
		}
		static void init(){
			try{
				Class.forName("con.jdbc.odbc.JdbcOdbcDriver");
				con=DriverManager.setConnection("Jdbc:odbc");