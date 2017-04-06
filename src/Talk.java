import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Enumeration;

public class Talk {
	public static void main(String[] args) throws SocketException, UnknownHostException {
		
	    Enumeration<NetworkInterface> n = NetworkInterface.getNetworkInterfaces();
	    for (; n.hasMoreElements();)
	    {
	        NetworkInterface e = n.nextElement();

	        Enumeration<InetAddress> a = e.getInetAddresses();
	        for (; a.hasMoreElements();)
	        {
	            InetAddress addr = a.nextElement();
	            String addrs = addr.getHostAddress();
	            try {
					
	            	int pre = Integer.parseInt(addrs.substring(0,3));
	            	if(pre != 127)
	            		System.out.println(addrs);
				} catch (NumberFormatException e2) {
					// TODO: handle exception
				}
	        }
	    }
		
	}
}
