
public class Encerra extends Certificado{

	protected String encerraPrograma="Fechando o sistema...";
	
	public void finaliza(){

		System.out.println(this.encerraPrograma);
		
		try {
			this.finalize();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


}
