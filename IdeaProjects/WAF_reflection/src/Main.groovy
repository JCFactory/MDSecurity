def printClassDescription(Class c) { println "Attribute".center(40,"-")
    c.metaClass.getProperties().sort({it.getName()}).each { println "${it.getType()} ${it.getName()}"
    }

    println "Methoden".center(40,"-")
    c.metaClass.getMethods().sort({it.getName()}).each {
        Class returnType = it.getReturnType();
        print "${returnType.getSimpleName()} " // Rückgabetyp (ignoriert Generics) print "${it.getName()}(" // Name
        boolean firstParameter=true
        it.getNativeParameterTypes().each {
            print "${firstParameter ? "" : ","}${it.getSimpleName()}"
            firstParameter=false }
        println(")") }
}
// Ignoriert Generics

print ClassDescription (java.lang.String)
