def tagPattern = /([012]?\d|30|31)/
def monatPattern = /([01]?\d|11|12)/
def jahrPattern = /(d{2}?\d{2})/
String datumPattern = /$tagPattern.$monatPattern.$jahrPattern/

//println datumPattern
def raumPattern = /([A-Z])(\d{1,2})(\d{2})([a-z]?)/

def result = "A105b" =~ raumPattern

result.each { match, gebaeude, stockwerk, raum, unterraum ->
    println "Raum $match gefunden: Gebäude $gebaeude, Stockwerk $stockwerk, Raum $raum Unterraum $unterraum"
    
    }

3.times {println()}

def kennzeichen = /([A-ZÄÖÜ]{1,2})\-([A-Z]{1,2}) (\d{1,4})/

def newresult = "HD-GJ 1525" =~ kennzeichen

newresult.each { zeile ->
    println "Kennzeichen ${zeile[0]} gefunden: Stadt ${zeile[1]}"
}