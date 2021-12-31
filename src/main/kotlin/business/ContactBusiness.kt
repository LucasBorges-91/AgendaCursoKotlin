package business

import java.lang.Exception

class ContactBusiness {

    fun validate( name: String, phone: String ) {
        if ( name == "" ) {
            throw Exception( "Nome é obrigatório! " )
        }
        if ( phone == "" ) {
            throw Exception( "Telefone é obrigatório! " )
        }
    }

    fun validateDelete( name: String, phone: String ) {
        if ( name == "" || phone == "" ) {
            throw Exception( "É necessário selecionar um contato antes de remover! " )
        }
    }

    fun saveContact( name: String, phone: String ) {
        validate( name, phone )
    }

    fun deleteContact( name: String, phone: String ) {
        validateDelete( name, phone )
    }
}