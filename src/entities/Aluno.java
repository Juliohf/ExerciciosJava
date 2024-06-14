package entities;

public class Aluno {
	
	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	
	
	public double fim() {
		return nota1+nota2+nota3;
	}
	
	public double missing() 
	{if (fim() >= 90.0) {
		return System.out.println("Pass");
	} else {
		return System.out.println("Fail /n Missing " + (60.0 - fim()));

	}
	}
	
	
	

}
