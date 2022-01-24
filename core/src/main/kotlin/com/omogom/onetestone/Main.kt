package com.omogom.onetestone

import com.badlogic.gdx.Game

/** [com.badlogic.gdx.ApplicationListener] implementation shared by all platforms. */
//class Main : ApplicationAdapter()

class Main : Game(){
    override fun create() {
        setScreen(FirstScreen())
    }
}