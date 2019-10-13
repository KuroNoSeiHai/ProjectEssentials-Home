package com.mairwunnx.projectessentials.projectessentialshome.models

import com.mairwunnx.projectessentialscore.extensions.empty
import kotlinx.serialization.Serializable

@Serializable
data class HomeModel(
    var homes: List<Home> = emptyList()
) {
    @Serializable
    data class Home(
        var home: String = String.empty,
        var clientWorld: String = String.empty,
        var worldId: Int = -1,
        var xPos: Int = -1,
        var yPos: Int = -1,
        var zPos: Int = -1
    )
}