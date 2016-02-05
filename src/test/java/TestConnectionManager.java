import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by Doc on 2/1/16.
 */
public class TestConnectionManager {

    @Test
    public void testAddConnection(){
        ConnectionManager.addConnection("127.0.0.1", 8888);
        ConnectionManager.addConnection("192.168.1.1", 80);
        ConnectionManager.addConnection("10.0.0.1", 80);

        String expected = "IP Address: 127.0.0.1 Port: 8888, IP Address: 192.168.1.1 Port: 80, IP Address: 10.0.0.1 Port: 80, ";

        assertEquals("Result not as expected", expected, ConnectionManager.displayConnections());

        ConnectionManager.removeConnection();
        ConnectionManager.removeConnection();
        ConnectionManager.removeConnection();


        assertEquals("Connection Manager did not remove testing connections", "", ConnectionManager.displayConnections());



    }
    @Test
    public void testRemoveConnection(){
        ConnectionManager.addConnection("127.0.0.1", 8888);
        ConnectionManager.addConnection("192.168.1.1", 80);
        ConnectionManager.addConnection("10.0.0.1", 80);

        ConnectionManager.removeConnection();
        ConnectionManager.removeConnection();
        ConnectionManager.removeConnection();


        assertEquals("Connection Manager did not remove testing connections", "", ConnectionManager.displayConnections());
    }
    @Test
    public void testGetConnection(){
        ConnectionManager.addConnection("127.0.0.1", 8888);
        ConnectionManager.addConnection("192.186.1.1", 80);
        ConnectionManager.addConnection("10.0.0.1", 80);

        ConnectionManager.getConnection();
        ConnectionManager.getConnection();
        Connection firstConnection = ConnectionManager.getConnection();
        assertEquals("IP AND PORT of connection not as expected", "ADDRESS: 127.0.0.1, PORT: 8888", "ADDRESS: "+ firstConnection.getIpAddress()+", PORT: "+firstConnection.getPortNumber());
        Connection connection = ConnectionManager.getConnection();
        assertNull("Object not NULL. Connection manager should not have any connections left.",connection);

        assertEquals("Connection Manager did not remove testing connections", "", ConnectionManager.displayConnections());

    }

    @Test
    public void testDisplayConnections(){
       
        ConnectionManager.addConnection("127.0.0.1", 8888);
        ConnectionManager.addConnection("192.168.1.1", 80);
        ConnectionManager.addConnection("10.0.0.1", 80);

        String result = ConnectionManager.displayConnections();
        String expected = "IP Address: 127.0.0.1 Port: 8888, IP Address: 192.168.1.1 Port: 80, IP Address: 10.0.0.1 Port: 80, ";

        assertEquals("Result not as expected", expected, result);

        ConnectionManager.removeConnection();
        ConnectionManager.removeConnection();
        ConnectionManager.removeConnection();

        assertEquals("Connection Manager did not remove testing connections", "", ConnectionManager.displayConnections());


    }
}
