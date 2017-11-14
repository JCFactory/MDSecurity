/** def wendeAn(Closure closure, def x, def y){
        return closure(x,y);
    }

    println wendeAn(closure {it -> x>=y ? x : y },y9)

   def abs2 = { it>=0 ? it : -it }
   println abs2 (-9)

   println "-"*40

   def fak;

    fak = {it<=1 ? 1 : it*fac(it-1)}

   println fak(9)**/
def zeitmessung(closure) {
   def start = new Date()
   closure() // Closure aufrufen def end = new Date()
   def runtime = end.time - start.time
   println "$start - $end: $runtime ms"
}

def startTimer={ name->
    def start=new Date()
    return { def end = new Date(); def runtime = end.time - start.time;
        println "$name: $start - $end: $runtime ms" }
}
def timer=startTimer("Schleifentimer")
for(i=0; i<10000000; i++);
timer() // Closure-Aufruf
