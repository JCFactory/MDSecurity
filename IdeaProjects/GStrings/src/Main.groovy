def vorname = "Thomas"
def nachname = "Specht"

println("$vorname $nachname")
println('$vorname $nachname')

println "*"*100

def dozent = """
Thomas $nachname sagt \"Guten Morgen\"
Fakultät für Informatik
Raum A105b
"""

println dozent

vorname="Thomas"
vorname -= "oma"
println vorname
name="Maja Mayer"
name -= "Ma"
println name

vorname="Thomas"
vorname++
++vorname
println vorname

println "Thomas".center(50," ")

