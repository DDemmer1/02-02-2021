# 26-01-2021
Übungsaufgabe vom 02.02.2021 für die Studierenden des Java I Seminars der Universität zu Köln



### 📝 Aufgabe:

1. Erzeugt eine ```public abstract class Pokemon``` mit den Feldern ```int hp``` , ```String nickName``` und vererbt diese an zwei Unter-Klassen z.B. ```Glumanda``` und ```Pikachu```.

2. Erzeugt ein ```public interface VisualObjekt``` mit der Methode ```public String getVisualRepresentation();``` und implementiert dieses interface in eure zwei Pokemon. 
```public String getVisualRepresentation();``` soll eine visuelle Darstellung eures Pokemons zurückgeben z.B. als ASCII art

3. Erzeugt eine Klasse ```Renderer``` mit der Methode ```public void render(VisualObject obj)```.Die Methode soll einen Methodenaufruf auf ```getVisualRepresentation()``` starten und den zurückgegebenen String einfach in der Konsole ausprinten.

4. In der Main-Methode erzeugt ihr jetzt ein ```Glumanda``` und ```Pikachu``` und lasst euch die Pokemon durch den ```Renderer``` mit der Methode ```public void render(VisualObject obj)``` in der Konsole ausgeben

#### ℹ️ Tipp


### ℹ️ Resourcen:
Hier noch ein paar nützliche 📃Artikel, 🖊️Threads und 🎥Videos

- [📃 Java BufferedReader](https://www.guru99.com/buffered-reader-in-java.html)
- [📃 Java File](https://java-tutorial.org/file.html)

