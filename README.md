# Hochschule Trier
## Modul [Fortgeschrittene Programmiertechniken](https://www.hochschule-trier.de/informatik/fernstudium/module/a-h/fopt) (FOPT)

### Aufgabe zu Java EE Servlet: Beschreibung

Personen können sich über einen Browser in eine Mailing-Liste eintragen. Personen können sich wieder abmelden. Dabei ist es nicht möglich andere Personen anzumelden, sondern nur sich selbst. Sicherstellen der Autorisierung über Passworteingabe.

Implementierung der Anwendung durch Erstellung von drei Servlets: Anmelden, Anzeigen der angemeldeten Benutzer, Abmelden.

Zugriff auf gemeinsame Daten. Deshalb Verwendung von globalen Daten mit entsprechender Synchronisation.

### Notizen

Klasse von HttpServlet ableiten. Die Methoden doGet und doPost überschreiben. Beide Methoden haben je zwei Parameter: HttpServletRequest, HttpServletResponse

Mit der Annotation @WebServlet("/some-title" wird festgelegt, wie das Servlet von außen erreichbar ist.

Context == Contextual Information. Es handelt sich um anwendungsglobale Daten, für eine **spezifische** Web-Anwendung.




