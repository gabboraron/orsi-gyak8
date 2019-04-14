import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class BinfaKliens {
	public static void main(String[] args) throws Exception {
//		Registry reg = LocateRegistry.getRegistry();
		Registry reg = LocateRegistry.getRegistry(1234);
		
		BinfaIface szerver1 = (BinfaIface)reg.lookup("szerver1");
		BinfaIface szerver2 = (BinfaIface)reg.lookup("szerver2");

		System.out.println(szerver1.getClass().getName());
		
		
		int valasz1 = szerver1.muvelet();
		int valasz2 = szerver1.muvelet();
		int valasz3 = szerver1.muvelet();
		int valasz4 = szerver1.muvelet();

		int valasz2_1 = szerver2.muvelet();
		int valasz2_2 = szerver2.muvelet();
		int valasz2_3 = szerver2.muvelet();

		System.out.println(valasz1);
		System.out.println(valasz2);
		System.out.println(valasz3);
		System.out.println(valasz4);
		System.out.println(valasz2_1);
		System.out.println(valasz2_2);
		System.out.println(valasz2_3);
	}
}
