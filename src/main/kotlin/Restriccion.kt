interface Restriccion {
    fun cumpleRestriccion(programa: Programa): Boolean

    fun tipoRestriccion(): String
}

class Rating(val valor: Int) : Restriccion{
    override fun cumpleRestriccion(programa: Programa): Boolean {
        return programa.promedioSemanal() > valor
    }

    override fun tipoRestriccion(): String {
        return "Rating"
    }
}

class MaxConductores(val maximoConductores: Int): Restriccion{
    override fun cumpleRestriccion(programa: Programa): Boolean {
        return programa.conductores.size <= maximoConductores
    }
}

class ConductorPrincipal(val conductor: Conductor) : Restriccion{
    override fun cumpleRestriccion(programa: Programa): Boolean {
        return programa.conductores.contains(conductor)
    }
}

class Presupuesto(val montoMaximo: Double): Restriccion {
    override fun cumpleRestriccion(programa: Programa): Boolean {
        return programa.presupuesto <= montoMaximo
    }
}

class Combinado(val restricciones : List<Restriccion>,val tipoAND: Boolean) : Restriccion{
    override fun cumpleRestriccion(programa: Programa): Boolean {
        if(tipoAND){
            return restricciones[0].cumpleRestriccion(programa) && restricciones[1].cumpleRestriccion(programa)
        }
        else{
            return restricciones[0].cumpleRestriccion(programa) || restricciones[1].cumpleRestriccion(programa)
        }
    }
}