package com.github.ummo93

import com.github.ummo93.config.ModuleConfig
import com.github.ummo93.framework.JayginApplication

object Launcher {
    @JvmStatic
    fun main(args: Array<String>) {
        val game = JayginApplication(ModuleConfig())
        game.start()
    }
}