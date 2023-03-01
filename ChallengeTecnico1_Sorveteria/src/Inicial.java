import java.util.ArrayList;

import abstracao.Sorvete;
import tiposDeSorvete.Chocolate;
import tiposDeSorvete.Creme;
import tiposDeSorvete.Flocos;
import tiposDeSorvete.Morango;
import tiposDeSorvete.Napolitano;
import votacaoSorvete.PesquisaSorveteria;

public class Inicial {

	public static void main(String[] args) {
		ArrayList<Sorvete> votacaoSorvete = new ArrayList<Sorvete>();
		Sorvete Chocolate = new Chocolate();
		Sorvete Creme = new Creme();
		Sorvete Flocos = new Flocos();
		Sorvete Morango = new Morango();
		Sorvete Napolitano = new Napolitano();
		votacaoSorvete.add(Chocolate);
		votacaoSorvete.add(Creme);
		votacaoSorvete.add(Flocos);
		votacaoSorvete.add(Flocos);
		votacaoSorvete.add(Chocolate);
		votacaoSorvete.add(Morango);
		votacaoSorvete.add(Creme);
		votacaoSorvete.add(Napolitano);
		
		 
		 Sorvete sorveteMaisPopular = PesquisaSorveteria.retornaSaborFavorito(votacaoSorvete);
		System.out.println("O sorvete mais popular é o: " + sorveteMaisPopular.getSabor() + 
				"! Ele recebeu " +  sorveteMaisPopular.getVotos() + " votos.");

	}

}
