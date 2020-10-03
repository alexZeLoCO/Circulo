import java.util.Scanner;		//IMPORTAR SCANNER PARA TECLADO
public class TestC�rculo {

	public static void main(String[] args) {
		
		
//-----------CREACI�N DE OBJETOS----------------
		Scanner teclado = new Scanner (System.in);		//CREAR OBJETO teclado DE CLASE SCANNER
		C�rculo Edison = new C�rculo();		//CREAR OBJETO Edison DE CLASE C�RCULO
		C�rculo Tesla = new C�rculo();		//CREAR OBJETO Tesla DE CLASE C�RCULO
		
		
//---------------DEFINICI�N ATRIBUTOS DE TESLA----------------------		
		Tesla.setRadio(25);		//DEFINIR RADIO DE TESLA
		Tesla.setPosX(7.5);		//DEFINIR POSICI�N X DE TESLA
		Tesla.setPosY(8.6);		//DEFINIR POSICI�N Y DE TESLA
		
		
//---------------------DEFINICI�N ATRIBUTOS DE EDISON------------------------		
		System.out.print("Introduzca el radio del c�rculo: ");		//SOLICITA RADIO DE EDISON
		Edison.setRadio(teclado.nextDouble());		//LLAMADA M�TODO setRadio() DE EDISON
		System.out.print("Introduzca la posici�n x del c�rculo: ");		//SOLICITA POSICI�N X DE EDISON
		Edison.setPosX(teclado.nextDouble());		//LLAMADA M�TODO setPosX() DE EDISON
		System.out.print("Introduzca la posici�n y del c�rculo: ");		//SOLICITA POSICI�N Y DE EDISON
		Edison.setPosY(teclado.nextDouble());		//LLAMADA M�TODO setPosY() DE EDISON
		
		
//--------------------SALIDA DE DATOS------------------------		
		System.out.println("-----------------------------------------------------------------------------");		//L�NEA DE SEPARACI�N
		System.out.printf("El radio de la circunferencia definida es %.3f\n", Edison.getRadio());		//RADIO EDISON		M�TODO getRadio()
		System.out.printf("El radio de la circunferencia predefinida es %.3f\n", Tesla.getRadio());		//RADIO TESLA		M�TODO getRadio()
		System.out.println("-----------------------------------------------------------------------------");		//L�NEA DE SEPARACI�N
		System.out.printf("La longitud de la circunferencia definida es %.3f\n", Edison.calcularLongitud());		//LONGITUD EDISON		M�TODO calcularLongitud()
		System.out.printf("La longitud de la circunferencia predefinida es %.3f\n", Tesla.calcularLongitud());		//LONGITUD TESLA		M�TODO calcularLongitud()
		System.out.println("-----------------------------------------------------------------------------");		//L�NEA DE SEPARACI�N
		System.out.printf("El �rea de la circunferencia definida es %.3f\n",Edison.calcular�rea());		//�REA EDISON		M�TODO calcular�rea()
		System.out.printf("El �rea de la circunferencia predefinida es %.3f\n",Tesla.calcular�rea());		//�REA TESLA	M�TODO calcular�rea()
		System.out.println("-----------------------------------------------------------------------------");		//L�NEA DE SEPARACI�N
		System.out.printf("La diferencia entre ambas longitudes es de %.3f\n",Edison.diferenciaLongitud(Tesla));		//DIFERENCIA DE LONGITUDES		M�TODO diferenciaLongitud()
		System.out.println("-----------------------------------------------------------------------------");		//L�NEA DE SEPARACI�N
		System.out.printf("La diferencia entre ambas �reas es de %.3f\n",Edison.diferencia�rea(Tesla));		//DIFERENCIA DE �REAS		M�TODO diferencia�rea()
		System.out.println("-----------------------------------------------------------------------------");		//L�NEA DE SEPARACI�N
		System.out.printf("La diferencia entre ambos centros es de %.3f\n", Edison.diferenciaCentros(Tesla));		//DIFERENCIA DE CENTROS (M�DULO)		M�TODO diferenciaCentros()
		System.out.println("-----------------------------------------------------------------------------");		//L�NEA DE SEPARACI�N
		System.out.println("El radio de la circunferencia definida se modificar� por la diferencia entre ambos centros");
		Edison.setRadio(Edison.diferenciaCentros(Tesla));		//MODIFICAR RADIO EDISON		M�TODO diferenciaCentros()
		System.out.println("-----------------------------------------------------------------------------");		//L�NEA DE SEPARACI�N
		System.out.println("Las nuevas caracter�sticas del c�rculo son: ");
		System.out.printf("El radio de la circunferencia definida es %.3f\n", Edison.getRadio());		//NUEVO RADIO EDISON
		System.out.printf("La longitud de la circunferencia definida es %.3f\n", Edison.calcularLongitud());		//NUEVA LONGITUD EDISON
		System.out.printf("El �rea de la circunferencia definida es %.3f\n",Edison.calcular�rea());		//NUEVA �REA EDISON
	}
}
