# GY8

> *Feladat:* Meg akarjuk hívni egy lokális függvényt a serveren a klienstől.

> Az adattípust amit meg akarok hívni ismerie kell mind a `server`nek mind a `kliens`nek. Azaz *közös `interface`n kell legyenek*. `Thread`eket nem tud átküldeni, de majdnem minden mást igen.

## Server
A server tartalmaz egy `serversocket`et és azt használja fel, elfedi a portot és minden egyebet is.

Ekkor az *objektumok serverként működnek* azaz, ahány objektumunk van annyi server is jön létre, de ezek nem teljes értékűek, de tekinthetőek egy servernek, vagy egy példányának. Ezeket az `RMIDeploy` szokta megoldani. A `Registry` objektumban a `rebind()` függvénnyel hozzuk létre, pl: `registry.rebind(....)`.


## Kliens
- meg kell találni a katalógust: `LocateRegistry.getRegistry(...)`
- megkérdezzük tőle, hogy benne van-e: `registry.lookup(serverName)` ennek a visszatérési értéke egy `proxy`, ami típusa: `$Proxy0`, ez kommunikál a hálózaton keresztül a serverünkkel.
    - ez a `proxy` is megvalósítja az `interface`t mint a távoli objektum, de *ez maga nem a távoli objektum*, csak ak inézete hasolnó.
- `reply` értéke a távoli objektumtól jön a helyettesen keresztül, azaz ez maga a helyettestől kapott érék. Valós környezetben ajánlott lekezelni a hálózati `Exception`öket.

### Proxy
>  Ez gyakorlatilag egy `kliens` ami becsomagolja a `kliens`től kapott anyagot és azt továbbkküldi a `server`nek, úgy, hogy az hálózaton vagy bármi egyeben át megkapja, gyakorlatilag a mgefeleől formára alakítja át.
