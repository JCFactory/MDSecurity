class Vector2d {
    def x
    def y


    Vector2d plus(Vector2d v2){
        new Vector2d(x:this.x+v2.x, y:this.y+v2.y)
    }

    Vector2d minus(Vector2d v2){
        new Vector2d(x:this.x-v2.x, y:this.y-v2.y)
    }

    Vector2d negative(){
        return new Vector2d(x:-this.x, y:-this.y)
    }

    Vector2d multiply(BigDecimal factor){
        new Vector2d(x:this.x*factor, y:this.y*factor)
    }

    //Missbrauch der Überladung
    BigDecimal bitwiseNegate(){
    Math.sqrt(this.x* this.x + this.y + this.y)
    }

    boolean equals(Vector2d v2){
        this.x==v2.x && this.y == v2.y
    }

    String toString(){
        "($x $y)"
    }
}

