import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Map;

public class BinfaImpl extends UnicastRemoteObject implements BinfaIface {
	public BinfaImpl(int kezdoertek) throws RemoteException {
		this.szamlalo = kezdoertek;
	}

	int szamlalo = 0;
	
	@Override
	public int muvelet() throws RemoteException {
		++szamlalo;
		return szamlalo;
	}

	@Override
	public int melyseg(BinFa b) throws RemoteException {
		return 0;
	}

	@Override
	public int muvelet(int a, double d, String s, Map<Integer, String> m) throws RemoteException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public BinFa keszit() throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BinFa tukroz(BinFa b) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BinFa kombinal(BinFa b1, BinFa b2) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

}
