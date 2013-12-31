package loader;

import java.util.LinkedHashMap;
import java.util.Map;

import myastro.constants.Nakshatra;
import myastro.constants.Rashi;
import myastro.constants.matchmaker.Koota;
import myastro.constants.matchmaker.MatchResult;
import myastro.service.matchmaker.IKootaService;
import myastro.service.matchmaker.INakshatraKootaService;
import myastro.service.matchmaker.IRashiKootaService;
import myastro.service.matchmaker.impl.DinaKootaService;
import myastro.service.matchmaker.impl.GanaKootaService;
import myastro.service.matchmaker.impl.MahendraKootaService;
import myastro.service.matchmaker.impl.NaadiKootaService;
import myastro.service.matchmaker.impl.RajjuKootaService;
import myastro.service.matchmaker.impl.RashiAthipatiKootaService;
import myastro.service.matchmaker.impl.RashiKootaService;
import myastro.service.matchmaker.impl.SthreeDeerkhaKootaService;
import myastro.service.matchmaker.impl.VashiyaKootaService;
import myastro.service.matchmaker.impl.VedhaiKootaService;
import myastro.service.matchmaker.impl.YoniKootaService;

public class MatchMakerMain {

	public static void main(String[] args) {
		LinkedHashMap<Koota, MatchResult> kootaResult = MatchMakerMain.checkAllKootas(Nakshatra.ROHINI, Nakshatra.ASHLESHA);
		int totalMatch = 0;
		for (Map.Entry<Koota, MatchResult> result : kootaResult.entrySet()) {
			System.out.println(result.getKey() + " ==== " + result.getValue().name());
			totalMatch += result.getValue().getValue();
		}
		System.out.println("Total Score :- " + totalMatch);
		
	}

	public static LinkedHashMap<Koota, MatchResult> checkAllKootas(Nakshatra boyStar, Nakshatra girlStar) {
		LinkedHashMap<Koota, MatchResult> poruthamResult = new LinkedHashMap<Koota, MatchResult>();
		MatchResult result;
		for (Koota koota : Koota.values()) {
			if (koota.getKootaType().equals("N")) {
				result = ((INakshatraKootaService) getKootaService(koota)).checkKoota(boyStar, girlStar);
				poruthamResult.put(koota, result);
			} else {
				result = ((IRashiKootaService) getKootaService(koota)).checkKoota(Rashi.VRISABHA, Rashi.KARKATA);
				poruthamResult.put(koota, result);
			}
		}

		return poruthamResult;
	}

	private static IKootaService getKootaService(Koota koota) {
		IKootaService kootaService = null;
		switch (koota) {
		case DINA:
			kootaService = DinaKootaService.getCheckDinaKootaService();
			break;
		case GANA:
			kootaService = GanaKootaService.getGanaKootaService();
			break;
		case MAHENDRA:
			kootaService = MahendraKootaService.getMahendraKootaService();
			break;
		case NAADI:
			kootaService = NaadiKootaService.getCheckNaadiKootaService();
			break;
		case RAJJU:
			kootaService = RajjuKootaService.getCheckRajjuKootaService();
			break;
		case RASHI:
			kootaService = RashiKootaService.getCheckRashiKootaService();
			break;
		case RASHI_ATHIPATI:
			kootaService = RashiAthipatiKootaService.getCheckRashiAthipatiKootaService();
			break;
		case STHREE_DEERKHA:
			kootaService = SthreeDeerkhaKootaService.getCheckSthreeDeerkhaKootaService();
			break;
		case VASHIYA:
			kootaService = VashiyaKootaService.getCheckVashiyaKootaService();
			break;
		case VEDHAI:
			kootaService = VedhaiKootaService.getCheckVedhaiKootaService();
			break;
		case YONI:
			kootaService = YoniKootaService.getCheckYoniKootaService();
			break;
		}
		return kootaService;
	}

}
