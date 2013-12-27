package loader;

import java.util.LinkedHashMap;

import myastro.constants.Nakshatra;
import myastro.constants.matchmaker.Koota;
import myastro.constants.matchmaker.MatchResult;

public class MatchMakerMain {

	public static void main(String[] args) {

		
	}
	
	public static LinkedHashMap<Koota, MatchResult> checkAllPoruthams(Nakshatra boyStar, Nakshatra girlStar) {
		LinkedHashMap<Koota, MatchResult> poruthamResult = new LinkedHashMap<Koota, MatchResult>();
		/*poruthamResult.put(Koota.DINA, checkDinaPorutham(boyStar, girlStar));
		poruthamResult.put(Koota.GANA, checkGanaPorutham(boyStar, girlStar));
		poruthamResult.put(Koota.MAHENDRA, checkMahendraPorutham(boyStar, girlStar));
		poruthamResult.put(Koota.STHREE_DEERKHA, checkSthreeDeerkkaPorutham(boyStar, girlStar));
		poruthamResult.put(Koota.YONI, checkYoniPorutham(boyStar, girlStar));
		poruthamResult.put(Koota.RASHI, checkRashiPorutham(boyStar, girlStar));
		poruthamResult.put(Koota.RASHI_ATHIPATHI, checkRashiAthipathiPorutham(boyStar, girlStar));
		poruthamResult.put(Koota.VASIYA, checkVasiyaPorutham(boyStar, girlStar));
		poruthamResult.put(Koota.RAJJU, checkRajjuPorutham(boyStar, girlStar));
		poruthamResult.put(Koota.VEDHAI, checkVedhaiPorutham(boyStar, girlStar));
		poruthamResult.put(Koota.NAADI, checkNaadiPorutham(boyStar, girlStar));*/
		return poruthamResult;
	}	

}
