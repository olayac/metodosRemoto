package my_pack;

/**
 * 
 * Entry point for the application. The only purpose for this class is to launch the application
 * @author Pablo Sanchez (p.sanchez@unican.es) 
 * http://personales.unican.es/sanchezbp 
 * 
 * */
public class Runner {

	/**
 	* Method which serves as entry point for the application
 	* 
 	* @param args Command-line arguments, they are simply ignored
 	*/
	public static void main(String[] args) {

		 AccessControl guardian = new AccessControl();
		
		 if (guardian.hasAccess()) {
			
			 Asr workerAtRight = new Asr();
			 Occ workerAtLeft   = new Occ();
			 Company xxx     = new Company();
		
			System.out.println("==================================================");
			System.out.println("              Product Developed by                ");
			System.out.println("");
			xxx.identufy(); 
			System.out.println("");
			System.out.println("              		Credits To  				 ");
			System.out.println("");
			workerAtLeft.identify();
			workerAtRight.identufy();
			System.out.println("==================================================");
		 } else {
			System.out.println("You do not have access to this application");			
		 } //if
	} // main

} // Runner
