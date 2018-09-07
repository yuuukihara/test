

public class a {
	public static void main(String[]args)
	int first = 0;
		int itemPrice = 0;
		int oturi = 0;
		int pay = 0;
		String msg = "";
		for(String itempay:keisan){
			int a = Integer.parseInt(itempay);
			if(first==0){
				itemPrice = a;
				first++;
			}else{
				pay = a;
				oturi = pay-itemPrice;

				int itiman=0;
				int gosen=0;
				int sen=0;
				int ghyaku=0;
				int hyaku=0;
				int goju=0;
				int ju=0;
				int go=0;
				int iti=0;

				for(int b=0; b< 10;b++){
					if(oturi>=10000){
						itiman += 1;
						oturi-=10000;
					}
				}
				for(int b=0; b< 10;b++){
					if(oturi>=5000){
						gosen += 1;
						oturi-=5000;
					}
				}
				for(int b=0; b< 10;b++){
					if(oturi>=1000){
						sen += 1;
						oturi-=1000;
					}
				}
				for(int b=0; b< 10;a++){
					if(oturi>=500){
						ghyaku += 1;
						oturi-=500;
					}
				}
				for(int b=0; b< 10;a++){
					if(oturi>=100){
						hyaku += 1;
						oturi -=100;
					}
				}
				for(int b=0; b< 10;b++){
					if(oturi>=50){
						goju += 1;
						oturi -= 50;
					}
				}
				for(int b=0; b< 10;b++){
					if(oturi>=10){
						ju += 1;
						oturi-=10;
					}
				}
				for(int b=0; b< 10;b++){
					if(oturi>=5){
						go += 1;
						oturi-=5;
					}
				}
				for(int b=0; b< 10;b++){
					if(oturi>=1){
						iti += 1;
						oturi -= 1;
					}
				}
				String itiman1 = Integer.toString(itiman);
				String gosen1 = Integer.toString(gosen);
				String sen1 = Integer.toString(sen);
				String ghyaku1 = Integer.toString(ghyaku);
				String hyaku1 = Integer.toString(hyaku);
				String goju1 = Integer.toString(goju);
				String ju1 = Integer.toString(ju);
				String go1 = Integer.toString(go);
				String iti1 = Integer.toString(iti);
				msg = "一万円:"+itiman1+"五千円:"+gosen1+"千円:"+sen1+"五百円:"+ghyaku1+"百円:"+hyaku1+"五十円:"+goju1+"十円:"+ju1+"五円:"+go1+"一円:"+iti1;
			}

		}
		return msg;

	}

}
