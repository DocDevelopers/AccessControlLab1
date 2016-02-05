import java.util.ArrayList;

/**
 * Created by Doc on 1/22/16.
 */
public class ConnectionManager{
    static ArrayList<Connection> mConnections = new ArrayList<Connection>();

    public ConnectionManager(){

    }

    public static Connection getConnection(){
        if(mConnections.size() > 0){
            Connection lastConnection = mConnections.get(mConnections.size()-1);
            mConnections.remove(lastConnection);
            return lastConnection;
        }else
            return null;
    }

    public static void addConnection(String ip, int port){
        mConnections.add(new Connection(ip, port));
    }

    public static void removeConnection(){
        mConnections.remove(0);

    }

    public static String displayConnections(){
        String result = "";
        for(Connection mConnection : mConnections){
            result += "IP Address: "+mConnection.getIpAddress() +" Port: "+ mConnection.getPortNumber()+", ";
        }

        return result;
    }

}

