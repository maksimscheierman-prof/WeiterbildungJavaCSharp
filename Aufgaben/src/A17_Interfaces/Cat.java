package A17_Interfaces;

//Ist eine ABSTRAKTE Klasse!! Heisst es muss nicht zwingend die abstrakten Methoden der vorherigen
//Klassen implementieren.

/**Es gilt die Regel:
 Die erste KONKRETE (nicht abstrakte) Klasse MUSS noch nicht implementierte,
 abstrakte Methoden aller Superklassen implmentieren
 */
abstract class Cat extends Animal {
    abstract void hunt();
}
