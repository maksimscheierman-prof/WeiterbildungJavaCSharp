# 🧮 Commandline Text-Analyzer (Pflichtaufgabe 20251105-07)

Ein Konsolenprogramm in **Java**, das Texte analysiert – inklusive Wort- und Zeichenzählung, Palindrom-Erkennung, Stringpool-Demonstration und Fehlerbehandlung.

---

## 🎯 Ziel
Der Text-Analyzer kann:

- Wörter und Zeichen im Text zählen
- Das **längste**, **kürzeste** und **häufigste** Wort bestimmen
- **Palindrom-Erkennung** durchführen
- Den **Stringpool-Unterschied** demonstrieren
- Text von Konsole oder Datei einlesen
- Fehler behandeln, falls kein Text übergeben wird
- Mit Menüauswahl arbeiten (inkl. Beispieltext)

---

## 🏗️ Aufbau

| Aufgabe | Thema | Umsetzung |
|:--|:--|:--|
| **0** | Modularer Aufbau | Klassen: `TextAnalyzer`, `Handler`, `ConsoleHandler`, `FileHandler` |
| **1** | Texteingabe über Konsole + Fehlerbehandlung | `ConsoleHandler.java`, `NoTextProvidedException.java` |
| **2** | Wörter & Zeichen zählen | Methoden in `TextAnalyzer.java` |
| **3** | Längstes / Kürzestes / Häufigstes Wort | Methoden `longestWord()`, `shortestWord()`, `mostFrequentWord()` in `TextAnalyzer.java` |
| **4** | Stringpool-Demonstration | `StringPoolDemo.java` |
| **5** | Schöne Ausgabe der Statistik | `prettyStats()` in `TextAnalyzer.java` |
| **6** | Palindrom-Erkennung | Methode `isPalindrome()` und `palindromes()` in `TextAnalyzer.java` |
| **7** | Abstrakte Klasse + FileHandler | `Handler.java`, `ConsoleHandler.java`, `FileHandler.java` |
| **8** | Konsolenmenü | `TextAnalyzerApp.java` |

---

## 🧰 Voraussetzungen

- Java 17 oder neuer
- Eine Datei `beispiel.txt` im Projekt-Hauptordner  
  *(kann beliebigen Text enthalten)*

---

## ▶️ Startanleitung

### 💡 Variante 1: In IntelliJ IDEA oder Eclipse

1. Neues Java-Projekt anlegen
2. Paket `textanalyzer` erstellen
3. Alle `.java`-Dateien in dieses Paket kopieren
4. Datei `beispiel.txt` in das **Projekt-Hauptverzeichnis** legen (nicht in das Paket!)
5. `TextAnalyzerApp.java` ausführen

---

### 💡 Variante 2: Über die Kommandozeile

```bash
# Projekt kompilieren
javac textanalyzer/*.java

# Programm starten
java textanalyzer.TextAnalyzerApp
