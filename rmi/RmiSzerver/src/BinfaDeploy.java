import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class BinfaDeploy {
	public static void main(String[] args) throws Exception {
		// kívülről indított névjegyzék (port: 1099)
//		Registry reg = LocateRegistry.getRegistry();

		// saját registry
//		Registry reg = LocateRegistry.createRegistry(1099);
		Registry reg = LocateRegistry.createRegistry(1234);
		
		BinfaImpl binfaSzerver1 = new BinfaImpl(5);
		BinfaImpl binfaSzerver2 = new BinfaImpl(-35);

		reg.bind("szerver1", binfaSzerver1);
		reg.bind("szerver2", binfaSzerver2);
//		reg.rebind("szerver1", binfaSzerver2);
	}
}
