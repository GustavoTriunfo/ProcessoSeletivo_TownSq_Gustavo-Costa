package votacaoSorvete;

import java.util.ArrayList;

import abstracao.Sorvete;
import tiposDeSorvete.Flocos;

public class PesquisaSorveteria 
{
	
	public static Sorvete retornaSaborFavorito(ArrayList<Sorvete> votos) 
	{
		Sorvete saborMaisVotado = null;
		int listaSabores = 0;
		for(Sorvete sorveteVoto : votos) {
		switch(sorveteVoto.getCodigo()){
		case 0: sorveteVoto.setVotos();
		break;
		case 1: sorveteVoto.setVotos();
		break;
		case 2: sorveteVoto.setVotos();
		break;
		case 3: sorveteVoto.setVotos();
		break;
		case 4: sorveteVoto.setVotos();
		break;
		}
		}
		for(Sorvete saborEmApuracao : votos) {
			if(listaSabores == 0) {
				saborMaisVotado = saborEmApuracao;
				listaSabores++;
			}
			if(saborEmApuracao.getVotos() > saborMaisVotado.getVotos()) {
				saborMaisVotado = saborEmApuracao;
				break;
			}
			else if(saborEmApuracao.getVotos() == saborMaisVotado.getVotos()) {
				if(saborEmApuracao.getCodigo() < saborMaisVotado.getCodigo()) {
				saborMaisVotado = saborEmApuracao;
				}
			}
		}
		return saborMaisVotado;
		}
	}

