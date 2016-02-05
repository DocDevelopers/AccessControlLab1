import java.util.ArrayList;

/**
 * Created by Doc on 1/22/16.
 */
class Connection {
    private int portNumber;
    private String ipAddress;

    public Connection(String ip, int port){
        this.ipAddress = ip;
        this.portNumber = port;
    }

    public String getIpAddress(){
        return this.ipAddress;
    }

    public int getPortNumber(){
        return this.portNumber;
    }

    public void setPortNumber(int mPortNumber){
        this.portNumber = mPortNumber;
    }

    public void setIpAddress(String mIpAddress){
        this.ipAddress = mIpAddress;
    }
}
