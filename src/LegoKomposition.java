import java.util.List;

public class LegoKomposition implements LegoBauteil {

	private List<LegoBauteil> teile;
	
	public LegoKomposition(List<LegoBauteil> newteile) {
		teile = newteile;
	}
	
	public double preis() {
		double preis = 0;
		
		for(LegoBauteil teil : teile) {
			preis += teil.preis();
		}
		return preis;
	}
}
