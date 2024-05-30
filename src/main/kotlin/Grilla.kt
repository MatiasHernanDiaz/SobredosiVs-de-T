class Grilla(
    private val programas: MutableSet<Programa> = mutableSetOf(),
    private val listaRevision: MutableSet<Programa> = mutableSetOf(),
    private val observers: MutableSet<Observer> = mutableSetOf()
) {

    fun generarRevision(){
        listaRevision.forEach({
            if(!it.cumpleRestriccion()){
                accion.ejecutarAcion()
            }
        })
    }

    fun agregar(observer: Observer) { observers.add(observer)}

    fun crearPrograma(){
        val nuevoPrograma = Programa(titulo = "programa nuevo", presupuesto = 100.0)
        observers.forEach({it.programaCreado(nuevoPrograma)})
    }

}