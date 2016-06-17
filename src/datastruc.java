
public class datastruc {
	public enum Company{
		EBAY, PAYPAL, GOOGLE, YAHOO, ATT
	}
	
	Company cName;
	
	public void CrunchifyEnumExample(Company cName){
		this.cName = cName;
	}
	
	public void companyDetails(){
		switch (cName){
		case EBAY:
			System.out.println("Biggest Market Place in the World");
			break;
			
		case PAYPAL:
			System.out.println("Simplest way to manage Money.");
			break;
			
		case GOOGLE:
		case YAHOO:
			System.out.println("1st Web 2.0 Company.");
			break;
			
			default:
				System.out.println("Google - biggest search giant.. ATT -my carrier provider..");
				break;
				
		}
	}
	
	public static void main(String[]args){
		datastruc ebay = new datastruc();
		ebay.CrunchifyEnumExample(Company.EBAY);
		ebay.companyDetails();
		
		datastruc paypal = new datastruc();
		paypal.CrunchifyEnumExample(Company.PAYPAL);
		paypal.companyDetails();
		
		datastruc google = new datastruc();
		google.CrunchifyEnumExample(Company.GOOGLE);
		google.companyDetails();
		datastruc yahoo = new datastruc();
		yahoo.CrunchifyEnumExample(Company.YAHOO);
		yahoo.companyDetails();	
	}
		
}
