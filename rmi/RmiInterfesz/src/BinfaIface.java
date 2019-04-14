import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Map;

public interface BinfaIface extends Remote {
	public int muvelet() throws RemoteException;
	public int muvelet(int a, double d, String s, Map<Integer, String> m) throws RemoteException;
	public int melyseg(BinFa b) throws RemoteException;
	public BinFa keszit() throws RemoteException;
	public BinFa tukroz(BinFa b) throws RemoteException;
	public BinFa kombinal(BinFa b1, BinFa b2) throws RemoteException;
}
