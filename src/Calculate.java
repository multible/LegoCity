import java.util.ArrayList;
import java.util.List;

public class Calculate {

	public static void main(String[] args) {
		
		double gesamtPreis = 0;
		
		List<LegoBauteil> LegoCity = new ArrayList<LegoBauteil>();
		
		Legostein teil1 = new Legostein();
		Legostein teil2 = new Legostein();
//		Legostein teil3 = new Legostein();
		
		LegoCity.add(teil1);
		LegoCity.add(teil2);
//		LegoCity.add(teil3);
		
		List<LegoBauteil> schlossTeile = new ArrayList<LegoBauteil>();
		
		Legostein schloss1 = new Legostein();
		Legostein schloss2 = new Legostein();
		Legostein schloss3 = new Legostein();
		
		schlossTeile.add(schloss1);
		schlossTeile.add(schloss2);
		schlossTeile.add(schloss3);
		
		LegoBauteil schloss = new LegoKomposition(schlossTeile);
		
		LegoCity.add(schloss);
		
		for (LegoBauteil teil : LegoCity)
			gesamtPreis += teil.preis();
		
		System.out.println("LegoCity Wert: " + gesamtPreis + " Money");
	}

}
