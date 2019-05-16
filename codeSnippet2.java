//Code snippet after code review:
void methodName(SomeObject someObject) throws SQLException {
   try (Connection connection = DriverManager.getConnection
   (databaseConfig.getUrl(),
   databaseConfig.getUsername(), 
   databaseConfig.getPassword())) {
     upsertRecord(someObject, connection);
   } 
 }
