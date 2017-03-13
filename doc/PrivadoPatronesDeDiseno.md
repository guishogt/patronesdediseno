#1. Introducción. 

Términos en inglés y en español. 

Usando ejemplos. 

Ejemplos propios. 

They facilitate communication

#2.  Los patrones de diseño

El software es un tema muy amplio que tiene bastantes esquinas interesantes para digerir. Uno de los puntos cruciales de todo el ecosistema técnico y de negocios del software es la calidad del código. Crear código de alta calidad no es fácil, y para cualquier profesional en el área, los fundamentos de hacer buen software siempre deben ser revisados constantemente. Porque, aun con la avalancha de nuevos lenguajes de programación, paradigmas y *frameworks*, los fundamentos de hacer buen software son similares. 

En el caso específico de la programación orientada a objetos, existen desde hace un par de décadas los llamados patrones de diseño. Estos patrones, que usualmente aparecen como consecuencia de identificar anti-patrones. 

En sí, un patrón de diseño es una solución puntual a un problema común y repetido de diseño. Para que sea considerado como tal, debe tener una amplia cantidad de escenarios donde resuelva estos problemas. 

La solidificación del concepto se dio en 1994, cuando Erich Gamma, Richard Helm, Ralph Johnson y John Vlissides (conocidos como "the gang of four (GoF)", o “la mara de los cuatro”) publicó el famoso libro “Design Patterns: Elements of Reusable Object-Oriented Software” (Patrones de diseño: elementos reusables para software orientado a objetos). A partir de ahí el concepto se popularizó, y las herramientas de desarrollo comienzan a incorporar el uso de patrones por todos lados, apareciendo el concepto de “refactorizar”, que es el concepto de aplicar patrones de diseño a software ya existente. 

#3.  Patrones Creacionales. 

Los patrones creacionales son los primeros que se abordarán, ya que naturalmente son los que aparecen inicialmente en las distintas etapas de desarrollo. 

La creación de objetos en un lenguaje de programación orientada a objetos  es percibida como algo muy simple y fundamental al paradigma. Si bien lo es, conforme un sistema comienza a escalar, comienza también a volverse muy importante la manera en la que los objetos son creados, afectando la manera que se hace la escalabilidad y el rendimiento. 

Aunque la mayoría de máquinas virtuales y plataformas actuales cuentan con compiladores muy capaces que se enfocan en técnicas agresivas de optimización, nada puede sustituir a un software bien diseñado y bien hecho. En un sistema cualquiera, la cantidad de objetos que se crean y destruyen es considerable (independientemente del manejo de memoria que se elija), por lo que crear y destruir objetos de una buena manera es siempre un reto. 

Dejando el rendimiento por un lado, una de las características fundamentales de un software que pueda escalar es que tan legible para humanos es. Ya se habló de lo eficiente que son los compiladores, por lo que enfocarse en hacer software legible es siempre una buena apuesta en cualquier proyecto de software. Y los patrones creacionales son muy útiles para esto. 

 La razón de ser de estos patrones es para facilitar, ordenar, o ayudar en la creación de objetos. Dependiendo del lenguaje de programación que estemos utilizando, generalmente crearemos un objeto así: Objeto o = new Objeto(). Los patrones creacionales modifican un poco la manera de crear objetos, y una manera de crearlos, por ejemplo, sería: Objeto o = ObjectoFactory.getInstance("x").

## 3.1 Patron de constructor fluido  (*Builder, Fluid*)

En términos generales un constructor (*builder*) existe para esconder los detalles de la creación de un objeto final, al que se llama producto. Hay varios métodos para lograr esto, y por ello hay varias "implementaciones" de este patrón que en nada coinciden, salvo en el nombre. El clásico, usado en el GoF es un poco más complejo del que se presentará ahora. El enfoque estará en lo que se conoce como constructores de interfaces fluidas. 

Para ilustrar el uso del patrón, se utilizará un ejemplo. Supóngase que se va a hacer un programa para una empresa que ofrece servicios de* web hosting* (alojamiento en web). Esta empresa comercializa varios planes: un plan personal, un plan bronce, uno plata, uno oro y finalmente uno diamante. El plan personal ofrece un alojamiento de 10 MB, una transferencia mensual de 100 MB, una cuenta de correo electrónico y nada más. El bronce ofrece 100MB de alojamiento, 1000 MB de transferencia mensual, y 10 cuentas de correo electrónico. Así sucesivamente cada plan aumenta las cantidades de alojamiento, transferencia y cuentas de correo. A la vez cada plan agrega nuevas características: el plata ofrece acceso ssh, y una base de datos; el oro agrega estadísticas de sitio y panel de control. Así se van multiplicando las opciones, y para crear la aplicación se define un objeto como el siguiente:

```java
package com.guisho.software.patrones.builder;

import java.math.BigDecimal;

public class PaqueteDeHosting {

    /*Los siguientes campos son obligatorios siempre*/

    private String nombre;

    private BigDecimal precioAnual;

    private int capacidadDeAlmacenamiento; //en MB

    private int transferenciaMensual; //en MB

    private int cantidadDireccionesCorreo;//

    /*Las siguientes son opcionales, hay planes que no los tienen*/

    private int cantidadSitiosPermitidos;

    private int cantidadBaseDeDatos;

    private String codigoOferta;

    private boolean accesoSsh;

    private boolean panelDeControl;

    private boolean estadisticasDeSitio;

    private boolean ipPublica;

    public PaqueteDeHosting(){

    }

    /* mas constructores */

    /* Setters, getters y demás código....*/

}
```

Bien, ahora cada plan tiene una configuración previamente establecida, que el vendedor no arma en el momento, y que preferiblemente no puede cambiar. ¿Cómo se puede hacer para crear cada objeto? La primera manera que se suele proponer es crear un constructor para cada caso, manteniendo siempre los valores obligatorios. Esto resultaría en  una colección de constructores como la siguiente:

```java
    public PaqueteDeHosting(String nombre, BigDecimal precioAnual, int almacenamiento, int transferencia, int cantidadCorreos) {

        this.nombre = nombre;

        this.precioAnual = precioAnual;

        this.capacidadDeAlmacenamiento = almacenamiento;

        this.transferenciaMensual = transferencia;

        this.cantidadDireccionesCorreo = cantidadCorreos;

    }

    public PaqueteDeHosting(String nombre, BigDecimal precioAnual, int almacenamiento, int transferencia, int cantidadCorreos, int basesDatos) {

        this.nombre = nombre;

        this.precioAnual = precioAnual;

        this.capacidadDeAlmacenamiento = almacenamiento;

        this.transferenciaMensual = transferencia;

        this.cantidadDireccionesCorreo = cantidadCorreos;

        this.cantidadBaseDeDatos = basesDatos;

    }

    public PaqueteDeHosting(String nombre, BigDecimal precioAnual, int almacenamiento, int transferencia, int cantidadCorreos, String ipPublica) {

        this.nombre = nombre;

        this.precioAnual = precioAnual;

        this.capacidadDeAlmacenamiento = almacenamiento;

        this.transferenciaMensual = transferencia;

        this.cantidadDireccionesCorreo = cantidadCorreos;

        this.ipPublica = ipPublica;

    }

    public PaqueteDeHosting(String nombre, BigDecimal precioAnual, int almacenamiento, int transferencia, int cantidadCorreos, String ipPublica,int basesDatos){

        this.nombre=nombre;

        this.precioAnual=precioAnual;

        this.capacidadDeAlmacenamiento=almacenamiento;

        this.transferenciaMensual=transferencia;

        this.cantidadDireccionesCorreo=cantidadCorreos;

        this.ipPublica=ipPublica;

        this.cantidadBaseDeDatos=basesDatos;

    }

```



Como se observa, sólo se hicieron  un par de combinaciones con la cantidad de bases de datos y la IP pública. Mientras la cantidad de campos opcionales crece, la cantidad de constructores aumenta desmedidamente creando el ambiente ideal para que aparezcan errores.

Otro camino que se puede tomar es el clásico *bean*: un constructor vacío y *setters* para cada parámetro que se desee agregar. Sin embargo, este método tiene un pequeño inconveniente: puede dejar al objeto en un estado inconsistente: podría ponérsele cuántas cuentas de correo pero no ponérsele nombre, ni ponerle precio. ¿Qué se puede hacer entonces?  Utilizar el patrón constructor y hacer un *builder*. El *builder* se explicará por el solo. Véase:

En PaqueteDeHosting se hace un constructor con los campos que siempre van para evitar estados inconsistentes:


```java
    public PaqueteDeHosting(String nombre, BigDecimal precioAnual, int almacenamiento, int transferencia, int cantidadCorreos) {

        this.nombre = nombre;

        this.precioAnual = precioAnual;

        this.capacidadDeAlmacenamiento = almacenamiento;

        this.transferenciaMensual = transferencia;

        this.cantidadDireccionesCorreo = cantidadCorreos;

    }
```

Y se crea el *builder*:

```java
package com.guisho.software.patrones.builder;

import java.math.BigDecimal;

/**

 *

 * @author guisho.com, luishernan@gmail.com

 */

public class PaqueteDeHostingBuilder {

    private  PaqueteDeHosting paquete;

    public PaqueteDeHostingBuilder(String nombre, BigDecimal precio, int cantidadAlmacenamiento, int transferenciaMesual, int cantidadCorreo){

        this.paquete.setNombre(nombre);

        this.paquete.setPrecioAnual(precio);

        this.paquete.setCapacidadDeAlmacenamiento(cantidadAlmacenamiento);

        this.paquete.setTransferenciaMensual(transferenciaMesual);

        this.paquete.setCantidadDireccionesCorreo(cantidadCorreo);

    }

    public PaqueteDeHostingBuilder catidadSitiosPermitidos (int cantidad){

        this.paquete.setCantidadSitiosPermitidos(cantidad);

        return this;

    }

    public PaqueteDeHostingBuilder cantidadBaseDeDatos (int cantidad){

        this.paquete.setCantidadBaseDeDatos(cantidad);

        return this;

    }

    public PaqueteDeHostingBuilder accessoSsh(boolean acceso){

        this.paquete.setAccesoSsh(acceso);

        return this;

    }

    public PaqueteDeHostingBuilder panelControl (boolean panel){

        this.paquete.setPanelDeControl(panel);

        return this;

    }

    public PaqueteDeHostingBuilder codigoOferta(String codigo){

        this.paquete.setCodigoOferta(codigo);

        return this;

    }

    public PaqueteDeHostingBuilder ipPublica (String ip){

        this.paquete.setIpPublica(ip);

        return this;

    }

}
```

Si se observa el *builder* simplemente envuelve al objeto que creará, con una especie de métodos de acceso (parecido a un *JavaBean*) pero con la peculiaridad que se devuelve a sí mismo siempre. ¿En qué ayuda esto? Véase el cliente como crea un PaqueteDeHosting ahora:

```java
    public static void main(String[] args) {

        PaqueteDeHosting personal = new PaqueteDeHostingBuilder("personal",new BigDecimal(100),10,100,1).build();

        PaqueteDeHosting bronce =

        new PaqueteDeHostingBuilder("bronce",new BigDecimal(200),100,1000,10).accessoSsh(true).build();

        PaqueteDeHosting plata =

        new PaqueteDeHostingBuilder("plata",new BigDecimal(300),100,1000,50).accessoSsh(true).catidadSitiosPermitidos(10).cantidadBaseDeDatos(1).build();

        PaqueteDeHosting oro =

        new PaqueteDeHostingBuilder("oro",new BigDecimal(500),100,4000,100).accessoSsh(true).catidadSitiosPermitidos(100).cantidadBaseDeDatos(5).ipPublica("10.10.10.10").build();

    }
```


Esto es mucho más sencillo de leer (aparte que la línea se alarga un poco, aunque pueden hacecer varias líneas), y deja al objeto siempre en un estado consistente. Este método de construcción por medio de llamadas encadenadas se llama interfaces fluidas, y es el punto de inicio para muchos lenguajes como *Groovy*, que crean construcciones bastantes complejas a partir de *builders* sencillos que permiten muchas configuraciones.

De nuevo, este no es el Builder de GoF, pero es otro concepto de *builder*, que se expone para que se vea la flexibilidad que nuevos patrones pueden traer. 

## 3.2 Lazy initialization

## 3.3 Factory

**TODO** definir mejor la teoría de este patrón. 

Para ilustrar este patrón, se hará uso de un ejemplo. Supóngase que la tarea que se está por hacer es crear un traductor que devuelva los números del cero al diez en tres idiomas: inglés, español, y alemán. Existen muchísimas maneras de hacer esto. Al final, se desea un método que reciba un entero entre 0 y 10 y que devuelva una cadena con el nombre de dicho número en el idioma que se esté trabajando. 

 

Una manera de resolver el problema puede ser algo así:

```java

public class MainClient {

public MainClient(){

     }

	public traducirNumero(String idioma, int numero){

		if (idioma.equals("español")){

		  switch (numero){

		     case 0: return "uno";

		     case 1: return "dos";

		    ....

		   }

		}

		if (idioma.equals("english")){

		    switch (numero){

		     case 0: return "one";

		     case 1: return "two";

		    ....

		    }

		} 

		if (idioma.equals("deutsch")){

		    switch (numero){

		     case 0: return "eins";

		     case 1: return "zwei";

		    ....

		    }

		}

	}//traducirNumero
       

public static void main(String args[]){

MainClient mc = new MainClient();

System.out.println(mc.traducirNumero("espanol",1));

}

}//de la clase
```

El resultado del código anterior es:
```
uno
```

Esta solución parece funcionar, y de hecho lo hace. Pero imagínese que ahora nos dicen sea desea la traducción de todos los números. El código comenzará a crecer desmedidamente, ya que ahora se hace necesario agregar código de lógica para cada idioma para escribir números como 752, 1233, etc. 

Siguiendo la escuela de programación orientada a objetos, una solución natural puede ser el uso de herencia. Se define una clase abstracta Traductor, y para cada idioma se escribe	 una subclase de Traductor.

 ```Java

public abstract class Traductor{

   public abstract String traducirNumero(int numero);

}
```

Ahora comienza la magia a aparecer: se va a crear una clase especializada para diccionario, que se encargará de traducir los números. Se tendrá una clase especializada para traducir los números al español, que iría algo así:

```java

public class TraductorEspanol extends Traductor {

    public TraductorEspanol(){

       super();

       ...

    }

    public String traducirNumero(int numero){

       switch(numero){

       	   case 1: return "uno";

       	   case 2: return "dos";

       	   ...

       }

    }	

}
```

La clase para el inglés sería:

```java
public class TraductorIngles extends Traductor {

    public TraductorIngles(){

       super();

       ...

    }

    public String traducirNumero(int numero){

       switch(numero){

       	   case 1: return "one";

       	   case 2: return "two";

       	   ...

       }

    }	

}
```

La del alemán sería similar. Ahora, en el momento de querer utilizar un diccionario, se llamaría de la siguiente manera:

```

Traductor t = new TraductorEspanol();

t.traducirNumero(1);

Entonces, la clase MainClient cambiaría un poco y quedaría así:

public class MainClient {

	public String  traducirNumero(int numero){

		Traductor traductor = null;

		if (idioma.equals("español")){

			traductor = new TraductorEspanol();

		}

		if (idioma.equals("ingles")){

			traductor = new TraductorIngles();

		} 

		if (idioma.equals("aleman")){

			traductor = new TraductorAleman();

		}

		String toReturn traductor.traducirNumero(numero);

                return toReturn;

	}//traducirNumero

     public static void main(String args[]){

          MainClient mc = new MainClient();

          System.out.println(mc.traducirNumero("espanol",1));

     }

}//de la clase
```

Con este nuevo enfoque, ¿qué se ha ganado? Primero, el código es mucho más legible. Segundo es bastante más escalable: se puede agregar el traductor para el francés muy fácilmente. Tercero, se ha escondido la manera en la que se traduce a Tradúceme. Por ejemplo, puede ser que las traducciones a chino se vayan a traer a un *Web Service*. En ese caso TraductorChino se encargaría de hacer todo el ajetreo de conectarse a Internet y buscar el *web services*, pero los demás ni se enteran.

El *Factory Pattern* no ha aparecido, Es tiempo de irlo a llamar. Traduceme está haciendo algo que no le compete: está eligiendo la instancia de Traductor que quiere usar. Piénses que se usa el traductor en 100 lugares, entonces en cien lugares se tiene que buscar qué clase de Traductor vamos a instanciar. El patrón de fábrica (*factory pattern*) esconde esa lógica. Se va a agregar ahora la fábrica de traductores.

```java

public class TraductorFactory {

     public TraductorFactory(){

     }

	public static Traductor createTraductor(int numero){

		Traductor traductor = null;

		if (idioma=="español"){

			traductor = new TraductorEspanol();

		}

		if (idioma=="english"){

			traductor = new TraductorIngles();

		} 

		if (idioma=="deutsch"){

			traductor = new TraductorAleman();

		}

		return traductor;

	}

}//de la clase

```

¿Qué hace TraductorFactory? Simplemente elige, en base a los argumentos dados – en este caso el idioma- qué clase de traductor se instanciará. Traduceme de nuevo cambia y quedaría así:

```java
public class MainClient {

     String idioma;

     public static void main(Strin []args){

		Traductor traductor = TraductorFactory.createTraductor("espanol");

		System.out.println( traductor.traducirNumero(1) );

	}//main

}//de la clase
```

MainClient se ha visto dramáticamente reducido, y su código es muy fácil de leer. Quien quiera usar un traductor simplemente hará llamar a Traduceme. Traduceme sabe el idioma que eligieron, pero no sabe que subclase de Traductor instanciar, pero sabiendo el idioma TraductorFactory sabe exáctamente qué instancia de Traductor crear. Si la aplicación desea cambiar de idioma simplemente le envía otro parámetro a Traduceme y listo. También agregar idiomas es más manejable que antes. 

El *Factory Pattern* esconde al usuario final del código la desición de qué sublclase instanciar, y promueve el encapsulamiento de las partes más variables del sistema. En términos generales, una fábrica abstracta consiste de las siguientes partes:

Un cliente, que es el que llama a la fábrica (en nuestro caso MainClient).

Una fábrica, que decide la clase a instanciar (TraductorFactory).

Un producto, lo que la fábrica devuelve (para nosotros las instancias de Traductor).

 

## 3.4 Abstract Factory

Hace una semana hablamos del Factory Pattern, que realmente se llama Factory Method Pattern, porque como vimos se trata de reducir la desición de la creación de una instancia a un método, pero que por gusto mío lo pusimos en una clase Factory con un método abstracto. Ahora vamos a hablar del Abstract Factory Pattern, que va un paso más alla: el Abstract Factory Method agrupa varios Factory Methods.

Básicamente lo que hace el este patrón es unir varios Factory Methods, delegando la responsabilidad total sobre qué instancias crear a partir de datos comunes. La semana pasada hicimos un pequeño traductor, que al recibir un número desplegaba su valor en español, inglés o alemán. Para mostrar el concepto del Abstract Factory vamos a extender el ejemplo.

Primero vamos hacer un sencillo reloj que nos muestra la hora actual. Como sabemos, la hora puede ser desplegada en formato de 24Hrs o puede ser desplegada en formato AM/PM. Recordando que es a manera de ejemplo, vamos a utilizar la clase Date de una manera que no se debe, y probablemente el reloj lo haríamos de una manera más sencilla, pero para nuestro ejemplo queda perfecta su uso. Como en el caso del diccionario, haremos una clase abstracta de Reloj y dos implementaciones para cada una de los formatos, y una clase que contenga el método del Factory Method. La cosa quedaría algo así:

```java

La clase Reloj:

public abstract class Reloj {

    abstract String dameLaHora();

}

```
La clase que se da la hora en formato AM/PM:

```java
public class RelojAmPm extends Reloj{

    public RelojAmPm(){

    }

    public String dameLaHora() {

        Date d = new Date();

        int hora = d.getHours();

        int minutos = d.getMinutes();

        int segundos = d.getSeconds();

        String tr;

        if (hora<=12){

            tr="Son las "+hora+":"+minutos+":"+segundos+" AM";

        } else {

            tr="Son las "+(hora-12)+":"+minutos+":"+segundos+" PM";

        }

        return tr;

    }

}
```

La que nos da la hora en formato de 24 horas:

```java

public class Reloj24Hrs extends Reloj {

    public String dameLaHora() {

        Date d = new Date();

        int hora = d.getHours();

        int minutos = d.getMinutes();

        int segundos = d.getSeconds();

        String tr;

        tr = "Son las " + hora + ":" + minutos + ":" + segundos + " ";

        return tr;

    }

}
```

Nuestra clase que contiene la el método que elije las instancias. A diferencia del post anterior, ahora el parámetro que recibe el método es un entero, que acepta los enteros especificados como constantes estáticas en la clase. Esto se usa mucho para no estar adivinando los paráemetros que acepta el método:

```java

public class RelojFactory {

    public static final int RELOJ_AM_PM=0;

    public static final int RELOJ_24_HRS=1;

    public RelojFactory(){

    }

    public static Reloj createReloj(int tipoDeReloj){

        if (tipoDeReloj==RelojFactory.RELOJ_24_HRS){

            return new Reloj24Hrs();

        }

        if (tipoDeReloj==RelojFactory.RELOJ_AM_PM){

            return new RelojAmPm();

        }

        return null;

    }

}
```

Y finalmente la clase cliente, que será la usuario final:

```java

public class MainClient {

    public static void main(String[] args) {

        Reloj r = RelojFactory.createReloj(RelojFactory.RELOJ_24_HRS);

        System.out.println(r.dameLaHora());

    }

}
```

Hasta aquí tenemos dos fábricas: una de palabras, y la que acabamos de hacer que nos da la hora. En un proyecto cualquiera se nos pide hacer un sistema que despliegue la hora y los números de la manera en la que se expresan en cada país (una implementación súper elemental de Locale de Java). Vamos con dos ejemplos prácticos. En Estados Unidos se despliegan los números en inglés, y la hora en formato AM/PM; mientras que en Guatemala se dicen los números en español y la hora en formato de 24 Horas.

Ahora vamos a crear una Abstract Factory, que le pondremos Locale.

```java
public abstract class AbstractLocaleFactory {

    public static final String US="ESTADOS_UNIDOS";

    public static final String GT="GUATEMALA";

    String pais;

    public abstract Traductor createTraductor();

    public abstract Reloj createReloj();

    public String getPais(){

        return this.pais;

    }

    public void setPais(String pais){

        this.pais = pais;

    }

}
```

Como ven esta fabrica tiene un par de métodos que devuelven un Reloj y un Traductor. Noten que Reloj y Traductor son a su vez clases abstractas.

Ahora implementamos nuestra clase LocaleGuatemalaFactory, que va así:

```java

public class LocaleGuatemalaFactory extends AbstractLocaleFactory{

    public LocaleGuatemalaFactory(){

        this.pais=this.GT;

    }

    public Traductor createTraductor() {

        return TraductorFactory.createTraductor("espanol");

    }

    public Reloj createReloj() {

        return RelojFactory.createReloj(RelojFactory.RELOJ_24_HRS);

    }

}
```

Y la respectiva para Estados Unidos:

```java
public class LocaleEstadosUnidosFactory extends AbstractLocaleFactory{

    public LocaleEstadosUnidosFactory(){

        this.pais=AbstractLocaleFactory.US;

    }

    public Traductor createTraductor() {

        return TraductorFactory.createTraductor("ingles");

    }

    public Reloj createReloj() {

        return RelojFactory.createReloj(RelojFactory.RELOJ_AM_PM);

    }

}
```

Ahora en el cliente, si queremos las cosas como se verían en Guatemala, simplemente hacemos esto.

```java
public class MainClient {

    public static void main(String[] args) {

        Reloj reloj = null;

        Traductor traductor = null;

        AbstractLocaleFactory localeFactory = new LocaleGuatemalaFactory();

        reloj = localeFactory.createReloj();

        traductor = localeFactory.createTraductor();

        System.out.println("--------");

        System.out.println("1="+traductor.traducirNumero(1));

        System.out.println(reloj.dameLaHora());

    }

}
```

El resultado de correr el codigo anterior es:
```

1=uno

Son las 21:50:17

```
Ahora si cambiamos la linea
```java

        AbstractLocaleFactory localeFactory = new LocaleGuatemalaFactory();
```        

Por esta

```java
        AbstractLocaleFactory localeFactory = new LocaleEstadosUnidosFactory();
```

Tendremos como resultado:
```

1=one

9:52:56 PM
```

Aquí es un ejemplo sencillo. Pero imaginen quedemos hacer un Locale para cada país, y en el locale tener más cosas como: la nomenclatura de moneda, el sistema de numeración, el manejo de fechas, kilómetros o millas, etc. Con el Abstract Factory Pattern es muy sencillo agregar cada nuevo pais, o cada nueva característica del Locale. Pero sobre todo el código es MUY legible y FACILMENTE extensible. Alguien que nunca ha visto estas piezas de código puede entender como hacer un nuevo país.

Entonces, el Abstract Factory Pattern puede ayudarnos mucho en casos donde hemos de manejar familias de objetos. Al inicio no siempre es obvia su implementación, pero siempre está el recurso de del refactoring, en el cual salen nuevas maneras sencillas de hacer las cosas. Este, como muchos patrones, requieren escribir un poco más de código al principio, pero nos reducen el esfuerzo a largo plazo porque hay menos código repetido.

## 3.5 Prototype

Ya casi terminando con los patrones creacionales, vamos a hablar hoy sobre el prototype pattern, o patrón prototipo. Como los demás patrones creacionales, este patrón sustituirá para el cliente la palabra clave new por otra forma de crear objetos. En este caso específico la creación se hará sobre objetos que son complicados de crear, que para evitar usar new  serán clonados a partir de una instancia ya existente. Afortunadamente crear objetos no crea ningún tipo de reparo moral, porque este patrón de eso se trata: de clonar, de pasar el ADN de un objeto a otro.  Es decir cada instancia del objeto se obtendrá a partir de un prototipo (sí, de ahí el nombre del patrón!). 

Este patrón es facilito, ya lo veremos. En el caso específico de Java ya se tiene mucho camino ganado, porque Java provee la interaz clonable con el propósito de crear clones en mente. Pero vamos a hacer también una implementación sin usar esta interfaz para comprender completamente la idea detrás del prototipo. La primera manera de implementar este patrón en Java es implementando la interfaz Cloneable. Mas abajo veremos otra forma de implementarlo, que es haciéndolo a mano, con una ventaja extra: en vez de crear referencias a los objetos contenidos, podemos crear objetos nuevos, que en muchos cosas nos puede ser de utilidad. Por ahora veamos un un ejemplo sencillo usando cloneable:

```java
  public class Copiame implements Cloneable {

			Object clone = null;

			try {

				clone = super.clone();

			} catch (CloneNotSupportedException e) {

				e.printStackTrace();

			}

			return clone;

  }
  ```

Expliquemos un poco. Clonable es una interfaz vacía, pero para utilizar super.clone() tenemos que implementar cloneable si no quere mos una CloneNoSupportedException. La segunda cosa a considerar es que clone hace una copia de los valores de los campos de un objeto, no de los objetos a los que apunta. En otras palabras, el objeto clonado apuntará a los mismos objetos que el objeto antiguo apuntaba. Otra cosa a tomar en cuenta es que clone() devuelve siempre un Object. También notemos que clone es un método protected que puede ser llamado solo por la misma clase o el paquete que la contiene.

Entonces, ¿para qué nos sirve clonar objetos? Bueno, nos sirve para copiar objetos que tardan mucho en crear, o que son complejos de crear. Por ejemplo una lista grande que es costoso en tiempo obtener y que se desea ordenar de dos maneras distintas.

De nuevo nos adentraremos con un ejemplo, que sigo pensando es la mejor manera de aprender. Para nuestro ejemplo vamos a hacer una clase Persona y luego llenar la persona con los datos de dos hermanos: Juan y María que serán ingresados a un sistema x.

```java

package com.guisho.software.patrones.prototype;

/**

 *

 * @author guisho.com, luishernan@gmail.com

 */

public class Persona implements Cloneable{

    public String nombres;

    public String appellidos;

    public String nombrePadre;

    public String nombreMadre;

    public String direccion;

    public String telCasa;

    public String nacionalidad;

    public String ciudadEnQueVive;

    public String nombreMascota;

    public Persona(){

    }

/*Setters y geters....*/

}
```

Y un cliente que crea la Persona:

```java
    public static void main(String[] args) {

        Persona juan = new Persona();

        juan.setNombres("Juan José");

        juan.setAppellidos("Pérez Ramirez");

        juan.setNombrePadre("Juan Pérez Martinez");

        juan.setNombreMadre("María Ramirez");

        juan.setDireccion("9a. Ave. 43-12 Z.1");

        juan.setTelCasa("34567890");

        juan.setNacionalidad("Guatemalteca");

        juan.setCiudadEnQueVive("Guatemala");

        juan.setNombreMascota("Pepito");

        //Hacer algo con Juan, ingresarlo al sistema, etc...

        System.out.println("Ingresando al sistema :"+juan.toString());

        Persona maria = (Persona)juan.clone();

        maria.setNombres("María Inés");

        System.out.println("Ingresando al sistema :"+maria.toString());

        //ingresar a Maria al sistema....

    }
```

Como vemos, ahora no se tuvieron que ingresar todos los campos de María sino, solo aquellos que la diferenciaban de su hermano Juan. Hay que recordar que si hubiesen objetos en el ejemplo estos se clonan por referencia, es decir las referencias de ambos objetos son las mismas. Ahora vamos a vamos a implementar la clonación a mano. Le vamos a añadir a Persona este método:

```java

    public Persona creaPrototipo(){

        Persona p = new Persona();

        p.setNombres(this.nombres);

        p.setAppellidos(this.appellidos);

        p.setNombrePadre(this.nombrePadre);

        p.setNombreMadre(this.nombreMadre);

        p.setDireccion(this.direccion);

        p.setTelCasa(this.telCasa);

        p.setNacionalidad(this.nacionalidad);

        p.setCiudadEnQueVive(this.ciudadEnQueVive);

        p.setNombreMascota(this.nombreMascota);

        System.out.println("Creado prototipo de Persona");

        return p;

    }
```

Entonces en el cliente podemos hacer esta llamada

```java

        Persona maria = juan.creaPrototipo();
```        

Como vemos, el patrón prototipo es sencillo: crear una copia de un objeto para ahorrarnos los pasos de su creación, o para optimizar accesos o procesos que ya se hicieron en un objeto similar y crear una copia del objeto ya con esos datos ingresados.

## 3.6 Object Pool

## 3.7 Singleton

Estamos abordando ahora un tercer patrón creacional, o de creación. El Singleton Pattern, a diferencia de los dos que ya hemos visto y los que veremos, no se encarga de la creación de objetos en sí, sino que se enfoca en la restricción en la creación de un objeto. Este patrón es ampliamente utilizado por muchos frameworks, y también es uno de los más fáciles de aprender y utilizar. 

Siempre que se crea un objeto nuevo (en Java con la palabra reservada new) se invoca al constructor del objeto para que cree una instancia. Por lo general los constructores son públicos. El singleton lo que hace es convertir al constructor en privado, de manera que nadie lo pueda instanciar. Entonces, si el constructor es privado, ¿cómo se instancia el objeto? Pues a través de un método público y estático de la clase. En este método se revisa si el el objeto ha sido instanciado antes. Si no ha sido instanciado, llama al constructor y guarda el objeto creado en una variable estática del objeto. Si el objeto ya fue instanciado anteriormente, lo que hace este método es devolver la referencia al estado creado anteriormente. 

En los patrones anteriores utilizamos un Traductor. Imaginemos que el traductor carga a memoria no sólo números, pero también diez mil palabras obtenidas a través de un archivo de texto o un web service. Cada vez que este objeto se cree utilizará mucho espacio en memoria. Además, si se usa un web services para cargarlo, cada carga consume muchos recursos de red y tarda mucho en terminarse de construir. 

Traductor estará disponible para toda la aplicación, y en cualquier lado que se despliegue un texto será invocado. No tendría mucho sentido construir un Traductor cada vez que lo querramos utilizar. Lo más sano sería utilizar un sólo Traductor para toda la aplicación. ¿Cómo lograrlo? A través de un Singleton. Omitiendo la lógica del objeto, el código que se debería usar quedaría algo así:

```java

public class Traductor{

      private static boolean instanciated=false;

      private static Traductor traductorInstance;

     /**

       *Notar que el constructor es privado!

      */

      private Traductor(){

          //cargar un diccionario a memoria  a través de un WebService.

     }

    public static Traductor getTraductor(){

           if (! Traductor.instanciated){

                 Traductor.traductorInstance= new Traductor();

                 Traductor.instanciated=true;

           }

          return Traductor.traductorInstance;

   }

    public String translate(String toTranslate){

       //mucho código bonito va aquí

    } 

}
```

En cualquier lugar de la aplicacion que se quiera utilizar hacer una traducción se hace esto:

Traductor.getTraductor().translate("unaPalabra");

¿Qué logramos con esto? Que alguien que utilice nuestro código no pueda hacer esto

```java
Traductor t = new Traductor();
```

Es un gran beneficio porque podemos controlar mejor, cambiarla en el futuro, optimizarla, a Traductor. Evita malos usos de la clase y se nos asegura que a lo más hay una instancia del objeto en toda la aplicación.

Las cosas no son tan fáciles como parecen. Hay muchas maneras de crear los Singletons. En este ejemplo utilizamos un booleano estático, pero no siempre es necesario, pudimos haber inicializado traductorInstance como null, y en vez de verificar la variable booleana, verificar si la instancia es null o no.

```java

public class Traductor{

      private static  Traductor traductorInstance=null;

      /**

       *Notar que el constructor es privado!

      */

      private Traductor(){

          //cargar un diccionario a memoria  a través de un WebService.

     }

    public static Traductor getTraductor(){

           if (! Traductor.INSTANCE==null){

                 Traductor.traductorInstance= new Traductor();

           }

          return Traductor.traductorInstance;

   	}

    public String translate(String toTranslate){

       //mucho código bonito va aquí

    } 

}
```

O, para hacer las cosas más fáciles (que no siempre conviene, jeje) podríamos evitar la evaluación en getTraductor y crear el objeto cuando lo declaramos:

```java

public class Traductor{

      private static  Traductor traductorInstance=new Traductor();

      /**

       *Notar que el constructor es privado!

      */

      private Traductor(){

          //cargar un diccionario a memoria  a través de un WebService.

     }

    public static Traductor getTraductor(){

           return Traductor.traductorInstance;

   	}

    public String translate(String toTranslate){

       //mucho código bonito va aquí

    } 

}
```


Fácil ¿no? Mmm, pues se puede complicar. En Java por ejemplo, todavía se podría obtener una copia de traductor así:

```java
Traductor t = (Traductor)Traductor.getTraductor().clone();

Para evitar esto tendríamos que añadir las siguietnes líneas a nuestra clase Traductor

     public Object clone() throws CloneNotSupportedException {

         throw new CloneNotSupportedException();

       }
       
```       

También alguien podría extender la clase y volver público el constructor. Para evitar esto sería buena idea declarar nuestra clase como final.

Hay que tener especial cuidado cuando el Singleton se utiliza en un ambiete multi hilos, porque puede crear problemas si no se implementa de la manera adecuada. En Java es posible que tengamos que meter algún synchronized por ahí para evitar problemas.

Concluyendo, la idea central del Singleton es esa: asegurar de que exista tan solo una instancia del objeto en toda la aplicación. Hay muchas maneras de implementar un Singleton (aquí solo vimos algunas). Es un patrón muy aplicado en Java, aunque, como todos los patrones, se puede implementar en cualquier lenguaje orientado a objetos. También se pueden hacer cosas interesantes uniendo el Singleton con otros patrones creacionales (recordemos que el singleton no busca crear, sino que limitar la creación).

#4.  Patrones Estructurales. 

imos ya los patrones creacionales más importantes. No son todos, en el futuro veremos más, pero son los más usados y los más importantes. Ahora comenzamos con una nueva fase: Los patrones estructurales. Los patrones estructurales (structural patterns) podrían llamarse patrones de relaciones, o algo parecido, porque su principal función es facilitar y mejorar las relaciones entre objetos.

En el mundo de objetos, la creación de instancias es muy importante, pero tan importante como la creación, es la manera en la que instancias de objetos se comunican entre sí. Un diseño estandarizado y bien pensado puede facilitar mucho las cosas durante el desarrollo de un sistema grande. En ocasiones nos ponemos a realizar nuestras soluciones a la medida, pero generalmente estas solucionen decaen en construcciones extrañas que serán difíciles de entender para futuros desarrolladores, e incluso para nosotros mismos una vez que dejemos de ver el código.

Una solución elegante es utilizar inteligentemente patrones estructurales. Pero cuidado, puede ser arma de dos filos. Podemos caer en la tentación de meter patrones en todos lados, incluso cuando no es necesario. Nuestro código puede comenzar a crecer y crecer sin hacer aún nada, bajo la premisa de que todo lo queremos hacer con patrones.

Los patrones son una herramienta de diseño muy poderosa, pero hay que saberla utilizar. El tiempo y la experiencia suelen ser los mejores acompañantes para un diseñador de software, porque sólo el tiempo le dará el colmillo para utilizar sus herramientas adecuadamente.

Con mucha frecuencia el diseño de un dominio inicia con nociones sumamente intuitivas. Conforme el diseño se va destilando y mejorando, se agregan soluciones específicas de software (como patrones), que lo pueden ir complicando (con el propósito de hacerlo más manejable). Generalmente los patrones estructurales entran en la jugada en etapas medias del diseño, y muchísimas veces son el resultado de refactorización (refactoring).

Así que comenzamos con los patrones estructurales. Encendamos motores y preparemos la mente, porque estos patrones son buenos martillos y desatornilladores que podemos meter en nuestra caja de herramientas. Sin dudas algún día nos serán de mucha utilidad en medio de un proyecto, y la gente quedará sorprendida de como resuelves elegantemente los problemas ;).

## 4.1 Decorator

## 4.2 Composite

## 4.3  Adapter

 El patrón estructural que ahora vamos a analizar es muy eficaz así como sencillo. Se puede utilizar en muchos contextos y es de especialidad utilidad cuando se utilizan códigos o librerías ajenos al que estamos utilizando y sobre el que no tenemos control. Este patrón se le conoce como adaptador o adapter en inglés, aunque algunos lo llaman también wrapper, que viene siendo como envoltorio. Ambos nombres tienen bastante sentido y explican el por qué de este patrón.

 Antes de comenzar con código o parecido, pensemos en este problema. En muchos países se utilizan las espigas redondas en los tomacorrientes, y en otros las espigas planitas. En ocasiones tenemos un dispositivo que tiene 3 espigas y el tomacorrientes 2. Sin embargo sabemos que el aparato que deseamos conectar "entiende" la corriente eléctrica, “la acepta”, aunque la interfaz para conectarse a ella sea una distinta a la que posee. ¿Qué hacemos en estos casos? Usamos un adaptador! O un convertidor, o un transformador, cómo le querramos llamar.  Pues lo mismo sucede con el software. Sucede a menudo que nos encontramos con librerías que pueden sernos de utilidad, pero que existe la necesidad de adaptarnos a ellas. En esos casos tenemos dos opciones: modificar todo nuestro código para que se adapte a la librería, o podemos crear un adaptadro que traduzca lo nuestro a lo de ellos y lo de ellos a lo nuestro. Un ejemplo sencillo en el mundo Java es el de los Enumeration y los Iterators. Ambos tienen un hasNext()  o  un hasMoreElements() que hacen lo mismo; al igual que un next() y un nextElement() que hacen lo mismo. Imaginemos todo lo queremos manejar con Iterators, podemos crear un adaptador que nos “convierta” entre Iterator y Enumeration.

 Vamos con el usual ejemplo. Imaginemos tenemos un sistema que maneja coches, barcos, aviones y parecidos. Generalmente los motores que se usan son de gasolina, pero las nuevas tendencias han popularizado los motores eléctricos. Para simplificar mi caso y mostra bien el punto, tenemos que el proveedor de vehículos eléctricos nos provee sus librerías para el motor eléctrico que es prácticamente igual a nuestras implementaciones pero con otros nombres (prender en vez de encender, "mover más rápido" en vez de acelerar, etc.), y tiene una restricción extra: para poder acelerar o detener el motor, este tiene que estar conectado. Y surge el problema ¿cómo hacemos para nuestras librerías puedan hacer uso del motor eléctrico? Podríamos reescribirlas todas, pero el tiempo que eso nos tomaría sería mucho. Además sabemos que existirían problemas que nuestras librerías ya han solucionado.

Como nos gusta ser elegantes en nuestro uso de objetos, hace muchos años creamos una clase abstracta (pensamos también hacer una interfaz, pero la clase abstracta nos provee otros métodos útiles):

```java

 package com.guisho.software.patrones.adapter;

 public abstract class Motor {

    abstract public void encender();

    abstract public void acelerar();

    abstract public void apagar();

    //...mas metodos que hacen muchas cosas

 }
 ```

 Y tenemos nuestras implementaciones de algunos motores, por ejemplo el motor económico:
 
 ```java

 package com.guisho.software.patrones.adapter;

 public class MotorEconomico extends Motor {

     public MotorEconomico(){

         super();

         System.out.println("Craendo motor economico");

     }

     public void encender() {

         System.out.println("Encendiendo motor economico.");

     }

     public void acelerar() {

         System.out.println("Acelerando motor economico.");

     }

     public void apagar() {

         System.out.println("Apagando motor economico.");

     }

 }
```

 Y el motor gastón (que ya no se vende tanto!):
 
 ```java

 package com.guisho.software.patrones.adapter;

 public class MotorGaston extends Motor {

     public MotorGaston(){

         super();

         System.out.println("Creando el motor gaston");

     }

     public void encender() {

         System.out.println("Bum, bum....encendiendo motor gaston");

     }

     public void acelerar() {

         System.out.println("Buuuuuuuuuuuum, acelerando y gastando muuuucha gas");

     }

     public void apagar() {

         System.out.println("Apagando motor gaston");

     }

 }
```

 Estas clases siempre nos han funcionado bien, y de hecho tienen muchas cosas como servicios, mantenimientos y otros, que usamos gracias a la interfaz motor. Por ejemplo es común que usemos cosas como estás:
 
 ```java

         Motor motor = new MotorEconomico();

         motor.encender();

         motor.acelerar();

         motor.apagar();

        //hacer mas cosas....

         motor = new MotorGaston();

         motor.encender();

         motor.acelerar();

         motor.apagar();
         
```         

 Ahora la empresa que construye motores eléctricos nos manda su propia implementación que va así:

```java
 public class MotorElectrico {

     private boolean conectado = false;

     public MotorElectrico() {

         System.out.println("Creando motor electrico");

         this.conectado = false;

     }

     public void conectar() {

         System.out.println("Conectando motor eléctrico");

         this.conectado = true;

     }

     public void activar() {

         if (!this.conectado) {

             System.out.println("No se puede activar porque no esta conectado el motor electrico");

         } else {

             System.out.println("Esta conectado, activando motor electrico....");

         }

     }

     public void moverMasRapido() {

         if (!this.conectado) {

             System.out.println("No se puede mover rapido el motor electrico porque no esta conectado...");

         } else {

             System.out.println("Moviendo mas rapido...aumentando voltaje");

         }

     }

     public void detener() {

         if (!this.conectado) {

             System.out.println("No se puede detener motor electrico porque no esta conectado");

         } else {

             System.out.println("Deteniendo motor electrico");

         }

     }

     public void desconectar() {

         System.out.println("Desconectando motor electrico...");

         this.conectado = false;

     }

 }
 ```

 Como vemos, este motor hace lo mismo que el nuestro, pero de manera y con llamadas un poco diferentes. ¿Cómo hacemos para integrar este MotorEléctrico al resto de nuestro sistema? Así es, con un adaptador o adapter!

 El adapter "envuelve" al objeto extraño (por eso le llaman wrapper también, ya que wrapper viene siendo envoltorio).

 Nuestro adaptador se escribiría así:

```java
 package com.guisho.software.patrones.adapter;

 public class MotorElectricoAdapter extends Motor{

     private MotorElectrico motorElectrico;

     public MotorElectricoAdapter(){

         super();

         this.motorElectrico = new MotorElectrico();

         System.out.println("Creando motor Electrico adapter");

     }

     public void encender() {

         System.out.println("Encendiendo motorElectricoAdapter");

         this.motorElectrico.conectar();

         this.motorElectrico.activar();

     }

     public void acelerar() {

         System.out.println("Acelerando motor electrico...");

         this.motorElectrico.moverMasRapido();

     }

     public void apagar() {

         System.out.println("Apagando motor electrico");

         this.motorElectrico.detener();

         this.motorElectrico.desconectar();

     }

 }
 ```
 

 Como ven el adapter se encarga no solo de corregir los nombres de los métodos, sino también cosas como conectar y desconectar el motor, cosas que a nuestra implementación no le importan. Pero lo más importante es que ahora podemos utilizar esta implemetnación de Motor en nuestro sistema utilizando la implementación de ellos. Por ejemplo podemos hacer cosas como esta:
 
 ```java

         Motor motor = new MotorEconomico();

         motor.encender();

         motor.acelerar();

         motor.apagar();

         motor = new MotorGaston();

         motor.encender();

         motor.acelerar();

         motor.apagar();

         motor = new MotorElectricoAdapter() ;

         motor.encender();

         motor.acelerar();

         motor.apagar();
```         

 El patrón adapter aparece en todos lados, aunque muchas veces no se le llama adapter específicamente. Ahora que lo conocemos lo podemos usar en nuevos proyectos, o tal vez puede solucionarlos problemas que resolvimos a medias en algún software por ahí.
 
 

 ##4.4 Bridge

 ##4.5 Facade

 ##4.6 Proxy

 ##4.7  Module

#5.  Patrones de comportamiento.  

##5.1 Observer

##5.2 Chain of responsibility

##5.3 Command


##5.4 Interpreter

##5.5 Strategy

##5.6 Template

##5.7 Visitor
