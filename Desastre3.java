
public class Desastre3 {

	public static void main(String[] args) {
	int i=4;
	int s=9;
	double x=6.45;
	double y=-4.55;
	double z=76.7;
	System.out.println("01)- " + "|" + i + "| es " + Math.abs(i)); //valor absoluto de un entero
	System.out.println("02)- " + "|" + y + "| es " + Math.abs(y));//valor absoluto de un decimal	
	System.out.println("03)- " + "máximo (" + i + "," + s + ") es " + Math.max(i,s)); // Valor máximo entre dos números
	System.out.println("04)- " + "Redondeo de (" + x + ") es " + Math.ceil(x));//redondeo al entero mayor
	System.out.println("05)- " + "Hipotenusa del triángulo de catetos (" + i + "," + s + ") es " + Math.hypot(i,s)); //hipotenusa de un triángulo
	System.out.println("06)- " + "Entero mas próximo de (" + y + ") es " + Math.rint(y)); //Redondeo al entero más próximo
	System.out.println("07)- " + z +"° convertidos a radianes es " + Math.toRadians(z)); //Convertir de grado a radián
	System.out.println("08)- " + s +" radianes covertidos a grados es " + Math.toDegrees(s) + "°"); //convertir de radián a grados
	System.out.println("09)- " + "El exponencial de (" + i + ") es " + Math.exp(i)); //Exponencial de un número
	System.out.println("10)- " + "El signo del número es " + Math.signum (y)); //Muestra el signo del número como 1 o -1, seún sea el caso
	System.out.println("11)- " + "El valor del primer término con el signo del segundo es " + Math.copySign(y, x)); //Muestra el primer término con el signo del segundo
	System.out.println("12)- " + "" + Math.nextAfter(s, y)); // Devuelve el número de punto flotante adyacente al primer argumento en la dirección del segundo argumento.
	System.out.println("13)- " + "" + Math.scalb(i, s)); //Devuelve f × 2^scaleFactor redondeado como si se realizara mediante una única multiplicación de punto flotante correctamente redondeada a un miembro del conjunto de valores flotantes.
	System.out.println("14)- " + "" + Math.ulp(x)); // Devuelve el tamaño de unidad en el último lugar, de un doublevalor es la distancia positiva entre este valor de punto flotante y el doublesiguiente valor más grande en magnitud.
	System.out.println("15)- " + "" + Math.IEEEremainder(x,z)); //Calcula la operación de resto en dos argumentos según lo prescrito por el estándar IEEE 754.

	}

} 
