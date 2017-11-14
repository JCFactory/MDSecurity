class Vector3D {

    def x
    def y
    def z


    Vector3D plus(Vector3D v2){
        new Vector3D(x:this.x+v2.x, y:this.y+v2.y, z:this.z+v2.z)
    }

    Vector3D minus(Vector3D v2){
        new Vector3D(x:this.x-v2.x, y:this.y-v2.y, z:this.z-v2.z)
    }

    Vector3D negative(){
        return new Vector3D(x:-this.x, y:-this.y)
    }

    Vector3D multiply(BigDecimal factor){
        new Vector3D(x:this.x*factor, y:this.y*factor, z:this.z*factor)
    }

    //Missbrauch der Überladung
    BigDecimal bitwiseNegate(){
        Math.sqrt(this.x* this.x + this.y*this.y + this.z*this.z)
    }

    boolean equals(Vector3D v2){
        this.x==v2.x && this.y == v2.y && this.z == v2.z
    }

    String toString(){
        "($x $y $z)"
    }
}
