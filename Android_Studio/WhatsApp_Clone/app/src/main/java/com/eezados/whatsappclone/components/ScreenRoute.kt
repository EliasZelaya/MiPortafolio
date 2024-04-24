package com.eezados.whatsappclone.components

//sealed es una clase que puede instanciar un constructor sin necesidad de esta instanciando en cada parte del codigo un nuevo objeto
sealed class ScreenRoute(var route: String) {
    object Chats : ScreenRoute("chats")
    object Status : ScreenRoute("status")
    object Community : ScreenRoute("community")
    object Calls : ScreenRoute("calls")
    object Contacts : ScreenRoute("contacts")
}