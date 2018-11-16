
public class Desastre3 {

	public static void main(String[] args) {
	int i=4;
	int s=9;
	double x=6.45;
	double y=-4.55;
	double z=76.7;
	System.out.println("01)- " + "|" + i + "| es " + Math.abs(i)); //valor absoluto de un entero
	System.out.println("02)- " + "|" + y + "| es " + Math.abs(y));//valor absoluto de un decimal	
	System.out.println("03)- " + "m�ximo (" + i + "," + s + ") es " + Math.max(i,s)); // Valor m�ximo entre dos n�meros
	System.out.println("04)- " + "Redondeo de (" + x + ") es " + Math.ceil(x));//redondeo al entero mayor
	System.out.println("05)- " + "Hipotenusa del tri�ngulo de catetos (" + i + "," + s + ") es " + Math.hypot(i,s)); //hipotenusa de un tri�ngulo
	System.out.println("06)- " + "Entero mas pr�ximo de (" + y + ") es " + Math.rint(y)); //Redondeo al entero m�s pr�ximo
	System.out.println("07)- " + z +"� convertidos a radianes es " + Math.toRadians(z)); //Convertir de grado a radi�n
	System.out.println("08)- " + s +" radianes covertidos a grados es " + Math.toDegrees(s) + "�"); //convertir de radi�n a grados
	System.out.println("09)- " + "El exponencial de (" + i + ") es " + Math.exp(i)); //Exponencial de un n�mero
	System.out.println("10)- " + "El signo del n�mero es " + Math.signum (y)); //Muestra el signo del n�mero como 1 o -1, se�n sea el caso
	System.out.println("11)- " + "El valor del primer t�rmino con el signo del segundo es " + Math.copySign(y, x)); //Muestra el primer t�rmino con el signo del segundo
	System.out.println("12)- " + "" + Math.nextAfter(s, y)); // Devuelve el n�mero de punto flotante adyacente al primer argumento en la direcci�n del segundo argumento.
	System.out.println("13)- " + "" + Math.scalb(i, s)); //Devuelve f � 2^scaleFactor redondeado como si se realizara mediante una �nica multiplicaci�n de punto flotante correctamente redondeada a un miembro del conjunto de valores flotantes.
	System.out.println("14)- " + "" + Math.ulp(x)); // Devuelve el tama�o de unidad en el �ltimo lugar, de un doublevalor es la distancia positiva entre este valor de punto flotante y el doublesiguiente valor m�s grande en magnitud.
	System.out.println("15)- " + "" + Math.IEEEremainder(x,z)); //Calcula la operaci�n de resto en dos argumentos seg�n lo prescrito por el est�ndar IEEE 754.

	}

} 
