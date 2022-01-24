package com.omogom.onetestone

import ktx.app.KtxGame
import ktx.app.KtxScreen

/** [com.badlogic.gdx.ApplicationListener] implementation shared by all platforms. */
//class Main : ApplicationAdapter()

class Main : KtxGame<KtxScreen>(){
    override fun create() {
        addScreen(FirstScreen())
        setScreen<FirstScreen>()
    }
}