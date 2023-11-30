package utils;

public class Paths {
	public static final String ABEOPENCURRENTACCOUNTMUDARABAHCAACSV  = "csvFiles\\ABEOpenCurrentAccountMudarabahCAA.csv";
	public static final String ABEVERIFYCURRENTACCOUNTOPENINGCSV = "csvFiles\\ABEVerifyCurrentAccountOpeningMudarabahCAA.csv";
	public static final String ABEOPENCURRENTACCOUNTMUDARABAHJSON =  "jsonFiles\\" + ABEOPENCURRENTACCOUNTMUDARABAHCAACSV.substring(9, Paths.ABEOPENCURRENTACCOUNTMUDARABAHCAACSV.length()-4) + ".json";
	public static final String ABEVERIFYCURRENTACCOUNTOPENINGJSON = "jsonFiles\\" + ABEVERIFYCURRENTACCOUNTOPENINGCSV.substring(9, Paths.ABEVERIFYCURRENTACCOUNTOPENINGCSV.length()-4) + ".json";
	}