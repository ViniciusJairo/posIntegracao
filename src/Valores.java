
public class Valores implements ValoresITF {
	int[] vetor = {0,0,0,0,0,0,0,0,0,0};
	
	@Override
	public boolean ins(int v) {
	  boolean retorno = false;
	  
	  if(v <=0) {
		  return retorno;
	  }
	  
	  for (int i = 0; i < vetor.length; i++) {
		 if (vetor[i] == 0) {
			 vetor[i] = v;
			 retorno = true;
		 }
	  }
	  return retorno;
	}
	@Override
	public int del(int i) {
		
		int remov = vetor[i];
		vetor[i] = 0; 
		return remov;
	}

	@Override
	public int size() {
		
		int quantidade = 0;
		
		for(int i = 0; i < vetor.length; i++) {
			if (vetor[i] > 0) {
				quantidade++;
			}
		}
		
		return quantidade;
	}

	@Override
	public double mean() {
		
		int dr = 0;
		int div = 0;
		
		for(int i = 0; i < vetor.length; i++) {
			if (vetor[i] > 0) {
				div += vetor[i];
				dr++;
			}
		}		
		return (div/dr);
	}

	@Override
	public int greater() {
		int Mv = 0;
		
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] > Mv) {
				Mv = vetor[i];
			}
		}		
		return Mv;
	}

	@Override
	public int lower() {
		
		int mV = 0;
		
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] > 0) {
				mV = vetor[i];
				i += 10;
			}
		}		
		
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] < mV) {
				mV = vetor[i];
			}
		}		
 		
		return mV;
	}
	
}