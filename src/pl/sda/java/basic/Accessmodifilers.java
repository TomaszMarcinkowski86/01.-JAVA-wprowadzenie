package pl.sda.java.basic;



public class Accessmodifilers {
	
	private int x;
	public int y;
	
    public static void main(String[] args) {
    	
    	// kolejno�� kt�ra klasa jest najbardziej restrykcyjna
    	//private
    	//default
    	//protected
    	//public
    	
    	// wszystkie te modyfikatory mog� by� przypisane do zmiennych
    	
    	
    	
	
}
    // pozwala na dost�p do danego elementu ze wszystkich klas
    public void doSomethingPublic() {
    	
    }
    // dost�p do danego obiektu tylko dla klasy w kt�rym jest zdefiniowany 
    // tego u�ywamy najcz�ciej gdy tylko mo�emy. 
    // Dzi�ki temu program jest bezpieczniejszy i upraszcza interfejs dla objekt�w
    
    private void doSomethingPrivate() {
    	
    	
    }
    // pozwala na dost�p do doanego elementu tylko dla klas dziedziczonych oraz klas tego samego pakietu
    protected void doSomethingProtected() {
    	
    	
    }
    // default tu nie podajemy modyfikatora (samo void)
    //pozwala na dostt�p do danego elementu tylko klasom z danego pakietu 
    void doSomethning() {
    	
    }
    
}
