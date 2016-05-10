# ACDA
public class NumeralToRoman {

	
	static char TabRom[] = {'I','V','X','L','C','D','M'};
	static int TabAra[] = {1,5,10,50,100,500,1000};
	

	
	static int RomanToNumeral ( String NombreR )
	{
		int Valeur = 0;
		boolean Soustraction = false;
		
		if ( NombreR.length() == 1 )
			Valeur = GetAraValue(NombreR.charAt(0));
		else
		{
			for ( int i = 0 ; i < NombreR.length() - 1 ; ++i )
			{
				char C1 = NombreR.charAt(i);
				char C2 = NombreR.charAt(i+1);
				int V1 = GetAraValue(C1);
				int V2 = GetAraValue(C2);
				
				if ( V1 < V2 && Soustraction == false && IsPowerOf10 (C1) && 10*V1 >= V2 )
				{
					Valeur -= V1;
					Soustraction = true;
				}
				else
				{
					Valeur += V1;
					Soustraction = false;
				}
					
			}
			Valeur += GetAraValue(NombreR.charAt(NombreR.length()-1));
			
		}
		return Valeur;
	};
	
	static int GetAraValue ( char Caract )
	{
		for ( int Indice = 0 ; Indice < TabRom.length ; ++Indice )
		{
			if (Caract == TabRom[Indice])
				return (TabAra[Indice]);
		}
		return 0;
	};
	
	static boolean IsPowerOf10 ( char Caract )
	{
		if ( Caract == 'I' || Caract == 'X' || Caract == 'M' )
			return true;
		return false;
	};
}
