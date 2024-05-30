class Programa (
    private val titulo: String,
    val conductores: MutableSet<Conductor> = mutableSetOf(),
    private val dias: List<Dia> = mutableListOf(),
    private val duracion: Double = 0.0,
    val ratingSemanal: MutableList<Int> = mutableListOf(),
    val restricciones: MutableSet<Restriccion> = mutableSetOf(),
    val presupuesto: Double
){
    fun agregarRestriccion(restriccion: Restriccion) { restricciones.add(restriccion)}
    fun promedioSemanal() : Double = ratingSemanal.sum() / 5.0
    fun agregarConductor(conductor: Conductor){ conductores.add(conductor)}
    fun cumpleRestriccion(): Boolean = restricciones.all { it.cumpleRestriccion(this) }
}