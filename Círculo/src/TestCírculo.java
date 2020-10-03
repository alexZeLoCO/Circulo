import java.util.Scanner;		//IMPORTAR SCANNER PARA TECLADO
public class TestCírculo {

	public static void main(String[] args) {
		
		
//-----------CREACIÓN DE OBJETOS----------------
		Scanner teclado = new Scanner (System.in);		//CREAR OBJETO teclado DE CLASE SCANNER
		Círculo Edison = new Círculo();		//CREAR OBJETO Edison DE CLASE CÍRCULO
		Círculo Tesla = new Círculo();		//CREAR OBJETO Tesla DE CLASE CÍRCULO
		
		
//---------------DEFINICIÓN ATRIBUTOS DE TESLA----------------------		
		Tesla.setRadio(25);		//DEFINIR RADIO DE TESLA
		Tesla.setPosX(7.5);		//DEFINIR POSICIÓN X DE TESLA
		Tesla.setPosY(8.6);		//DEFINIR POSICIÓN Y DE TESLA
		
		
//---------------------DEFINICIÓN ATRIBUTOS DE EDISON------------------------		
		System.out.print("Introduzca el radio del círculo: ");		//SOLICITA RADIO DE EDISON
		Edison.setRadio(teclado.nextDouble());		//LLAMADA MÉTODO setRadio() DE EDISON
		System.out.print("Introduzca la posición x del círculo: ");		//SOLICITA POSICIÓN X DE EDISON
		Edison.setPosX(teclado.nextDouble());		//LLAMADA MÉTODO setPosX() DE EDISON
		System.out.print("Introduzca la posición y del círculo: ");		//SOLICITA POSICIÓN Y DE EDISON
		Edison.setPosY(teclado.nextDouble());		//LLAMADA MÉTODO setPosY() DE EDISON
		
		
//--------------------SALIDA DE DATOS------------------------		
		System.out.println("-----------------------------------------------------------------------------");		//LÍNEA DE SEPARACIÓN
		System.out.printf("El radio de la circunferencia definida es %.3f\n", Edison.getRadio());		//RADIO EDISON		MÉTODO getRadio()
		System.out.printf("El radio de la circunferencia predefinida es %.3f\n", Tesla.getRadio());		//RADIO TESLA		MÉTODO getRadio()
		System.out.println("-----------------------------------------------------------------------------");		//LÍNEA DE SEPARACIÓN
		System.out.printf("La longitud de la circunferencia definida es %.3f\n", Edison.calcularLongitud());		//LONGITUD EDISON		MÉTODO calcularLongitud()
		System.out.printf("La longitud de la circunferencia predefinida es %.3f\n", Tesla.calcularLongitud());		//LONGITUD TESLA		MÉTODO calcularLongitud()
		System.out.println("-----------------------------------------------------------------------------");		//LÍNEA DE SEPARACIÓN
		System.out.printf("El área de la circunferencia definida es %.3f\n",Edison.calcularÁrea());		//ÁREA EDISON		MÉTODO calcularÁrea()
		System.out.printf("El área de la circunferencia predefinida es %.3f\n",Tesla.calcularÁrea());		//ÁREA TESLA	MÉTODO calcularÁrea()
		System.out.println("-----------------------------------------------------------------------------");		//LÍNEA DE SEPARACIÓN
		System.out.printf("La diferencia entre ambas longitudes es de %.3f\n",Edison.diferenciaLongitud(Tesla));		//DIFERENCIA DE LONGITUDES		MÉTODO diferenciaLongitud()
		System.out.println("-----------------------------------------------------------------------------");		//LÍNEA DE SEPARACIÓN
		System.out.printf("La diferencia entre ambas áreas es de %.3f\n",Edison.diferenciaÁrea(Tesla));		//DIFERENCIA DE ÁREAS		MÉTODO diferenciaÁrea()
		System.out.println("-----------------------------------------------------------------------------");		//LÍNEA DE SEPARACIÓN
		System.out.printf("La diferencia entre ambos centros es de %.3f\n", Edison.diferenciaCentros(Tesla));		//DIFERENCIA DE CENTROS (MÓDULO)		MÉTODO diferenciaCentros()
		System.out.println("-----------------------------------------------------------------------------");		//LÍNEA DE SEPARACIÓN
		System.out.println("El radio de la circunferencia definida se modificará por la diferencia entre ambos centros");
		Edison.setRadio(Edison.diferenciaCentros(Tesla));		//MODIFICAR RADIO EDISON		MÉTODO diferenciaCentros()
		System.out.println("-----------------------------------------------------------------------------");		//LÍNEA DE SEPARACIÓN
		System.out.println("Las nuevas características del círculo son: ");
		System.out.printf("El radio de la circunferencia definida es %.3f\n", Edison.getRadio());		//NUEVO RADIO EDISON
		System.out.printf("La longitud de la circunferencia definida es %.3f\n", Edison.calcularLongitud());		//NUEVA LONGITUD EDISON
		System.out.printf("El área de la circunferencia definida es %.3f\n",Edison.calcularÁrea());		//NUEVA ÁREA EDISON
	}
}
