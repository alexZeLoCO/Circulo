
public class CÌrculo {

	
//------------------------INICIALIZACI”N DE VARIABLES PRIVADAS-----------------------
	private final double PI = 3.141592654;		//CONSTANTE FINAL PI
	private double radio;		//RADIO
	private double ·rea;		//¡REA
	private double longitud;		//LONGITUD
	private double posx;		//POSICI”N X DEL CENTRO
	private double posy;		//POSICI”N Y DEL CENTRO	
	private double difA;		//DIFERENCIA ENTRE ¡REAS
	private double difX;		//DIFERENCIA ENTRE POSICIONES X DE LOS CENTROS
	private double difY;		//DIFERENCIA ENTRE POSICIONES Y DE LOS CENTROS
	private double difC;		//DIFERENCIA ENTRE LOS DOS CENTROS | M”DULO DE (difX,difY)
	private double difL;		//DIFERENCIA ENTRE LAS DOS LONGITUDES

	
//--------------M…TODOS GET-----------------
	public double getRadio() {		//RADIO
		return radio;
	}
	public double getPosX() {		//POSICI”N X DEL CENTRO
		return posx;
	}
	public double getPosY() {		//POSICI”N Y DEL CENTRO
		return posy;
	}
	public double get¡rea() {		//¡REA
		return ·rea;
	}
	

//---------------M…TODOS SET------------------
	public void setPosX (double x) {		//POSICI”N X DEL CENTRO
		posx = x;
	}
	public void setPosY (double y) {		//POSICI”N Y DEL CENTRO
		posy = y;
	}
	public void setRadio (double r) {		//RADIO. VARIABLE r TEMPORAL
		if (r<0) {		//CONDICI”N: SI r<0.
			System.out.print("El radio introducido es inferior que 0. Ha sido invalidado.");
			System.exit(0);		//CIERRA PROGRAMA
		} else {
			System.out.println("El radio introducido ha sido validado.");
			radio = r;		//VARIABLE ACEPTADA. ALMACENAR EN radio
		}
	}


//---------------------M…TODOS DE C¡LCULO-----------------
	public double calcular¡rea() {		//¡REA
		·rea = PI*Math.pow(radio,2);
		return ·rea;
	}

	public double calcularLongitud () {		//LONGITUD
		longitud = 2*PI*radio;
		return longitud;
	}

	public void copiarCentro(CÌrculo Tesla) {		//COPIAR CENTRO
		setPosX(Tesla.getPosX());		//POSICI”N X DE EDISON = POSICI”N X DE TESLA
		setPosY(Tesla.getPosY());		//POSICI”N Y DE EDISON = POSICI”N Y DE TESLA
	}

	public double diferencia¡rea(CÌrculo Tesla) {		//DIFERENCIA ENTRE ¡REAS
		difA = Tesla.get¡rea()-get¡rea();		//CALCULA UNA DIFERENCIA
		if (difA<0) {		//CONDICI”N: SI DIFERENCIA < 0
			difA = get¡rea() - Tesla.get¡rea();		//CALCULAR LA DIFERENCIA AL REV…S. PARA QUE SEA POSITIVA.
		}
		return difA;
	}
	
	public double diferenciaLongitud(CÌrculo Tesla) {		//DIFERENCIA DE LONGITUDES
		difL = Tesla.calcularLongitud()-calcularLongitud();		//CALCULA UNA DIFERENCIA
		if (difL < 0) {		//CONDICI”N: SI DIFERENCIA < 0
			difL = calcularLongitud()-Tesla.calcularLongitud();		//CALCULAR LA DIFERENCIA AL REV…S. PARA QUE SEA POSITIVA.
		}
		return difL;
	}

	public double diferenciaCentros(CÌrculo Tesla) {		//DIFERENCIA ENTRE CENTROS
		
		difX = getPosX() - Tesla.getPosX();		//DIFERENCIA ENRE LAS POSICIONES X
		if (difX < 0) {		//CONDICI”N: SI DIFERENCIA < 0
			difX = Tesla.getPosX()-getPosX();		//OPERAR AL REV…S. PARA QUE SEA POSITIVA
		}
		
		difY = getPosY() - Tesla.getPosY();		//DIFERENCIA DE LAS POSICIONES Y
		if (difY < 0) {		//CONDICI”N: SI DIFERENCIA < 0
			difY = Tesla.getPosY()-getPosY();		//OPERAR AL REV…S. PARA QUE SEA POSITIVA
		}
		
		//GUÕA: DIFERENCIA ENTRE AMBOS CENTROS EN FORMA VECTORIAL: difX*i + difY*j
		
		difC = Math.sqrt(Math.pow(difX,2)*Math.pow(difY, 2));		//M”DULO DE (difY,difX)
		return difC;
	}
	
	public void ajustarRadio(CÌrculo Tesla) {		//COPIAR RADIO DE TESLA EN EDISON
		setRadio(Tesla.getRadio());		//RADIO DE EDISON = RADIO DE TESLA
	}
}