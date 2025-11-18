// Grundlagen_CSharp
// Ausführlich kommentierte Einsteiger-Übersicht mit Theorie-Hinweisen – besonders für Java-Entwickler

using System;
using System.Collections;
using System.Collections.Generic;

class Program
{
    // ### READONLY-FELD (final in Java)
    // Theorie: readonly-Felder können nur beim Deklarieren oder im Konstruktor gesetzt werden.
    // Anders als const, deren Wert zur Compile-Zeit bekannt sein muss, erlaubt readonly Laufzeitwerte im Konstruktor.
    private readonly int _nurLesbar = 42;

    // ### HAUPTEINSTIEGSPUNKT
    // Main-Methode: Programmstartpunkt in C#. Entspricht public static void main(String[] args) in Java
    // Darf pro Projekt nur eins geben
    static void Main(string[] args)
    {
        // ### KONSOLE
        // Theorie: Console.WriteLine schreibt Text in die Konsole, inklusive Zeilenumbruch.
        // Console.ReadLine liest eine komplette Zeile von der Konsole ein.
        Console.WriteLine("Hello, World!");

        // ### PRIMITIVE DATENTYPEN (WERTTYPEN)
        // int, double, bool, char – sind Werttypen in C#. Sie speichern die Daten direkt.
        int ganzzahl = 42;
        double gleitkomma = 3.14;
        bool wahrheitswert = true;
        char buchstabe = 'A';

        // ### REFERENZTYPEN
        // string und object sind Referenztypen. Sie speichern die Adresse des Objekts, nicht den Wert selbst.
        string text = "Beispiel";
        object objekt = new Program();

        // ### KONSTANTEN
        // Theorie: const = compile-time constant. readonly = runtime-konstante (Feldlevel).
        const int Maximalwert = 100;

        // ### ARRAYS
        // Theorie: Arrays sind feste, indexbasierte Datenstrukturen. Mehrdimensionale Arrays = "rechteckige" Daten.
        int[] zahlen = { 1, 2, 3 };
        string[,] namen = { { "Anna", "Bob" }, { "Clara", "Dirk" } };

        // ### KONTROLLSTRUKTUREN
        // if-else: klassische Entscheidungsstruktur
        // wenn mehrzeilig, dann {} notwendig
        if (ganzzahl > 10)
            Console.WriteLine("Größer als 10");
        else
            Console.WriteLine("Nicht größer als 10");

        // switch-case: Auswahl zwischen mehreren Optionen
        // Wichtig: Jeder Fall muss mit break oder return enden
        switch (buchstabe)
        {
            case 'A':
                Console.WriteLine("Buchstabe ist A");
                break;
            default:
                Console.WriteLine("Anderer Buchstabe");
                break;
        }

        // ### SCHLEIFEN
        // for: klassische indexbasierte Schleife
        for (int i = 0; i < zahlen.Length; i++)
            Console.WriteLine(zahlen[i]);

        // foreach: Iteration über Collection-Elemente ohne Index
        foreach (int zahl in zahlen)
            Console.WriteLine(zahl);

        // while: kopfgesteuerte Schleife (Bedingung wird zuerst geprüft)
        int z = 0;
        while (z < 3)
        {
            Console.WriteLine(zahlen[z]);
            z++;
        }

        // do-while: fußgesteuerte Schleife (wird mindestens einmal ausgeführt)
        do
        {
            Console.WriteLine(zahlen[z]);
        } while (z < 3);

        // ### KONSOLENEINGABE
        // Theorie: Benutzerinteraktion über Console.ReadLine. Eingaben sind immer Strings und müssen ggf. konvertiert werden.
        Console.WriteLine("Bitte gib deinen Namen ein:");
        string benutzername = Console.ReadLine();
        Console.WriteLine("Hallo, " + benutzername + "!");

        Console.WriteLine("Bitte gib eine ganze Zahl ein:");
        try
        {
            int eingabezahl = int.Parse(Console.ReadLine());
            Console.WriteLine("Du hast die Zahl " + eingabezahl + " eingegeben.");
        }
        catch (FormatException)
        {
            Console.WriteLine("Ungültige Eingabe, bitte eine Zahl eingeben.");
        }

        // ### METHODENAUFRUFE UND ÜBERLADUNG
        // Theorie: Methoden kapseln Logik. Überladung erlaubt mehrere Signaturen mit gleichem Namen.
        Console.WriteLine(Addiere(2, 4));
        Console.WriteLine(Addiere(2, 4, 6));

        // ### OOP: KLASSEN, VERERBUNG, PROPERTIES
        // Theorie zu Properties:
        // Properties sind syntaktischer Zucker für Getter und Setter wie in Java.
        // Sie erlauben kontrollierten Zugriff auf private Felder mit get/set Accessoren.
        // Vorteil: sauberer, lesbarer Code und einfache Kapselung.
        Person p = new Person("Maria");
        Console.WriteLine(p.Name);

        Student s = new Student("Max", 101);
        Console.WriteLine($"{s.Name} (ID {s.Matrikelnummer})");

        // ### LISTEN
        ArrayList arrayList = new ArrayList { "Apple", 15, true };
        Console.WriteLine("ArrayList contents:");
        foreach (var item in arrayList)
            Console.WriteLine(item);

        List<string> stringList = new List<string> { "Anna", "Bob", "Clara" };
        stringList.Add("Dieter");
        Console.WriteLine("Generic List<string> contents:");
        foreach (string name in stringList)
            Console.WriteLine(name);

        // ### DICTIONARY (HashMap-Äquivalent)
        Dictionary<int, string> dict = new Dictionary<int, string>
        {
            { 1, "Eins" },
            { 2, "Zwei" }
        };
        dict[3] = "Drei";

        Console.WriteLine("Dictionary contents:");
        foreach (KeyValuePair<int, string> pair in dict)
            Console.WriteLine($"Key: {pair.Key}, Value: {pair.Value}");

        if (dict.TryGetValue(2, out string value))
            Console.WriteLine($"Key 2 corresponds to value '{value}'.");

        // ### EXCEPTION HANDLING
        try
        {
            int x = int.Parse("keine Zahl");
        }
        catch (FormatException ex)
        {
            Console.WriteLine("Fehler beim Parsen: " + ex.Message);
        }
        finally
        {
            Console.WriteLine("finally-Block wird immer ausgeführt.");
        }

        // ### LAMBDA AUSDRÜCKE
        // Theorie: Lambdas sind anonyme Methoden, ideal für funktionale Interfaces (Delegates).
        // Syntax: (Parameter) => Ausdruck oder Block
        // Vergleichbar mit Java Lambdas, z.B. Runnable oder Comparator.
        Predicate<int> addiereLambda = n => n%2 == 0;
        Console.WriteLine($"Lambda Addiere: {addiereLambda(4)}");  // Ausgabe: 12

        // Beispiel mit Action (void Rückgabe)
        Action<string> druckeText = text => Console.WriteLine($"Lambda Ausgabe: {text}");
        druckeText("Hallo Lambda!");
    }

    // ### METHODEN (FUNKTIONEN) UND ÜBERLADUNG
    static int Addiere(int a, int b)
    {
        return a + b;
    }

    static int Addiere(int a, int b, int c)
    {
        return a + b + c;
    }
}

// ### PROPERTIES IN C#
class Person
{
    // Properties sind die elegante, C#-typische Variante der Getter/Setter aus Java.
    // Sie kapseln den Zugriff auf Felder, erlauben dabei aber ein kompaktes und sicheres Syntaxmuster.
    public string Name { get; private set; }

    public Person(string name)
    {
        Name = name;
    }
}

class Student : Person
{
    public int Matrikelnummer { get; private set; }

    public Student(string name, int matrikelnummer) : base(name)
    {
        Matrikelnummer = matrikelnummer;
    }
}
