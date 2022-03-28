package committee.nova.examplemod

import committee.nova.examplemod.ExampleMod.ExampleMod.MODID
import committee.nova.examplemod.ExampleMod.ExampleMod.NAME
import committee.nova.examplemod.ExampleMod.ExampleMod.VERSION
import cpw.mods.fml.common.Mod

@Mod(modid = MODID, version = VERSION, name = NAME, dependencies = "required-after:legacymckotlin@[1.0,)")
class ExampleMod {
    companion object ExampleMod {
        const val MODID = "modid"
        const val VERSION = "1.0.0"
        const val NAME = "ExampleMod"

        @Mod.Instance(MODID)
        var instance: committee.nova.examplemod.ExampleMod? = null
    }

    init {
        instance = this
    }
}