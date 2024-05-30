interface Observer {
    fun programaCreado(programa: Programa): Unit
}

class enviarMail() : Observer{
    override fun programaCreado(programa: Programa) {
        TODO("Not yet implemented")
    }

}

class Cliowin() : Observer{
    override fun programaCreado(programa: Programa) {
        TODO("Not yet implemented")
    }

}

class Revision(): Observer{
    override fun programaCreado(programa: Programa) {
        TODO("Not yet implemented")
    }

}
