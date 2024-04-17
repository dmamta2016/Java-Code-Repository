import java.sql.Connection;
import java.sql.SQLException; import java.util.Properties; import javax.sql.DataSource;
import org.apache.commons.dbcp.DriverManagerConnectionFactory; import org.apache.commons.dbcp.PoolableConnection;
import org.apache.commons.dbcp.PoolableConnectionFactory; import org.apache.commons.dbcp.PoolingDataSource;
import org.apache.commons.pool.impl.GenericObjectPool; public class MySqlConnectionFactory {
private static interface Singleton {
final MySqlConnectionFactory INSTANCE = new MySqlConnectionFactory();
}
private final DataSource dataSource;
private MySqlConnectionFactory() { Properties properties = new Properties(); properties.setProperty("user", "root"); properties.setProperty("password", "root");
GenericObjectPool pool = new GenericObjectPool();
DriverManagerConnectionFactory connectionFactory = new DriverManagerConnectionFactory(
"jdbc:mysql://127.0.0.1/log4jlog", properties);
new PoolableConnectionFactory(connectionFactory, pool, null, "SELECT 1", 3, false, false, Connection.TRANSACTION_READ_COMMITTED);
this.dataSource = new PoolingDataSource(pool);
}
public static Connection getDatabaseConnection() throws SQLException { return Singleton.INSTANCE.dataSource.getConnection();
}}
