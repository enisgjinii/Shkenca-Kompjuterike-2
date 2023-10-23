# Autosalloni

Ky është një dokumentacion i shkurtër për klasën `Autosalloni` në Java, e cila përfaqëson një sallon për automjete dhe mundëson menaxhimin e tyre.

## Përdorimi

Për të përdorur klasën `Autosalloni` në projektin tuaj, ndiqni këto hapa:

1. Krijo një instancë të kësaj klase duke përdorur konstruktorin:

   ```java
   Autosalloni salloni = new Autosalloni("Salloni ABC", 50);
   ```

   Ky rresht krijo një sallon me emrin "Salloni ABC" dhe mundësinë për të ruajtur 50 automjete.

2. Për të shtuar automjete në sallon, përdorni metodën `shtoAutomjetin`:

   ```java
   Automjeti automjeti = new Automjeti("XYZABC123409873CDE", "Mercedes-Benz", 2015);
   salloni.shtoAutomjetin(automjeti);
   ```

3. Për të verifikuar ekzistencën e një automjeti në sallon, përdorni metodën `exists`:

   ```java
   boolean ekziston = salloni.exists(new Automjeti("XYZABC123409873CDE", "Mercedes-Benz", 2015));
   ```

4. Për të paraqitur automjetet e një prodhuesi të caktuar, përdorni metodën `shtypSipasProdhuesit`:

   ```java
   salloni.shtypSipasProdhuesit("Mercedes-Benz");
   ```

5. Për të gjetur dhe paraqitur automjetin më të vjetër në sallon, përdorni metodën `meIVjetri`:

   ```java
   Automjeti automjetiIVjeter = salloni.meIVjetri();
   ```

6. Për të fshirë automjetet më të vjetra se një vit të caktuar, përdorni metodën `fshijAutomjetet`:

   ```java
   salloni.fshijAutomjetet(2000);
   ```
