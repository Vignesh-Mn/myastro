package myastro.service.matchmaker.impl;

import myastro.constants.Nakshatra;
import myastro.constants.matchmaker.MatchResult;
import myastro.service.matchmaker.INakshatraKootaService;

public class NaadiKootaService implements INakshatraKootaService {

	private static final NaadiKootaService NAADI_KOOTA_SERVICE = new NaadiKootaService();

	public static NaadiKootaService getCheckNaadiKootaService() {
		return NAADI_KOOTA_SERVICE;
	}

	@Override
	public String getImportance() {
		return null;
	}

	@Override
	public MatchResult checkKoota(Nakshatra boyStar, Nakshatra girlStar) {
		return null;
	}

}
