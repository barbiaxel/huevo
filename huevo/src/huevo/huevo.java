package huevo;

public class huevo {
	class yema {
		yema( ) { System.out.println ("Inicializando yema� "); }
	}
	
	class clara {
		clara( ) { System.out.println ("Inicializando clara� "); }
	}
		
	huevo ( ) { System.out.println ("Inicializando huevo� "); }
		yema hazYema ( ) {
		return new yema( );
	}
		
	clara hazClara ( ) {
		return new clara( );
	}
	public static void main (String[] args) {
		huevo h = new huevo( );
		yema y = h.hazYema( );
		clara c = h.hazClara( );
	}
}
	