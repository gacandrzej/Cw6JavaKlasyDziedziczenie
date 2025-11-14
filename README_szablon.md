# Klasy, dziedziczenie, polimorfizm w Javie

![Build Status](https://github.com/gacandrzej/Cw6JavaKlasyDziedziczenie/actions/workflows/build.yml/badge.svg)

Projekt edukacyjny w Javie prezentujący ...:
- opis 1
- opis 2


Projekt zawiera również testy jednostkowe JUnit 5,
które weryfikują poprawność działania algorytmów
oraz metod.

---

## 📌 Spis treści
1. [Opis projektu](#opis-projektu)
2. [Technologie](#technologie)
3. [Instalacja](#instalacja)
4. [Użycie](#użycie)
5. [Przykład kodu](#przykład-kodu)
6. [Testy jednostkowe](#testy-jednostkowe)
7. [Diagram sekwencji](#diagram-sekwencji)
8. [Zrzuty ekranu](#zrzuty-ekranu)
9. [Uruchamianie testów](#uruchamianie-testów)
10. [Autor](#autor)
11. [Licencja](#licencja)


---

## 📝Opis projektu
Projekt ma na celu:
- Poznanie ...
- Wykorzystanie ... oraz testów jednostkowych w JUnit 5.
- Ćwiczenie pracy z ...

---

## ⚙️Technologie
- Java 25
- Swing (GUI)
- JUnit 5 (testy jednostkowe)

---

## 💻Instalacja
```bash
# Sklonuj repozytorium
git clone https://github.com/gacandrzej/Cw6JavaKlasyDziedziczenie.git

# Przejdź do katalogu projektu
cd Cw6JavaKlasyDziedziczenie

# Kompilacja
javac -d bin src/**/*.java

# Uruchomienie GUI (przykład)
java -cp bin ...
```

---

## 🚀Użycie

- Uruchom ...


---

## 📌Przykład kodu
```java
 
```

---

## 🧪Testy jednostkowe

```java
 
```
Uruchamianie:
```bash
# Uruchomienie testów w terminalu
  javac -cp junit-platform-console-standalone-1.10.0.jar -d bin test/**/*.java
  java -jar junit-platform-console-standalone-1.10.0.jar --class-path bin --scan-class-path
```

---

## 📊Diagram sekwencji

```mermaid
graph TD;
```
---

## 🖼️Zrzuty ekranu


---

## 🏃Uruchamianie testów

Projekt zawiera skrypt `run_all_tests.sh`, który umożliwia:

- pobranie potrzebnych bibliotek JUnit 5,
- pobranie i zainstalowanie `junit2html`,
- kompilację kodu źródłowego i testów jednostkowych,
- uruchomienie testów i wygenerowanie raportów w formacie XML oraz HTML.

### Co robi skrypt

- Tworzy katalogi `bin/`, `libs/` i `reports/` (jeśli nie istnieją).
- Pobiera pliki JUnit (`junit-jupiter-api` i `junit-platform-console-standalone`) do `libs/`.
- Pobiera i instaluje `junit2html` (jeśli nie jest zainstalowany).
- Kompiluje kod źródłowy i testy do katalogu `bin/`.
- Uruchamia wszystkie testy jednostkowe i zapisuje wyniki w XML w katalogu `reports/`.
- Konwertuje raporty XML na HTML przy użyciu `junit2html`.

Pliki HTML powstają w katalogu `reports/` z nazwami:

- `report-jupiter.html`
- `report-platform.html`
- `report-vintage.html`

### Przykład raportu

Po uruchomieniu skryptu w katalogu `reports/` znajdziesz pliki HTML, które można otworzyć w przeglądarce, aby zobaczyć wyniki testów w czytelnej formie.

### Uruchomienie

W terminalu (Bash / Git Bash / Linux / Mac):

```bash
  ./run_all_tests.sh
```

---

## 👤Autor
- [GitHub: gacandrzej](https://github.com/gacandrzej)


- Email: [gacandrzej@gmail.com](mailto:gacandrzej@gmail.com)

---

## Licencja
- MIT License © 2025 Gac Andrzej