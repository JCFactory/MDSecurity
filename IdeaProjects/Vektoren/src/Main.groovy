BigDecimal.metaClass.multiply = { Vector2d meinVektor ->
    println "multiply für BigDecimal*Vector2D aufgerufen"
    new Vector2d(x:delegate*meinVektor.x, y:delegate*meinVektor.y)
}
/**multiply-Methode wurde überladen **/

def a = new Vector3D(x:9,y:18, z:8)
def b = new Vector3D(x:3,y:6, z:0)
def c = new Vector2d(x:3, y:8)
/*
println a+b*3
println (-a)
println (a.equals(b))
println (b==b)
println (a==b)

println(~a)

println c as Vector3D*/

println 3.0*4.9
println c*3.0
println 3.0*c