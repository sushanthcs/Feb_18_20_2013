import groovy.sql.Sql;

sql = Sql.newInstance("dburl", "user", "pwd")
sql.eachRow("select * from employees") {
	println it.columnName1 + ", " + it.columnName2
}
